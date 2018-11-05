(ns clovertonemusic.core
  (:gen-class))

;; Load all of the functions for creating and interacting with the catalogue:
(load "catalogue")

;; Load the clojure template for generating HTML code
(load "html-renderer")

(require '[clojure.tools.logging :as log]
         '[clj-logging-config.log4j :as log-config]
         '[org.httpkit.server :refer [run-server]]
         '[compojure.route :as route]
         '[compojure.handler :refer [site]]
         '[compojure.core :refer [defroutes GET POST PUT DELETE ANY context]]
         '[clojure.string :as str]
         '[clovertonemusic.catalogue :as catalogue]
         '[clovertonemusic.html-renderer :as renderer])

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

;; Load and validate the catalogue from the .csv files on disk. Everything is loaded 'as is' to
;; begin with, and then validated table by table.
(def catalogue
  (let [raw-catalogue (catalogue/load-catalogue)]
    ;; Each key in the catalogue represents a 'table', i.e. a vector of 'rows' (hashmaps).
    ;; Tables are validated one at a time:
    (reduce (fn [tables next-key]
              (assoc tables next-key (catalogue/validate-table next-key raw-catalogue)))
            {} (keys raw-catalogue))))

(defroutes all-routes
  (GET "/about/:page" [page] renderer/render-about)
  (GET "/about/" [] renderer/render-about)

  (GET "/charts/:page" [page] renderer/render-charts)
  (GET "/charts/" [] renderer/render-charts)

  (GET "/composers/:page" [page] renderer/render-composers)
  (GET "/composers/" [] renderer/render-composers)

  (GET "/genres/:page" [page] renderer/render-genres)
  (GET "/genres/" [] renderer/render-genres)

  (GET "/grades/:page" [page] renderer/render-grades)
  (GET "/grades/" [] renderer/render-grades)

  (GET "/:page.html" [page] renderer/render-root)
  (GET "/" [] renderer/render-root)

  (route/resources "") ; this will grab anything in the public/ directory
  (route/not-found "<p>Page not found, sir!</p>")) ;; all other, return 404

(defn -main
  [& args]
  ;; Start the http server
  (log/info "Starting HTTP server on port 8090. Press Ctrl-C to exit.")
  (run-server (site #'all-routes) {:port 8090}))
