(in-ns 'clovertonemusic.core)

(def html-about-customization
 [:html
  {:lang "en-us"}
  [:head
   [:title "Customization - Clovertone Music"]
   [:meta
    {:http-equiv "content-type", :content "text/html; charset=utf-8"}]
   [:meta {:name "description", :content "Clovertone Music"}]
   "<!-- meta(name=\"author\", content=\"James A. Overton, james@overton.ca\")-->"
   [:meta
    {:name "viewport",
     :content "width=device-width, initial-scale=1.0"}]
   [:link
    {:rel "shortcut icon", :type "image/x-icon", :href "/favicon.ico"}]
   [:link
    {:rel "stylesheet", :type "text/css", :href "/application.css"}]
   [:script
    {:type "text/javascript",
     :src "https://use.typekit.com/uzg4nir.js"}]
   [:script "try{Typekit.load();}catch(e){}"]]
  [:body
   [:div#page
    [:div#clover-box.left
     [:a
      {:href "/"}
      [:img {:width "105", :height "90", :src "/assets/clover.png"}]]]
    [:div#banner-box.right [:a {:href "/"}] [:h1 "Clovertone Music"]]
    [:div#status-box.right [:ul#status-menu]]
    [:div#rule]
    [:div#nav-box.right
     [:ul.top-menu
      [:li.first [:a {:href "/about/clovertone-story"} "About"]]
      [:li [:a {:href "/about/customization"} "Customization"]]
      [:li [:a {:href "/about/clinics"} "Clinics"]]
      [:li [:a {:href "/about/commissions"} "Commissions"]]
      [:li [:a {:href "/composers"} "Composers"]]
      [:li [:a {:href "/about/faq"} "FAQ"]]]]
    [:div#search-box.box.left
     [:input#search {:type "text", :value "Search"}]]
    [:div#main.right
     [:div#contents
      [:div#content
       [:h1.title "Customization"]
       [:div
        [:p [:img.float {:src "/images/wrench.jpg"}]]
        [:p
         "Clovertone Music is on the cutting edge of the sheet music publishing world, and we are based right here in Canada. Not only do we offer the fastest way to buy sheet music, but we also will customize the charts to suit your bands, an option never available before in publishing."]
        [:p
         "At Clovertone Music we understand that every school band is unique. The difference in skill between stronger players and weaker ones is vast and playing with full instrumentation is not always an option. The solution is customization."]
        [:p
         "Clovertone Music’s experienced Canadian writers will re-arrange our charts to suit your band. Get the chart you want designed for the band you have!"]
        [:p "We can:"]
        [:ul
         [:li
          [:em "Feature that great soloist"]
          ": We’ll give them the lead and/or solo parts."]
         [:li
          [:em "Challenge advanced students"]
          ": We’ll increase the difficulty for stronger sections of the band to keep them challenged."]
         [:li
          [:em "Simplify parts for beginning players"]
          ": We can make things easier for players so they don’t feel like their lagging behind or limit Brass range to keep them always sounding confident."]
         [:li
          [:em
           "Get those great flute and clarinet players in Jazz band"]
          ": Replace or double saxophone parts with flute or clarinet."]
         [:li
          [:em "Keep your band sounding great year after year"]
          ": Customize your chart again and again to keep your bands evolving strengths showing."]]
        [:p
         "Just tell us what you need! "
         [:a
          {:href
           "mailto:info@clovertonemusic.com?subject=Custom%20Charts%20from%20Clovertone%20Music"}
          "Contact Us!"]]]]]
     [:div#charts]
     [:div#users]]
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
      [:li
       [:a.musicians {:href "/about/musician-roster"} "Musicians"]]]]
    [:div#follow-box.box.left
     [:h2 "Follow Us"]
     [:ul
      [:li [:a {:href "/about/podcast"} "Podcast"]]
      "<!--li: a RSS-->"
      [:li
       [:a
        {:href
         "http://www.facebook.com/pages/Clovertone-Music/148289658545365"}
        "Facebook\n"]]
      [:li
       [:a {:href "http://www.twitter.com/clovertone"} "Twitter\n"]]]]
    [:div#footer
     [:ul
      [:li [:a {:href "/about/privacy-policy"} "Privacy Policy\n"]]
      [:li "© 2017 Clovertone Music"]]]]
   [:script
    {:src "/application.js",
     :type "text/javascript",
     :charset "utf-8"}]
   [:script
    {:type "text/javascript", :charset "utf-8"}
    "if(!window.console){window.console = {}; window.console.log=function(){};}\nvar jQuery  = require(\"jqueryify\");\nvar exports = this;\njQuery(function(){\n  var App = require(\"index\");\n  exports.app = new App({el: $(\"#page\")});      \n});\n"]]])

(defn show-html-about-customization [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-about-customization)})
