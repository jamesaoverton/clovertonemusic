(ns clovertonemusic.genrespages
  (:require [clovertonemusic.chartdivs :as chartdivs]
            [clovertonemusic.catalogue :as catalogue]))

(def html-genres
  (reduce (fn [saved-genres curr-genre]
            (merge saved-genres
                   {(:filename curr-genre)
                    {:title (str (:genre-name curr-genre) " - Clovertone Music")
                     :contents [:div#contents
                                [:div#content.index
                                 [:h1.title (:genre-name curr-genre)]
                                 [:p (:notes curr-genre)]]]
                     :charts [:div#charts
                              (let [genres-charts
                                    (reduce (fn [saved-charts next-chart]
                                              (if (= (:category next-chart) (:filename curr-genre))
                                                (conj saved-charts (chartdivs/chart-to-html next-chart))
                                                saved-charts))
                                            [:div#list] (:charts catalogue/catalogue))]
                                genres-charts)]
                     :users [:div#users]}}))
          {} (:genres catalogue/catalogue)))
