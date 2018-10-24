(in-ns 'clovertonemusic.core)

(def html-genres-rock
 [:html
  {:lang "en-us"}
  [:head
   [:title "Funk/Rock - Clovertone Music"]
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
      [:div#content.index
       [:h1.title "Funk/Rock"]
       [:p
        "Have fun with our wide selection of funk and rock tunes. A lot of crowd pleasers can be found here."]]]
     [:div#charts
      [:div#list
       [:div#8.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/the-dirrty-dog"} "The Dirrty Dog"]]
         [:h3.name
          [:a {:href "/composers/chris-hunt"} "By Chris Hunt\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Dirrty%20Dog%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio8.audio
            {:href "/audio/the-dirrty-dog.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-dirrty-dog.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Dirrty%20Dog%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This funky tune is inspired by a painting of a dirty looking hot dog. It’s great fun. This tune is a great opportunity to teach the difference between a half time feel vs a swing 4 feel and also the difference between swung 8ths funk and straight 8ths funk."]
          [:p "Other features:"]
          [:ul
           [:li "Optional high lead trumpet parts"]
           [:li
            "Fun parts for lead trombone, and solo parts for Tenor 2 and trumpet"]]]]
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
           [:td "Funk"]
           [:td [:a {:href "/composers/chris-hunt"} "Chris Hunt"]]
           [:td "5:00"]
           [:td "4/4"]
           [:td "160"]]]]]
       [:div#11.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/game-on"} "Game On!"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Game%20On!%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio11.audio
            {:href "/audio/game-on.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/game-on.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Game%20On!%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Game on!\" is a driving rock tune that’s a nice closer for your set. It’s a high energy feel that your students can really dig in on. The melody is catchy moves along with a purpose. A great crowd pleaser! Sample solos are provided for Alto and Tenor Sax."]
          [:p "Other features:"]
          [:ul
           [:li "Easy rock feel"]
           [:li "Optional fills for drums provided"]]]]
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
           [:td "Rock"]
           [:td
            [:a
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "112"]]]]]
       [:div#23.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/the-path"} "The Path"]]
         [:h3.name
          [:a
           {:href "/composers/josh-grossman"}
           "By Josh Grossman\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Path%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio23.audio
            {:href "/audio/the-path.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-path.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Path%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This original composition takes the band through a variety of grooves. Some tricky rhythm section and horn lines, and the feel requires a more mature band; a strong lead trumpet is also required."]]]
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
           [:td "Gospel/Funk"]
           [:td
            [:a {:href "/composers/josh-grossman"} "Josh Grossman"]]
           [:td "6:30"]
           [:td "4/4"]
           [:td "90"]]]]]
       [:div#26.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/first-x-free"} "First X Free"]]
         [:h3.name
          [:a {:href "/composers/chris-hunt"} "By Chris Hunt\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22First%20X%20Free%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio26.audio
            {:href "/audio/first-x-free.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/first-x-free.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22First%20X%20Free%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"First X’s Free\" goes from a mysterious driving straight 8th's feel to a groovy half time funk feel. It’s a high energy tune that will keep your band wanting to play week after week. It features the Soprano Saxophone and the Trombone. It also features some muted work by the brass and a chance to let your rhythm section let loose!"]
          [:p "Other Features:"]
          [:ul
           [:li
            "Woodwind section is Soprano, Alto 2 Tenors and Bari"]]]]
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
           [:td "Straight 8ths"]
           [:td [:a {:href "/composers/chris-hunt"} "Chris Hunt"]]
           [:td "8:00"]
           [:td "4/4"]
           [:td "160"]]]]]
       [:div#35.chart.grade1
        [:div.head
         [:h2.title
          [:a {:href "/charts/all-your-base"} "All Your Base"]]
         [:h3.name
          [:a
           {:href "/composers/erik-patterson"}
           "By Erik Patterson\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22All%20Your%20Base%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio35.audio
            {:href "/audio/all-your-base.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/all-your-base.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22All%20Your%20Base%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"All Your Base\" is a medium rock tune written by versatile composer and guitarist Erik Patterson. It drives with a fun sense of urgency and features some rhythm section shots and some independent saxophone work. The name derives from internet gaming. See if your students can figure it out."]]]
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
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "110"]]]]]
       [:div#38.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/funk-out"} "Funk Out"]]
         [:h3.name
          [:a
           {:href "/composers/michael-kundakcioglu"}
           "By Michael Kundakcioglu\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Funk%20Out%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio38.audio
            {:href "/audio/funk-out.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/funk-out.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Funk%20Out%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Michael says: \"Funk Out is fun tune based on the early funk sounds of the 1960’s and ‘70’s. It features the lead alto sax in the rubato ballad opening section and gives the lead alto the opportunity to improvise over the chord changes at letter D. Check out the challenging syncopated sections which feature the horns trading rhythms reminiscent of Tower of Power.\""]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to high D"]
           [:li "Alto sax feature"]
           [:li "Challenging horn sectional parts"]]]]
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
           [:td "Funk"]
           [:td
            [:a
             {:href "/composers/michael-kundakcioglu"}
             "Michael Kundakcioglu"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#49.chart.grade2
        [:div.head
         [:h2.title [:a {:href "/charts/cloud-song"} "Cloud Song"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Cloud%20Song%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio49.audio
            {:href "/audio/cloud-song.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/cloud-song.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Cloud%20Song%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Cloud Song” is a simple straight 8ths tune written in homage to those of us with their heads stuck in the clouds. It’s written as an introduction to cross section playing, meaning that the musicians are often in unison with players in different sections not always with those beside them. It has a light rockish feel with a 50’s inspired Piano pattern."]
          [:p "Other Features:"]
          [:ul
           [:li "Simple melodies in counterpoint"]
           [:li "Solo written for Guitar"]]]]
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
           [:td "Rock"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#55.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/lost-stories"} "Lost Stories"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Lost%20Stories%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio55.audio
            {:href "/audio/lost-stories.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/lost-stories.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Lost%20Stories%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Lost Stories” is a driving straight 8ths Jazz tune written for the 2010 Musicfest Canada Yamaha All Star Band under the direction of Terry Promane. It’s written in a professional band style but is definitely accessible for high school level players. It features improvising for Alto Sax and a climactic drum solo."]
          [:p "Other Features:"]
          [:ul
           [:li "Athletic sax parts"]
           [:li "Meaty brass parts"]
           [:li "Modern sound"]]]]
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
           [:td "Str. 8ths"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "140"]]]]]
       [:div#58.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/the-wiggle"} "The Wiggle"]]
         [:h3.name
          [:a
           {:href "/composers/josh-grossman"}
           "By Josh Grossman\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Wiggle%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio58.audio
            {:href "/audio/the-wiggle.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-wiggle.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Wiggle%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Josh Says: \"The Wiggle is a straightforward funk chart that features many of the rhythms and feels students will discover as they play more in the genre.  Electric bass and keyboards (fender rhodes if you've got it) establish the groove off the top - make sure it's together and swing the 16th notes ever so slightly.\""]
          [:p "Other Features:"]
          [:ul
           [:li "1 chord solo sections"]
           [:li "Drum solo"]
           [:li "Simple introduction to swung 16ths"]]]]
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
           [:td "Funk"]
           [:td
            [:a {:href "/composers/josh-grossman"} "Josh Grossman"]]
           [:td "4:30"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#60.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/gentlemen"} "Gentlemen"]]
         [:h3.name
          [:a
           {:href "/composers/erik-patterson"}
           "By Erik Patterson\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Gentlemen%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio60.audio
            {:href "/audio/gentlemen.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/gentlemen.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Gentlemen%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Gentlemen” is a slinky  laid back rock tune written by versatile composer and guitarist Erik Patterson. It features all sections on an easy melody and has fun and simple chord changes to improvise on. It also has easy brass and rhythm section parts, and a written out guitar line."]
          [:p "Other Features:"]
          [:ul
           [:li "Easy trombone melody sections"]
           [:li "Fun guitar part"]]]]
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
           [:td "Jazz band"]
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#61.chart.grade1
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/la-cattura"}
           "La Cattura Di Salvatore Veloce"]]
         [:h3.name
          [:a
           {:href "/composers/erik-patterson"}
           "By Erik Patterson\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22La%20Cattura%20Di%20Salvatore%20Veloce%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio61.audio
            {:href "/audio/la-cattura.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/la-cattura.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22La%20Cattura%20Di%20Salvatore%20Veloce%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“La Cattura” is a Funky 70s rock tune by guitarist Erik Patterson. It’s inspiration comes from the genre of Spaghetti westerns. It has a catchy minor vibe and is felt in 2 throughout. It’s epic feel feature some strong sax section work as well as some great brass backgrounds."]
          [:p "Other Features:"]
          [:ul
           [:li "Fun guitar part"]
           [:li "Solos for alto or tenor sax"]
           [:li "Easy brass parts"]]]]
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
           [:td "Jazz band"]
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#68.chart.grade2
        [:div.head
         [:h2.title [:a {:href "/charts/go-go-blues"} "Go Go Blues"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Go%20Go%20Blues%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio68.audio
            {:href "/audio/go-go-blues.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/go-go-blues.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Go%20Go%20Blues%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Go Go Blues” is a fun and slinky rock tun inspired by 1960’s go go music. It features accessible figures, blues scale improvising for any instrument, and a lot of unison passages. The groove is easy to learn and will keep students and audiences wanting to hear it again and again. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Losts of stop time sections"]
           [:li "Strong sax parts"]
           [:li "Solos for any instrument"]]]]
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
           [:td "Go Go Rock"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:30"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#75.chart.grade1
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/la-squadra-da-milano"}
           "La Squadra Da Milano"]]
         [:h3.name
          [:a
           {:href "/composers/erik-patterson"}
           "By Erik Patterson\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22La%20Squadra%20Da%20Milano%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio75.audio
            {:href "/audio/la-squadra-da-milano.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/la-squadra-da-milano.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22La%20Squadra%20Da%20Milano%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“La Squadra Di Milano” is another great and groovy grade 1 rock tune thats more of a strut. It was inspired my Italian cop movies. It’s got some easy rhythms that are great for beginner bands but is still very musical and a lot of fun. It has melody sections in the saxes and as a full band and features a solo section written for alto sax. The attitude really comes though the music and will have your band wanting to play it week in and week out."]]]
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
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#76.chart.grade1
        [:div.head
         [:h2.title
          [:a {:href "/charts/stone-cold-strut"} "Stone Cold Strut"]]
         [:h3.name
          [:a
           {:href "/composers/erik-patterson"}
           "By Erik Patterson\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Stone%20Cold%20Strut%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio76.audio
            {:href "/audio/stone-cold-strut.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/stone-cold-strut.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Stone%20Cold%20Strut%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Stone Cold Strut” is a high energy rock tune with a great jump feel to it. This one is sure to get your audience’s head bopping and features strong section playing throughout. The rhythmic figures are simple but effective and the solo section is written for Tenor Sax. Check out the great build at the end!"]]]
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
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#85.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/hamunaptra"} "Hamunaptra"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Hamunaptra%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio85.audio
            {:href "/audio/hamunaptra.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/hamunaptra.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Hamunaptra%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Hamunaptra” is a spooky minor rock tune named after the fictional Egyptian city also known as the city of the dead.  The tune goes from a half X feel to a driving four feel in the bridge building back up to launch back into the main feel. The sax section and trumpet section are featured throughout with room for improvising for any horn and later on for piano. This one is sure to be a hit with students and audience members alike."]]]
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
           [:td "Rock"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "180"]]]]]
       [:div#88.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/brown-and-tan"} "Brown and Tan"]]
         [:h3.name
          [:a
           {:href "/composers/brad-harrison"}
           "By Brad Harrison\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Brown%20and%20Tan%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio88.audio
            {:href "/audio/brown-and-tan.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/brown-and-tan.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Brown%20and%20Tan%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Brown and Tan is a medium tempo feature for flute or alto saxophone reminiscent of the jazzy pop tunes of the 60’s and 70’s. The improvised section can be navigated using only the F major concert scale. Two full chorus band solis also allow the rest of the ensemble to shine as well."]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a {:href "/composers/brad-harrison"} "Brad Harrison"]]
           [:td "6:00"]
           [:td "4/4 "]
           [:td "150"]]]]]
       [:div#95.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/no-trespassing"} "No Trespassing"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22No%20Trespassing%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio95.audio
            {:href "/audio/no-trespassing.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/no-trespassing.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22No%20Trespassing%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“No Trespassing” is a tough as nails strut inspired by the hip hop brass bands of modern New Orleans. It features lots of juicy brass and saxophone lines and is written in cut time for easy reading. This one is guaranteed to be a blast for students and audience members alike."]]]
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
           [:td "Rock"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:00"]
           [:td "2/2"]
           [:td "100"]]]]]
       [:div#98.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/river"} "River"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22River%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio98.audio
            {:href "/audio/river.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/river.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22River%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"River\" is about reflecting on one's troubles in the midst of the peace, calm, and strength of the eponymous river. The phrases\nhere should be smoothly articulated throughout, and the brass should be regal sounding wherever possible."]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "4:30"]
           [:td "5/4"]
           [:td "160"]]]]]
       [:div#99.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/julia"} "Julia"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Julia%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio99.audio
            {:href "/audio/julia.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/julia.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Julia%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Julia\" is inspired by a long-lost friend, someone who was incredibly important at one point and then just fell off the map. This piece features lush ensemble passages, a challenging soprano sax feature, and a modulation into and out of double-time."]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "7:00"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#100.chart.grade4
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/thinking-in-circles"}
           "Thinking In Circles"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Thinking%20In%20Circles%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio100.audio
            {:href "/audio/thinking-in-circles.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/thinking-in-circles.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Thinking%20In%20Circles%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Thinking In Circles\" is about negative thought spirals and inner conflict. This features an extended section without the drums and a slow-down/speed-up much like a wind-up toy."]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "6:00"]
           [:td "5/4"]
           [:td "132"]]]]]
       [:div#102.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/life-race"} "Life Race"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Life%20Race%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio102.audio
            {:href "/audio/life-race.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/life-race.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Life%20Race%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Life Race” is a high energy driving straight 8ths number that’s challenging but manageable for most bands and will be sure to have your group excited to come to rehearsal every week! It features the alto sax and a fun soli section for the whole band. There’s even some clapping for the audience to join in!"]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:30"]
           [:td "4/4"]
           [:td "180"]]]]]
       [:div#103.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/junk"} "Junk"]]
         [:h3.name
          [:a
           {:href "/composers/liam-gallagher"}
           "By Liam Gallagher\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Junk%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio103.audio
            {:href "/audio/junk.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/junk.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Junk%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Junk\" Is an accessible Jazz Funk tune with something to do for everyone! It's a nice introduction to cut time reading and has a groove your students will want to keep playing."]]]
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
           [:td "Funk"]
           [:td
            [:a {:href "/composers/liam-gallagher"} "Liam Gallagher"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "160"]]]]]
       [:div#105.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/last-resorts"} "Last Resorts"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Last%20Resorts%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio105.audio
            {:href "/audio/last-resorts.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/last-resorts.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Last%20Resorts%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Last Resorts\" aims to capture a feeling of wistfulness and desperation - what happens when you're out of ideas to solve a problem? The whole piece floats between a light and swinging Afro-Cuban feel and a heavier, funky 4/4 groove, and features a trumpet solo over the latter groove, and a drum solo around ensemble shots/pads after an unaccompanied horn soli."]]]
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
           [:td "12/8 Rock"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "5:30"]
           [:td "12/8"]
           [:td "100"]]]]]
       [:div#110.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/intransitory"} "Intransitory"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Intransitory%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio110.audio
            {:href "/audio/intransitory.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/intransitory.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Intransitory%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Inspired by a day of terrible commuting, \"Intransitory\" embodies all of the feelings of being a long-distance commuter - constantly in motion, often exhausted."]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "7:30"]
           [:td "4/4"]
           [:td "177"]]]]]
       [:div#111.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/twilight-fall"} "The Twilight Fall"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Twilight%20Fall%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio111.audio
            {:href "/audio/twilight-fall.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/twilight-fall.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Twilight%20Fall%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Picture your six-year-old self, in onesie pajamas (or whatever you wore when you were six), falling through a purple sky with orange clouds. Until you land, in a carnival – broken, tilted Ferris wheel on one side, dusty, abandoned carousel, chipped paint, fading, on the other. You see the gates open, and the buttons for the carousel are exposed in front of you, so you approach, teddy bear in one hand, the other outstretched to turn on the machine – when grey, translucent spirits, begin to swirl around your head."]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "9:00"]
           [:td "4/4"]
           [:td "65"]]]]]
       [:div#112.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/smooth"} "Smooth"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Smooth%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio112.audio
            {:href "/audio/smooth.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/smooth.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Smooth%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "After the worst day of your life, you end up running into the person you least wanted to see...and try to impress them into coming back into your life. It's not as excellent a start as you were hoping, to say the least"]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "7:30"]
           [:td "4/4"]
           [:td "72"]]]]]
       [:div#113.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/spirits"} "Spirits"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Spirits%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio113.audio
            {:href "/audio/spirits.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/spirits.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Spirits%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "A follow up to \"Smooth\", this piece begins as a Broadway style playoff and takes a moody turn into the dark side of your mind, coming to an unsteady resolution as your walk takes you home and into bed."]]]
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
           [:td "7/4"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "4:00"]
           [:td "7/4"]
           [:td "70"]]]]]
       [:div#114.chart.grade4
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/arrival-of-the-pegasus"}
           "Arrival of the Pegasus"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Arrival%20of%20the%20Pegasus%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio114.audio
            {:href "/audio/arrival-of-the-pegasus.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/arrival-of-the-pegasus.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Arrival%20of%20the%20Pegasus%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Based on the Six Theme from Battlestar: Galactica, and the plot from season 3, episode 4 of that show, this piece envisions an epic battle in space, from start to finish."]]]
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
           [:td "7/4"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "8:00"]
           [:td "7/4"]
           [:td "175"]]]]]
       [:div#115.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/foot-in-mouth"} "Foot in Mouth"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Foot%20in%20Mouth%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio115.audio
            {:href "/audio/foot-in-mouth.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/foot-in-mouth.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Foot%20in%20Mouth%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Imagine yourself 30 years older than you are, with friends you've known for decades, gossiping around a campfire or a dinner table. When you look back on your experiences, will you be proud of them? Or will you think of yourselves as foolish?"]]]
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
           [:td "Straight 8ths"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "10:00"]
           [:td "4/4"]
           [:td "70"]]]]]
       [:div#118.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/something-simple"} "Something Simple"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Something%20Simple%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio118.audio
            {:href "/audio/something-simple.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/something-simple.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Something%20Simple%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This is a celebratory piece - about all things that are good about love, and friends, and a solid groove. \"Something Simple\" was written to close a concert on my 21st birthday, and we've used it to close every show since."]]]
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
           [:td "Funk"]
           [:td
            [:a
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "6:30"]
           [:td "4/4"]
           [:td "185"]]]]]
       [:div#119.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/a-cool-breeze"} "A Cool Breeze"]]
         [:h3.name
          [:a
           {:href "/composers/terry-promane"}
           "By Terry Promane\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.rock]
          [:div.genre "rock"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22A%20Cool%20Breeze%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio119.audio
            {:href "/audio/a-cool-breeze.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/a-cool-breeze.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22A%20Cool%20Breeze%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This jazz fusion inspired tune has a great mood and feel that your students will grab onto. A great reward for mature sounding bands! It features the trumpet and soprano sax."]]]
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
           [:td "Rock"]
           [:td
            [:a {:href "/composers/terry-promane"} "Terry Promane"]]
           [:td "5:30"]
           [:td "4/4"]
           [:td "100"]]]]]]]
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

(defn show-html-genres-rock [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-genres-rock)})
