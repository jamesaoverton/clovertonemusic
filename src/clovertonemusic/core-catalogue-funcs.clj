(in-ns 'clovertonemusic.core)

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
            :Parent-Genre                "n/string/"
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
                    [] (str/split foreign-key #"-"))]
        ;; Find all of the values in the foreign key table for this column, and then check to see if
        ;; the contents of this cell is one of those values:
        (let [foreign-values (reduce
                              (fn [result-vector next-row]
                                (conj result-vector (get next-row foreign-column)))
                              [] (get catalogue foreign-table))]
          (when-not (some #(= contents %) foreign-values)
            (let [msg (str "At row " rownum ": '" contents "' not in " foreign-values)]
              ;; If the foreign key is a genre, then log a warning and return a map consisting
              ;; of a single key to the calling function indicating that the genre is unknown.
              (if (and (= table :charts) (= foreign-table :genres) (= foreign-column :Name))
                (do
                  (log/warn msg)
                  {:genre-known false})
                ;; For other foreign keys, just fail:
                (fail msg)))))))))

(defn validate-row
  "Validates the data in the given row, cell by cell. Returns the row plus possibly some extra
  added fields"
  [table row rownum catalogue]
  (reduce (fn [extra-fields col]
            ;; validate-cell will possibly return extra fields, which we collect together into
            ;; 'extra-fields' which gets passed back to the caller:
            (merge extra-fields (validate-cell table rownum col (get row col) catalogue)))
          {} (keys row)))

(defn validate-table
  "Validates the data in the given table, row by row. Returns a validated version of the table."
  [tblname catalogue]
  (log/info "Validating" (name tblname))
  (reduce (fn [new-table curr-row]
            (let [rownum (inc (.indexOf (get catalogue tblname) curr-row))]
              ;; validate-row will possibly return extra fields which we here merge into the
              ;; original row, and then add the result to the new table of validated rows:
              (conj new-table (merge curr-row (validate-row tblname curr-row rownum catalogue)))))
          [] (get catalogue tblname)))

(defn print-charts
  "Print out all of the charts in the catalogue which have the given genre"
  [genre-name charts & [parent-name]]
  (print "Genre:" genre-name)
  (if-not (nil? parent-name)
    (println (str " (Parent genre: " parent-name ")"))
    (println))
  (println "---")
  (doseq [chart (sort-by :Genre charts)]
    (if-not (= genre-name "Other")
      (when (= genre-name (:Genre chart))
        (println (:Name chart)))
      (when (and (contains? chart :genre-known) (= false (:genre-known chart)))
        (println (str (:Name chart) " (Genre: " (:Genre chart) ")")))))
  (println))

(defn print-tree
  "Create a tree structure showing each chart in the catalogue sorted by its genre"
  [catalogue]
  (def tree
    (reduce
     (fn [tree curr-genre]
       (let [parent (:Parent-Genre curr-genre)
             child (:Name curr-genre)]
         (if (re-find #"\S+" parent)
           ;; if the current genre has a parent,
           (if-not (contains? tree parent)
             ;; then if it is not already in the tree, add the parent to the tree and associate
             ;; the child with it:
             (assoc tree parent (set [child]))
             ;; if the parent is already in the tree, then add the child to its set of children:
             (assoc tree parent (conj (get tree parent) child)))
           ;; if the current genre has no parent, then add the child as a parent node to the tree:
           (assoc tree child (set [])))))
     {} (:genres catalogue)))

  ;; Now traverse the tree, outputting all of the charts for the given genres:
  (doseq [parent tree]
    (print-charts (key parent) (:charts catalogue))
    (doseq [child (get tree (key parent))]
      (print-charts child (:charts catalogue) (key parent)))))
