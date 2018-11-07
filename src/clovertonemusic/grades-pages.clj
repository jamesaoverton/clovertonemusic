(ns clovertonemusic.grades-pages)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs]
         '[clovertonemusic.catalogue :as catalogue]
         '[com.gfredericks.forty-two :as words])

(def html-grades
  (reduce (fn [saved-grades next-grade]
            (merge saved-grades
                   {(words/words (Integer/parseInt (:Number next-grade)))
                    {:title (str (:Name next-grade) " - Clovertone Music")
                     :contents [:div#contents
                                [:div#content.index
                                 [:h1.title (:Name next-grade)]
                                 [:p (:Notes next-grade)]]]
                     :charts [:div#charts
                              (let [charts-in-grade
                                    (reduce (fn [saved-charts next-chart]
                                              (if (= (:Grade next-chart) (:Number next-grade))
                                                (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                saved-charts))
                                            [:div#list] (:charts catalogue/catalogue))]
                                charts-in-grade)]
                     :users [:div#users]}}))
          {} (:grades catalogue/catalogue)))
