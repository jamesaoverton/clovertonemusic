(in-ns 'clovertonemusic.core)

(def html-composers-index
 [:html
  {:lang "en-us"}
  [:head
   [:title "All Charts - Clovertone Music"]
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
       [:h1.title "All Charts"]
       [:p
        "Clovertone Music’s Composers are the who’s-who of Canadian professional musicians. You’ll see these musicians teaching at the top universities and colleges in the country, and playing in the pit orchestra’s of downtown shows, in music festivals and in the clubs. All have experience writing not only for professionals but also teaching and writing for students of all ages. Read about the people and help them make a living through writing music!"]
       [:ul.composers
        [:li
         [:a.composer {:href "/composers/greg-crowe"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/greg-crowe-140.jpg"}]]
         [:div.name "Greg Crowe"]]
        [:li
         [:a.composer {:href "/composers/tom-richards"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/tom-richards-140.jpg"}]]
         [:div.name "Tom Richards"]]
        [:li
         [:a.composer {:href "/composers/allison-au"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/allison-au-140.jpg"}]]
         [:div.name "Allison Au"]]
        [:li
         [:a.composer {:href "/composers/liam-gallagher"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/liam-gallagher-140.jpg"}]]
         [:div.name "Liam Gallagher"]]
        [:li
         [:a.composer {:href "/composers/maria-kundakcioglu"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/maria-kundakcioglu-140.jpg"}]]
         [:div.name "Maria Kundakcioglu"]]
        [:li
         [:a.composer {:href "/composers/brad-harrison"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/brad-harrison-140.jpg"}]]
         [:div.name "Brad Harrison"]]
        [:li
         [:a.composer {:href "/composers/ewan-divitt"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/ewan-divitt-140.jpg"}]]
         [:div.name "Ewan Divitt"]]
        [:li
         [:a.composer {:href "/composers/chris-hunt"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/chris-hunt-140.jpg"}]]
         [:div.name "Chris Hunt"]]
        [:li
         [:a.composer {:href "/composers/brad-cheeseman"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/brad-cheeseman-140.jpg"}]]
         [:div.name "Brad Cheeseman"]]
        [:li
         [:a.composer {:href "/composers/andy-ballantyne"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/andy-ballantyne-140.jpg"}]]
         [:div.name "Andy Ballantyne"]]
        [:li
         [:a.composer {:href "/composers/josh-grossman"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/josh-grossman-140.jpg"}]]
         [:div.name "Josh Grossman"]]
        [:li
         [:a.composer {:href "/composers/chelsea-mcbride"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/chelsea-mcbride-140.jpg"}]]
         [:div.name "Chelsea McBride"]]
        [:li
         [:a.composer {:href "/composers/jason-logue"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/jason-logue-140.jpg"}]]
         [:div.name "Jason Logue"]]
        [:li
         [:a.composer {:href "/composers/michael-kundakcioglu"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/michael-kundakcioglu-140.jpg"}]]
         [:div.name "Michael Kundakcioglu"]]
        [:li
         [:a.composer {:href "/composers/terry-promane"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/terry-promane-140.jpg"}]]
         [:div.name "Terry Promane"]]
        [:li
         [:a.composer {:href "/composers/erik-patterson"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/erik-patterson-140.jpg"}]]
         [:div.name "Erik Patterson"]]
        [:li
         [:a.composer {:href "/composers/jim-lewis"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/jim-lewis-140.jpg"}]]
         [:div.name "Jim Lewis"]]
        [:li
         [:a.composer {:href "/composers/christian-overton"}]
         [:div.image
          [:img
           {:width "140",
            :height "140",
            :src "/images/christian-overton-140.jpg"}]]
         [:div.name "Christian Overton"]]]]]
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

(defn show-html-composers-index [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-composers-index)})
