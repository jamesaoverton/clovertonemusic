(ns clovertonemusic.html-renderer)

(load "root-pages")
(load "grades-pages")
(load "genres-pages")
(load "composers-pages")

(require '[hiccup.core :as page]
         '[clovertonemusic.root-pages :as root-pages]
         '[clovertonemusic.grades-pages :as grades-pages]
         '[clovertonemusic.genres-pages :as genres-pages]
         '[clovertonemusic.composers-pages :as composers-pages])

(defn render-html
  "Wraps the four parameters passed as arguments in the generic HTML code that is used for every
  page in Clovertone."
  [title contents charts users]
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
              [:ul [:li [:a.all {:href "/charts"} "All Charts"]]]]
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
            [:script
             {:src "/application.js",
              :type "text/javascript",
              :charset "utf-8"}]
            [:script
             {:type "text/javascript",
              :charset "utf-8"}
             "if(!window.console){window.console = {}; window.console.log=function(){};}\nvar jQuery  = require(\"jqueryify\");\nvar exports = this;\njQuery(function(){\n  var App = require(\"index\");\n  exports.app = new App({el: $(\"#page\")});      \n});\n"]]])})

(defn render-about
  [request]
  (str "<b>Rendering about</b> " request))

(defn render-charts
  [request]
  (str "<b>Rendering charts</b> " request))

(defn render-composers
  [request]
  (let [composer (or (:page (:params request)) "index")
        composer-html (get composers-pages/html-composers composer)]
    (when (some #(= composer %) (keys composers-pages/html-composers))
      (render-html (:title composer-html) (:contents composer-html) (:charts composer-html) (:users composer-html)))))

(defn render-genres
  [request]
  (let [genre (:page (:params request))
        genre-html (get genres-pages/html-genres genre)]
    (when (some #(= genre %) (keys genres-pages/html-genres))
      (render-html (:title genre-html) (:contents genre-html) (:charts genre-html) (:users genre-html)))))

(defn render-grades
  [request]
  (let [grade (:page (:params request))
        grade-html (get grades-pages/html-grades grade)]
    (when (some #(= grade %) (keys grades-pages/html-grades))
      (render-html (:title grade-html) (:contents grade-html) (:charts grade-html) (:users grade-html)))))

(defn render-root
  [request]
  (let [rootpg (or (:page (:params request)) "index")
        rootpg-html (get root-pages/html-root rootpg)]
    (when (some #(= rootpg %) (keys root-pages/html-root))
      (render-html (:title rootpg-html) (:contents rootpg-html) (:charts rootpg-html) (:users rootpg-html)))))
