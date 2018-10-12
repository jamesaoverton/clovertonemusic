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
            :Genre                       "y/string/genres-name"
            :Composer                    "y/string/composers-name"
            :Grade                       "y/number/grades-number"
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

(defn extract-from-csv
  [filename]
  (with-open [reader (io/reader (str csv-path "/" filename))]
    (doall
     (csv/read-csv reader))))

(defn create-table
  "Creates a 'table' from the given data implemented as a vector of zipmaps"
  [[header-row & body-rows]]
  (reduce
   (fn [saved-rows next-row]
     (if (not= (count header-row) (count next-row))
       (throw (Exception. "Number of fields in data row does not match the number of headers"))
       (conj saved-rows (zipmap (map keyword header-row) next-row))))
   [] body-rows))

(defn load-catalogue
  "<Say something here>"
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
  "<Say something here>"
  [[table column contents catalogue]]
  (let [[required datatype foreign-key] (str/split (get (get catalogue-table-constraints table) column) #"/")]
    (when (and (= required "y") (not (re-find #"\S+" contents)))
      (log/error "Required column:" column "of table" table "is empty"))
      (do))
    (when (or
           (and (= datatype "datetime") (not (re-matches #"\s*((\d{2}|\d{4})-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}){0,1}\s*" contents)))
           (and (= datatype "time") (not (re-matches #"\s*(\d+s){0,1}\s*" contents)))
           (and (= datatype "money") (not (re-matches #"\s*(\$\d+(\.\d+){0,1}){0,1}\s*" contents)))
           (and (= datatype "ratio") (not (re-matches #"\s*(\d+/\d+){0,1}\s*" contents)))
           (and (= datatype "number") (not (re-matches #"\s*\d*\s*" contents))))
      (log/error (str "'" contents "' is not a valid " datatype " in column '" column "' of table '" table "'")))))

(defn validate-catalogue
  "<Say something here>"
  [catalogue]
  ; this function should not use hard-coded values but at the top of this file we should
  ; have a `data definition' map that defines the restrictions on each column
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
