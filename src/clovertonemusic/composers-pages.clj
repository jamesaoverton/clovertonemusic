(ns clovertonemusic.composers-pages)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs]
         '[clovertonemusic.catalogue :as catalogue])

(def html-composers
  (merge
   (reduce (fn [saved-composers curr-composer]
             (merge saved-composers
                    {(:Filename curr-composer)
                     {:title (str (:Name curr-composer) " - Clovertone Music")
                      :contents [:div#contents
                                 [:div#content
                                  [:h1.title (:Name curr-composer)]
                                  [:img.float {:src (str "/images/" (:Filename curr-composer) ".jpg")}]
                                  [:p (:Notes curr-composer)]]]
                      :charts [:div#charts
                               (let [composers-charts
                                     (reduce (fn [saved-charts next-chart]
                                               (if (= (:Composer next-chart) (:Name curr-composer))
                                                 (conj saved-charts (chart-divs/chart-to-html next-chart))
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
                                          [:a.composer {:href (str "/composers/" (:Filename curr-composer))}]
                                          [:div.image
                                           [:img
                                            {:width "140",
                                             :height "140",
                                             :src (str "/images/" (:Filename curr-composer) "-140.jpg")}]]
                                           [:div.name (:Name curr-composer)]]))
                                   [:ul.composers] (:composers catalogue/catalogue))]]
             :charts [:div#charts]
             :users [:div#users]}}))
