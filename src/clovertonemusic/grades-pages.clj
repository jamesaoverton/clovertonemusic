(ns clovertonemusic.grades-pages)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs]
         '[clovertonemusic.catalogue :as catalogue])

(def html-grades
  {"one" {:title "Grade One - Clovertone Music"
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "Grade One"]
                      [:p
                       "Our grade 1 selections are for junior high school and advanced elementary school bands in their first years of playing."]]]
          :charts [:div#charts
                   (let [charts-in-grade (reduce (fn [saved-charts next-chart]
                                                   (if (= (:Grade next-chart) "1")
                                                     (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                     saved-charts))
                                                 [:div#list] (:charts catalogue/catalogue))]
                     charts-in-grade)]
          :users [:div#users]}
   "two" {:title "Grade Two - Clovertone Music"
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "Grade Two"]
                      [:p
                       "These grade 2 charts are aimed at intermediate bands or good junior bands."]]]
          :charts [:div#charts
                   (let [charts-in-grade (reduce (fn [saved-charts next-chart]
                                                   (if (= (:Grade next-chart) "2")
                                                     (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                     saved-charts))
                                                 [:div#list] (:charts catalogue/catalogue))]
                     charts-in-grade)]
          :users [:div#users]}
   "three" {:title "Grade Three - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Grade Three"]
                        [:p
                         "Here you will find senior band charts for players with a few years of experience."]]]
            :charts [:div#charts
                     (let [charts-in-grade (reduce (fn [saved-charts next-chart]
                                                     (if (= (:Grade next-chart) "3")
                                                       (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                       saved-charts))
                                                   [:div#list] (:charts catalogue/catalogue))]
                       charts-in-grade)]
            :users [:div#users]}
   "four" {:title "Grade Four - Clovertone Music"
           :contents [:div#contents
                      [:div#content.index
                       [:h1.title "Grade Four"]
                       [:p
                        "This is where you will find all of our advanced material written at professional level directed towards university bands or strong arts focused high schools. "]]]
           :charts [:div#charts
                    (let [charts-in-grade (reduce (fn [saved-charts next-chart]
                                                    (if (= (:Grade next-chart) "4")
                                                      (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                      saved-charts))
                                                  [:div#list] (:charts catalogue/catalogue))]
                      charts-in-grade)]
           :users [:div#users]}})
