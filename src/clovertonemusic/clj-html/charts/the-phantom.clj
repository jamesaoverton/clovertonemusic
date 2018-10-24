(in-ns 'clovertonemusic.core)

(def html-charts-the-phantom
 [:html
  {:lang "en-us"}
  [:head
   [:title "The Phantom - Clovertone Music"]
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
      [:div#77.chart.grade3
       [:div.head
        [:h2.title [:a {:href "/charts/the-phantom"} "The Phantom"]]
        [:h3.name
         [:a {:href "/composers/jason-logue"} "By Jason Logue\n"]]]
       [:div.body
        [:div.image
         [:div.genre-image.swing]
         [:div.genre "swing"]
         [:div.grade "Grade 3"]]
        [:a.purchase
         {:href
          "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Phantom%22.%0D%0A"}]
        [:div.blank]
        [:div.price
         [:span.dollar-sign "$"]
         [:span.dollars "60"]
         [:span.cents ".00"]]
        [:ul.actions
         [:li
          [:a#audio77.audio
           {:href "/audio/the-phantom.mp3"}
           "▶   Listen\n"]]
         [:li
          [:a
           {:href "/previews/the-phantom.preview.pdf",
            :target "_blank"}
           "Preview\n"]]
         [:li
          [:a
           {:href
            "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Phantom%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
           "Customize\n"]]]
        [:div.notes
         [:p
          "This great tune is by Toronto trumpet player and composer Jason Logue. It’s a swinging chart that’s very much a throwback to the classic Blue Note era of the 50s and 60s . The catchy melody is dripping with style written for trumpets and tenor saxes."]]]
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
          [:td "Jazz Band"]
          [:td "Swing"]
          [:td [:a {:href "/composers/jason-logue"} "Jason Logue"]]
          [:td "4:00"]
          [:td "4/4"]
          [:td "140"]]]]]]
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

(defn show-html-charts-the-phantom [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-charts-the-phantom)})
