(ns clovertonemusic.html
  (:require [hiccup.core :as page]
            [clovertonemusic.data :as data]))

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

(defn chart-to-html
  [chart]
  (let [number (:chart-number chart)
        grade-name (->> data/catalogue
                        (:grades)
                        (filter #(= (:grade-number %) (:grade chart)))
                        (first)
                        (:grade-name))
        composer-path (->> data/catalogue
                           (:composers)
                           (filter #(= (:composer chart) (:composer-name %)))
                           (first)
                           (:filename)
                           (str "/composers/"))]
    [(keyword (str "div#" number ".chart.grade" (:grade chart)))
     [:div.head
      [:h2.title [:a {:href (str "/charts/" (:filename chart))} (:chart-name chart)]]
      [:h3.name
       [:a
        {:href composer-path}
        (str "By " (:composer chart) "\n")]]]
     [:div.body
      [:div.image
       [:div.genre-image.swing]
       [:div.genre (:category chart)]
       [:div.grade grade-name]]
      [:a.purchase
       {:href
        (str "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&"
             "body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20%22"
             (:chart-name chart) "%22.%0D%0A")}]
      [:div.blank]
      [:div.price (:price chart)]
      [:ul.actions
       [:li
        [:a#audio2.audio
         {:href (str "/audio/" (:filename chart) ".mp3")}
         "▶   Listen\n"]]
       [:li
        [:a
         {:href (str "/preview/" (:filename chart) ".preview.pdf") :target "_blank"}
         "Preview\n"]]
       [:li
        [:a
         {:href
          (str "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&"
               "body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20"
               "the%20chart%20%22" (:chart-name chart)
               "%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20"
               "instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficulty"
               "%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20"
               "contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number"
               "%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of"
               "%20%0D%0A%0D%0A")}
         "Customize\n"]]]
      (:notes chart)]
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
        [:td (:band-type chart)]
        [:td (:genre chart)]
        [:td [:a {:href composer-path} (:composer chart)]]
        [:td (:duration chart)]
        [:td (:meter chart)]
        [:td (:tempo chart)]]]]]))

