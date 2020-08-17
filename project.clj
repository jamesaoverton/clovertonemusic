(defproject clovertonemusic "0.1.0-SNAPSHOT"
  :description "Web server for Clovertone Music"
  :url "https://clovertonemusic.com/"
  :license {:name "unspecified"
            :url ""}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.csv "1.0.0"]
                 [clojure.java-time "0.3.2"]
                 [buddy/buddy-auth "2.2.0"]
                 [buddy/buddy-hashers "1.4.0"]
                 [cheshire "5.10.0"]
                 [clj-pdf "2.5.4"]
                 [com.draines/postal "2.0.3"]
                 [compojure "1.6.2"]
                 [dk.ative/docjure "1.14.0"]
                 [hiccup "1.0.5"]
                 [http-kit "2.4.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [markdown-to-hiccup "0.6.2"]
                 [paraman "0.1.2"]
                 [ring/ring-core "1.8.1"]
                 [ring/ring-json "0.5.0"]]
  :main clovertonemusic.core
  :jar-exclusions [#"^public\/"]
  :uberjar-exclusions [#"^public\/"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
