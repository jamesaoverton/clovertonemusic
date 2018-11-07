(ns clovertonemusic.genres-pages)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs]
         '[clovertonemusic.catalogue :as catalogue])

(def html-genres
  {"latin" {:title "Latin - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Latin"]
                        [:p
                         "This genre includes salsa, bossa nova, and samba. All these feels are a fun way to spice up your program and challege your rhythm section."]]]
            :charts [:div#charts
                     (let [genres-charts (reduce (fn [saved-charts next-chart]
                                                      (if (= (:Category next-chart) "latin")
                                                        (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                        saved-charts))
                                                    [:div#list] (:charts catalogue/catalogue))]
                       genres-charts)]
            :users [:div#users]}
   "swing" {:title "Swing - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Swing"]
                        [:p
                         "We have all tempos of swing from slow shuffles to burners. This is what jazz bands were created to play."]]]
            :charts [:div#charts
                     (let [genres-charts (reduce (fn [saved-charts next-chart]
                                                   (if (= (:Category next-chart) "swing")
                                                     (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                     saved-charts))
                                                 [:div#list] (:charts catalogue/catalogue))]
                       genres-charts)]
                     :users [:div#users]}
   "ballad" {:title "Ballad - Clovertone Music"
             :contents [:div#contents
                        [:div#content.index
                         [:h1.title "Ballad"]
                         [:p
                          "In this genre you'll find rock ballads, swing ballads, 3/4 ballads and ballads for dancing. Find something for your festival repertoire here. "]]]
            :charts [:div#charts
                     (let [genres-charts (reduce (fn [saved-charts next-chart]
                                                   (if (= (:Category next-chart) "ballad")
                                                     (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                     saved-charts))
                                                 [:div#list] (:charts catalogue/catalogue))]
                       genres-charts)]
            :users [:div#users]}
   "rock" {:title "Funk/Rock - Clovertone Music"
           :contents [:div#contents
                      [:div#content.index
                       [:h1.title "Funk/Rock"]
                       [:p
                        "Have fun with our wide selection of funk and rock tunes. A lot of crowd pleasers can be found here."]]]
           :charts [:div#charts
                    (let [genres-charts (reduce (fn [saved-charts next-chart]
                                                  (if (= (:Category next-chart) "rock")
                                                    (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                    saved-charts))
                                                [:div#list] (:charts catalogue/catalogue))]
                      genres-charts)]
           :users [:div#users]}
   "other" {:title "Other - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Other"]
                        [:p
                         "We proudly carry feels not normally associated with jazz band. Look here to find world rhythms like reggae, afro beat, 12/8 feel, and odd meter feels."]]]
            :charts [:div#charts
                     (let [genres-charts (reduce (fn [saved-charts next-chart]
                                                   (if (= (:Category next-chart) "other")
                                                     (conj saved-charts (chart-divs/chart-to-html next-chart))
                                                     saved-charts))
                                                 [:div#list] (:charts catalogue/catalogue))]
                       genres-charts)]
            :users [:div#users]}})
