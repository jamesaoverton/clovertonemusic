(ns clovertonemusic.log
  (:require [postal.core :refer [send-message]]
            [clovertonemusic.config :refer [get-config]]))

(def log-levels {:debug 0 :info 1 :warn 2 :warning 2 :error 3 :fatal 4})

(defn- screened-out?
  "Given a keword representing the log-level, check to see whether the application configuration
  requires it to be screened out."
  [log-level]
  (let [config-level (->> :log-level
                          (get-config)
                          (get log-levels))
        given-level (log-level log-levels)]
    (< given-level config-level)))

(defn- generate-log-msg
  "Generate a log message using the given words"
  [first-word & other-words]
  (let [now (-> "yyyy-MM-dd HH:mm:ss.SSSZ" (java.text.SimpleDateFormat.)
                (.format (new java.util.Date)))]
    (->> other-words
         (apply clojure.string/join " ")
         (str first-word " ")
         (str now " - "))))

(defn- notify-admin
  "Send an email to the administrator to notify him/her of an event"
  [first-word & other-words]
  (let [smtp-server (get-config :smtp-server)
        admin-email (get-config :admin-errors-email-address)
        send-status (send-message smtp-server
                                  {:from "noreply@clovertonemusic.com"
                                   :to [admin-email]
                                   :subject "Clovertonemusic.com Error Notification"
                                   :body (->> (generate-log-msg first-word other-words))})]
    (when (not= (:error send-status) :SUCCESS)
      (binding [*out* *err*]
        (println "***** Attempt to send an error notification to" admin-email
                 "failed with status:" send-status "*****")))))

(defn- log
  "Log the message represented by the given words to stderr."
  [first-word & other-words]
  (binding [*out* *err*]
    (->> (generate-log-msg first-word other-words) (println))))

(defn debug
  [first-word & other-words]
  (when (not (screened-out? :debug))
    (apply log "DEBUG" first-word other-words)))

(defn info
  [first-word & other-words]
  (when (not (screened-out? :info))
    (apply log "INFO" first-word other-words)))

(defn warn
  [first-word & other-words]
  (when (not (screened-out? :warn))
    (apply log "WARN" first-word other-words)))

(defn warning
  [first-word & other-words]
  (when (not (screened-out? :warning))
    (apply log "WARN" first-word other-words)))

(defn error
  [first-word & other-words]
  (when (not (screened-out? :error))
    (apply log "ERROR" first-word other-words)
    (apply notify-admin "ERROR" first-word other-words)))

(defn fatal
  [first-word & other-words]
  (when (not (screened-out? :fatal))
    (apply log "FATAL" first-word other-words)
    (apply notify-admin "FATAL" first-word other-words)))
