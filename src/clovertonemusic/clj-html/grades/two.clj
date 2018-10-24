(in-ns 'clovertonemusic.core)

(def html-grades-two
 [:html
  {:lang "en-us"}
  [:head
   [:title "Grade Two - Clovertone Music"]
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
       [:h1.title "Grade Two"]
       [:p
        "These grade 2 charts are aimed at intermediate bands or good junior bands."]]]
     [:div#charts
      [:div#list
       [:div#7.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/detective-story"} "Detective Story"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Detective%20Story%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio7.audio
            {:href "/audio/detective-story.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/detective-story.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Detective%20Story%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This chart is written with a real \"film noir\" type of sound. I'm picturing a 1920's  hard boiled detective in his daily grind. This tune let's your Bass player really dig in and offers some great opportunity for some bluesy sounds out of your sax section."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to G"]
           [:li "Minimal line independence"]
           [:li "Blues scale based solos"]]]]
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
           [:td "Slow Swing"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#9.chart.grade2
        [:div.head
         [:h2.title [:a {:href "/charts/that-look"} "That Look"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22That%20Look%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio9.audio
            {:href "/audio/that-look.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/that-look.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22That%20Look%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"That Look\" is a slow dance shuffle ballad feature for the Alto Saxophone. It’s a classic recognizable style that we as professional musicians play in all the time. The melody is very singable and the harmony goes some nice places. It’s a good opportunity to share with your students a little bit about being a musician as a career, and playing this dance kind of music."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to G"]
           [:li "Improvising is Beginner level"]]]]
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
           [:td "Swing Ballad"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "60"]]]]]
       [:div#10.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/atlantic-crossing"} "Atlantic Crossing"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Atlantic%20Crossing%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio10.audio
            {:href "/audio/atlantic-crossing.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/atlantic-crossing.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Atlantic%20Crossing%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Atlantic crossing\" is a modal tune with a light straight 8ths feel. I wrote this to get the kind of feeling of being alone on the quiet water. It features some wave sound effects in the brass and some room for your trumpet soloist to blow. A good teaching opportunity is the Mixolydian scale and modal Jazz as a whole."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to F"]
           [:li "Wave effects in the horns"]
           [:li "Trumpet solo on the mixolydian scale"]]]]
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
           [:td "Straight 8ths Modal"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#15.chart.grade2
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/electros-next-plot-jr"}
           "Electro's Next Plot (Jr.)"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Electro's%20Next%20Plot%20(Jr.)%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio15.audio
            {:href "/audio/electros-next-plot-jr.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/electros-next-plot-jr.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Electro's%20Next%20Plot%20(Jr.)%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Electro’s Next Plot\" was inspired by T.V. music from when I was a kid, most notably in the comic book genre. This is a fun shuffle featuring your guitar player and some dirty saxophone section work. It’s a good opportunity to teach your students about the 12/8 feel and reading rhythms in this meter. Have your band let loose!"]
          [:p "Other features:"]
          [:ul
           [:li "Grade 2 Version"]
           [:li "Lead trumpet to G"]
           [:li "Blues scale improvisation"]]]]
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
           [:td "Slow Shuffle"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "12/8"]
           [:td "72"]]]]]
       [:div#31.chart.grade2
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/a-kingdoms-last-hope-jr"}
           "A Kingdom's Last Hope Jr."]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22A%20Kingdom's%20Last%20Hope%20Jr.%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio31.audio
            {:href "/audio/a-kingdoms-last-hope-jr.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/a-kingdoms-last-hope-jr.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22A%20Kingdom's%20Last%20Hope%20Jr.%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"A Kingdom’s Last Hope\" is a story telling tune. The first section is the pleading villagers, followed by a gallant hero called to action, and then to monster section and eventual heroic victory. See if you can hear the imagery. This grade 2 version is a simplified version of the original recorded by the \"Composer's Collective Big Band\" designed for high school players."]]]
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
           [:td "12/8 Feel"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:30"]
           [:td "12/8"]
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
       [:div#52.chart.grade2
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/let-me-be"}
           "Let Me Be the Sugar in Your Tea"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Let%20Me%20Be%20the%20Sugar%20in%20Your%20Tea%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio52.audio
            {:href "/audio/let-me-be.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/let-me-be.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Let%20Me%20Be%20the%20Sugar%20in%20Your%20Tea%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Let Me Be the Sugar in Your Tea” is inspired by the charming slow struts of Louis Armstrong. I’m picturing him swooning with a woman trying to win her over with his singing. The tune is a medium 2 step Dixieland feel featuring the solo trumpet on the melody."]
          [:p "Other Features:"]
          [:ul
           [:li "Improvising for Piano"]
           [:li "Sectional melody"]
           [:li "Solo trumpet to Ab"]]]]
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
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "96"]]]]]
       [:div#54.chart.grade2
        [:div.head
         [:h2.title [:a {:href "/charts/lifted"} "Lifted"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Lifted%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio54.audio
            {:href "/audio/lifted.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/lifted.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Lifted%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Lifted” is a Gospel tune inspired by the great sound of gospel bands and choirs in churches all over the world. It features a chin’ solo for the trumpet, a great gospel 2 feel and even a “testifying” section at the end to bring the house down. In the middle of the tune you’ll also find a clapping breakdown section for your audience to join in."]
          [:p "Other Features:"]
          [:ul
           [:li "Improvising for trumpet"]
           [:li "Easy trombone parts"]
           [:li "Fun sax lines"]]]]
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
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "140"]]]]]
       [:div#64.chart.grade2
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/a-long-kept-secret"}
           "A Long Kept Secret"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22A%20Long%20Kept%20Secret%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio64.audio
            {:href "/audio/a-long-kept-secret.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/a-long-kept-secret.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22A%20Long%20Kept%20Secret%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“A Long Kept Secret” is a warm straight eighths ballad filled with hints of nostalgia and reflection. It features a memorable yet searching melody written for alto saxophone. The bridge section moves and grows while the A sections play as a gentle release. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Great band feature as well as solo feature"]
           [:li "Memorable melody"]
           [:li "Modal improvising"]]]]
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
           [:td "Ballad"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "90"]]]]]
       [:div#66.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/crusin-at-30000"} "Crusin' at 30000"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Crusin'%20at%2030000%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio66.audio
            {:href "/audio/crusin-at-30000.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/crusin-at-30000.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Crusin'%20at%2030000%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Crusin’ at 30 000” is an up tempo swing tune that takes us on a journey from take off to the clouds and finally to a soft landing. It was written as for use as an introduction to faster tempos through accessible swing figures. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Modal improvising"]
           [:li "Drum solo trading fours"]]]]
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
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "200"]]]]]
       [:div#67.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/the-gene-machine"} "The Gene Machine"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Gene%20Machine%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio67.audio
            {:href "/audio/the-gene-machine.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-gene-machine.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Gene%20Machine%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“The Gene Machine” is a 1940’s inspired jump swing tune written in tribute to the great Gene Krupa. It features plunger muted brass figures, call and response and some drum work in the style that Gene Krupa made famous. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Blues scale improvising"]
           [:li "Fun for every section of the band"]]]]
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
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "180"]]]]]
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
       [:div#71.chart.grade2
        [:div.head
         [:h2.title [:a {:href "/charts/en-su-camino"} "En Su Camino"]]
         [:h3.name
          [:a {:href "/composers/greg-crowe"} "By Greg Crowe\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22En%20Su%20Camino%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio71.audio
            {:href "/audio/en-su-camino.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/en-su-camino.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22En%20Su%20Camino%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This exciting new chart is from well known Winnipeg based educator Greg Crowe. It's a great Cha Cha that perfectly exemplifies the style of this romanic genre and is a great departure from the standard latin charts in the educational repertoire, a guaranteed hit with your band! It features solos for any horn on an easy diatonic progression and great melodic moments for every section."]]]
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
           [:td "Cha Cha"]
           [:td [:a {:href "/composers/greg-crowe"} "Greg Crowe"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "110"]]]]]
       [:div#72.chart.grade2
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/sometimes-i-feel"}
           "Sometimes I Feel Like a Muppet"]]
         [:h3.name
          [:a {:href "/composers/chris-hunt"} "By Chris Hunt\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Sometimes%20I%20Feel%20Like%20a%20Muppet%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio72.audio
            {:href "/audio/sometimes-i-feel.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/sometimes-i-feel.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Sometimes%20I%20Feel%20Like%20a%20Muppet%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "The newest chart from composer Chris Hunt is a fun blues romp with a catchy repeated figure sure to get you hooked. It's got some classic swing rhythms great for teaching young bands about swing and a reasonable tempo to get them started. It's got some great parts for your saxes to dig in on and solos are written for anyone."]]]
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
           [:td [:a {:href "/composers/chris-hunt"} "Chris Hunt"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "110"]]]]]
       [:div#73.chart.grade2
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/friday-night-special"}
           "Friday Night Special"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Friday%20Night%20Special%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio73.audio
            {:href "/audio/friday-night-special.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/friday-night-special.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Friday%20Night%20Special%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Friday Night Special\" is a throwback to the classic days of live television where big bands backed up famous artists and celebrities. It’s a great high energy swing tune featuring some fast and fun figures that are great to teach your band about swing feel. It features a stop time sax soli and a huge build in the shout chorus. Solos are written for any horn."]]]
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
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "180"]]]]]
       [:div#74.chart.grade2
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/god-rest-ye"}
           "God Rest Ye Merry Gentlemen"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22God%20Rest%20Ye%20Merry%20Gentlemen%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio74.audio
            {:href "/audio/god-rest-ye.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/god-rest-ye.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22God%20Rest%20Ye%20Merry%20Gentlemen%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This arrangement is a fresh and fun version of a well loved Christmas classic. It starts off in a classical choral but quickly switches to a Benny Goodman inspired 1940s jump tune. It’s full of surprises and features multiple soloists trading back to back. It’s got some fun bassline figures in the trombones and some great swinging in the saxes and trumpets. This one’s sure to be the tune to remember at your Christmas concert."]]]
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
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "140"]]]]]
       [:div#86.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/the-first-noel"} "The First Noel"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20First%20Noel%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio86.audio
            {:href "/audio/the-first-noel.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-first-noel.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20First%20Noel%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This arrangement of “The First Noel” is a bluesy take on the Christmas classic everyone knows. It features easy blues improvising changes and a fresh horn feature in the development section. This is a sure way to spice up your Christmas concert! Improvising is written for any horn. "]]]
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
           [:td "Waltz"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:00"]
           [:td "3/4"]
           [:td "100"]]]]]
       [:div#87.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/what-once-was"} "What Once Was"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22What%20Once%20Was%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio87.audio
            {:href "/audio/what-once-was.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/what-once-was.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22What%20Once%20Was%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Was Once Was” is a nostalgic rock ballad featuring the alto saxophone. The melody is memorable and moves from feeling a sense of longing to more of a positive feel in the bridge. It also features juicy parts for the saxophone and trumpet sections as well as on opportunity to show off dynamically for the whole band. Improvising is almost exclusively 2 scales. This tune will be a welcome ballad addition to your festival repertoire."]]]
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
           [:td "Ballad"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "70"]]]]]
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
       [:div#90.chart.grade2
        [:div.head
         [:h2.title [:a {:href "/charts/livvy-dear"} "Livvy Dear"]]
         [:h3.name
          [:a {:href "/composers/greg-crowe"} "By Greg Crowe\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Livvy%20Dear%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio90.audio
            {:href "/audio/livvy-dear.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/livvy-dear.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Livvy%20Dear%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Livvy Dear is a fun medium swing tune written to feature flute and trumpet. It's got classic swing figures essential for teaching jazz to beginners and is a rare opportunity to put the flute from and centre of the jazz band."]]]
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
           [:td [:a {:href "/composers/greg-crowe"} "Greg Crowe"]]
           [:td "3:30"]
           [:td "4/4 "]
           [:td "132"]]]]]
       [:div#92.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/summer-on-my-mind"} "Summer on my Mind"]]
         [:h3.name
          [:a {:href "/composers/tom-richards"} "By Tom Richards\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Summer%20on%20my%20Mind%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio92.audio
            {:href "/audio/summer-on-my-mind.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/summer-on-my-mind.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Summer%20on%20my%20Mind%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Summer on my Mind\" is a relaxed swing tune, evoking the easy days of summer. The trumpet and saxophone sections carry the tuneful melody while the rhythm section alternates between \"two-feel\" and \"four-feel\". The saxes and trombones have featured soli sections, and there are written solos (with chord changes) for alto/tenor, piano, bass, and drums."]]]
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
           [:td "Jazz Band "]
           [:td "Swing"]
           [:td [:a {:href "/composers/tom-richards"} "Tom Richards"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "128"]]]]]
       [:div#93.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/good-king-w"} "Good King Wenceslas"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Good%20King%20Wenceslas%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio93.audio
            {:href "/audio/good-king-w.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/good-king-w.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Good%20King%20Wenceslas%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This version of this classic carol features swinging moments while still paying homage to classic renditions on the song. This fun and energetic version features great moments for brass and saxophone sections to shine and also has easy blowing changes. The mood of the piece shifts throughout creating a performance that’s interesting as well as great fun to play!"]]]
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
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "160"]]]]]
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
       [:div#107.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/roscos-big-hit"} "Rosco's Big Hit"]]
         [:h3.name
          [:a {:href "/composers/tom-richards"} "By Tom Richards\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Rosco's%20Big%20Hit%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio107.audio
            {:href "/audio/roscos-big-hit.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/roscos-big-hit.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Rosco's%20Big%20Hit%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "From the streets of New Orleans comes this party tune from Tom Richards. This is a great chance for students to learn about the street parade band culture in the crescent city and have fun doing it!"]]]
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
           [:td "Dixieland"]
           [:td [:a {:href "/composers/tom-richards"} "Tom Richards"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "176"]]]]]
       [:div#108.chart.grade2
        [:div.head
         [:h2.title
          [:a {:href "/charts/the-long-way-home"} "The Long Way Home"]]
         [:h3.name
          [:a
           {:href "/composers/brad-harrison"}
           "By Brad Harrison\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 2"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Long%20Way%20Home%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "50"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio108.audio
            {:href "/audio/the-long-way-home.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-long-way-home.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Long%20Way%20Home%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This rock ballad from Brad Harrison brings on the romance and features simple harmony and rhythms for beginning bands. It also is a great spotlight for your great alto sax player."]]]
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
           [:td "Rock Ballad"]
           [:td
            [:a {:href "/composers/brad-harrison"} "Brad Harrison"]]
           [:td "4:00"]
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

(defn show-html-grades-two [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-grades-two)})
