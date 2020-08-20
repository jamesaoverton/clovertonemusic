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

(defn parse-as-percentage
  "Accepts either a string or a number as input and returns a string formatted as a percentage with
  at most two decimal points. If the given can't be parsed, it is assumed to be valid
  anyway and returned as is."
  [given]
  ;; First assume that the given is an integer:
  (try
    (->> given (* 100) (format "%d") (#(str % "%")))
    (catch Exception e1
      ;; If that fails, try assuming it is a float; keep at most two places after the decimal:
      (try
        (-> given (* 100) (#(format "%.2f" %)) (string/replace #"0+$" "") (string/replace #"\.$" "")
            (str "%"))
        (catch Exception e2
          ;; If that fails, try assuming that it is a number formatted as a string, and if that
          ;; succeeds, pass back the resulting number to ourselves recursively:
          (try
            (-> given (parse-as-number) (parse-as-percentage))
            (catch Exception e3
              ;; If that fails too, then return the given back as is:
              given)))))))
