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

(defn get-charts
  [charts-from-file]
  (reduce (fn [final-charts chart]
            (into final-charts chart))
          [] charts-from-file))


(defn -main
  "<Description to be filled in>"
  [& args]
  (def charts (get-charts (extract-from-csv "charts.csv")))
  (def composers (get-charts (extract-from-csv "composers.csv")))
  (def genres (get-charts (extract-from-csv "genres.csv")))
  (def grades (get-charts (extract-from-csv "grades.csv")))

  (println charts)
  (println composers)
  (println genres)
  (println grades))
