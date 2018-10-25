(ns clovertonemusic.core
  (:gen-class))

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io]
         '[clojure.tools.logging :as log]
         '[clj-logging-config.log4j :as log-config]
         '[org.httpkit.server :refer [run-server]]
         '[hiccup.core :as page]
         '[compojure.route :as route]
         '[compojure.handler :refer [site]]
         '[compojure.core :refer [defroutes GET POST PUT DELETE ANY context]]
         '[clojure.string :as str])

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

;; Load all of the functions for creating and interacting with the catalogue:
(load "catalogue-funcs")

;; Load the clojure template for generating HTML code
(load "html-renderer")

;; Load and validate the catalogue from the .csv files on disk. Everything is loaded 'as is' to
;; begin with, and then validated table by table.
(def catalogue
  (let [raw-catalogue (load-catalogue)]
    ;; Each key in the catalogue represents a 'table', i.e. a vector of 'rows' (hashmaps).
    ;; Tables are validated one at a time:
    (reduce (fn [tables next-key]
              (assoc tables next-key (validate-table next-key raw-catalogue)))
            {} (keys raw-catalogue))))

(defroutes all-routes
  (GET "/about/:page.html" [page] render-about)
  (GET "/about/" [] render-about)
  (GET "/charts/:page.html" [page] render-charts)
  (GET "/charts/" [] render-charts)
  (GET "/composers/:page.html" [page] render-composers)
  (GET "/composers/" [] render-composers)
  (GET "/genres/:page.html" [page] render-genres)
  (GET "/genres/" [] render-genres)
  (GET "/grades/:page.html" [page] render-grades)
  (GET "/grades/" [] render-grades)
  (GET "/:page.html" [page] render-root)
  (GET "/" [] render-root)
  (route/resources "") ; this will grab anything in the public/ directory
  (route/not-found "<p>Page not found, sir!</p>")) ;; all other, return 404

(defn -main
  [& args]
  ;; At startup, print the catalogue represented as a tree:
  ;; TODO: MAKE THIS OPTIONAL WITH A COMMAND-LINE SWITCH
  (print-tree catalogue)

  ;; Start the http server
  (log/info "Starting HTTP server on port 8080. Press Ctrl-C to exit.")
  (run-server (site #'all-routes) {:port 8090}))
