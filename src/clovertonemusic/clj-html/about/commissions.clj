(in-ns 'clovertonemusic.core)

(def html-about-commissions
 [:html
  {:lang "en-us"}
  [:head
   [:title "Commissions - Clovertone Music"]
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
       [:h1.title "Commissions"]
       [:div
        [:p [:img.float {:src "/images/sheetmusic.jpg"}]]
        [:p
         "If you’re enjoying Clovertone music’s great charts already but are looking for something special, why not get us to write a chart specifically for your band? Maybe you’re running an honour band, playing for another teacher’s retirement function, student graduation ceremony or other event, or maybe this is just that great year when you finally have that really strong band. Why not get something special, like the world premiere of a chart written for your band!"]
        [:p
         "Our preferred way of writing for your band is to get one of our composers to visit your band at a rehearsal, meet with the students face to face, ask them what they like to play and what they want to see in their chart. Then, we consult with you, the teacher, and get down to the details, like what style you’re looking for and the strengths and weaknesses of your band. We’ll even put your students’ names on the parts!"]
        [:p
         "Once we’re done the chart we can even run the first rehearsal with your band!"]
        [:p
         "Email/phone consultation is also available to those outside the Greater Toronto Area."]
        [:p
         "Here are some great reasons to commission a chart from Clovertone Music:"]
        [:ul
         [:li "Make that school event even more special."]
         [:li
          "Show off your bands strengths and hide their weaknesses with charts written specifically for your band."]
         [:li
          "Get your students engaged by having them meet the composer and give their own ideas to the project."]
         [:li
          "Get your students’ names on the parts so they can feel part of something that was really written for them."]
         [:li
          "Fill in your repertoire with something in the style you need."]
         [:li "Get your band playing Canadian content!"]]
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

(defn show-html-about-commissions [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-about-commissions)})
