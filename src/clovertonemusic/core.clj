(ns clovertonemusic.core
  (:gen-class))

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io]
         '[clojure.tools.logging :as log]
         '[clojure.string :as str])

(def csv-path "data/catalogue")
(def catalogue-table-names ["composers" "genres" "grades" "charts"])
(def catalogue-table-constraints         ; Form: required (y/n)/type/foreign key
  {:composers {(keyword "Date Created")  "y/datetime/"
               (keyword "Date Modified") "y/datetime/"
               :Name                     "y/string/"
               :Filename                 "y/string/"
               :Notes                    "n/string/"}
   :genres {(keyword "Date Created")     "y/datetime/"
            (keyword "Date Modified")    "y/datetime/"
            :Name                        "y/string/"
            :Filename                    "y/string/"
            :Notes                       "n/string/"}
   :grades {(keyword "Date Created")     "y/datetime/"
            (keyword "Date Modified")    "y/datetime/"
            :Number                      "y/number/"
            :Name                        "y/string/"
            :Filename                    "y/string/"
            :Notes                       "n/string/"}
   :charts {(keyword "Date Created")     "y/datetime/"
            (keyword "Date Modified")    "y/datetime/"
            :Number                      "y/number/"
            :Name                        "y/string/"
            :Filename                    "y/string/"
            :Notes                       "n/string/"
            :Genre                       "y/string/genres-Name"
            :Composer                    "y/string/composers-Name"
            :Grade                       "y/number/grades-Number"
            :Category                    "y/string/"
            :Price                       "y/money/"
            :Recorded                    "n/number/"
            :Featured                    "y/number/"
            :Duration                    "n/time/"
            :Meter                       "n/ratio/"
            :Tempo                       "n/number/"
            (keyword "Band Type")        "n/string/"
            :Master                      "n/number/"
            :Project                     "n/string/"}})

(defn create-table
  "Creates a 'table' from the given data implemented as a vector of zipmaps"
  [[header-row & body-rows]]
  (reduce
   (fn [saved-rows next-row]
     (if (not= (count header-row) (count next-row))
       (throw (Exception. "Number of fields in data row does not match the number of headers"))
       (conj saved-rows (zipmap (map keyword header-row) next-row))))
   [] body-rows))

(defn extract-from-csv
  "Reads the contents of the CSV file containing the catalogue data from disk using the
  csv library and the read-csv function which returns a lazy sequence of vectors representing rows"
  [filename]
  (with-open [reader (io/reader (str csv-path "/" filename))]
    (doall
     (csv/read-csv reader))))

(defn load-catalogue
  "For each table name (defined above), read the CSV file which contains that data, and add it
  to a map that maps the table name to the data for that table."
  []
  (reduce
   (fn [result-map next-key]
     (try
       (log/info "Loading" next-key)
       (assoc result-map
              (keyword next-key)
              (create-table (extract-from-csv (str next-key ".csv"))))
       (catch Exception ex
         (log/fatal (str "Error while parsing " next-key ".csv: " (.getMessage ex)))
         (System/exit 1))))
   {} catalogue-table-names))

(defn validate-cell
  "For each data cell belonging to a given column of a given table:
   (1) Validate that it is not empty if it is a required field
   (2) Validate that the contents conform to the column's datatype
   (3) If the column has a foreign key, then check in the catalogue to see that it is satisfied"
  [[table column contents catalogue]]
  ; split up the string specifying the constraints associated with this column (defined above):
  (let [[required datatype foreign-key] (str/split (get (get catalogue-table-constraints table) column) #"/")]
    ; If the column is required, make sure it is not empty:
    (when (and (= required "y") (not (re-find #"\S+" contents)))
      (log/error "Required column:" column "of table" table "is empty"))
    ; Make sure the contents conform to the column's datatype:
    (when (or
           (and (= datatype "datetime") (not (re-matches #"\s*(\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}){0,1}\s*" contents)))
           (and (= datatype "time") (not (re-matches #"\s*(\d+s){0,1}\s*" contents)))
           (and (= datatype "money") (not (re-matches #"\s*(\$\d+(\.\d+){0,1}){0,1}\s*" contents)))
           (and (= datatype "ratio") (not (re-matches #"\s*(\d+/\d+){0,1}\s*" contents)))
           (and (= datatype "number") (not (re-matches #"\s*\d*\s*" contents))))
      (log/error (str "'" contents "' is not a valid " datatype " in column '" column "' of table '" table "'")))
    ; Validate the foreign key if it exists:
    (when (not (nil? foreign-key))
      (let [[foreign-table foreign-column]
            ; The foreign key constraint is of the form 'table-column', but it is a string so
            ; we need to convert the column names to keywords after splitting:
            (reduce (fn [result-vector next-string]
                      (conj result-vector (keyword next-string)))
                    [] (str/split foreign-key #"-"))]
        ; Find all of the values in the foreign key table for this column, and then check to see if
        ; the contents of this cell is one of those values:
        (let [foreign-values (reduce
                              (fn [result-vector next-row]
                                (conj result-vector (get next-row foreign-column)))
                              [] (get catalogue foreign-table))]
          (when (not (some #(= contents %) foreign-values))
            (log/error (str "'" contents "' not in " foreign-values))))))))

(defn validate-catalogue
  "Validates all of the data in the catalogue, table by table, row by row, column by column"
  [catalogue]
  (loop [[curr-table & remaining-tables] (keys catalogue)]
    (log/info "Validating" (name curr-table))
    (loop [[curr-row & remaining-rows] (get catalogue curr-table)]
      (loop [[curr-col & remaining-cols] (keys curr-row)]
        (validate-cell [curr-table curr-col (get curr-row curr-col) catalogue])
        (when (not (empty? remaining-cols))
          (recur remaining-cols)))
      (when (not (empty? remaining-rows))
        (recur remaining-rows)))
    (when (not (empty? remaining-tables))
      (recur remaining-tables))))

(defn -main
  "At startup, the server creates a map called `catalogue` which consists of four tables
  corresponding to charts, composers, genres, and keys"
  [& args]
  (def catalogue (load-catalogue))
  (validate-catalogue catalogue))
