(ns clovertonemusic.gradespages
  (:require [clovertonemusic.chartdivs :as chartdivs]
            [clovertonemusic.data :as data]))

(def html-grades
  (reduce (fn [saved-grades curr-grade]
            (merge saved-grades
                   {(:filename curr-grade)
                    {:title (str (:grade-name curr-grade) " - Clovertone Music")
                     :contents [:div#contents
                                [:div#content.index
                                 [:h1.title (:grade-name curr-grade)]
                                 [:p (:notes curr-grade)]]]
                     :charts [:div#charts
                              (let [charts-in-grade
                                    (reduce (fn [saved-charts curr-chart]
                                              (if (= (:grade curr-chart) (:grade-number curr-grade))
                                                (conj saved-charts (chartdivs/chart-to-html curr-chart))
                                                saved-charts))
                                            [:div#list] (:charts data/catalogue))]
                                charts-in-grade)]
                     :users [:div#users]}}))
          {} (:grades data/catalogue)))
