(ns clovertonemusic.html
  (:require [hiccup.core :as page]
            [clovertonemusic.rootpages :as rootpages]
            [clovertonemusic.aboutpages :as aboutpages]
            [clovertonemusic.gradespages :as gradespages]
            [clovertonemusic.genrespages :as genrespages]
            [clovertonemusic.composerspages :as composerspages]
            [clovertonemusic.chartspages :as chartspages]))

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

(defn render-about
  [request]
  (let [about-page (:page (:params request))]
    (when (some #(= about-page %) (keys aboutpages/html-about))
      (let [about-html (get aboutpages/html-about about-page)]
        (render-html about-html)))))

(defn render-charts
  [request]
  (let [chart (or (:page (:params request)) "index")]
    (when (some #(= chart %) (keys chartspages/html-charts))
      (let [chart-html (get chartspages/html-charts chart)]
        (render-html chart-html)))))

(defn render-composers
  [request]
  (let [composer (or (:page (:params request)) "index")]
    (when (some #(= composer %) (keys composerspages/html-composers))
      (let [composer-html (get composerspages/html-composers composer)]
        (render-html composer-html)))))

(defn render-genres
  [request]
  (let [genre (:page (:params request))]
    (when (some #(= genre %) (keys genrespages/html-genres))
      (let [genre-html (get genrespages/html-genres genre)]
        (render-html genre-html)))))

(defn render-grades
  [request]
  (let [grade (:page (:params request))]
    (when (some #(= grade %) (keys gradespages/html-grades))
      (let [grade-html (get gradespages/html-grades grade)]
        (render-html grade-html)))))

(defn render-root
  [request]
  (let [rootpg (or (:page (:params request)) "index")]
    (when (some #(= rootpg %) (keys rootpages/html-root))
      (let [rootpg-html (get rootpages/html-root rootpg)]
        (render-html (rootpg-html))))))
