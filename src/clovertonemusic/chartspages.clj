(ns clovertonemusic.chartspages
  (:require [clovertonemusic.chartdivs :as chartdivs]
            [clovertonemusic.data :as data]))

(def html-charts
  (reduce (fn [saved-chart2s curr-chart2]
            (merge saved-chart2s
                   {(:filename curr-chart2)
                    {:title (str (:chart-name curr-chart2) " - Clovertone Music")
                     :contents [:div#contents
                                (let [charts-in-chart2
                                      (reduce (fn [saved-charts curr-chart]
                                                (if (= (:chart-number curr-chart) (:chart-number curr-chart2))
                                                  (conj saved-charts (chartdivs/chart-to-html curr-chart))
                                                  saved-charts))
                                              [:div#list] (:charts data/catalogue))]
                                  charts-in-chart2)]
                     :charts [:div#charts]
                     :users [:div#users]}}))
          {"index" {:title "All Charts - Clovertone Music"
                    :contents [:div#contents
                               [:div#content.index
                                [:h1.title "All Charts"]
                                [:p
                                 "Here's a list of all our titles so you can browse from the oldest selections to our newest material."]]]
                    :charts [:div#charts
                             (let [all-charts (reduce (fn [saved-charts next-chart]
                                                        (conj saved-charts (chartdivs/chart-to-html next-chart)))
                                                      [:div#list] (:charts data/catalogue))]
                               all-charts)]
                    :users [:div#users]}}
          (:charts data/catalogue)))
