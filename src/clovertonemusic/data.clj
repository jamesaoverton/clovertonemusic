(ns clovertonemusic.data
  (:require [clojure.data :refer [diff]]
            [clojure.data.csv :as csv]
            [clojure.java.shell :refer [sh]]
            [clojure.java.io :as io]
            [clojure.string :as string]
            [clojure.tools.logging :as log]
            [buddy.hashers :as hashers]
            [clj-logging-config.log4j :as log-config]
            [clj-pdf.core :as pdf]
            [dk.ative.docjure.spreadsheet :as xlsx]
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

(def config
  "A map of configuration parameters, loaded from the config file in the data directory"
  (try
    (->> "data/config.edn"
         (slurp)
         (clojure.edn/read-string))
    (catch Exception ex
      (fail "Unable to read configuration file"))))

(defn pull-xlsx-file
  "Given the filename of a file on the remote drive in XLSX format, pull it to the server's
  filesystem"
  [remote-filename local-path]
  (let [exit-status (sh "rclone" "copy" "--drive-export-formats" "xlsx"
                        (-> config
                            :remote-drive-name
                            (str remote-filename))
                        local-path)]
    (when (not= (:exit exit-status) 0)
      (log/error "Rclone pull failed:" (:err exit-status)))
    ;; Return the exit status from rclone:
    (:exit exit-status)))

(defn push-xlsx-file
  "Given a path to a file on the server's file system, push it to the remote drive in XLSX format"
  [local-path]
  (let [exit-status (sh "rclone" "copy" "--drive-import-formats" "xlsx"
                        local-path
                        (:remote-drive-name config))]
    (when (not= (:exit exit-status) 0)
      (log/error "Rclone push failed:" (:err exit-status)))
    ;; Return the exit status from rclone:
    (:exit exit-status)))

(defn extract-rows-from-xlsx
  "Given an XLSX workbook and the name of a worksheet within it, extract and return the data rows
  from that sheet"
  [workbook sheetname]
  ;; Note the following:
  ;; ------------------
  ;; When retrieving data from a worksheet, docjure ignores columns that do not have data, even
  ;; when the column has a header. For example, if we have:
  ;;
  ;; col1 | col2 | col3
  ;; -----|------|-----
  ;; 1    | 3    |  2
  ;; 5    |      |  3
  ;;
  ;; then docjure will extract the data rows: [["1" "3" "2"] ["5" "3"]]. This is really awful. What
  ;; we need to have instead is: [["1" "3" "2"] ["5" "" "3"]]. To implement this we have do go
  ;; through some contortions. First we get the contents of the header row, and use it to create a
  ;; map mapping each alphabetic character from A-Z (note: we don't allow more than 26 columns) to
  ;; its corresponding header column. Then we use the mapping to get the data from the data rows.
  ;; But note that the data will be problematic in the way described above. So we then have to merge
  ;; the data for each row with a map in which each column header is mapped to "". Ugh.
  (let [sheet (->> workbook
                   (xlsx/select-sheet sheetname))
        header-row (->> sheet
                        (first)
                        (map #(.toString %))
                        (vec))
        ;; A mapping from columns A-Z to their corresponding headers. Note that 65 to 91 are A to Z
        ;; in ASCII:
        column-header-mapping (->> header-row
                                   (zipmap (->> (range 65 91)
                                                (map char)
                                                (map str)
                                                (map keyword))))
        ;; A mapping in which each header name is assigned the empty string. We will use this later
        ;; as the basis upon which to superimpose the data for a given row in the sheet:
        row-template (->> header-row
                          (map #(list % ""))
                          (flatten)
                          (apply hash-map))
        data-rows (->> sheet
                       (xlsx/select-columns column-header-mapping)
                       ;; drop the header and remove any empty rows:
                       (drop 1)
                       (remove nil?)
                       (map (fn [row]
                              ;; For each row, start with the row-template, then merge it with
                              ;; the data row, resulting in a map from header names to the data in
                              ;; this row, including any empty cells. In the last step we remove
                              ;; the header to yield only the data values (in the right order),
                              ;; including any empty cells:
                              (-> row-template
                                  (merge row)
                                  (map header-row))))
                       ;; When parsing numeric cells, docjure formats integers as float. We need to
                       ;; rectify this, so we call the utils/parse-as-string function, which formats
                       ;; numbers that have no decimal places or only zeroes after the decimal as
                       ;; integers:
                       (map #(->> %
                                  (map utils/parse-as-string)
                                  (vec))))]
    ;; Return all the rows in the sheet (including the header):
    (->> data-rows
         (into [header-row]))))

(defn simple-extract-db-from-xlsx
  "Reads the contents of the given worksheet from the given XLSX workbook and returns a sequence of
  array maps for each record"
  [workbook sheetname]
  (let [[header & data-rows] (extract-rows-from-xlsx workbook sheetname)
        header-keywords (map keyword header)
        ;; It would be simpler to convert each row to a zipmap. However, we use an array map since
        ;; that will keep the columns in the original order that they were in in the file.
        generate-array-map (fn [row] (->> row
                                          (map vector header-keywords)
                                          (flatten)
                                          (apply array-map)))]
    (map generate-array-map data-rows)))

(defn write-atomic-db-to-xlsx
  "Writes the contents of an atomic db to the given sheet in its associated XLSX file, and pushes
  the updated file to the remote drive"
  [atomic-db xlsx sheetname]
  (try
    (let [dereferenced-db (deref atomic-db)
          colkeys (->> dereferenced-db
                       (first)
                       (keys))
          get-values-from-rec (fn [db-rec]
                                (for [colkey colkeys]
                                  (colkey db-rec)))
          update-worksheet (fn [rows]
                             ;; This is implemented simply by removing all existing rows and
                             ;; re-adding them to the worksheet. The data set is relatively
                             ;; small so this should be fine, however if the customer-base
                             ;; expands sufficiently we may want to revisit this implementation
                             ;; to make it more scalable.
                             (-> sheetname
                                 (xlsx/select-sheet (:workbook xlsx))
                                 (xlsx/remove-all-rows!)
                                 (xlsx/add-rows! rows))
                             ;; Save the workbook to the filesystem and push it to the remote drive:
                             (xlsx/save-workbook-into-file! (:path xlsx) (:workbook xlsx))
                             (push-xlsx-file (:path xlsx)))]
      (-> []
          ;; The header row:
          (into (->> colkeys
                     (map name)
                     (list)))
          ;; The data rows:
          (into (->> dereferenced-db
                     (map #(get-values-from-rec %))))
          (update-worksheet)))
    (catch Exception ex
      (->> xlsx
           :name
           (str "Got error: '" (.getMessage ex) "' while persisting ")
           (log/error))
      (->> (Thread/currentThread)
           (.getStackTrace)
           (interpose "\n")
           (apply str)
           (log/debug)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to the music catalogue
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def catalogue-dir "data/catalogue")

(def catalogue-xlsx
  (let [xlsx-name (:catalogue-xlsx-name config)]
    ;; Try to get the file from the remote drive and fail if we cannot:
    (when-not (= (pull-xlsx-file xlsx-name catalogue-dir) 0)
      (fail (str "Error retrieving catalogue file: " xlsx-name)))
    ;; catalogue-xlsx is a map consisting of the filename and associated workbook object
    {:name xlsx-name
     :workbook (->> xlsx-name
                    (str catalogue-dir "/")
                    (xlsx/load-workbook))}))

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

(defn generate-table-from-xlsx
  "Given a table name and a data catalogue, this function generates a table from an XLSX file stored
  on disk. It returns a new catalogue consisting of the old catalogue merged with a new entry for
  the constructed table."
  [tablename catalogue]
  (try
    (log/info "Loading" tablename)
    (->> tablename
         (extract-rows-from-xlsx (:workbook catalogue-xlsx))
         (create-table tablename catalogue)
         (hash-map (keyword tablename))
         (merge catalogue))
    (catch Exception ex
      (->> (Thread/currentThread)
           (.getStackTrace)
           (interpose "\n")
           (apply str)
           (log/debug))
      (fail (str "Error while parsing " tablename ": " (.getMessage ex))))))

(def catalogue
  ;; The catalogue is built by generating each catalogue table successively. The output
  ;; of each call adds the built table to the orignally given catalogue; i.e.:
  ;; {} -> {:genres {...}} -> {:genres {...} :composers {...}} -> ...
  ;; The order here is important; in particular "charts" must be last since it has
  ;; foreign keys to all of the other tables.
  (->> {}
       (generate-table-from-xlsx "genres")
       (generate-table-from-xlsx "composers")
       (generate-table-from-xlsx "grades")
       (generate-table-from-xlsx "charts")))

;; Validate that, for each catalogue entry, there is an mp3 file in the audio directory, a preview
;; PDF in the previews directory, and two PDFs for the full score and individual parts,
;; respectively, in the chart-pdfs directory

(log/info "Looking for PDFs and MP3s")

(doseq [chart-filename (->> catalogue
                            :charts
                            (map #(:filename %)))]

  (let [parts (-> catalogue-dir
                  (str "/chart-pdfs/")
                  (str chart-filename)
                  (str ".parts.pdf"))]
    (when-not (.exists (io/as-file parts))
      (fail (str parts " does not exist"))))

  (let [score (-> catalogue-dir
                  (str "/chart-pdfs/")
                  (str chart-filename)
                  (str ".score.pdf"))]
    (when-not (.exists (io/as-file score))
      (fail (str score " does not exist"))))

  (let [preview (-> "resources/public/previews/"
                    (str chart-filename)
                    (str ".preview.pdf"))]
    (when-not (.exists (io/as-file preview))
      (fail (str preview " does not exist"))))

  (let [audio (-> "resources/public/audio/"
                  (str chart-filename)
                  (str ".mp3"))]
    (when-not (.exists (io/as-file audio))
      (fail (str audio " does not exist")))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Data relating to the users and purchases databases
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def users-and-purchases-dir "data/users-and-purchases")

(def users-and-purchases-xlsx
  (let [xlsx-name (:users-and-purchases-xlsx-name config)]
    ;; Try to get the file from the remote drive and fail if we cannot:
    (when-not (= (pull-xlsx-file xlsx-name users-and-purchases-dir) 0)
      (fail (str "Error retrieving users-and-purchases file: " xlsx-name)))
    ;; users-and-purchases-xlsx is a map consisting of the filename, path, and associated workbook:
    {:name xlsx-name
     :path (str users-and-purchases-dir "/" xlsx-name)
     :workbook (->> xlsx-name
                    (str users-and-purchases-dir "/")
                    (xlsx/load-workbook))}))

(def purchases-data-dir (str users-and-purchases-dir "/purchases"))
(def chart-template-dir (str catalogue-dir "/chart-pdfs"))

;; Initialize the users database using the XLSX workbook. Note that it may change while the server
;; is running, so we make it an atom. The way this works is as follows:
;; - We read it from disk into memory at server startup
;; - All subsequent read accesses are to the memory instance.
;; - When an update is made (e.g., through create-user! or activate-user!), we update the atom, and
;;   then persist the atom to disk and to the remote drive. Apart from these occasional writes, the
;;   .xlsx file on disk is never written to except the one time at startup.
(def users-db (-> users-and-purchases-xlsx
                  :workbook
                  (simple-extract-db-from-xlsx "users")
                  (atom)))

;; Verify that the user database is in a good state at server startup; fail otherwise:
(let [dereferenced-db (deref users-db)]
  (when-not (empty? dereferenced-db)
    (when-not (->> dereferenced-db
                   (map #(:email %))
                   (apply distinct?))
      (fail "User database contains duplicate emails"))))

;; Initialize the purchases and purchases-details databases using the XLSX workbook. Note that they
;; may change while the server is running, so we make them atoms. Updates are handled similarly to
;; the users database (see above)
(def purchases-db (-> users-and-purchases-xlsx
                      :workbook
                      (simple-extract-db-from-xlsx "purchases-summary")
                      (atom)))

(def purchases-details-db (-> users-and-purchases-xlsx
                              :workbook
                              (simple-extract-db-from-xlsx "purchases-details")
                              (atom)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions relating to users
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn get-next-user-id
  "Returns a number 1 larger than the largest user id in the db, in string format."
  []
  (letfn [(max-or-default [number-collection]
            ;; Get back the largest number in the collection or 0 if it is empty:
            (if (empty? number-collection)
              0
              (apply max number-collection)))]
    (->> users-db
         (deref)
         (map (fn [idstring]
                ;; Old pre-migration users may have a non-numeric userid. If we come across one of
                ;; these just treat it as '0', i.e. the minimum possible value:
                (try
                  (utils/parse-as-number (:userid idstring))
                  (catch Exception ex 0))))
         (max-or-default)
         (inc)
         (str))))

(defn get-user-by-id
  "Finds and returns the user in the db corresponding to the given userid."
  [userid]
  (->> users-db
       (deref)
       (filter #(= (:userid %) userid))
       (first))) ; Note: result of filter must be unique (verified at load time)

(defn get-user-by-email
  "Finds and returns the user in the db corresponding to the given email."
  [email]
  (->> users-db
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
  (not (or (nil? (:activationid user))
           (= (:activationid user) "null")
           (string/blank? (:activationid user)))))

(defn get-user-by-resetpwid
  "Finds and returns the user in the db associated with the given reset password id"
  [resetpwid]
  (->> users-db
       (deref)
       (filter #(= (:resetpwid %) resetpwid))
       (first)))

(defn generate-random-id
  "Generate a random id composed of the epoch time in ms appended to a randomly generated UUID. This
  is used for generating activation ids, purchase ids, reset password ids, etc."
  []
  (str (java.util.UUID/randomUUID) (System/currentTimeMillis)))

(defn create-user!
  "Creates a user with the given information and writes the record to the xlsx file. If the user
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
        ;; The way this works is, an activationid in the user record that is not blank means that
        ;; the user has not yet been activated. The activation id is then returned to the caller as
        ;; a convenience. We use an array map to keep the fields in the same order in which they
        ;; were inserted:
        (swap! users-db conj (array-map
                              :userid userid :lastaccessed "" :dateadded today
                              :password (hashers/derive password) :name name :band band :city city
                              :province province :country country :phone phone :email email
                              :newsletter newsletter :activationid activationid :resetpwid ""))
        ;; Persist the database, and then return the userid back to the caller. Note that future
        ;; blocks don't emit generated exceptions until they are de-referenced. Since we don't care
        ;; about the result of the block and won't be de-referencing it, it is important to handle
        ;; all exceptions within the write-atomic-db-to-xlsx function.
        (future (locking users-and-purchases-xlsx
                  (write-atomic-db-to-xlsx users-db users-and-purchases-xlsx "users")))
        ;; Finally return the activation id:
        activationid))))

(defn activate-user!
  "Activates the user corresponding to the given activation id. If the user is activated
  successfully, returns true, otherwise if the activation id is not found, returns false."
  [activationid]
  (let [mark-as-activated (fn [dereferenced-users-db]
                            (let [{matching-user-recs true, other-user-recs false}
                                  (->> dereferenced-users-db
                                       (group-by #(= (:activationid %) activationid)))
                                  ;; There will always only ever be one matching user at most:
                                  potential-new-user-record (merge
                                                             (first matching-user-recs)
                                                             {:activationid ""})]
                              ;; Return the database records including the modified record
                              ;; if it exists:
                              (if (= (count matching-user-recs) 0)
                                other-user-recs
                                (conj other-user-recs potential-new-user-record))))
        old-db-contents (deref users-db)]

    ;; Update the user db to mark the user as activated:
    (swap! users-db mark-as-activated)
    ;; Now compare the old and new db contents. If there are differences, persist the database
    ;; and return true; otherwise return false. If there is no difference this is because
    ;; the activation id was not found.
    (let [differences (diff (sort-by :userid old-db-contents) (sort-by :userid (deref users-db)))]
      (if (or (first differences) (second differences))
        (do
          ;; Note that future blocks don't emit generated exceptions until they are de-referenced.
          ;; Since we don't care about the result of the block and won't be de-referencing it, it is
          ;; important to handle all exceptions within the write-atomic-db-to-xlsx function.
          (future (locking users-and-purchases-xlsx
                    (write-atomic-db-to-xlsx users-db users-and-purchases-xlsx "users")))
          true)
        false))))

(defn update-user-last-accessed-time!
  "Updates the last accessed time of the user in the db with the given userid"
  [userid]
  (let [current-time (->> (jtime/offset-date-time) (jtime/format "yyyy-MM-dd HH:mmZ"))
        update-access-time (fn [dereferenced-users-db]
                             (let [{matching-user-recs true, other-user-recs false}
                                   (->> dereferenced-users-db
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
    (swap! users-db update-access-time))
  ;; Persist the database, and then return the userid back to the caller. Note that future blocks
  ;; don't emit generated exceptions until they are de-referenced. Since we don't care about the
  ;; result of the block and won't be de-referencing it, it is important to handle all exceptions
  ;; within the write-atomic-db-to-xlsx function.
  (future (locking users-and-purchases-xlsx
            (write-atomic-db-to-xlsx users-db users-and-purchases-xlsx "users")))
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
        update-resetpwid (fn [dereferenced-users-db]
                           (let [{matching-user-recs true, other-user-recs false}
                                 (->> dereferenced-users-db
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
    (swap! users-db update-resetpwid)
    ;; Persist the database, then return the generated password reset id back to the caller. Note
    ;; that future blocks don't emit generated exceptions until they are de-referenced. Since we
    ;; don't care about the result of the block and won't be de-referencing it, it is important to
    ;; handle all exceptions within the write-atomic-db-to-xlsx function.
    (future (locking users-and-purchases-xlsx
              (write-atomic-db-to-xlsx users-db users-and-purchases-xlsx "users")))
    resetpwid))

(defn change-user-password!
  "Change the password for the given user with the given one, deleting any existing
  'reset password id' in the user record."
  [userid new-password]
  (let [hashed-new-password (hashers/derive new-password)
        update-password (fn [dereferenced-users-db]
                          (let [{matching-user-recs true, other-user-recs false}
                                (->> dereferenced-users-db
                                     (group-by (fn [row] (= userid (:userid row)))))
                                potential-new-user-record (merge
                                                           (first matching-user-recs)
                                                           {:password hashed-new-password
                                                            :resetpwid ""})]
                            ;; Return the database records including the modified record if it
                            ;; exists:
                            (if (= (count matching-user-recs) 0)
                              other-user-recs
                              (conj other-user-recs potential-new-user-record))))]
    ;; Update the user db:
    (swap! users-db update-password))
  ;; Persist the db. Note that future blocks don't emit generated exceptions until they are
  ;; de-referenced. Since we don't care about the result of the block and won't be de-referencing
  ;; it, it is important to handle all exceptions within the write-atomic-db-to-xlsx function.
  (future (locking users-and-purchases-xlsx
            (write-atomic-db-to-xlsx users-db users-and-purchases-xlsx "users"))))

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
        update-user-rec-in-db (fn [dereferenced-users-db]
                                (let [{matching-user-recs true, other-user-recs false}
                                      (->> dereferenced-users-db
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
    (swap! users-db update-user-rec-in-db))
  ;; Persist the db. Note that future blocks don't emit generated exceptions until they are
  ;; de-referenced. Since we don't care about the result of the block and won't be de-referencing
  ;; it, it is important to handle all exceptions within the write-atomic-db-to-xlsx function.
  (future (locking users-and-purchases-xlsx
            (write-atomic-db-to-xlsx users-db users-and-purchases-xlsx "users"))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions relating to purchases
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn get-full-purchase-path
  "If the given relative path of a purchase can be found in the purchases directory, then return
  its absolute path, otherwise return nil"
  [purchase-dir purchase-file]
  (let [full-purchase-path (str purchases-data-dir "/" purchase-dir "/" purchase-file)]
    (when (.exists (io/as-file full-purchase-path))
      full-purchase-path)))

(defn get-user-purchases
  "Returns a sequence of maps for each of the given user's purchases, containing the fields :userid,
  :uuid, and :epoch-ms, which are obtained by parsing the directory names in the purchases/
  directory. Each directory name is of the form '<userid>:<uuid>:<epoch-ms>' where <userid> is
  the user's id, <uuid> is randomly generated when the purchase is made, and <epoch-ms> is the
  epoch time in milliseconds at the time the purchase was made."
  [userid]
  (->> purchases-db
       (deref)
       (filter #(and (->> %
                          :userid
                          (= userid))
                     (->> %
                          :payment-completed
                          (string/lower-case)
                          (= "true"))))))

(defn generate-purchase-pdfs
  "Given a Stripe Checkout session id, find the purchase corresponding to it, and for each
  chart purchased, create a PDF with a watermark indicating the purchasing user's band name.
  Save the PDFs to a unique directory corresponding to the purchase on the server's filesystem."
  [stripe-checkout-session-id]
  (let [purchase (->> purchases-db
                      (deref)
                      (filter #(= (:stripe-checkout-session-id %) stripe-checkout-session-id))
                      (first))
        purchasedir (->> purchase
                         :purchaseid
                         (str purchases-data-dir "/"))
        purchased-charts (-> purchase
                             :charts
                             (or "")
                             (string/split #"\s*;\s*"))]

    (when-not (nil? purchase)
      ;; Create a new subdirectory in the purchases directory
      (.mkdir (java.io.File. purchasedir))

      ;; Look up the charts in the catalogue directory, and create stamped copies of them in the
      ;; new directory:
      (doseq [chart purchased-charts]
        ;; Create the watermark file:
        (try
          (pdf/pdf [{:font {:family :times-roman :style :italic :encoding :unicode
                            :color [47 79 79]}}
                    [:phrase (:watermark purchase)]]
                   (str purchasedir "/watermark.pdf"))
          (catch Exception ex
            (->> (Thread/currentThread)
                 (.getStackTrace)
                 (interpose "\n")
                 (apply str)
                 (log/debug))
            (log/error (.getMessage ex))))

        ;; Now call the external program 'pdftk' to add the watermark to the charts' PDFs:
        (doseq [file-type ["score" "parts"]]
          (let [exit-status (sh "pdftk" (str chart-template-dir "/" chart "." file-type ".pdf")
                                "stamp" (str purchasedir "/watermark.pdf")
                                "output" (str purchasedir "/" chart "." file-type ".pdf"))]
            (when (not= (:exit exit-status) 0)
              (log/error "During purchase, stamping of" file-type "for chart" chart "for purchase"
                         (:purchaseid purchase) "failed:" (:err exit-status)))))))))

(defn mark-as-paid!
  "Marks the purchase corresponding to the given stripe checkout session id as paid, and then
  generates the files corresponding to the purchase. If successful, returns true, otherwise
  returns false."
  [stripe-checkout-session-id]
  (let [mark-as-paid (fn [dereferenced-purchases-db]
                       (let [{matching-purchase-recs true, other-purchase-recs false}
                             (->> dereferenced-purchases-db
                                  (group-by #(= (:stripe-checkout-session-id %)
                                                stripe-checkout-session-id)))
                             ;; There will always only ever be one matching purchase at most:
                             potential-new-purchase-rec (merge (first matching-purchase-recs)
                                                               {:payment-completed "true"})]
                         ;; Return the database records including the modified record
                         ;; if it exists:
                         (if (= (count matching-purchase-recs) 0)
                           other-purchase-recs
                           (conj other-purchase-recs potential-new-purchase-rec))))
        old-db-contents (deref purchases-db)]

    ;; Update the purchases db to mark the purchase as paid:
    (swap! purchases-db mark-as-paid)

    ;; Create the watermarked charts corresponding to the purchase on the server's filesystem:
    (generate-purchase-pdfs stripe-checkout-session-id)

    ;; Now compare the old and new db contents. If there are differences, persist the database
    ;; and return true; otherwise return false. If there is no difference this is because
    ;; the activation id was not found.
    (let [differences (diff (sort-by :purchaseid old-db-contents)
                            (sort-by :purchaseid (deref purchases-db)))]
      (if (or (first differences) (second differences))
        (do
          ;; Note that future blocks don't emit generated exceptions until they are de-referenced.
          ;; Since we don't care about the result of the block and won't be de-referencing it, it is
          ;; important to handle all exceptions within the write-atomic-db-to-xlsx function.
          (future (locking users-and-purchases-xlsx
                    (write-atomic-db-to-xlsx purchases-db users-and-purchases-xlsx "purchases-summary")))
          true)
        false))))

(defn remove-already-owned-charts-from-cart
  "Remove any already-owned items from the given cart of the given user"
  [user {cart :cart, :as session}]
  ;; This function is meant to be a safeguard against allowing the user to purchase charts that she
  ;; already owns. A user may add already-owned charts to her cart if she is not logged in (since
  ;; is no way for the server to know which carts she owns if she isn't logged in). So this function
  ;; should be called after login.
  (let [owned-charts (->> user
                          :userid
                          (get-user-purchases)
                          (map #(string/split (:charts %) #"\s*;\s*"))
                          (map set)
                          (apply clojure.set/union))
        pruned-cart (->> cart
                         (filter #(not (contains? owned-charts %))))]
    (when (not= (set cart) (set pruned-cart))
      (log/info "Pruning items from cart of user" (:userid user) "that are already owned:"
                (clojure.set/difference (set cart) (set pruned-cart))))
    ;; Return the session replacing the original cart with the pruned cart:
    (assoc session :cart pruned-cart)))

(defn create-purchase!
  "Create a new record in the purchase db for the items in the given cart for the given user"
  [userid cart subtotal taxrate taxname taxes total watermark stripe-checkout-session-id]
  (let ;; Purchase id is composed of a randomly generated UUID prepended to the epoch time in ms:
      [purchaseid (generate-random-id)
       today (->> (jtime/local-date) (jtime/format "yyyy-MM-dd"))
       user (get-user-by-id userid)
       get-chart-data (fn [filename] (->> catalogue
                                          :charts
                                          (filter #(= filename (:filename %)))
                                          (map #(select-keys % [:chart-name :price :composer :grade
                                                                :subgenre]))
                                          (first)))]
    ;; Update the two purchases databases with the new purchase record.
    (swap! purchases-db conj
           (array-map :purchaseid purchaseid :userid userid  :user_name (:name user)
                      :user_email (:email user) :charts (string/join ";" cart)
                      :date today :subtotal subtotal :taxrate taxrate :taxname taxname :taxes taxes
                      :total total :watermark watermark
                      :stripe-checkout-session-id stripe-checkout-session-id
                      :payment-completed "false"))
    (swap! purchases-details-db into
           (for [chart (map get-chart-data cart)]
             (array-map :purchaseid purchaseid :chart (:chart-name chart) :price (:price chart)
                        :composer (:composer chart) :grade (:grade chart)
                        :subgenre (:subgenre chart))))

    ;; Persist the purchases databases. Note that future blocks don't emit generated exceptions
    ;; until they are de-referenced. Since we don't care about the result of the block and won't be
    ;; de-referencing it, it is important to handle all exceptions within the
    ;; write-atomic-db-to-xlsx function.
    (future (locking users-and-purchases-xlsx
              (write-atomic-db-to-xlsx purchases-db users-and-purchases-xlsx "purchases-summary")))
    (future (locking users-and-purchases-xlsx
              (write-atomic-db-to-xlsx purchases-details-db
                                       users-and-purchases-xlsx
                                       "purchases-details")))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to other data in the data directory
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def about-path "data/about")
(def indices-path "data/indices")
(def email-path "data/email")

(defn get-about-page-contents
  "Return the contents of the given about page"
  [about-page]
  (slurp (str about-path "/" about-page ".md")))

(defn get-index-file-contents
  "Return the contents of the given index file"
  [index-file]
  (try
    (slurp (str indices-path "/" index-file ".md"))
    (catch java.io.FileNotFoundException ex
      "No content found!")))

(defn get-inquiry-email-contents
  "Given the name of an inquiry email CSV file, retrieve the values for the columns to, subject,
  and body, and return a map with those fields and their corresponding values."
  [email]
  (with-open [reader (io/reader (str email-path "/" email ".csv"))]
    (let [[header data] (doall (csv/read-csv reader))]
      {:to (get data (.indexOf header "to"))
       :subject (get data (.indexOf header "subject"))
       :body (get data (.indexOf header "body"))})))

(defn get-activation-email-contents
  "Given a user and an activation link, get the contents of an activation email to send to the user"
  [user link]
  (let [template (slurp (str email-path "/activation.md"))]
    (-> template
        (string/replace #"<USER>" user)
        (string/replace #"<LINK>" link))))

(defn get-reset-pwid-email-contents
  "Given a user, a URL link, and a flag specifying whether this is a migration or a normal reset
  password request, get the contents of the appropriate reset password email to send to the user."
  [is-migration user link]
  (let [template (if (nil? is-migration)
                   (slurp (str email-path "/reset-pw.md"))
                   (slurp (str email-path "/migration.md")))]
    (-> template
        (string/replace #"<USER>" user)
        (string/replace #"<LINK>" link))))
