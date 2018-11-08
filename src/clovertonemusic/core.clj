(ns clovertonemusic.core
  (:require [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [org.httpkit.server :refer [run-server]]
            [compojure.route :as route]
            [compojure.handler :refer [site]]
            [compojure.core :refer [defroutes GET POST PUT DELETE ANY context]]
            [clojure.string :as str]
            [clovertonemusic.catalogue :as catalogue]
            [clovertonemusic.html :as html]))

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

(defroutes all-routes
  (GET "/about/:page" [page] html/render-about)
  (GET "/about/" [] html/render-about)

  (GET "/charts/:page" [page] html/render-charts)
  (GET "/charts/" [] html/render-charts)

  (GET "/composers/:page" [page] html/render-composers)
  (GET "/composers/" [] html/render-composers)

  (GET "/genres/:page" [page] html/render-genres)
  (GET "/genres/" [] html/render-genres)

  (GET "/grades/:page" [page] html/render-grades)
  (GET "/grades/" [] html/render-grades)

  (GET "/:page.html" [page] html/render-root)
  (GET "/" [] html/render-root)

  (route/resources "") ; this will grab anything in the public/ directory
  (route/not-found "<h1>Page not found</h1>")) ; all other, return 404

(defn -main
  [& args]
  ;; Start the http server
  (log/info "Starting HTTP server on port 8090. Press Ctrl-C to exit.")
  (run-server (site #'all-routes) {:port 8090}))
