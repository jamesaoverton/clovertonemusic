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
     (if (not= (count header-row) (count next-row))
       (throw (Exception. "Number of fields in data row does not match the number of headers"))
       (conj saved-rows (zipmap (map keyword header-row) next-row))))
   [] body-rows))

(defn -main
  "<Description to be filled in>"
  [& args]
  (def catalogue
    (reduce
     (fn [result-map next-key]
       (try
         (assoc result-map
                (keyword next-key)
                (create-table (extract-from-csv (str next-key ".csv"))))
         (catch Exception ex
           (println (str "Error while parsing " next-key ".csv: " (.getMessage ex)))
           (System/exit 1))))
     {} ["charts" "composers" "genres" "grades"])))
