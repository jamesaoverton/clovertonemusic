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
    (->> userid
         (data/get-user-by-id)
         (assoc req :user)
         (handler))))

(defn wrap-exception-handling
  [handler]
  (fn [{user :user,
        {cart :cart, :as session} :session,
        :as request}]
    (try
      (handler request)
      (catch Exception ex
        (let [error-summary (.getMessage ex)
              detailed-error (apply str (interpose "\n\t" (.getStackTrace ex)))]
          (log/error error-summary "\n" detailed-error)
          (html/render-html
           {:title "Internal Server Error - Clovertone Music"
            :contents [:div#contents
                       [:h1 "Internal Server Error"]
                       [:p "The server encountered an error while processing your request:"]
                       [:p [:code error-summary]]
                       [:p "For assistance, send an email to "
                        [:a {:href (str "mailto:" html/support-email-address)}
                         html/support-email-address]]]
            :user-status (html/user-status user cart)
            :page-status 500}))))))

(defn unauthorized-handler
  [{user :user,
    {cart :cart, :as session} :session,
    :as request}
   metadata]
  (html/render-html
   {:title "Unauthorized - Clovertone Music"
    :contents [:div#contents
               [:h1 "Unauthorized"]
               [:p "You are not authorized to access the required resource. (You may not be logged in.)"]
               [:p "For assistance, send an email to "
                [:a {:href (str "mailto:" html/support-email-address)}
                 html/support-email-address]]]
    :user-status (html/user-status user cart)
    :page-status 401}))


;; Subroutes which require authentication:
(defroutes account-routes
  (GET "/" [] html/render-account))
(defroutes account-change-routes
  (POST "/" [] html/post-account-change))
(defroutes purchases-routes
  (GET "/:purchase-dir/:purchase-file" [] html/render-purchase-file))
(defroutes buy-cart-routes
  (POST "/" [] html/post-buy-cart))

(defroutes all-routes
  ;; To test authentication:
  ;; (app {:request-method :post :uri "/login/" :form-params {"username" "jim@thedoors.com"
  ;;                                                          "password" "jim"}})
  ;; This yields the output: {:status 302, :headers {"Location" "/", "Set-Cookie" ("<...>")}, :body ""}
  ;; Then send:
  ;; (app {:request-method :get :uri "/account/" :headers {"cookie" "<...>"}}))

  ;; Account and purchases pages are protected; only authenticated users may access them:
  (context "/account" []
           (restrict account-routes {:handler is-authenticated}))
  (context "/account-change" []
           (restrict account-change-routes {:handler is-authenticated}))
  (context "/purchases" []
           (restrict purchases-routes {:handler is-authenticated}))
  (context "/buy-cart" []
           (restrict buy-cart-routes {:handler is-authenticated}))

  (GET "/login/" [] html/render-login)
  (GET "/logout/" [] html/get-logout)
  (GET "/forgotpw/" [] html/render-forgotpw)
  (POST "/login/" [] html/post-login)
  (POST "/signup/" [] html/post-signup)
  (POST "/forgotpw/" [] html/post-forgotpw)

  (GET "/activation/:activationid" [] html/process-and-render-activation)

  (GET "/resetpw/:resetpwid" [] html/process-and-input-password-reset)
  (POST "/resetpw/" [] html/post-resetpw)

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

  (GET "/add-to-cart/:chart" [chart]
       html/add-to-cart)

  (GET "/remove-from-cart/:chart" [chart]
       html/remove-from-cart)

  (GET "/cart/" [] html/render-shopping-cart)

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

  ;; all other, return 404
  (route/not-found (html/render-html
                    {:title "Page Not Found - Clovertone Music"
                     :contents [:div#contents
                                [:h1 "Page Not Found"]
                                [:p "The requested resource could not be found."]
                                [:p "For assistance, send an email to "
                                 [:a {:href (str "mailto:" html/support-email-address)}
                                  html/support-email-address]]]
                     :page-status 404})))

(def backend (session-backend {:unauthorized-handler unauthorized-handler}))
(def app
  (-> #'all-routes
      (wrap-user)
      (wrap-authentication backend)
      (wrap-authorization backend)
      (wrap-session)
      (wrap-params)
      (wrap-exception-handling)))

(defn -main
  [& args]
  ;; Start the http server
  (log/info "Starting HTTP server on port 8090. Press Ctrl-C to exit.")
  (run-server (site #'app) {:port 8090}))
