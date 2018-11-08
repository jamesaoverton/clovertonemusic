(ns clovertonemusic.catalogue
  (:require [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [clojure.string :as str]))

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

(def csv-path "data/catalogue")
(def catalogue-table-names ["composers" "genres" "grades" "charts"])
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
            :genre                       "y/string/"
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

(defn fail
  "Logs a fatal error and then exits with a failure status"
  [errorstr]
  (log/fatal errorstr)
  (System/exit 1))

(defn create-table
  "Creates a 'table' from the given data implemented as a vector of zipmaps"
  [[header-row & body-rows]]
  (reduce
   (fn [saved-rows next-row]
     (if-not (= (count header-row) (count next-row))
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
       (->> ".csv"
            (str next-key)
            (extract-from-csv)
            (create-table)
            (assoc result-map (keyword next-key)))
       (catch Exception ex
         (fail (str "Error while parsing " next-key ".csv: " (.getMessage ex))))))
   {} catalogue-table-names))

(defn validate-cell
  "For each data cell belonging to a given column of a given table:
   (1) Validate that it is not empty if it is a required field
   (2) Validate that the contents conform to the column's datatype
   (3) If the column has a foreign key, then check in the catalogue to see that it is satisfied.
       In the case of Genres, we don't fail on a foreign key failure but send back an indication
       instead."
  [table rownum column contents catalogue]
  ;; split up the string specifying the constraints associated with this column (defined above):
  (let [[required datatype foreign-key]
        (str/split (get (get catalogue-table-constraints table) column) #"/")]
    ;; If the column is required, make sure it is not empty:
    (when (and (= required "y") (not (re-find #"\S+" contents)))
      (fail (str "At row " rownum ": Required column: " column " of table " table " is empty")))
    ;; Make sure the contents conform to the column's datatype:
    (when (or
           (and (= datatype "datetime")
                (not (re-matches
                      #"\s*(\d{4}-\d{2}-\d{2}(T|\s){0,1}\d{2}(:\d{2}){1,2}){0,1}\s*"
                      contents)))
           (and (= datatype "boolean") (not (re-matches #"(?i)\s*(true|false){0,1}\s*" contents)))
           (and (= datatype "time") (not (re-matches #"\s*(\d+s){0,1}\s*" contents)))
           (and (= datatype "money") (not (re-matches #"\s*(\$\d+(\.\d+){0,1}){0,1}\s*" contents)))
           (and (= datatype "ratio") (not (re-matches #"\s*(\d+/\d+){0,1}\s*" contents)))
           (and (= datatype "number") (not (re-matches #"\s*\d*\s*" contents))))
      (fail (str "At row " rownum ": '" contents "' is not a valid " datatype " in column '"
                 column "' of table '" table "'")))
    ;; Validate the foreign key if it exists:
    (when-not (nil? foreign-key)
      (let [[foreign-table foreign-column]
            ;; The foreign key constraint is of the form 'table-column', but it is a string so
            ;; we need to convert the column names to keywords after splitting:
            (reduce (fn [result-vector next-string]
                      (conj result-vector (keyword next-string)))
                    [] (str/split foreign-key #"-" 2))]
        ;; Find all of the values in the foreign key table for this column, and then check to see if
        ;; the contents of this cell is one of those values:
        (let [foreign-values (reduce
                              (fn [result-vector next-row]
                                (conj result-vector (get next-row foreign-column)))
                              [] (get catalogue foreign-table))]
          (when-not (some #(= contents %) foreign-values)
            ;; if the column contents do not match any of the possible foreign key values,
            ;; just fail:
            (fail (str "At row " rownum ": '" contents "' not in " foreign-values))))))))

(defn validate-row
  "Validates the data in the given row, cell by cell."
  [table row rownum catalogue]
  (doseq [col row]
    (let [col-name (key col)]
      (validate-cell table rownum col-name (get row col-name) catalogue))))

(defn validate-table
  "Validates the data in the given table, row by row. Returns a validated version of the table."
  [tblname catalogue]
  (log/info "Validating" (name tblname))
  (reduce (fn [new-table curr-row]
            (let [rownum (inc (.indexOf (get catalogue tblname) curr-row))]
              ;; validate the current row and then add it to the validated version of the table:
              (validate-row tblname curr-row rownum catalogue)
              (conj new-table curr-row)))
          [] (get catalogue tblname)))

;; Load and validate the catalogue from the .csv files on disk. Everything is loaded 'as is' to
;; begin with, and then validated table by table.
(def catalogue
  (let [raw-catalogue (load-catalogue)]
    ;; Each key in the catalogue represents a 'table', i.e. a vector of 'rows' (hashmaps).
    ;; Tables are validated one at a time:
    (reduce (fn [tables next-key]
              (assoc tables next-key (validate-table next-key raw-catalogue)))
            {} (keys raw-catalogue))))
