(in-ns 'clovertonemusic.core)

(def html-about-grading-system
 [:html
  {:lang "en-us"}
  [:head
   [:title "Our Grading System - Clovertone Music"]
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
       [:h1.title "Our Grading System"]
       [:div
        [:p
         "At Clovertone Music we base our grading system grades 1 to 4+ which closely resembles the publishing grades you are used to seeing; Grade 1 being for beginner bands, and 4+ being advance senior high school to professional difficulty."]
        [:h1 "Jazz Band"]
        [:h2 "Grade 1"]
        [:p [:strong "Band Type:"] " Beginner bands"]
        [:p [:strong "Range:"] " "]
        [:p.example
         [:img {:src "/images/grade1ranges.jpg", :alt "grade1ranges"}]]
        [:p [:strong "Rhythms:"] " "]
        [:p.example
         [:img {:src "/images/grade1rhythm.jpg", :alt "grade1rhythm"}]]
        [:p
         [:strong "Line Independence:"]
         " Horns play as a section unless a soloist is featured."]
        [:p
         [:strong "Improvising:"]
         " Mostly blues scale, very basic modal improvising. Sample scales are provided."]
        [:p.example
         [:img
          {:src "/images/improvisation.jpg", :alt "improvisation"}]]
        [:p
         [:strong "Rhythm Section:"]
         " "
         [:a {:href "/images/rhythmsections1.jpg"} "Click to View"]]
        [:p
         [:strong "Goal:"]
         " Each chart has an opportunity to teach specific musical skills and appreciation."]
        [:h2 "Grade: 2"]
        [:p [:strong "Band Type:"] " Intermediate Bands"]
        [:p [:strong "Range:"] " "]
        [:p.example
         [:img {:src "/images/grade2ranges.jpg", :alt "grade2ranges"}]]
        [:p [:strong "Rhythms:"] " "]
        [:p.example
         [:img {:src "/images/grade2rhythm.jpg", :alt "grade2rhythm"}]]
        [:p
         [:strong "Line Independence:"]
         " Still mostly sectional unless a soloist is featured, occasional double duet within the section."]
        [:p
         [:strong "Improvising:"]
         " Basic modal improvising, some very simple chord progressions, sample scales provided."]
        [:p
         [:strong "Rhythm Section:"]
         " Guitar will rarely have chord diagrams, Piano has written voicings and symbols, sample drums patters provided."]
        [:p
         [:strong "Goal:"]
         " Very educational, with more style variations."]
        [:h2 "Grade: 3"]
        [:p [:strong "Band Type:"] " Senior High School"]
        [:p [:strong "Range:"] " "]
        [:p.example
         [:img {:src "/images/grade3ranges.jpg", :alt "grade3ranges"}]]
        [:p [:strong "Rhythms:"] " "]
        [:p.example
         [:img {:src "/images/grade3rhythm.jpg", :alt "grade3rhythm"}]]
        [:p
         [:strong "Line Independence:"]
         " More line division within sections, lead parts are sometimes independent from the section."]
        [:p [:strong "Improvising:"] " Simple chord progressions."]
        [:p
         [:strong "Rhythm Section:"]
         " Slashes used for Guitar and Piano, advanced drum figures written out."]
        [:p
         [:strong "Goal:"]
         " Semi-professional material playable by students."]
        [:h2 "Grade: 4+"]
        [:p
         [:strong "Band Type:"]
         " Advanced schools bands, college/university bands, professional bands"]
        [:p [:strong "Range:"] " Professional ranges "]
        [:p.example
         [:img {:src "/images/grade4ranges.jpg", :alt "grade4ranges"}]]
        [:p [:strong "Rhythms:"] " At the composer’s discretion."]
        [:p
         [:strong "Line Independence:"]
         " At the composer’s discretion."]
        [:p [:strong "Improvising:"] " Simple to advanced harmony."]
        [:p
         [:strong "Rhythm Section:"]
         " "
         [:a {:href "/images/rhythmsections4.jpg"} "Click to View"]]
        [:p
         [:strong "Goal:"]
         " To showcase Canada’s finest composers."]
        [:h1 "Questions?"]
        [:p
         "If you have any questions about Clovertone Music’s grading system please don’t hesitate to "
         [:a
          {:href
           "mailto:info@clovertonemusic.com?subject=Grading%20System%20for%20Clovertone%20Music"}
          "contact us"]
         "."]]]]
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

(defn show-html-about-grading-system [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-about-grading-system)})
