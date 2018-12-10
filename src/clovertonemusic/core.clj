(ns clovertonemusic.core
  (:require [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [org.httpkit.server :refer [run-server]]
            [compojure.route :as route]
            [compojure.handler :refer [site]]
            [compojure.core :refer [defroutes context GET POST]]
            [buddy.auth.accessrules :refer [restrict]]
            [buddy.auth.backends.session :refer [session-backend]]
            [buddy.auth.middleware :refer [wrap-authentication wrap-authorization]]
            [ring.middleware.session :refer [wrap-session]]
            [ring.middleware.params :refer [wrap-params]]
            [clovertonemusic.html :as html]
            [clovertonemusic.data :as data]))

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

(defn is-authenticated
  "Determines whether the request is authenticated by checking for the presence of the :identity
  keyword within it."
  [{identity :identity :as req}]
  (not (nil? identity)))

(defn wrap-user
  "Adds complete information for the user to the request"
  [handler]
  (fn [{userid :identity :as req}]
    (let [user-db (data/get-user-db)]
      (->> userid
           (data/get-user-by-id user-db)
           (assoc req :user)
           (handler)))))

(defroutes user-routes
  (GET "/" [] html/render-user))

(defroutes all-routes
  ;; To test authentication:
  ;; (app {:request-method :post :uri "/login/" :form-params {"username" "jim@thedoors.com"
  ;;                                                          "password" "jim"}})
  ;; This yields the output: {:status 302, :headers {"Location" "/", "Set-Cookie" ("<...>")}, :body ""}
  ;; Then send:
  ;; (app {:request-method :get :uri "/user/" :headers {"cookie" "<...>"}}))

  (context "/user" []
           (restrict user-routes {:handler is-authenticated}))

  (GET "/login/" [] html/render-login)
  (GET "/logout/" [] html/get-logout)
  (POST "/login/" [] html/post-login)
  (POST "/signup/" [] html/post-signup)

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

(def backend (session-backend))
(def app
  (-> #'all-routes
      (wrap-user)
      (wrap-authentication backend)
      (wrap-authorization backend)
      (wrap-session)
      (wrap-params)))

(defn -main
  [& args]
  ;; Start the http server
  (log/info "Starting HTTP server on port 8090. Press Ctrl-C to exit.")
  (run-server (site #'app) {:port 8090}))
