(ns clovertonemusic.root-pages)

;; This file contains the HTML code used for pages in the root directory

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs]
         '[clovertonemusic.catalogue :as catalogue])

(def html-root
  {"index" {:title "Home - Clovertone Music."
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Home"]
                        [:p
                         "Welcome to Clovertone Music, we are a sheet music publisher specializing in the educational jazz band market. Our library is completely Canadian and features some of our countries top composers. Fill out your repertoire with Canadian content and feel good about supporting Canadian musicians!"]]]
            :charts [:div#charts
                     (let [featured-charts (reduce (fn [saved-charts next-chart]
                                                     (if-not (= (:Featured next-chart) "0")
                                                       (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                       saved-charts))
                                                   [:div#list] (sort-by :Featured (:charts catalogue/catalogue)))]
                       featured-charts)]
            :users [:div#users]}})
