(ns clovertonemusic.utils
  (:require[clojure.string :as string]))

(defn parse-as-number
  "Accepts either a string or a number as input and returns a number"
  [given]
  (try
    ;; First assume that the given is a string and attempt to parse it to int:
    (Integer/parseInt given)
    (catch Exception e1
      ;; If that fails, attempt to parse it to float:
      (try
        (Float/parseFloat given)
        (catch Exception e2
          ;; If that fails, then we assume it is already a number and return it:
          given)))))

(defn parse-as-string
  "Accepts either a string or a number as intput and returns a string. If the input is a
  floating-point number with only zeroes after the decimal point, then remove the decimal places
  before returning it"
  [given]
  (try
    ;; First assume that the given is an integer:
    (format "%d" given)
    (catch Exception e1
      ;; If that fails, try assuming it is a float, and remove any decimal places
      ;; before returning the result:
      (try
        (-> (format "%f" given)
            (string/replace #"\.0+$" ""))
        (catch Exception e2
          ;; If that fails, then assume it is already a string and remove any decimal places
          ;; before returning the result:
          (string/replace given #"^(-?\d+)\.0+$" "$1"))))))
