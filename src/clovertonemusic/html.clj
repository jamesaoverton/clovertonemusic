(ns clovertonemusic.html
  (:require [hiccup.core :as page]
            [markdown-to-hiccup.core :as m2h]
            [ring.util.codec :as codec]
            [clojure.string :as string]
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
             [:div#search-box.box.left
              [:form
               [:input#search {:type "text", :name "search", :placeholder "Search"}]]]
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

(defn construct-email
  [email chart-name]
  (let [email-contents (data/get-email-contents email)]
    (str "mailto:" (->> (:to email-contents)
                        (codec/url-encode))
         "?subject=" (->> (:subject email-contents)
                          (codec/url-encode))
         "&body=" (->> (string/replace (:body email-contents) #"<CHART>" chart-name)
                       (codec/url-encode)))))

(defn construct-readable-duration
  [seconds-string]
  ;; We can assume that the duration ends in 's'
  (let [total-seconds (Integer/parseInt (string/replace seconds-string #"s$" ""))
        minutes (quot total-seconds 60)
        seconds (mod total-seconds 60)]
    (format "%d:%02d" minutes seconds)))

(defn chart-to-html
  [chart]
  (let [number (:chart-number chart)
        price (re-matches #"\$(\d+)(\.\d\d)" (:price chart))
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
       [(keyword (str "div.genre-image." (:category chart)))]
       [:div.genre (:category chart)]
       [:div.grade grade-name]]
      [:a.purchase
       {:href (construct-email "purchase" (:chart-name chart))}
       [:div.blank]
       [:div.price
        [:span.dollar-sign "$"]
        [:span.dollars (get price 1)]
        [:span.cents (get price 2)]]]
      [:ul.actions
       [:li
        [:a#audio2.audio
         {:href (str "/audio/" (:filename chart) ".mp3")}
         "▶   Listen\n"]]
       [:li
        [:a
         {:href (str "/previews/" (:filename chart) ".preview.pdf") :target "_blank"}
         "Preview\n"]]
       [:li
        [:a
         {:href (construct-email "customize" (:chart-name chart))}
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
        [:td (construct-readable-duration (:duration chart))]
        [:td (:meter chart)]
        [:td (:tempo chart)]]]]]))

(defn search
  [search-string]
  (letfn [(search-string-in-chart [chart]
            ;; Note: we do not filter on either category or grade since these
            ;; filters are easily accessible from the side menu
            (or
             (string/index-of (string/lower-case (:chart-name chart))
                              (string/lower-case search-string))
             (string/index-of (string/lower-case (:composer chart))
                              (string/lower-case search-string))
             (string/index-of (string/lower-case (:band-type chart))
                              (string/lower-case search-string))
             (string/index-of (string/lower-case (:tempo chart))
                              (string/lower-case search-string))
             (string/index-of (string/lower-case (:meter chart))
                              (string/lower-case search-string))
             (string/index-of (string/lower-case (->> (:duration chart)
                                                      (construct-readable-duration)))
                              (string/lower-case search-string))
             ;; For price, require the query string to either lead or end with a "$",
             ;; and don't require the cents:
             (and
              (or
               (nth (re-matches #"\$(\d+)(\.\d{2})?" search-string) 1)
               (nth (re-matches #"(\d+)(\.\d{2})?\$" search-string) 1))
              (string/index-of (:price chart)
                               (string/replace search-string #"\$" "")))
             (string/index-of (string/lower-case (:genre chart))
                              (string/lower-case search-string))
             (string/index-of (string/lower-case (:notes chart))
                              (string/lower-case search-string))))]
    (render-html
     {:title "Search Results - Clovertone Music"
      :contents [:div#contents
                 (->> data/catalogue
                      (:charts)
                      (filter search-string-in-chart)
                      (map chart-to-html)
                      (conj [:div#list]))]
      :charts [:div#charts]
      :users [:div#users]})))

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
                      (data/get-about-page-contents)
                      (m2h/md->hiccup)
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

(defn render-about
  [request]
  (if (:search (:params request))
    (search (:search (:params request)))
    (let [about-page (:page (:params request))]
      (try
        (render-html (generate-about-contents about-page))
        ;; If the file doesn't exist, just return nothing, which should result in a 404 in the browser
        (catch java.io.FileNotFoundException ex)))))

(defn render-charts
  [request]
  (if (:search (:params request))
    (search (:search (:params request)))
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
                        [:p (data/get-index-file-contents "charts")]]]
            :charts [:div#charts (into [:div#list] (map chart-to-html (:charts data/catalogue)))]
            :users [:div#users]}))))))

(defn render-composers
  [request]
  (if (:search (:params request))
    (search (:search (:params request)))
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
                        [:p (data/get-index-file-contents "composers")]
                        (into [:ul.composers]
                              (map (fn [composer-catentry]
                                     [:li
                                      [:a.composer {:href (str "/composers/" (:filename composer-catentry))}
                                       [:div.image
                                        [:img
                                         {:width "140",
                                          :height "140",
                                          :src (str "/images/" (:filename composer-catentry) "-140.jpg")}]]
                                       [:div.name (:composer-name composer-catentry)]]])
                                   (:composers data/catalogue)))]]
            :charts [:div#charts]
            :users [:div#users]}))))))

(defn render-genres
  [request]
  (if (:search (:params request))
    (search (:search (:params request)))
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
          :users [:div#users]})))))

(defn render-grades
  [request]
  (if (:search (:params request))
    (search (:search (:params request)))
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
          :users [:div#users]})))))

(defn render-root
  [request]
  (if (:search (:params request))
    (search (:search (:params request)))
    (let [rootpg (:page (:params request))]
      (when (or (nil? rootpg) (= "index" rootpg))
        (render-html
         {:title "Home - Clovertone Music."
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "Home"]
                      [:p (data/get-index-file-contents "index")]]]
          :charts [:div#charts
                   (->> data/catalogue
                        (:charts)
                        (sort-by :featured)
                        (filter #(not= (:featured %) "0"))
                        (map chart-to-html)
                        (conj [:div#list]))]
          :users [:div#users]})))))
