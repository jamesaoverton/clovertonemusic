(ns clovertonemusic.core
  (:gen-class))

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io]
         '[clojure.tools.logging :as log]
         '[clj-logging-config.log4j :as log-config]
         '[org.httpkit.server :refer [run-server]]
         '[hiccup.core :as page]
         '[clojure.string :as str])

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

;; Load all of the functions for creating and interacting with the catalogue:
(load "core-catalogue-funcs")

;; Load all of the HTML pages:
(load "clj-html/index")
(def html-index (get-html-index))


;; Load and validate the catalogue from the .csv files on disk. Everything is loaded 'as is' to
;; begin with, and then validated table by table.
(def catalogue
  (let [raw-catalogue (load-catalogue)]
    ;; Each key in the catalogue represents a 'table', i.e. a vector of 'rows' (hashmaps).
    ;; Tables are validated one at a time:
    (reduce (fn [tables next-key]
              (assoc tables next-key (validate-table next-key raw-catalogue)))
            {} (keys raw-catalogue))))

(defn app
  "The HTTP server application"
  [request]
  (log/info "Got request:" request)
  ;; Simply respond with a 200 and some dummy text in the body
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-index)})

(defn -main
  "At startup, the server creates a map called `catalogue` which consists of four tables
  corresponding to charts, composers, genres, and keys"
  [& args]

  ;; At startup, print the catalogue represented as a tree:
  (print-tree catalogue)

  ;; Start the http server
  (log/info "Starting HTTP server on port 8080. Press Ctrl-C to exit.")
  (run-server app {:port 8080}))