(defn html-about
  []
  {"clinics" {:title "Clinics - Clovertone Music"
              :contents [:div#contents
                         [:div#content
                          [:h1.title "Clinics"]
                          [:div
                           [:h2 "Now Available in the Greater Toronto Area!"]
                           [:p [:img.float {:src "/images/session2.jpg"}]]
                           [:p
                            "Clovertone Music’s commitment to the development of Canadian music students doesn’t just stop at the sheet music that they play. We’ll actually book a clinician to come in and work with your band giving them insight from professional Canadian musicians right in the classroom.Get your weak sections up to snuff or give a special musical treat to your keen students."]
                           [:p "We offer clinics on topics such as:"]
                           [:ul
                            [:li "Sectionals: For any section."]
                            [:li
                             "Full band chart rehearsal: Get inside the scores and get your band sounding tight."]
                            [:li "Improvisation: Help your soloists sound like the pros."]
                            [:li "Theory: Learn what all those crazy chords mean!"]
                            [:li
                             "Jazz Appreciation: Peak your students’ interest in playing this great music."]]
                           [:p
                            [:a
                             {:href
                              "mailto:info@clovertonemusic.com?subject=Clinics%20from%20Clovertone%20Music"}
                             "Contact us"]
                            " and let us know you’re interested!"]]]]
              :charts [:div#charts]
              :users [:div#users]}
   "clovertone-story" {:title "The Clovertone Story - Clovertone Music"
                       :contents [:div#contents
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
                       :charts [:div#charts]
                       :users [:div#users]}
   "commissions" {:title "Commissions - Clovertone Music"
                  :contents [:div#contents
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
                  :charts [:div#charts]
                  :users [:div#users]}
   "customization" {:title "Customization - Clovertone Music"
                    :contents [:div#contents
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
                    :charts [:div#charts]
                    :users [:div#users]}
   "faq" {:title "Frequently Asked Questions - Clovertone Music"
          :contents [:div#contents
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
          :charts [:div#charts]
          :users [:div#users]}
   "grading-system" {:title "Our Grading System - Clovertone Music"
                     :contents [:div#contents
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
                     :charts [:div#charts]
                     :users [:div#users]}
   "musician-roster" {:title "Musician Roster - Clovertone Music"
                      :contents [:div#contents
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
                      :charts [:div#charts]
                      :users [:div#users]}
   "podcast" {:title "Clovertone Music's Jazz Education Podcast - Clovertone Music"
              :contents [:div#contents
                         [:div#content
                          [:h1.title "Clovertone Music's Jazz Education Podcast"]
                          [:div
                           [:p
                            [:a
                             {:href
                              "https://itunes.apple.com/ca/podcast/clovertone-musics-jazz-education/id684534867?mt=2",
                              :target "_blank"}
                             [:img.float
                              {:width "200",
                               :src "/assets/podcast.jpg",
                               :alt "Clovertone Podcast",
                               :title "Subscribe with iTunes!"}]]]
                           [:h3
                            [:a
                             {:href
                              "https://itunes.apple.com/ca/podcast/clovertone-musics-jazz-education/id684534867?mt=2",
                              :target "_blank"}
                             "Subscribe with iTunes!"]]
                           [:p
                            "Clovertone Music's Jazz Education Podcast is where educators can gain insights on teaching jazz from top pros. Hosted by Clovertone Music's Christian Overton, each episode we interview a different expert about strategies for running rehearsals, teaching specific jazz feels, what to look out for when teaching certain instruments and more! A must for any music teacher."]
                           [:p
                            "("
                            [:a
                             {:href "https://clovertonemusic.com/podcast.xml",
                              :target "_blank"}
                             "Subscribe with another program."]
                            ")"]]]]
              :charts [:div#charts]
              :users [:div#users]}
   "privacy-policy" {:title "Clovertone Music Privacy Policy - Clovertone Music"
                     :contents [:div#contents
                                [:div#content
                                 [:h1.title "Clovertone Music Privacy Policy"]
                                 [:div
                                  [:p
                                   "Clovertone Music Understands that you care about your personal information and how it's used."]
                                  [:h2 "What information do we collect?"]
                                  [:p
                                   "We collect information from you when you register on our site, place an order, subscribe to our newsletter or fill out a form. "]
                                  [:p
                                   "We do not see or keep any of your financial information. When you pay for items at Clovertone music you are transferred to Paypal's secure site and they deal with all your financial information. We never see your financial information."]
                                  [:p
                                   "When ordering or registering on our site, as appropriate, you may be asked to enter your: name, e-mail address or phone number. You may, however, visit our site anonymously."]
                                  [:h2 "What do we use your information for?"]
                                  [:p
                                   "Any of the information we collect from you may be used in one of the following ways: "]
                                  [:ul
                                   [:li
                                    [:p
                                     "To improve our website\n(we continually strive to improve our website offerings based on the information and feedback we receive from you)"]]
                                   [:li
                                    [:p
                                     "To improve customer service\n(your information helps us to more effectively respond to your customer service requests and support needs)"]]
                                   [:li
                                    [:p
                                     "To process transactions\nYour information, whether public or private, will not be sold, exchanged, transferred, or given to any other company for any reason whatsoever, without your consent, other than for the express purpose of delivering the purchased product or service requested. "]]]
                                  [:h2 "Do we use cookies?"]
                                  [:p
                                   "Yes (Cookies are small files that a site or its service provider transfers to your computers hard drive through your Web browser (if you allow) that enables the sites or service providers systems to recognize your browser and capture and remember certain information"]
                                  [:p
                                   "We use cookies to help us remember and process the items in your shopping cart and compile aggregate data about site traffic and site interaction so that we can offer better site experiences and tools in the future."]
                                  [:h2 "Do we disclose any information to outside parties?"]
                                  [:p
                                   "We do not sell, trade, or otherwise transfer to outside parties your personally identifiable information. We may release your information when we believe release is appropriate to comply with the law, enforce our site policies, or protect ours or others rights, property, or safety. "]
                                  [:h2 "Childrens Online Privacy Protection Act Compliance"]
                                  [:p
                                   "We are in compliance with the requirements of COPPA (Childrens Online Privacy Protection Act), we do not collect any information from anyone under 13 years of age. Our website, products and services are all directed to people who are at least 13 years old or older."]
                                  [:h2 "Online Privacy Policy Only"]
                                  [:p
                                   "This online privacy policy applies only to information collected through our website and not to information collected offline."]
                                  [:h2 "Your Consent"]
                                  [:p "By using our site, you consent to our privacy policy."]
                                  [:h2 "Changes to our Privacy Policy"]
                                  [:p
                                   "If we decide to change our privacy policy, we will post those changes on this page. "]
                                  [:h2 "Contacting Us"]
                                  [:p
                                   "If there are any questions regarding this privacy policy you may contact us using the information below. "]
                                  [:p
                                   "clovertonemusic.com "
                                   [:br]
                                   "\n30 Lessard Ave "
                                   [:br]
                                   "\nToronto, Ontario M6S 1X5 "
                                   [:br]
                                   "\nCanada "
                                   [:br]
                                   "\nchristian@clovertonemusic.com "
                                   [:br]
                                   "\n(416) 274-5875  "]
                                  [:p
                                   "Privacy Policy Created by "
                                   [:a
                                    {:href "http://www.freeprivacypolicy.com"}
                                    "Free Privacy Policy"]
                                   "."]
                                  [:h1 "Clovertone Music Conditions of Use"]
                                  [:p
                                   "Welcome to Clovertone Music. We provide website features to you subject to the following conditions. If you visit or shop at ClovertoneMusic.com, you accept these conditions. Please read them carefully."]
                                  [:h2 "PRIVACY"]
                                  [:p
                                   "Please review our Privacy Notice, which also governs your visit to ClovertoneMusic.com, to understand our practices."]
                                  [:h2 "COPYRIGHT"]
                                  [:p
                                   "All content included on this site, such as text, graphics, logos, button icons, images, audio clips, digital downloads, and data compilations, is the property of Clovertone Music or its content suppliers and is protected by international copyright laws."]
                                  [:h2 "LICENSE AND SITE ACCESS"]
                                  [:p
                                   "Clovertone Music grants you a limited license to access and make personal use of this site and not to download (other than page caching) or modify it, or any portion of it, except with express written consent of Clovertone Music. This license does not include any resale or commercial use of this site or its contents; any collection and use of any product listings, descriptions, or prices; any derivative use of this site or its contents; any downloading or copying of account information for the benefit of another merchant; or any use of data mining, robots, or similar data gathering and extraction tools. This site or any portion of this site may not be reproduced, duplicated, copied, sold, resold, visited, or otherwise exploited for any commercial purpose without express written consent of Clovertone Music. The products sold on this site are for use by the purchaser and the institution to which that purchaser belongs use by any third party is prohibited. Any reproduction or distribution of these files is strictly forbidden. "]
                                  [:h2 "YOUR ACCOUNT"]
                                  [:p
                                   "If you use this site, you are responsible for maintaining the confidentiality of your account and password and for restricting access to your computer, and you agree to accept responsibility for all activities that occur under your account or password. You must be 18 years of age to purchase from this site.  "]
                                  [:h2 "DISCLAIMER"]
                                  [:p
                                   "Clovertone Music does dot warrant that ClovertoneMusic.com, it's servers or any email sent from Clovertone Music is free from harmful components. Clovertone Music will not be liable for damages of any kind arising from the use of this site. "]
                                  [:h2 "PRICING"]
                                  [:p
                                   "The listed price on Clovertone Music will be the price charged to PayPal for every chosen product, however we reserve the right to change our prices at any time. "]
                                  [:h2 "APPLICABLE LAW"]
                                  [:p
                                   "By using ClovertoneMusic.com you agree to abide under the laws of the province of Ontario, and are aware that these laws will cover these conditions of use and any dispute that may arise."]]]]
                     :charts [:div#charts]
                     :users [:div#users]}})

(defn render-about
  [request]
  (let [about-page (:page (:params request))]
    (when (some #(= about-page %) (keys (html-about)))
      (let [about-html (get (html-about) about-page)]
        (render-html about-html)))))

(defn render-charts
  [request]
  (let [chart (:page (:params request))
        chart-catentry (->> data/catalogue
                            (:charts)
                            (filter #(= (:filename %) chart))
                            (first))]
    (if-not (nil? chart-catentry)
      (render-html
       {:title (str (:chart-name chart-catentry) " - Clovertone Music")
        :contents [:div#contents
                   (->> data/catalogue
                        (:charts)
                        (filter #(= (:chart-number chart-catentry) (:chart-number %)))
                        (map chart-to-html)
                        (conj [:div#list]))]
        :charts [:div#charts]
        :users [:div#users]})
      (when (nil? chart)
        (render-html
         {:title "All Charts - Clovertone Music"
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "All Charts"]
                      [:p
                       "Here's a list of all our titles so you can browse from the oldest selections "
                       "to our newest material."]]]
          :charts [:div#charts (into [:div#list] (map chart-to-html (:charts data/catalogue)))]
          :users [:div#users]})))))

(defn render-composers
  [request]
  (let [composer (:page (:params request))
        composer-catentry (->> data/catalogue
                               (:composers)
                               (filter #(= (:filename %) composer))
                               (first))]
    (if-not (nil? composer-catentry)
      (render-html
       {:title (str (:composer-name composer-catentry) " - Clovertone Music")
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:composer-name composer-catentry)]
                    [:img.float {:src (str "/images/" (:filename composer-catentry) ".jpg")}]
                    [:p (:notes composer-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      (:charts)
                      (filter #(= (:composer-name composer-catentry) (:composer %)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :users [:div#users]})
      (when (nil? composer)
        (render-html
         {:title "Composers - Clovertone Music"
          :contents [:div#contents
                     [:div#content
                      [:h1.title "Composers"]
                      [:p
                       (str "Clovertone Music’s Composers are the who’s-who of Canadian professional "
                            "musicians. You’ll see these musicians teaching at the top universities and "
                            "colleges in the country, and playing in the pit orchestra’s of downtown shows, "
                            "in music festivals and in the clubs. All have experience writing not only for "
                            "professionals but also teaching and writing for students of all ages. Read "
                            "about the people and help them make a living through writing music!")]
                      (into [:ul.composers]
                            (map (fn [composer-catentry]
                                   [:li
                                    [:a.composer {:href (str "/composers/" (:filename composer-catentry))}]
                                    [:div.image
                                     [:img
                                      {:width "140",
                                       :height "140",
                                       :src (str "/images/" (:filename composer-catentry) "-140.jpg")}]]
                                    [:div.name (:composer-name composer-catentry)]])
                                 (:composers data/catalogue)))]]
          :charts [:div#charts]
          :users [:div#users]})))))

(defn render-genres
  [request]
  (let [genre (:page (:params request))
        genre-catentry (->> data/catalogue
                            (:genres)
                            (filter #(= (:filename %) genre))
                            (first))]
    (when-not (nil? genre-catentry)
      (render-html
       {:title (str (:genre-name genre-catentry) " - Clovertone Music")
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:genre-name genre-catentry)]
                    [:p (:notes genre-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      (:charts)
                      (filter #(= (:filename genre-catentry) (:category %)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :users [:div#users]}))))

(defn render-grades
  [request]
  (let [grade (:page (:params request))
        grade-catentry (->> data/catalogue
                            (:grades)
                            (filter #(= (:filename %) grade))
                            (first))]
    (when-not (nil? grade-catentry)
      (render-html
       {:title (str (:grade-name grade-catentry) " - Clovertone Music")
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:grade-name grade-catentry)]
                    [:p (:notes grade-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      (:charts)
                      (filter #(= (:grade-number grade-catentry) (:grade %)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :users [:div#users]}))))

(defn render-root
  [request]
  (let [rootpg (:page (:params request))]
    (when (or (nil? rootpg) (= "index" rootpg))
      (render-html
       {:title "Home - Clovertone Music."
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title "Home"]
                    [:p
                     (str "Welcome to Clovertone Music, we are a sheet music publisher specializing "
                          "in the educational jazz band market. Our library is completely Canadian "
                          "and features some of our countries top composers. Fill out your repertoire "
                          "with Canadian content and feel good about supporting Canadian musicians!")]]]
        :charts [:div#charts
                 (->> data/catalogue
                      (:charts)
                      (sort-by :featured)
                      (filter #(not= (:featured %) "0"))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :users [:div#users]}))))
