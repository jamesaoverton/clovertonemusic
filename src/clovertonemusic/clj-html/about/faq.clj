(in-ns 'clovertonemusic.core)

(def html-about-faq
  [:html
   {:lang "en-us"}
   [:head
    [:title "Frequently Asked Questions - Clovertone Music"]
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
        [:h1.title "Frequently Asked Questions"]
        [:div
         [:p
          "To save you some time, we’ve provided answers to our most frequently asked questions:"]
         [:ul
          [:li
           [:p
            [:strong "I didn’t get an email when I created my account?"]
            " "]
           [:p
            "Please check your junk mail folder for these emails as they can sometimes be caught by junk mail filters."]]
          [:li
           [:p
            [:strong "Is there a time limit on the downloaded file?"]
            " "]
           [:p "No. It is yours for life."]]
          [:li
           [:p
            [:strong
             "Is there a limit to how many times the chart can be printed?"]
            " "]
           [:p
            "No. You can print extra copies and parts at no extra charge."]]
          [:li
           [:p
            [:strong "Do I need any special software to read the file?"]
            " "]
           [:p
            "No. The file you download is in PDF format which can be read by any computer."]]
          [:li
           [:p [:strong "Why do my charts have a watermark?"]]
           [:p
            "The watermark is to deter file sharing. We have tried to make it as unintrusive as possible."]]
          [:li
           [:p
            [:strong
             "Are clinicians available outside the Greater Toronto Area?"]
            " "]
           [:p
            "If you are outside of the GTA and are interested in clinics please email us and we will see if we can accommodate you."]]
          [:li
           [:p
            [:strong
             "I don’t know exactly what I need out of my customization, can I talk to someone about it?"]
            " "]
           [:p
            "Yes. When emailing us about your customizations please include your phone number and the best time to reach you. An experienced composer will be in contact with you to talk over the details and answer any questions you might have. "]]
          [:li
           [:p
            [:strong "Is a composer visit required for commissions?"]]
           [:p
            "No. We can talk over any necessary deals over the phone, however having the composer visit your band and sit in on a rehearsal is preferred."]]
          [:li
           [:p
            [:strong
             "Do you write for ensembles other than Jazz band?"]]
           [:p
            "Yes. We are currently collecting scores for concert band and orchestra, feel free to request commissions for these ensembles. If you have any requests for ensembles you’d like the Clovertone Music library to feature please drop us a line an let us know."]]]]]]
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

(defn show-html-about-faq
  [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-about-faq)})
