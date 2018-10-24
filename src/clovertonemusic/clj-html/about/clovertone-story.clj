(in-ns 'clovertonemusic.core)

(def html-about-clovertone-story
  [:html
   {:lang "en-us"}
   [:head
    [:title "The Clovertone Story - Clovertone Music"]
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
        [:h1.title "The Clovertone Story"]
        [:div
         [:p.byline "By Christian Overton"]
         [:p [:img.float {:src "/images/christian-sitting.jpg"}]]
         [:p
          "In spring 2008, I learned from a colleague that selected Canadian music festivals were instituting Canadian content recommendations to schools wishing to participate.  As a professional composer, I saw these recommendations as an opportunity to make my own charts available to music teachers and students.  So I began researching Canadian publishers but soon discovered that few accessible publication outlets for Canadian writers existed.  Of those that did, they usually offered less than ideal agreements to their writers.  One might think that selling compositions to schools would be lucrative for musicians; however, traditional publishing deals often involve the writer giving up ownership of their work in return for a marginal share of the profits.  In fact, many of the writers I know have avoided publishing their material for these reasons. I realized a more collective approach to Canadian music publishing was needed and from a publisher that would benefit both writers and music educators."]
         [:p
          "Today, these aspirations are a reality with the official launch of Clovertone Music Publishing.  Clovertone is operated by professional musicians and is committed to providing fair publishing agreements to our composers while letting them keep ownership of their own music.  Similarly, the Clovertone team is committed to providing the best possible service to you, the music educator."]
         [:p
          "In the last eight years of teaching and conducting clinics in the education field, I have seen firsthand the everyday challenges music teachers face in the classroom.  For instance, busy teachers need to find their music quickly and effectively.  So we have built an online store with live-recorded demos, a solution that we believe is the most convenient way to browse and purchase sheet music. We have replaced the old publishing system of paper and postage with PDF downloading so that you can get your music faster and at a better price."]
         [:p
          "I have also seen the challenges of working with diverse student demographics across different classrooms. Sometimes there are not enough kids to fill a band, but the charts available from most publishers are designed for complete ensembles.  Teachers are also confronted with the ever-changing skill dynamics within each band and finding material for a band’s unique skill set is difficult.  So Clovertone is trying something different with our customization service.  We will customize our charts to your band’s specifications or write a whole new piece just for your ensemble.  With customization, you can work with the composers directly."]
         [:p
          "Clovertone Music also bridges the significant gap between aspiring students and the professional musicians they can look up to.  Thinking back on my years as an elementary and high school trombonist in Sudbury, Ontario, I couldn’t recall ever playing material written by a Canadian.  And even as one of the biggest music geeks studying performance and composition at Humber College in Toronto, I didn’t know the names of the outstanding Canadian composers who were now my university instructors.  Clovertone Music Publishing brings all the young, budding musicians in our schools closer to the professionals.  On our site, you can read about our composers and follow the web links to each one’s musical careers.  Take the opportunity to get in touch with the musicians who write the music you play."]
         [:p
          "At Clovertone, we are excited to provide you with a fresh way to buy quality music and support Canadian musicians.  Since we are new on the scene, your feedback is key to the development of our content and services. After browsing our site or choosing your charts, you are invited to contact us and let us know what you think."]
         [:p "Welcome to Clovertone Music,"]
         [:p "Christian Overton"]
         [:h2 "Acknowledgements"]
         [:p
          "Clovertone Music Publishing would not be possible without the funding assistance of the Canadian Youth Business Foundation (CYBF).  I would also like to personally thank Brian Lillos, John MacLeod, Andrew Jones, Stephen Overton, Daniele Overton, Victoria Buchy, Joe Auty, Eric Overton, Megumi Overton and the professional writers and musicians of Toronto for all of their dedicated work, encouragement and guidance in making Clovertone happen."]]]]
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

(defn show-html-about-clovertone-story
  [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-about-clovertone-story)})
