(ns clovertonemusic.rootpages
  (:require [clovertonemusic.chartdivs :as chartdivs]
            [clovertonemusic.catalogue :as catalogue]))

(def html-root
  {"index" {:title "Home - Clovertone Music."
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Home"]
                        [:p
                         (str "Welcome to Clovertone Music, we are a sheet music publisher specializing "
                              "in the educational jazz band market. Our library is completely Canadian "
                              "and features some of our countries top composers. Fill out your repertoire "
                              "with Canadian content and feel good about supporting Canadian musicians!")]]]
            :charts [:div#charts
                     (let [featured-charts
                           (reduce (fn [saved-charts next-chart]
                                     (if-not (= (:featured next-chart) "0")
                                       (conj saved-charts (chartdivs/chart-to-html next-chart))
                                       saved-charts))
                                   [:div#list] (sort-by :featured (:charts catalogue/catalogue)))]
                       featured-charts)]
            :users [:div#users]}})
