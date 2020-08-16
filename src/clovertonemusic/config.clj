(ns clovertonemusic.config)

(def config
  "A map of configuration parameters, loaded from the config file in the data directory"
  (->> "data/config.edn"
       (slurp)
       (clojure.edn/read-string)))
