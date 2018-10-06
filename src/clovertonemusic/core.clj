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

(defn create-zipmap
  [[header-row & body-rows]]
  (reduce
   (fn [saved-rows next-row]
     (conj saved-rows (zipmap (map keyword header-row) next-row)))
   [] body-rows))

(defn -main
  "<Description to be filled in>"
  [& args]
  (def charts (create-zipmap (extract-from-csv "charts.csv")))
  (def composers (create-zipmap (extract-from-csv "composers.csv")))
  (def genres (create-zipmap (extract-from-csv "genres.csv")))
  (def grades (create-zipmap (extract-from-csv "grades.csv")))
)
