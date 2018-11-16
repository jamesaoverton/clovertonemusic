(ns clovertonemusic.data
  (:require [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [clojure.string :as string]))

(def about-path "data/about")
(def indices-path "data/indices")
(def csv-path "data/catalogue")

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

(defn fail
  "Logs a fatal error and then exits with a failure status"
  [errorstr]
  (log/fatal errorstr)
  (System/exit 1))

(def about-page-paths
  {:clinics (str about-path "/clinics.md")
   :clovertone-story (str about-path "/clovertone-story.md")
   :commissions (str about-path "/commissions.md")
   :customization (str about-path "/customization.md")
   :faq (str about-path "/faq.md")
   :grading-system (str about-path "/grading-system.md")
   :musician-roster (str about-path "/musician-roster.md")
   :podcast (str about-path "/podcast.md")
   :privacy-policy (str about-path "/privacy-policy.md")})

(def indices-paths
  {:charts (str indices-path "/charts.md")
   :composers (str indices-path "/composers.md")
   :index (str indices-path "/index.md")})

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
  "Creates a 'table' from the given data implemented as a vector of zipmaps"
  [tablename catalogue [header & body-rows]]
  (vec (map (fn [row]
              (let [processed-row (zipmap (map keyword header) row)]
                (validate-row
                 tablename
                 processed-row
                 (inc (.indexOf body-rows row))
                 (count header)
                 catalogue)))
            body-rows)))

(defn extract-from-csv
  "Reads the contents of the CSV file containing the catalogue data from disk using the
  csv library and the read-csv function, which returns a lazy sequence of vectors representing rows"
  [filename]
  (with-open [reader (io/reader (str csv-path "/" filename))]
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
         (extract-from-csv)
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
