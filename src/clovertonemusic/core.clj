(ns clovertonemusic.core
  (:gen-class))

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io])

(def csv-path "data/catalogue")


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
     (conj saved-rows (zipmap (map keyword header-row) next-row)))
   [] body-rows))

(defn -main
  "<Description to be filled in>"
  [& args]
  (def charts (create-table (extract-from-csv "charts.csv")))
  (def composers (create-table (extract-from-csv "composers.csv")))
  (def genres (create-table (extract-from-csv "genres.csv")))
  (def grades (create-table (extract-from-csv "grades.csv")))
)
