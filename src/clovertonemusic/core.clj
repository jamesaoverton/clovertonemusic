(ns clovertonemusic.core
  (:require [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [org.httpkit.server :refer [run-server]]
            [compojure.route :as route]
            [compojure.handler :refer [site]]
            [compojure.core :refer [defroutes GET]]
            [clovertonemusic.html :as html]))

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

(defroutes all-routes
  (GET "/about/:page" [page search]
       (if search
         html/render-search
         html/render-about))

  (GET "/charts/:page" [page search]
       (if search
         html/render-search
         html/render-charts))
  (GET "/charts/" [search]
       (if search
         html/render-search
         html/render-charts))

  (GET "/composers/:page" [page search]
       (if search
         html/render-search
         html/render-composers))
  (GET "/composers/" [search]
       (if search
         html/render-search
         html/render-composers))

  (GET "/genres/:page" [page search]
       (if search
         html/render-search
         html/render-genres))

  (GET "/grades/:page" [page search]
       (if search
         html/render-search
         html/render-grades))

  (GET "/:page.html" [page search]
       (if search
         html/render-search
         html/render-root))

  (GET "/" [search]
       (if search
         html/render-search
         html/render-root))

  (route/resources "") ; this will grab anything in the public/ directory
  (route/not-found "<h1>Page not found</h1>")) ; all other, return 404

(defn -main
  [& args]
  ;; Start the http server
  (log/info "Starting HTTP server on port 8090. Press Ctrl-C to exit.")
  (run-server (site #'all-routes) {:port 8090}))
