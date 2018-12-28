(ns clovertonemusic.data
  (:require [buddy.hashers :as hashers]
            [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [clojure.data :refer [diff]]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [clojure.string :as string]
            [java-time :as jtime]
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
  "Returns a number 1 larger than the largest user id in the db, in string format"
  []
  (->> user-db
       (deref)
       (map (fn [idstring] (utils/parse-number (:userid idstring))))
       (apply max)
       (inc)
       (str)))

(defn get-user-by-id
  "Finds and returns the user in the db corresponding to the given userid"
  [userid]
  (->> user-db
       (deref)
       (filter #(= (:userid %) userid))
       (first))) ; Note: result of filter must be unique (verified at load time)

(defn get-user-by-email
  "Finds and returns the user in the db corresponding to the given email"
  [email]
  (->> user-db
       (deref)
       (filter #(= (:email %) email))
       (first))) ; Note: result of filter must be unique (verified at load time)

(defn check-password
  "Returns true if the password is correct, false if not correct, and nil if the user isn't found."
  [email password]
  (->> email
       (get-user-by-email)
       :password
       (hashers/check password)))

(defn get-user-by-email-and-password
  "Returns the record corresponding to the given email if the password is correct,
  or false if the password is incorrect, or nil if the email isn't found."
  [email password]
  (let [password-ok (check-password email password)]
    (cond
      (nil? password-ok) nil
      (not password-ok) false
      password-ok (get-user-by-email email))))

(defn write-user-db-to-csv
  []
  (let [colkeys (->> user-db
                     (deref)
                     (first)
                     (keys))
        get-values-from-rec (fn [user-rec]
                              (for [colkey colkeys]
                                (colkey user-rec)))]
    (with-open [writer (io/writer users-file)]
      ;; Write the header row:
      (csv/write-csv writer [(map name colkeys)])
      ;; Write the data rows:
      (doseq [rec (deref user-db)]
        (csv/write-csv writer [(get-values-from-rec rec)])))))

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
            ;; Activation id is the epoch time in ms appended to a randomly generated UUID:
            activationid (str (java.util.UUID/randomUUID) (System/currentTimeMillis))]
        ;; Write the user record to the user db, indicating the user is not yet activated by placing
        ;; "0" in the activated field, and writing an activation id which will be used for later
        ;; activation. The activation id is then returned to the caller as a convenience. We use an
        ;; array map to keep the fields in the same order in which they were inserted:
        (swap! user-db conj (array-map
                             :userid userid :lastaccessed nil :dateadded today
                             :password (hashers/derive password) :name name :band band :city city
                             :province province :country country :phone phone :email email
                             :newsletter newsletter :activated "0" :activationid activationid))
        ;; Persist the user-db to disk (in case of a crash):
        (write-user-db-to-csv)
        ;; Finally return the activation id:
        activationid))))

(defn activate-user!
  "Activates the user corresponding to the given activation id. If the user is activated, returns
  true, otherwise if the activation id is not found, returns false."
  [activationid]
  (let [matches-activationid (fn [row]
                               (and (= (:activated row) "0")
                                    (= (:activationid row) activationid)))
        mark-as-activated (fn [dereferenced-user-db]
                            (let [{matching-user-recs true, other-user-recs false}
                                  (->> dereferenced-user-db
                                       (group-by matches-activationid))
                                  ;; There will always only ever be one matching user at most:
                                  potential-new-user-record (merge
                                                             (first matching-user-recs)
                                                             {:activated "1" :activationid nil})]
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
          (write-user-db-to-csv)
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
                                 (conj other-user-recs potential-new-user-record))))
        old-db-contents (deref user-db)]

    ;; Update the user db with the current time as the last accessed time
    (swap! user-db update-access-time))
  ;; Persist the database to disk, and then return the userid back to the caller:
  (write-user-db-to-csv)
  userid)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to purchases in the data directory
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def purchases-path "data/purchases")
(def purchases-db-file (str purchases-path "/purchases.csv"))

;; Initialize the purchases database. Note that the user database may change while the server is
;; running, so we make it an atom. Updates are handled similarly to the users database (see above)
(def purchases-db (atom (simple-extract-db-from-csv purchases-db-file)))

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


(defn get-full-purchase-path
  "If the given relative path of a purchase can be found in the purchases directory, then return
  its absolute path, otherwise return nil"
  [purchase-dir purchase-file]
  (let [full-purchase-path (str purchases-path "/" purchase-dir "/" purchase-file)]
    (when (.exists (io/as-file full-purchase-path))
      full-purchase-path)))

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

(defn get-email-contents
  [email]
  (with-open [reader (io/reader (str email-path "/" email ".csv"))]
    (let [[header data] (doall (csv/read-csv reader))]
      {:to (get data (.indexOf header "to"))
       :subject (get data (.indexOf header "subject"))
       :body (get data (.indexOf header "body"))})))
