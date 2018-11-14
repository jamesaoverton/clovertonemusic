(ns clovertonemusic.html
  (:require [hiccup.core :as page]
            [markdown-to-hiccup.core :as m2h]
            [clovertonemusic.data :as data]))

(defn render-html
  "Wraps the four parameters passed as arguments in the generic HTML code that is used for every
  page in Clovertone."
  [{title :title, contents :contents, charts :charts, users :users}]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html
          [:html
           {:lang "en-us"}
           [:head
            ;; title parameter goes here:
            [:title title]
            [:meta {:http-equiv "content-type", :content "text/html; charset=utf-8"}]
            [:meta {:name "description", :content "Clovertone Music"}]
            "<!-- meta(name=\"author\", content=\"James A. Overton, james@overton.ca\")-->"
            [:meta {:name "viewport", :content "width=device-width, initial-scale=1.0"}]
            [:link {:rel "shortcut icon", :type "image/x-icon", :href "/favicon.ico"}]
            [:link {:rel "stylesheet", :type "text/css", :href "/application.css"}]
            [:script {:type "text/javascript", :src "https://use.typekit.com/uzg4nir.js"}]
            [:script "try{Typekit.load();}catch(e){}"]]
           [:body
            [:div#page
             [:div#clover-box.left
              [:a {:href "/"} [:img {:width "105", :height "90", :src "/assets/clover.png"}]]]
             [:div#banner-box.right [:a {:href "/"}] [:h1 "Clovertone Music"]]
             [:div#status-box.right [:ul#status-menu]]
             [:div#rule]
             [:div#nav-box.right
              [:ul.top-menu
               [:li.first [:a {:href "/about/clovertone-story"} "About"]]
               [:li [:a {:href "/about/customization"} "Customization"]]
               [:li [:a {:href "/about/clinics"} "Clinics"]]
               [:li [:a {:href "/about/commissions"} "Commissions"]]
               [:li [:a {:href "/composers/"} "Composers"]]
               [:li [:a {:href "/about/faq"} "FAQ"]]]]
             [:div#search-box.box.left [:input#search {:type "text", :value "Search"}]]
             ;; The contents, charts, and users parameters passed to this function go here:
             [:div#main.right contents charts users]
             [:div#audio-box]
             [:div#catalogue-box.box.left
              [:h2 "Catalogue"]
              [:ul [:li [:a.all {:href "/charts/"} "All Charts"]]]]
             [:div#grades-box.box.left
              [:h3 "Level"]
              [:ul
               [:li.grade1 [:a {:href "/grades/one"} "Grade One\n"]]
               [:li.grade2 [:a {:href "/grades/two"} "Grade Two\n"]]
               [:li.grade3 [:a {:href "/grades/three"} "Grade Three\n"]]
               [:li.grade4 [:a {:href "/grades/four"} "Grade Four\n"]]]]
             [:div#genres-box.box.left
              [:h3 "Genre"]
              [:ul
               [:li [:a {:href "/genres/latin"} "Latin"]]
               [:li [:a {:href "/genres/ballad"} "Ballad"]]
               [:li [:a {:href "/genres/rock"} "Funk / Rock"]]
               [:li [:a {:href "/genres/swing"} "Swing"]]
               [:li [:a {:href "/genres/other"} "Other"]]]]
             [:div#misc-box.box.left
              [:ul
               [:li [:a {:href "/about/grading-system"} "Grade System"]]
               [:li [:a.musicians {:href "/about/musician-roster"} "Musicians"]]]]
             [:div#follow-box.box.left
              [:h2 "Follow Us"]
              [:ul
               [:li [:a {:href "/about/podcast"} "Podcast"]]
               "<!--li: a RSS-->"
               [:li [:a {:href "http://www.facebook.com/pages/Clovertone-Music/148289658545365"} "Facebook\n"]]
               [:li [:a {:href "http://www.twitter.com/clovertone"} "Twitter\n"]]]]
             [:div#footer
              [:ul
               [:li [:a {:href "/about/privacy-policy"} "Privacy Policy\n"]]
               [:li "© 2017 Clovertone Music"]]]]
            ]])})

(defn chart-to-html
  [chart]
  (let [number (:chart-number chart)
        grade-name (->> data/catalogue
                        (:grades)
                        (filter #(= (:grade-number %) (:grade chart)))
                        (first)
                        (:grade-name))
        composer-path (->> data/catalogue
                           (:composers)
                           (filter #(= (:composer chart) (:composer-name %)))
                           (first)
                           (:filename)
                           (str "/composers/"))]
    [(keyword (str "div#" number ".chart.grade" (:grade chart)))
     [:div.head
      [:h2.title [:a {:href (str "/charts/" (:filename chart))} (:chart-name chart)]]
      [:h3.name
       [:a
        {:href composer-path}
        (str "By " (:composer chart) "\n")]]]
     [:div.body
      [:div.image
       [:div.genre-image.swing]
       [:div.genre (:category chart)]
       [:div.grade grade-name]]
      [:a.purchase
       {:href
        (str "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&"
             "body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20%22"
             (:chart-name chart) "%22.%0D%0A")}]
      [:div.blank]
      [:div.price (:price chart)]
      [:ul.actions
       [:li
        [:a#audio2.audio
         {:href (str "/audio/" (:filename chart) ".mp3")}
         "▶   Listen\n"]]
       [:li
        [:a
         {:href (str "/preview/" (:filename chart) ".preview.pdf") :target "_blank"}
         "Preview\n"]]
       [:li
        [:a
         {:href
          (str "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&"
               "body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20"
               "the%20chart%20%22" (:chart-name chart)
               "%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20"
               "instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficulty"
               "%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20"
               "contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number"
               "%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of"
               "%20%0D%0A%0D%0A")}
         "Customize\n"]]]
      (:notes chart)]
     [:table.details
      [:thead
       [:tr
        [:td "Band"]
        [:td "Genre"]
        [:td "Composer"]
        [:td "Duration"]
        [:td "Meter"]
        [:td "Tempo"]]]
      [:tbody
       [:tr
        [:td (:band-type chart)]
        [:td (:genre chart)]
        [:td [:a {:href composer-path} (:composer chart)]]
        [:td (:duration chart)]
        [:td (:meter chart)]
        [:td (:tempo chart)]]]]]))

(defn tweak-about-page
  [page-component]
  (if (= page-component :div)
    (keyword "div#content")
    (if (= (first page-component) :h1)
      (let [[h1 & rest] page-component]
        (vec (concat [(keyword (str "h1" ".title"))] rest)))
      page-component)))

(defn generate-about-contents
  [about-page]
  (let [contents (->> about-page
                      (keyword)
                      (get data/about-page-paths)
                      (m2h/file->hiccup)
                      (m2h/component)
                      (map tweak-about-page)
                      (vec)
                      (conj [:div#contents]))
        title (->> :h1.title
                   (m2h/hiccup-in contents)
                   (last))]
    {:title (str title " - Clovertone Music")
     :contents contents
     :charts [:div#charts]
     :users [:div#users]}))

(defn html-about
  []
  {"clinics" (generate-about-contents "clinics")
   "clovertone-story" (generate-about-contents "clovertone-story")
   "commissions" (generate-about-contents "commissions")
   "customization" (generate-about-contents "customization")
   "faq" (generate-about-contents "faq")
   "musician-roster" (generate-about-contents "musician-roster")
   "podcast" (generate-about-contents "podcast")
   "privacy-policy" (generate-about-contents "privacy-policy")
   "grading-system" (generate-about-contents "grading-system")})

(defn render-about
  [request]
  (let [about-page (:page (:params request))]
    (when (some #(= about-page %) (keys (html-about)))
      (let [about-html (get (html-about) about-page)]
        (render-html about-html)))))

(defn render-charts
  [request]
  (let [chart (:page (:params request))
        chart-catentry (->> data/catalogue
                            (:charts)
                            (filter #(= (:filename %) chart))
                            (first))]
    (if-not (nil? chart-catentry)
      (render-html
       {:title (str (:chart-name chart-catentry) " - Clovertone Music")
        :contents [:div#contents
                   (->> data/catalogue
                        (:charts)
                        (filter #(= (:chart-number chart-catentry) (:chart-number %)))
                        (map chart-to-html)
                        (conj [:div#list]))]
        :charts [:div#charts]
        :users [:div#users]})
      (when (nil? chart)
        (render-html
         {:title "All Charts - Clovertone Music"
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "All Charts"]
                      [:p
                       "Here's a list of all our titles so you can browse from the oldest selections "
                       "to our newest material."]]]
          :charts [:div#charts (into [:div#list] (map chart-to-html (:charts data/catalogue)))]
          :users [:div#users]})))))

(defn render-composers
  [request]
  (let [composer (:page (:params request))
        composer-catentry (->> data/catalogue
                               (:composers)
                               (filter #(= (:filename %) composer))
                               (first))]
    (if-not (nil? composer-catentry)
      (render-html
       {:title (str (:composer-name composer-catentry) " - Clovertone Music")
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:composer-name composer-catentry)]
                    [:img.float {:src (str "/images/" (:filename composer-catentry) ".jpg")}]
                    [:p (:notes composer-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      (:charts)
                      (filter #(= (:composer-name composer-catentry) (:composer %)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :users [:div#users]})
      (when (nil? composer)
        (render-html
         {:title "Composers - Clovertone Music"
          :contents [:div#contents
                     [:div#content
                      [:h1.title "Composers"]
                      [:p
                       (str "Clovertone Music’s Composers are the who’s-who of Canadian professional "
                            "musicians. You’ll see these musicians teaching at the top universities and "
                            "colleges in the country, and playing in the pit orchestra’s of downtown shows, "
                            "in music festivals and in the clubs. All have experience writing not only for "
                            "professionals but also teaching and writing for students of all ages. Read "
                            "about the people and help them make a living through writing music!")]
                      (into [:ul.composers]
                            (map (fn [composer-catentry]
                                   [:li
                                    [:a.composer {:href (str "/composers/" (:filename composer-catentry))}]
                                    [:div.image
                                     [:img
                                      {:width "140",
                                       :height "140",
                                       :src (str "/images/" (:filename composer-catentry) "-140.jpg")}]]
                                    [:div.name (:composer-name composer-catentry)]])
                                 (:composers data/catalogue)))]]
          :charts [:div#charts]
          :users [:div#users]})))))

(defn render-genres
  [request]
  (let [genre (:page (:params request))
        genre-catentry (->> data/catalogue
                            (:genres)
                            (filter #(= (:filename %) genre))
                            (first))]
    (when genre-catentry
      (render-html
       {:title (str (:genre-name genre-catentry) " - Clovertone Music")
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:genre-name genre-catentry)]
                    [:p (:notes genre-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      (:charts)
                      (filter #(= (:filename genre-catentry) (:category %)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :users [:div#users]}))))

(defn render-grades
  [request]
  (let [grade (:page (:params request))
        grade-catentry (->> data/catalogue
                            (:grades)
                            (filter #(= (:filename %) grade))
                            (first))]
    (when grade-catentry
      (render-html
       {:title (str (:grade-name grade-catentry) " - Clovertone Music")
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:grade-name grade-catentry)]
                    [:p (:notes grade-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      (:charts)
                      (filter #(= (:grade-number grade-catentry) (:grade %)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :users [:div#users]}))))

(defn render-root
  [request]
  (let [rootpg (:page (:params request))]
    (when (or (nil? rootpg) (= "index" rootpg))
      (render-html
       {:title "Home - Clovertone Music."
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title "Home"]
                    [:p
                     (str "Welcome to Clovertone Music, we are a sheet music publisher specializing "
                          "in the educational jazz band market. Our library is completely Canadian "
                          "and features some of our countries top composers. Fill out your repertoire "
                          "with Canadian content and feel good about supporting Canadian musicians!")]]]
        :charts [:div#charts
                 (->> data/catalogue
                      (:charts)
                      (sort-by :featured)
                      (filter #(not= (:featured %) "0"))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :users [:div#users]}))))
