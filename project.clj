(defproject clovertonemusic "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "TBD"
            :url "TBD"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [org.clojure/tools.logging "0.4.1"]
                 [clojure.java-time "0.3.2"]
                 [buddy/buddy-auth "2.1.0"]
                 [buddy/buddy-hashers "1.3.0"]
                 [cheshire "5.9.0"]
                 [clj-logging-config "1.9.12"]
                 [clj-pdf "2.3.1"]
                 [com.draines/postal "2.0.3"]
                 [compojure "1.1.6"]
                 [dk.ative/docjure "1.12.0"]
                 [hiccup "1.0.5"]
                 [http-kit "2.3.0"]
                 [http-kit "2.2.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [markdown-to-hiccup "0.3.0"]
                 [paraman "0.1.2"]
                 [ring/ring-core "1.7.1"]]
  :main ^:skip-aot clovertonemusic.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
