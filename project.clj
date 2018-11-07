(defproject clovertonemusic "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "TBD"
            :url "TBD"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [org.clojure/tools.logging "0.4.1"]
                 [clj-logging-config "1.9.12"]
                 [hiccup "1.0.5"]
                 [compojure "1.1.6"]
                 [http-kit "2.2.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [com.gfredericks/forty-two "1.0.0"]]
  :main ^:skip-aot clovertonemusic.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
