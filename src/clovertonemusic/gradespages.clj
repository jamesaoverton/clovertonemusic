(ns clovertonemusic.gradespages
  (:require [clovertonemusic.chartdivs :as chartdivs]
            [clovertonemusic.catalogue :as catalogue]))

(def html-grades
  (reduce (fn [saved-grades curr-grade]
            (merge saved-grades
                   {(:Filename curr-grade)
                    {:title (str (:Name curr-grade) " - Clovertone Music")
                     :contents [:div#contents
                                [:div#content.index
                                 [:h1.title (:Name curr-grade)]
                                 [:p (:Notes curr-grade)]]]
                     :charts [:div#charts
                              (let [charts-in-grade
                                    (reduce (fn [saved-charts curr-chart]
                                              (if (= (:Grade curr-chart) (:Number curr-grade))
                                                (conj saved-charts (chartdivs/chart-to-html curr-chart))
                                                saved-charts))
                                            [:div#list] (:charts catalogue/catalogue))]
                                charts-in-grade)]
                     :users [:div#users]}}))
          {} (:grades catalogue/catalogue)))
