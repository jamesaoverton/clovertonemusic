(ns clovertonemusic.utils
  (:require [clojure.string :as string]))

(defn parse-as-number
  "Accepts either a string or a number as input and returns a number. If the given is a string that
  does not contain a decimal point, then it will be parsed as an integer. If it does contain a
  decimal then it will be parsed as a float. If it is already a number it is returned as is."
  [given]
  (try
    ;; First assume that the given is a string and attempt to parse it to int:
    (Integer/parseInt given)
    (catch Exception e1
      ;; If that fails, attempt to parse it to float:
      (try
        (Float/parseFloat given)
        (catch Exception e2
          ;; If that fails, then the given should already be a number. If it isn't, then throw an
          ;; exception:
          (if (instance? java.lang.Number given)
            given
            (-> given
                (str " cannot be parsed as a number")
                (Exception.)
                (throw))))))))

(defn parse-as-float
  "Accepts either a string or a number as input and returns a floating point number."
  [given]
  (try
    (Float/parseFloat given)
    (catch Exception e1
      (try
        (-> given (str) (Float/parseFloat))))))

(defn parse-as-string
  "Accepts either a string or a number as input and returns a string. If the input is a
  floating-point number with only zeroes after the decimal point, then remove the decimal places
  before returning it"
  [given]
  (try
    ;; First assume that the given is an integer:
    (format "%d" given)
    (catch Exception e1
      ;; If that fails, try assuming it is a float; if there are only zeroes after the decimal
      ;; point, remove them before returning the result:
      (try
        (-> (format "%f" given)
            (string/replace #"\.0+$" ""))
        (catch Exception e2
          ;; If that fails, then assume it is already a string; if there are only zeroes after the
          ;; decimal point, remove them before returning the result:
          (string/replace given #"^(-?\d+)\.0+$" "$1"))))))
