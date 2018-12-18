(ns clovertonemusic.utils)

(defn parse-number
  "Accepts either a string or a number as input and returns a number"
  [given]
  (try
    ;; First assume that the given is a string and attempt to parse it to int:
    (Integer/parseInt given)
    (catch NumberFormatException nfex
      ;; If that fails, attempt to parse it to float:
      (Float/parseFloat given))
    (catch ClassCastException ccex
      ;; If that fails, then we assume it is already a number and return it:
      given)))
