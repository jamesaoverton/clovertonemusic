(in-ns 'clovertonemusic.core)

(def html-about-musician-roster
 [:html
  {:lang "en-us"}
  [:head
   [:title "Musician Roster - Clovertone Music"]
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
       [:h1.title "Musician Roster"]
       [:div
        [:p [:img.float {:src "/images/session1.jpg"}]]
        [:p
         "The sample recordings of our charts have been performed by some of Toronto’s finest musicians. These musicians have donated their time and skills to the project because of they care about Canadian music and about Canadian music students."]
        [:p
         "Many of these fine musicians have their own projects and teach privately. Clovertone Music is proud to provide links to their projects and business contact information. Check out their stuff or find a private teacher!"]
        [:h2 "The Clovertone Music Orchestra (Block 1):"]
        [:ul
         [:li
          "1st Alto: "
          [:a
           {:href "http://www.alexisdyanmarsh.com/"}
           "Alexis Marsh"]]
         [:li "2nd Alto: Chris Roberts"]
         [:li "1st Tenor: Andy Ballantyne"]
         [:li "2nd Tenor: Nevin Dunn"]
         [:li "Baritone Sax: John DeSimini"]
         [:li "1st Trombone: Joel Green"]
         [:li
          "2nd Trombone: "
          [:a {:href "http://www.insoundmusic.com/"} "Tom Richards"]]
         [:li
          "3rd Trombone: "
          [:a {:href "http://chrishunt.ca"} "Chris Hunt"]]
         [:li "Bass Trombone: Sylvain Bedard"]
         [:li
          "1st Trumpet: "
          [:a {:href "http://theparkinglotguys.ca"} "Steve Dyte"]]
         [:li "2nd Trumpet: Mike Nease"]
         [:li
          "3rd Trumpet: Klaus Anselm ("
          [:a {:href "http://www.thehomelessband.ca/"} "The Homeless"]
          ")"]
         [:li "4th Trumpet: John Pitman"]
         [:li "Guitar: Erik Patterson"]
         [:li
          "Piano: "
          [:a {:href "http://kcroberts.ca"} "Todd Pentney"]]
         [:li "Bass: Chris Virtue"]
         [:li
          "Drums: "
          [:a
           {:href "http://www.torontodrumlessons.ca"}
           "Bruce McCarthy"]]
         [:li
          "Special Soloists: Charlie Finlay, Christian Overton, Steve Dyte"]]
        [:h2 "The Composer’s Collective Big band:"]
        [:ul
         [:li "1st Alto: Marcus Ali"]
         [:li
          "2nd Alto: "
          [:a {:href "http://www.andrewkaymusic.com"} "Andrew Kay"]
          " ("
          [:a
           {:href "http://monsoon-music.com/Welcome.html"}
           "Monsoon Band"]
          ")"]
         [:li
          "1st Tenor: "
          [:a
           {:href "http://www.myspace.com/myjonkay"}
           "Jonathan Kay"]]
         [:li
          "2nd Tenor: "
          [:a
           {:href "http://www.myspace.com/jaredwelshmusic"}
           "Jared Welsh"]]
         [:li "Baritone Sax: Phil Skladowski"]
         [:li "1st Trombone: Carsten Rubeling"]
         [:li "2nd Trombone: RJ Sachithananthan"]
         [:li "3rd Trombone: Sylvain Bedard"]
         [:li "Bass Trombone: Dan Corbett"]
         [:li
          "1st Trumpet: "
          [:a {:href "http://theparkinglotguys.ca"} "Steve Dyte"]]
         [:li "2nd Trumpet: Brian Walters"]
         [:li "3rd Trumpet: Patrice Barbanchon"]
         [:li "4th Trumpet: Will Loach, Jon Challoner"]
         [:li "Guitar: Erik Patterson"]
         [:li
          "Piano: "
          [:a {:href "http://carissaneufeld.com"} "Carissa Neufeld"]]
         [:li "Bass: Devon Henderson"]
         [:li
          "Drums: "
          [:a
           {:href "http://www.myspace.com/jeffhalischuk"}
           "Jeff Halischuk"]]]
        [:h2 "The Toronto Jazz Orchestra (the Path):"]
        [:ul
         [:li "1st Alto: Mark Laver"]
         [:li "2nd Alto: Chris Hunsburger"]
         [:li "1st Tenor: Terry Quinney"]
         [:li "2nd Tenor: Michael Carter"]
         [:li "Baritone Sax: Eric Jensen"]
         [:li "1st Trombone: Christian Overton"]
         [:li "2nd Trombone: Pat Blanchard"]
         [:li "3rd Trombone: Sylvain Bedard"]
         [:li
          "Bass Trombone: "
          [:a {:href "http://chrishunt.ca"} "Chris Hunt"]]
         [:li "1st Trumpet: Dave Dulong"]
         [:li "2nd Trumpet: Brian Walters"]
         [:li "3rd Trumpet: Marcus Extavour"]
         [:li "4th Trumpet: Ewan Divitt"]
         [:li "Guitar: Todd Elsliger"]
         [:li "Piano: Ali Berkok"]
         [:li "Bass: Carlie Howell"]
         [:li "Drums: David MacDougall"]
         [:li "Josh Grossman: Artistic Director"]]
        [:h2 "The Andy Ballantyne Large Ensemble (A.B.L.E):"]
        [:ul
         [:li "Tenor Sax/Flute: Andy Ballantyne"]
         [:li "Alto and Soprano Sax: Tara Davidson"]
         [:li "Tenor and Soprano Sax: Kelly Jefferson"]
         [:li "Baritone Sax and Contra Alto Clarinet: Peter Lutek"]
         [:li "Trumpet/Flugelhorn: Jason Logue"]
         [:li "Trumpet/Flugelhorn: Kevin Turcotte"]
         [:li "Trombone: William Carn"]
         [:li "Trombone: Rob Somervillle"]
         [:li "Piano and Wurlitzer: David Braid"]
         [:li "Bass: Michael McClennan"]
         [:li "Drums: Daniel Barnes"]]
        [:h2 "The Clovertone Music Orchestra (Block 2):"]
        [:ul
         [:li "1st Alto: Marcus Ali"]
         [:li
          "2nd Alto: "
          [:a {:href "http://www.andrewkaymusic.com"} "Andrew Kay"]
          " ("
          [:a
           {:href "http://monsoon-music.com/Welcome.html"}
           "Monsoon Band"]
          ")"]
         [:li
          "1st Tenor: "
          [:a
           {:href "http://www.myspace.com/myjonkay"}
           "Jonathan Kay"]]
         [:li "2nd Tenor: Paul Metcalfe"]
         [:li "Baritone Sax: John DeSimini"]
         [:li "1st Trombone: Joel Green"]
         [:li "2nd Trombone: Pat Blanchard"]
         [:li
          "3rd Trombone: "
          [:a {:href "http://www.insoundmusic.com/"} "Tom Richards"]]
         [:li "Bass Trombone: Sylvain Bedard"]
         [:li "1st Trumpet: Jason Logue"]
         [:li "2nd Trumpet: John Pitman"]
         [:li
          "3rd Trumpet: "
          [:a {:href "http://theparkinglotguys.ca"} "Steve Dyte"]]
         [:li "4th Trumpet: Jon Challoner"]
         [:li "Guitar: Erik Patterson"]
         [:li
          "Piano: "
          [:a {:href "http://carissaneufeld.com"} "Carissa Neufeld"]]
         [:li
          "Bass: Gord Mowat ("
          [:a {:href "http://www.arkana-music.com/"} "Arkana Music"]
          ")"]
         [:li
          "Drums: "
          [:a
           {:href "http://www.torontodrumlessons.ca"}
           "Bruce McCarthy"]]]
        [:h2
         "The University of Toronto 10 O'clock Jazz Orchestra & Guests (Block 3):"]
        [:ul
         [:li "1st Alto: Matthew Woroshyl"]
         [:li "2nd Alto: Landen Vieira"]
         [:li
          "1st Tenor: "
          [:a {:href "http://www.davidrubelmusic.com"} "David Rubel"]]
         [:li "2nd Tenor: Daniel Petras"]
         [:li "Baritone Sax: Hojin Jang "]
         [:li "1st Trombone: James Cho"]
         [:li "2nd Trombone: Aiden Sibley"]
         [:li "3rd Trombone: Michael Brooker"]
         [:li
          "Bass Trombone: "
          [:a {:href "http://www.alexduncanmusic.net"} "Alex Duncan"]]
         [:li "1st Trumpet: Jason Logue"]
         [:li "2nd Trumpet: Stephen Dyte"]
         [:li "3rd Trumpet: Patrice Barbanchon"]
         [:li "4th Trumpet: Devin Hoare"]
         [:li "Guitar: Rob Greive"]
         [:li "Piano: Paul Morrison"]
         [:li "Bass: Malcolm Connor"]
         [:li "Drums: Robin Claxton"]]
        [:h2 "The Clovertone Music Orchestra (Block 4)"]
        [:ul
         [:li
          "1st Alto: "
          [:a {:href "http://mikewark.com/home.cfm"} "Mike Wark"]]
         [:li "2nd Alto: Chris Roberts"]
         [:li "1st Tenor: Landen Viera"]
         [:li "2nd Tenor: Brian Qu"]
         [:li "Baritone Sax: Francis Smith"]
         [:li
          "1st Trombone: "
          [:a {:href "http://www.chrishunt.ca"} "Chris Hunt"]]
         [:li "2nd Trombone: Eric Porter"]
         [:li "3rd Trombone: Ernesto Barahona"]
         [:li "Bass Trombone: Sylvain Bedard"]
         [:li "1st Trumpet: Steve Dyte"]
         [:li
          "2nd Trumpet: "
          [:a
           {:href "http://www.bradharrison.ca/Home.html"}
           "Brad Harrison"]]
         [:li "3rd Trumpet: Joshua Hung"]
         [:li "4th Trumpet: Brad Eaton"]
         [:li "Guitar: Erik Patterson"]
         [:li
          "Piano: "
          [:a
           {:href "http://www.carissaneufeld.com"}
           "Carissa Neufeld"]]
         [:li "Bass: Brandon Davis"]
         [:li "Drums: Mat MacDonald"]]]]]
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

(defn show-html-about-musician-roster [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-about-musician-roster)})
