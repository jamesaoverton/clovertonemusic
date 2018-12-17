(ns clovertonemusic.data
  (:require [buddy.hashers :as hashers]
            [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [clojure.string :as string]
            [java-time :as jtime]))

(def about-path "data/about")
(def indices-path "data/indices")
(def email-path "data/email")
(def catalogue-path "data/catalogue")
(def users-file "data/users/users.csv")

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

(defn fail
  "Logs a fatal error and then exits with a failure status"
  [errorstr]
  (log/fatal errorstr)
  (System/exit 1))

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

(defn get-user-db
  "Reads the contents of the CSV file containing user information and returns a sequence
  of zipmaps for each user record"
  []
  (with-open [reader (io/reader users-file)]
    (let [[header & data-rows] (doall (csv/read-csv reader))
          header-keywords (map keyword header)
          ;; It would be simpler to convert each row to a zipmap. However, we use an array map since
          ;; that will keep the columns in the original order that they were in in the file.
          generate-array-map (fn [row] (->> row
                                            (map vector header-keywords)
                                            (flatten)
                                            (apply array-map)))]
      (map generate-array-map data-rows))))

(defn get-next-user-id
  "Returns a number 1 larger than the largest user id in the db."
  [user-db]
  ;; We pass in the user-db from the caller, rather than generating it internally, to potentially
  ;; save processing if the caller needs to call this and other similar functions repeatedly.
  (->> user-db
       (map (fn [idstring] (Integer/parseInt (:userid idstring))))
       (apply max)
       (inc)))

(defn get-user-by-id
  "Finds and returns the user in the db corresponding to the given userid"
  ;; We pass in the user-db from the caller, rather than generating it internally, to potentially
  ;; save processing if the caller needs to call this and other similar functions repeatedly.
  [user-db userid]
  (->> user-db
       (filter #(= (:userid %) userid))
       (first))) ; Note: result of filter must be unique (verified at load time)

(defn get-user-by-email
  "Finds and returns the user in the db corresponding to the given email"
  [user-db email]
  ;; We pass in the user-db from the caller, rather than generating it internally, to potentially
  ;; save processing if the caller needs to call this and other similar functions repeatedly.
  (->> user-db
       (filter #(= (:email %) email))
       (first))) ; Note: result of filter must be unique (verified at load time)

(defn check-password
  "Returns true if the password is correct, false if not correct, and nil if the user isn't found."
  [user-db email passwd]
  ;; We pass in the user-db from the caller, rather than generating it internally, to potentially
  ;; save processing if the caller needs to call this and other similar functions repeatedly.
  (->> email
       (get-user-by-email user-db)
       :password
       (hashers/check passwd)))

(defn get-user-by-email-and-password
  "Returns the record corresponding to the given email if the password is correct,
  or false if the password is incorrect, or nil if the email isn't found."
  [user-db email passwd]
  ;; We pass in the user-db from the caller, rather than generating it internally, to potentially
  ;; save processing if the caller needs to call this and other similar functions repeatedly.
  (let [password-ok (check-password user-db email passwd)]
    (cond
      (nil? password-ok) nil
      (not password-ok) false
      password-ok (get-user-by-email user-db email))))

(defn create-user!
  "Creates a user with the given informatoin and writes the record to the csv file"
  [passwd name band city province country phone email newsletter]
  ;; Since this function will actually write to the user-db, it is best to fetch it internally
  ;; rather than accept it as a parameter from the caller.
  (let [user-db (get-user-db)
        today (->> (jtime/local-date) (jtime/format "yyyy-MM-dd"))
        userid (get-next-user-id user-db)
        ;; Activation id is composed of the epoch time in ms appended to a randomly generated UUID:
        activation-id (str (java.util.UUID/randomUUID) (System/currentTimeMillis))]
    ;; Write the user record to the CSV file, indicating the user is not yet activated by placing
    ;; a 0 in the activated field, and writing an activation id which will be used for later
    ;; activation. The activation id is then returned to the caller as a convenience.
    (with-open [writer (io/writer users-file :append true)]
      (csv/write-csv writer [[userid nil today (hashers/derive passwd) name band
                              city province country phone email newsletter 0 activation-id]]))
    activation-id))

(defn activate-user!
  "Activates the user corresponding to the given activation id"
  [activation-id]
  ;; Since this function will actually write to the user-db, it is best to fetch it internally
  ;; rather than accept it as a parameter from the caller.
  (let [user-db (get-user-db)
        colnames (->> user-db (first) (keys) (map name))
        only-vals (fn [user-rec] (for [col colnames]
                                   ((keyword col) user-rec)))
        matches-activation-id (fn [row] (and
                                         (= (:activated row) "0")
                                         (= (:activationid row) activation-id)))
        ;; There will always only ever be one matching user:
        {matching-user-recs true, other-user-recs false} (->> user-db
                                                              (group-by matches-activation-id))
        ;; We will it as activated and delete the activation id:
        new-user-record (merge (first matching-user-recs) {:activated 1 :activationid nil})]

    (when (> (count matching-user-recs) 0)
      ;; Write everything back to the CSV file:
      (with-open [writer (io/writer users-file)]
        (csv/write-csv writer [colnames])
        (doseq [user-rec other-user-recs]
          (csv/write-csv writer [(only-vals user-rec)]))
        (csv/write-csv writer [(only-vals new-user-record)])))))

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

;; Verify that the user database is in a good state:
(let [user-db (get-user-db)]
  (when-not (apply distinct? (map #(:email %) user-db))
    (fail "User database contains duplicate emails")))
