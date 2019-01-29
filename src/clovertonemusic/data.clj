(ns clovertonemusic.data
  (:require [buddy.hashers :as hashers]
            [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [clojure.data :refer [diff]]
            [clojure.data.csv :as csv]
            [clojure.java.shell :refer [sh]]
            [clojure.java.io :as io]
            [clojure.string :as string]
            [java-time :as jtime]
            [clj-pdf.core :as pdf]
            [clovertonemusic.utils :as utils]))

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

(defn fail
  "Logs a fatal error and then exits with a failure status"
  [errorstr]
  (log/fatal errorstr)
  (System/exit 1))

(defn simple-extract-db-from-csv
  "Reads the contents of the given CSV file and returns a sequence of array maps for each record"
  [csv-file]
  (with-open [reader (io/reader csv-file)]
    (let [[header & data-rows] (doall (csv/read-csv reader))
          header-keywords (map keyword header)
          ;; It would be simpler to convert each row to a zipmap. However, we use an array map since
          ;; that will keep the columns in the original order that they were in in the file.
          generate-array-map (fn [row] (->> row
                                            (map vector header-keywords)
                                            (flatten)
                                            (apply array-map)))]
      (map generate-array-map data-rows))))

(defn write-atomic-db-to-csv
  "Writes the contents of an atomic db to its associated CSV file"
  [atomic-db csv-file]
  (let [colkeys (->> atomic-db
                     (deref)
                     (first)
                     (keys))
        get-values-from-rec (fn [db-rec]
                              (for [colkey colkeys]
                                (colkey db-rec)))]
    (with-open [writer (io/writer csv-file)]
      ;; Write the header row:
      (csv/write-csv writer [(map name colkeys)])
      ;; Write the data rows:
      (doseq [rec (deref atomic-db)]
        (csv/write-csv writer [(get-values-from-rec rec)])))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to the charts catalogue
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def catalogue-path "data/catalogue")

(def catalogue-table-constraints         ; Form: required (y/n)/type/foreign key
  {:composers {:date-created             "y/datetime/"
               :date-modified            "y/datetime/"
               :composer-name            "y/string/"
               :filename                 "y/string/"
               :notes                    "n/string/"}
   :genres {:date-created                "y/datetime/"
            :date-modified               "y/datetime/"
            :genre-name                  "y/string/"
            :filename                    "y/string/"
            :notes                       "n/string/"}
   :grades {:date-created                "y/datetime/"
            :date-modified               "y/datetime/"
            :grade-number                "y/number/"
            :grade-name                  "y/string/"
            :filename                    "y/string/"
            :notes                       "n/string/"}
   :charts {:date-created                "y/datetime/"
            :date-modified               "y/datetime/"
            :chart-number                "y/number/"
            :chart-name                  "y/string/"
            :filename                    "y/string/"
            :notes                       "n/string/"
            :subgenre                    "y/string/"
            :composer                    "y/string/composers-composer-name"
            :grade                       "y/number/grades-grade-number"
            :category                    "y/string/genres-filename"
            :price                       "y/money/"
            :recorded                    "n/number/"
            :featured                    "y/number/"
            :duration                    "n/time/"
            :meter                       "n/ratio/"
            :tempo                       "n/number/"
            :band-type                   "n/string/"
            :master                      "n/number/"
            :project                     "n/string/"}})

(defn validate-cell
  "For each data cell belonging to a given column of a given table:
   (1) Validate that it is not empty if it is a required field
   (2) Validate that the contents conform to the column's datatype
   (3) If the column has a foreign key, then check in the catalogue to see that it is satisfied."
  [tablename rownum col-name col-data catalogue]
  ;; split up the string specifying the constraints associated with this column (defined above):
  (let [tablekey (keyword tablename)
        [required datatype foreign-key] (string/split
                                         (get (get catalogue-table-constraints tablekey) col-name)
                                         #"/")]
    ;; If the column is required, make sure it is not empty:
    (when (and (= required "y") (not (re-find #"\S+" col-data)))
      (fail (str "At row " rownum ": Required column: " col-name " of table " tablename " is empty")))
    ;; Make sure the contents conform to the column's datatype. Note: we do not convert here but keep
    ;; the real datatype of all of these fields as string, since this will be convenient later when it
    ;; comes to HTML generation.
    (when (or
           (and (= datatype "datetime")
                (not (re-matches
                      #"\s*(\d{4}-\d{2}-\d{2}(T|\s){0,1}\d{2}(:\d{2}){1,2}){0,1}\s*"
                      col-data)))
           (and (= datatype "boolean") (not (re-matches #"(?i)\s*(true|false){0,1}\s*" col-data)))
           (and (= datatype "time") (not (re-matches #"\s*(\d+s){0,1}\s*" col-data)))
           (and (= datatype "money") (not (re-matches #"\s*(\$\d+(\.\d+){0,1}){0,1}\s*" col-data)))
           (and (= datatype "ratio") (not (re-matches #"\s*(\d+/\d+){0,1}\s*" col-data)))
           (and (= datatype "number") (not (re-matches #"\s*\d*\s*" col-data))))
      (fail (str "At row " rownum ": '" col-data "' is not a valid " datatype " in column '"
                 col-name "' of table '" tablename "'")))
    ;; Validate the foreign key if it exists:
    (when foreign-key
      (let [;; The foreign key constraint is of the form 'table-column', but it is a string so
            ;; we need to convert the column names to keywords after splitting:
            [foreign-table foreign-column] (vec (map (fn [next-string] (keyword next-string))
                                                     (string/split foreign-key #"-" 2)))
            ;; Find all of the values in the foreign key table for this column, and then check to see if
            ;; the contents of this cell is one of those values:
            foreign-values (vec (map (fn [next-row] (get next-row foreign-column))
                                     (get catalogue foreign-table)))]
        (when-not (some #(= col-data %) foreign-values)
          ;; if the column contents do not match any of the possible foreign key values,
          ;; just fail:
          (fail (str "At row " rownum ": '" col-data "' not in " foreign-values)))))))

(defn validate-row
  "Validates the data in the given row, cell by cell."
  [tablename row rownum numfields catalogue]
  (when-not (= (count row) numfields)
    (throw (Exception. (str "Number of fields in data row #"
                            rownum " does not match the number of headers"))))
  (doseq [col row]
    (let [col-name (key col)]
      (validate-cell tablename rownum col-name (get row col-name) catalogue)))
  ;; return the row back to the caller after validation:
  row)

(defn create-table
  "Creates a 'table' from the given data implemented as a (lazy) sequence of zipmaps"
  [tablename catalogue [header & body-rows]]
  (map (fn [row]
         (let [processed-row (zipmap (map keyword header) row)]
           (validate-row
            tablename
            processed-row
            (inc (.indexOf body-rows row))
            (count header)
            catalogue)))
       body-rows))

(defn extract-catalogue-data-from-csv
  "Reads the contents of the CSV file containing the catalogue data from disk using the
  csv library and the read-csv function, which returns a lazy sequence of vectors representing rows"
  [filename]
  (with-open [reader (io/reader (str catalogue-path "/" filename))]
    (doall
     (csv/read-csv reader))))

(defn generate-table-from-csv
  "Given a table name and a data catalogue, this function generates a table from a CSV file stored
  on disk. It returns a new catalogue consisting of the old catalogue merged with a new entry for
  the constructed table."
  [tablename catalogue]
  (try
    (log/info "Loading" tablename)
    (->> ".csv"
         (str tablename)
         (extract-catalogue-data-from-csv)
         (create-table tablename catalogue)
         (hash-map (keyword tablename))
         (merge catalogue))
    (catch Exception ex
      (.printStackTrace ex)
      (fail (str "Error while parsing " tablename ".csv: " (.getMessage ex))))))

(def catalogue
  ;; The catalogue is build by generating each catalogue table successively. The output
  ;; of each call adds the built table to the orignally given catalogue; i.e.:
  ;; {} -> {:genres {...}} -> {:genres {...} :composers {...}} -> ...
  ;; The order here is important; in particular "charts" must be last since it has
  ;; foreign keys to all of the other tables.
  (->> {}
       (generate-table-from-csv "genres")
       (generate-table-from-csv "composers")
       (generate-table-from-csv "grades")
       (generate-table-from-csv "charts")))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to the user database
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def users-file "data/users/users.csv")

;; Initialize the user database. Note that the user database may change while the server is running,
;; so we make it an atom. The way this works is as follows:
;; - We read it from disk into memory at server startup
;; - All subsequent read accesses are to the memory instance.
;; - When an update is made (e.g., through create-user! or activate-user!), we update the atom, and
;;   then write a backup of the atom to disk. Apart from these occasional writes, the .csv file on
;;   disk is never accessed except the one time at startup.
(def user-db (atom (simple-extract-db-from-csv users-file)))

;; Verify that the user database is in a good state at server startup; fail otherwise:
(when-not (->> user-db
               (deref)
               (map #(:email %))
               (apply distinct?))
  (fail "User database contains duplicate emails"))

(defn get-next-user-id
  "Returns a number 1 larger than the largest user id in the db, in string format."
  []
  (->> user-db
       (deref)
       (map (fn [idstring]
              ;; Old pre-migration users may have a non-numeric userid. If we come across one of
              ;; these just treat it as '0', i.e. the minimum possible value:
              (try
                (utils/parse-number (:userid idstring))
                (catch Exception ex 0))))
       (apply max)
       (inc)
       (str)))

(defn get-user-by-id
  "Finds and returns the user in the db corresponding to the given userid."
  [userid]
  (->> user-db
       (deref)
       (filter #(= (:userid %) userid))
       (first))) ; Note: result of filter must be unique (verified at load time)

(defn get-user-by-email
  "Finds and returns the user in the db corresponding to the given email."
  [email]
  (->> user-db
       (deref)
       (filter #(= (:email %) email))
       (first))) ; Note: result of filter must be unique (verified at load time)

(defn check-password
  "Returns true if the password is correct, false if not correct, and nil if the user isn't found.
  Note that if the password for the user is not set in the db, then we always return 'incorrect'."
  [email given-password]
  (let [check-password-with-default-false (fn [actual-password]
                                            (if (= actual-password "")
                                              false
                                              (hashers/check given-password actual-password)))]
    (->> email
         (get-user-by-email)
         :password
         (check-password-with-default-false))))

(defn get-user-by-email-and-password
  "Returns the record corresponding to the given email if the password is correct,
  or false if the password is incorrect, or nil if the email isn't found."
  [email password]
  (let [password-ok (check-password email password)]
    (cond
      (nil? password-ok) nil
      (not password-ok) false
      password-ok (get-user-by-email email))))

(defn user-is-disabled
  "Tests to see whether the given user is disabled (e.g. if he is not activated)."
  [user]
  ;; If an activation id exists, it means that the user is still pending activation:
  (not (string/blank? (:activationid user))))

(defn get-user-by-resetpwid
  "Finds and returns the user in the db associated with the given reset password id"
  [resetpwid]
  (->> user-db
       (deref)
       (filter #(= (:resetpwid %) resetpwid))
       (first)))

(defn generate-random-id
  "Generate a random id composed of the epoch time in ms appended to a randomly generated UUID. This
  is used for generating activation ids, purchase ids, reset password ids, etc."
  []
  (str (java.util.UUID/randomUUID) (System/currentTimeMillis)))

(defn create-user!
  "Creates a user with the given information and writes the record to the csv file. If the user
  already exists, returns nothing, otherwise returns an activation id that can be later used to
  activate the user."
  [password name band city province country phone email newsletter]
  (let [existing-user (get-user-by-email email)]
    ;; Only create the user if a record associated with the email doesn't already exist:
    (when-not existing-user
      (let [today (->> (jtime/local-date) (jtime/format "yyyy-MM-dd"))
            userid (get-next-user-id)
            activationid (generate-random-id)]
        ;; Write the user record to the user db, indicating the user is not yet activated by writing
        ;; an activation id into the activationid column which will be used for later activation.
        ;; The way this works is, an activationid in the user record that is not nil means that the
        ;; user has not yet been activated.
        ;; The activation id is then returned to the caller as a convenience. We use an
        ;; array map to keep the fields in the same order in which they were inserted:
        (swap! user-db conj (array-map
                             :userid userid :lastaccessed nil :dateadded today
                             :password (hashers/derive password) :name name :band band :city city
                             :province province :country country :phone phone :email email
                             :newsletter newsletter :activationid activationid :resetpwid nil))
        ;; Persist the user-db to disk (in case of a crash):
        (write-atomic-db-to-csv user-db users-file)
        ;; Finally return the activation id:
        activationid))))

(defn activate-user!
  "Activates the user corresponding to the given activation id. If the user is activated
  successfully, returns true, otherwise if the activation id is not found, returns false."
  [activationid]
  (let [mark-as-activated (fn [dereferenced-user-db]
                            (let [{matching-user-recs true, other-user-recs false}
                                  (->> dereferenced-user-db
                                       (group-by #(= (:activationid %) activationid)))
                                  ;; There will always only ever be one matching user at most:
                                  potential-new-user-record (merge
                                                             (first matching-user-recs)
                                                             {:activationid nil})]
                              ;; Return the database records including the modified record
                              ;; if it exists:
                              (if (= (count matching-user-recs) 0)
                                other-user-recs
                                (conj other-user-recs potential-new-user-record))))
        old-db-contents (deref user-db)]

    ;; Update the user db to mark the user as activated:
    (swap! user-db mark-as-activated)
    ;; Now compare the old and new db contents. If there are differences, persist the database to
    ;; disk and return true; otherwise return false. If there is no difference this is because
    ;; the activation id was not found.
    (let [differences (diff (sort-by :userid old-db-contents) (sort-by :userid (deref user-db)))]
      (if (or (first differences) (second differences))
        (do
          (write-atomic-db-to-csv user-db users-file)
          true)
        false))))

(defn update-user-last-accessed-time!
  "Updates the last accessed time of the user in the db with the given userid"
  [userid]
  (let [current-time (->> (jtime/offset-date-time) (jtime/format "yyyy-MM-dd HH:mmZ"))
        update-access-time (fn [dereferenced-user-db]
                             (let [{matching-user-recs true, other-user-recs false}
                                   (->> dereferenced-user-db
                                        (group-by (fn [row] (= userid (:userid row)))))
                                   ;; There will always only ever be one matching user at most:
                                   potential-new-user-record (merge
                                                              (first matching-user-recs)
                                                              {:lastaccessed current-time})]
                               ;; Return the database records including the modified record if it
                               ;; exists:
                               (if (= (count matching-user-recs) 0)
                                 other-user-recs
                                 (conj other-user-recs potential-new-user-record))))]

    ;; Update the user db with the current time as the last accessed time
    (swap! user-db update-access-time))
  ;; Persist the database to disk, and then return the userid back to the caller:
  (write-atomic-db-to-csv user-db users-file)
  userid)

(defn add-reset-password-id-to-user!
  "Marks the user record as pending a password reset, by adding a randomly generated
  'password reset id' to the user record, and then returning the generated id to the caller.
  Note that this function does not actually delete the old password. To do that, the user must later
  supply the id generated here (e.g. by clicking on a link within which it is embedded). Also note
  that if the user never actually follows through with the password reset, then the id generated
  here will just remain a part of the user record forever, or until it is overwritten with another
  one (whichever comes first). It is safe to have it there, though, since it is only used for
  resetting the user's password and is otherwise ignored."
  [userid]
  (let [resetpwid (generate-random-id)
        update-resetpwid (fn [dereferenced-user-db]
                           (let [{matching-user-recs true, other-user-recs false}
                                 (->> dereferenced-user-db
                                      (group-by (fn [row] (= userid (:userid row)))))
                                 ;; There will always only ever be one matching user at most:
                                 potential-new-user-record (merge
                                                            (first matching-user-recs)
                                                            {:resetpwid resetpwid})]
                             ;; Return the database records including the modified record if it
                             ;; exists:
                             (if (= (count matching-user-recs) 0)
                               other-user-recs
                               (conj other-user-recs potential-new-user-record))))]
    ;; Update the user db:
    (swap! user-db update-resetpwid)
    ;; Persist the database to disk, then return the generated password reset id back to the caller:
    (write-atomic-db-to-csv user-db users-file)
    resetpwid))

(defn change-user-password!
  "Change the password for the given user with the given one, deleting any existing
  'reset password id' in the user record."
  [userid new-password]
  (let [hashed-new-password (hashers/derive new-password)
        update-password (fn [dereferenced-user-db]
                          (let [{matching-user-recs true, other-user-recs false}
                                (->> dereferenced-user-db
                                     (group-by (fn [row] (= userid (:userid row)))))
                                potential-new-user-record (merge
                                                           (first matching-user-recs)
                                                           {:password hashed-new-password
                                                            :resetpwid nil})]
                            ;; Return the database records including the modified record if it
                            ;; exists:
                            (if (= (count matching-user-recs) 0)
                              other-user-recs
                              (conj other-user-recs potential-new-user-record))))]
    ;; Update the user db:
    (swap! user-db update-password))
  ;; Persist the db to disk
  (write-atomic-db-to-csv user-db users-file))

(defn modify-account-information!
  "Updates the user record in the database which corresponds to the given email with the
  provided information."
  [{email "email" name "name" band "band_name" city "city" province "province"
    province_other "province_other" country "country" country_other "country_other"
    password "new_password" phone "phone" newsletter "newsletter"}]
  (let [get-updated-user-rec (fn [user]
                               (merge
                                user
                                ;; Update any attributes which have been modified:
                                (if (= country "Other")
                                  (when (and (not= country_other "")
                                             (not= country_other (:country user)))
                                    {:country country_other})
                                  (when (and (not= country "") (not= country (:country user)))
                                    {:country country}))
                                (if (= province "Other")
                                  (when (and (not= province_other "")
                                             (not= province_other (:province user)))
                                    {:province province_other})
                                  (when (and (not= province "") (not= province (:province user)))
                                    {:province province}))
                                (when (and (not= name "") (not= name (:name user)))
                                  {:name name})
                                (when (and (not= band "") (not= band (:band user)))
                                  {:band band})
                                (when (and (not= city "") (not= city (:city user)))
                                  {:city city})
                                (when (and (not= phone "") (not= phone (:phone user)))
                                  {:phone phone})
                                (when (and (not= newsletter "")
                                           (not= newsletter (:newsletter user)))
                                  {:newsletter newsletter})
                                (when (not= password "")
                                  {:password (hashers/derive password)})))
        update-user-rec-in-db (fn [dereferenced-user-db]
                                (let [{matching-user-recs true, other-user-recs false}
                                      (->> dereferenced-user-db
                                           (group-by (fn [row] (= email (:email row)))))
                                      ;; Emails are unique, so only one record will match:
                                      potential-new-user-record (get-updated-user-rec
                                                                 (first matching-user-recs))]
                                  ;; Return the database records including the modified one
                                  ;; if it exists:
                                  (if (= (count matching-user-recs) 0)
                                    other-user-recs
                                    (conj other-user-recs potential-new-user-record))))]

    ;; Update the user db with the modified user record
    (swap! user-db update-user-rec-in-db))
  ;; Persist the db to disk:
  (write-atomic-db-to-csv user-db users-file))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to purchases in the data directory
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def purchases-path "data/purchases")
(def purchases-file (str purchases-path "/purchases.csv"))
(def purchases-details-file (str purchases-path "/purchases-details.csv"))
(def chart-template-dir (str catalogue-path "/chart-pdfs"))

(defn get-full-purchase-path
  "If the given relative path of a purchase can be found in the purchases directory, then return
  its absolute path, otherwise return nil"
  [purchase-dir purchase-file]
  (let [full-purchase-path (str purchases-path "/" purchase-dir "/" purchase-file)]
    (when (.exists (io/as-file full-purchase-path))
      full-purchase-path)))

;; Initialize the purchases database. Note that the user database may change while the server is
;; running, so we make it an atom. Updates are handled similarly to the users database (see above)
(def purchases-db (atom (simple-extract-db-from-csv purchases-file)))
(def purchases-details-db (atom (simple-extract-db-from-csv purchases-details-file)))

(defn get-user-purchases
  "Returns a sequence of maps for each of the given user's purchases, containing the fields :userid,
  :uuid, and :epoch-ms, which are obtained by parsing the directory names in the purchases/
  directory. Each directory name is of the form '<userid>:<uuid>:<epoch-ms>' where <userid> is
  the user's id, <uuid> is randomly generated when the purchase is made, and <epoch-ms> is the
  epoch time in milliseconds at the time the purchase was made."
  [userid]
  (->> purchases-db
       (deref)
       (filter #(= (:userid %) userid))))

(defn remove-already-owned-charts-from-cart
  "Remove any already-owned items from the given cart of the given user"
  [userid cart]
  ;; This function is meant to be a safeguard against allowing the user to purchase charts that she
  ;; already owns. Ideally, the web page should not allow already owned charts to ever be in the
  ;; user's cart, but this is a second safety mechanism, just in case.
  (let [owned-charts (->> userid
                          (get-user-purchases)
                          (map #(string/split (:charts %) #"\s*;\s*"))
                          (map set)
                          (apply clojure.set/union))
        pruned-cart (->> cart
                         (filter #(not (contains? owned-charts %))))]
    (when (not= (set cart) (set pruned-cart))
      (log/warn "Shopping cart for user" userid "contained items that are already owned:"
                (clojure.set/difference (set cart) (set pruned-cart))))
    ;; Return the pruned cart:
    pruned-cart))

(defn create-purchase!
  "Create a new record in the purchase db for the items in the given cart for the given user"
  [userid cart subtotal taxrate taxname taxes total watermark]
  (let ;; Purchase id is composed of a randomly generated UUID prepended to the epoch time in ms:
      [purchaseid (generate-random-id)
       purchasedir (str purchases-path "/" purchaseid)
       today (->> (jtime/local-date) (jtime/format "yyyy-MM-dd"))
       pruned-cart (remove-already-owned-charts-from-cart userid cart)
       user (get-user-by-id userid)
       get-chart-data (fn [filename] (->> catalogue
                                          :charts
                                          (filter #(= filename (:filename %)))
                                          (map #(select-keys % [:chart-name :price :composer :grade
                                                                :subgenre]))
                                          (first)))]

    ;; Update the two purchases databases with the new purchase record. We do this first, since if
    ;; one of the steps below goes wrong, at least the purchase will have been recorded.
    (swap! purchases-db conj
           (array-map :purchaseid purchaseid :userid userid  :user_name (:name user)
                      :user_email (:email user) :charts (string/join ";" pruned-cart)
                      :date today :subtotal subtotal :taxrate taxrate :taxname taxname :taxes taxes
                      :total total :watermark watermark :paypal_token nil :paypal_payer nil
                      :expires nil :completed nil :cancelled nil))
    (swap! purchases-details-db into
           (for [chart (map get-chart-data pruned-cart)]
             (array-map :purchaseid purchaseid :chart (:chart-name chart) :price (:price chart)
                        :composer (:composer chart) :grade (:grade chart)
                        :subgenre (:subgenre chart))))

    ;; Create a new subdirectory in the purchases directory
    (.mkdir (java.io.File. purchasedir))

    ;; Look up the charts in the catalogue directory, and create stamped copies of them in the
    ;; new directory:
    (doseq [item pruned-cart]
      ;; Create the watermark file:
      (try
        (pdf/pdf [{:font {:family :times-roman :style :italic :encoding :unicode :color [47 79 79]}}
                  [:phrase watermark]]
                 (str purchasedir "/watermark.pdf"))
        (catch Exception ex
          (log/error (.getMessage ex) "\n" (.printStackTrace ex))))

      ;; Now call the external program 'pdftk' to add the watermark to the charts' PDFs:
      (doseq [file-type ["score" "parts"]]
        (let [exit-status (sh "pdftk" (str chart-template-dir "/" item "." file-type ".pdf")
                              "stamp" (str purchasedir "/watermark.pdf")
                              "output" (str purchasedir "/" item "." file-type ".pdf"))]
          (when (not= (:exit exit-status) 0)
            (log/error "During purchase, stamping of" file-type "for chart" item "for user" userid
                       "failed:" (:err exit-status))))))

    ;; Persist the purchases databases to disk (for backup purposes):
    (write-atomic-db-to-csv purchases-db purchases-file)
    (write-atomic-db-to-csv purchases-details-db purchases-details-file)))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to other data in the data directory
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def about-path "data/about")
(def indices-path "data/indices")
(def email-path "data/email")

(defn get-about-page-contents
  [about-page]
  (slurp (str about-path "/" about-page ".md")))

(defn get-index-file-contents
  [index-file]
  (try
    (slurp (str indices-path "/" index-file ".md"))
    (catch java.io.FileNotFoundException ex
      "No content found!")))

(defn get-inquiry-email-contents
  [email]
  (with-open [reader (io/reader (str email-path "/" email ".csv"))]
    (let [[header data] (doall (csv/read-csv reader))]
      {:to (get data (.indexOf header "to"))
       :subject (get data (.indexOf header "subject"))
       :body (get data (.indexOf header "body"))})))

(defn get-activation-email-contents
  [user link]
  (let [template (slurp (str email-path "/activation.md"))]
    (-> template
        (string/replace #"<USER>" user)
        (string/replace #"<LINK>" link))))

(defn get-reset-pwid-email-contents
  [is-migration user link]
  (let [template (if (nil? is-migration)
                   (slurp (str email-path "/reset-pw.md"))
                   (slurp (str email-path "/migration.md")))]
    (-> template
        (string/replace #"<USER>" user)
        (string/replace #"<LINK>" link))))
