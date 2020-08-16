(ns clovertonemusic.config)

(def config
  "A map of configuration parameters, loaded from the config file in the data directory"
  (try
    (->> "data/config.edn"
         (slurp)
         (clojure.edn/read-string))
    (catch java.io.FileNotFoundException ex
      (binding [*out* *err*]
        (println "The file: data/config.edn is required for the operation of the Clovertonemusic"
                 "server but it does not exist."))
      (System/exit 1))))

(defn get-config
  "Get the configuration parameter corresponding to the given keyword. If the parameter has
  entries for different operating environments, get the one corresponding to the currently
  configured operating environment (:dev, :test, or :prod), given by the :env parameter in the
  config file."
  [param-keyword]
  (let [env (:env config)
        param-rec (-> config (get param-keyword))]
    (if (and (map? param-rec)
             (contains? param-rec env))
      (get param-rec env)
      (get config param-keyword))))
