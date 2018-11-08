(ns clovertonemusic.composerspages
  (:require [clovertonemusic.chartdivs :as chartdivs]
            [clovertonemusic.catalogue :as catalogue]))

(def html-composers
  (merge
   (reduce (fn [saved-composers curr-composer]
             (merge saved-composers
                    {(:filename curr-composer)
                     {:title (str (:composer-name curr-composer) " - Clovertone Music")
                      :contents [:div#contents
                                 [:div#content
                                  [:h1.title (:composer-name curr-composer)]
                                  [:img.float {:src (str "/images/" (:filename curr-composer) ".jpg")}]
                                  [:p (:notes curr-composer)]]]
                      :charts [:div#charts
                               (let [composers-charts
                                     (reduce (fn [saved-charts next-chart]
                                               (if (= (:composer next-chart) (:composer-name curr-composer))
                                                 (conj saved-charts (chartdivs/chart-to-html next-chart))
                                                 saved-charts))
                                             [:div#list] (:charts catalogue/catalogue))]
                                 composers-charts)]
                      :users [:div#users]}}))
           {} (:composers catalogue/catalogue))
   {"index" {:title "All Charts - Clovertone Music"
             :contents [:div#contents
                        [:div#content
                         [:h1.title "All Charts"]
                         [:p
                          (str "Clovertone Music’s Composers are the who’s-who of Canadian professional "
                               "musicians. You’ll see these musicians teaching at the top universities and "
                               "colleges in the country, and playing in the pit orchestra’s of downtown shows, "
                               "in music festivals and in the clubs. All have experience writing not only for "
                               "professionals but also teaching and writing for students of all ages. Read "
                               "about the people and help them make a living through writing music!")]
                         (reduce (fn [saved-composers curr-composer]
                                   (conj saved-composers
                                         [:li
                                          [:a.composer {:href (str "/composers/" (:filename curr-composer))}]
                                          [:div.image
                                           [:img
                                            {:width "140",
                                             :height "140",
                                             :src (str "/images/" (:filename curr-composer) "-140.jpg")}]]
                                           [:div.name (:composer-name curr-composer)]]))
                                   [:ul.composers] (:composers catalogue/catalogue))]]
             :charts [:div#charts]
             :users [:div#users]}}))
