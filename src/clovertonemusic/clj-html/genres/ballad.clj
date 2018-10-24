(in-ns 'clovertonemusic.core)

(def html-genres-ballad
 [:html
  {:lang "en-us"}
  [:head
   [:title "Ballad - Clovertone Music"]
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
       [:h1.title "Ballad"]
       [:p
        "In this genre you'll find rock ballads, swing ballads, 3/4 ballads and ballads for dancing. Find something for your festival repertoire here. "]]]
     [:div#charts
      [:div#list
       [:div#6.chart.grade1
        [:div.head
         [:h2.title
          [:a {:href "/charts/sakura-lullaby"} "Sakura Lullaby"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Sakura%20Lullaby%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio6.audio
            {:href "/audio/sakura-lullaby.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/sakura-lullaby.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Sakura%20Lullaby%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This song is a romantic Lullaby in 3/4 about the beautiful Japanese cherry blossom tree or Sakura. It is a ballad featuring the trombone. This selection is a good opportunity to teach about 3/4 time in jazz."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to G"]
           [:li "Improvising is beginner level"]]]]
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
           [:td "Ballad Waltz"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "3/4"]
           [:td "90"]]]]]
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
       [:div#12.chart.grade3
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/on-the-ending-earth"}
           "On The Ending Earth"]]
         [:h3.name
          [:a
           {:href "/composers/erik-patterson"}
           "By Erik Patterson\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22On%20The%20Ending%20Earth%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio12.audio
            {:href "/audio/on-the-ending-earth.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/on-the-ending-earth.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22On%20The%20Ending%20Earth%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"On the Ending Earth\" is an original composition written in the classic Big Band ballad style. This tasty tune is inspired in part by Mingus ballads and provokes thoughts of Big Band nostalgia. It features the solo Flugelhorn, with some juicy sax section parts and gentle brass playing. Use this chart to educate your students on the classic big band sound."]
          [:p "Other features:"]
          [:ul
           [:li "Improvising intermediate to advanced"]
           [:li "Lots of independent parts"]]]]
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
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:15"]
           [:td "4/4"]
           [:td "70"]]]]]
       [:div#19.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/wood-and-shadow"} "Wood & Shadow"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Wood%20%26%20Shadow%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio19.audio
            {:href "/audio/wood-and-shadow.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/wood-and-shadow.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Wood%20%26%20Shadow%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Wood & Shadow\" is a spooky selection as recorded by the \"Composer's Collective Big Band\" on their self titled release. This tune is a feature vehicle for the soprano saxophone, and also features the melody played by Bass Clarinet, Bass and Bass trombone creating a unique sound. It’s a nice change from the standard big band repertoire and will be a good work out for your woodwind section if they are saxophone players looking to double."]
          [:p "Other features:"]
          [:ul
           [:li
            "Woodwinds are: Soprano Sax, Flute, 2 Clarinets, Bass Clarinet"]]]]
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
           [:td "Slow Straight 8ths "]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "8:30"]
           [:td "4/4"]
           [:td "88"]]]]]
       [:div#46.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/silent-night"} "Silent Night"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Silent%20Night%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio46.audio
            {:href "/audio/silent-night.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/silent-night.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Silent%20Night%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This classically inspired arrangement was written to really set the mood of a crisp, starlit winter’s night. It features lush section playing and some chances to show off independent section leaders. There is an improvising section for Alto Saxophone."]
          [:p "Other Features:"]
          [:ul
           [:li "Bb Major scale improvising"]
           [:li "Choral sections"]
           [:li "A fresh take on a classic Holiday standard"]]]]
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
           [:td "3/4"]
           [:td "90"]]]]]
       [:div#56.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/dark-matter"} "Dark Matter"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Dark%20Matter%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio56.audio
            {:href "/audio/dark-matter.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/dark-matter.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Dark%20Matter%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Andy Says: \"Dark Matter\"  is a musically sophisticated but technically accessible chart which features either alto or baritone sax in an extended feature.  The main theme is in a straight eighth ballad feel with the solo section and shout chorus in double-time swing.  The objective with this piece was to explore a more contemporary \"dark\" minor harmonic palette while keeping all the parts playable for young musicians."]
          [:p "Other Features:"]
          [:ul
           [:li "Mutes for trumpets"]
           [:li "Alternate Solo parts for Alto 1 or Bari Sax"]
           [:li "All exposed trombone parts cued in saxophones"]
           [:li "Guitar pedal effects"]]]]
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
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "6:30"]
           [:td "4/4"]
           [:td "76"]]]]]
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
       [:div#81.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/epitaph"} "Epitaph"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Epitaph%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio81.audio
            {:href "/audio/epitaph.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/epitaph.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Epitaph%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Epitaph is a reflective modern composition dedicated to a remarkable young musician who sadly left us too soon. The simple expressive melody is contrasted with a dense pan-diatonic harmonic pallet. While the technical demands are not extreme, this piece offers many challenges in terms of blend and rhythmic complexity. In addition to a strong tenor saxophone soloist with good harmonic knowledge, the rhythm section must be confident and sensitive to the soloist throughout. "]]]
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
           [:td "Ballad Waltz"]
           [:td
            [:a
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "6:00"]
           [:td "3/4"]
           [:td "90"]]]]]
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
       [:div#96.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/state-of-mind"} "State of Mind"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22State%20of%20Mind%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio96.audio
            {:href "/audio/state-of-mind.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/state-of-mind.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22State%20of%20Mind%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"State of Mind\" depicts the pause being taken at the fork in the road, as one faces a tough life-changing decision, and does not use the guitar, bass, or drums. It is meant to be pretty and hopeful, and even the fastest lines should be fluid in execution."]]]
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
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "2:30"]
           [:td "4/4 "]
           [:td "80"]]]]]
       [:div#97.chart.grade4
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/state-of-mind-reprise"}
           "State of Mind Reprise"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22State%20of%20Mind%20Reprise%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio97.audio
            {:href "/audio/state-of-mind-reprise.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/state-of-mind-reprise.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22State%20of%20Mind%20Reprise%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"State of Mind (reprise)\" is the counterpart to \"State of Mind\" and also does not use guitar, bass or drums. The life-changing decision has now been made, and this is the point where one moves on with their life - hence the uplifting resolution at the end of the piece."]]]
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
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "2:00"]
           [:td "4/4 "]
           [:td "80"]]]]]
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
           [:td "100"]]]]]
       [:div#109.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/ambleside"} "Ambleside"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Ambleside%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio109.audio
            {:href "/audio/ambleside.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/ambleside.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Ambleside%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Ambleside\" embodies the peace and stillness of a quiet afternoon near the Guardian at Ambleside Park in West Vancouver...but an Ambleside surrounded by orange clouds and purple skies - closer to a Jovian moon. "]]]
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
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "2:45"]
           [:td "4/4"]
           [:td "75"]]]]]
       [:div#116.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/in-dreams"} "In Dreams"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22In%20Dreams%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio116.audio
            {:href "/audio/in-dreams.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/in-dreams.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22In%20Dreams%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "You are asleep, in a dimension that does not belong to you, and your faithful friend and guide has led you to the end of the road. It's time for you to wake up and return home, but first, you get a chance to say goodbye."]]]
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
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "5:30"]
           [:td "4/4"]
           [:td "80"]]]]]
       [:div#117.chart.grade4
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/ambleside-reprise"}
           "Ambleside (Reprise)"]]
         [:h3.name
          [:a
           {:href "/composers/chelsea-mcbride"}
           "By Chelsea McBride\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.ballad]
          [:div.genre "ballad"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Ambleside%20(Reprise)%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio117.audio
            {:href "/audio/ambleside-reprise.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/ambleside-reprise.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Ambleside%20(Reprise)%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "s the partner to \"Ambleside\", this reprise should be brighter and more resolute, and can move a little more quickly in tempo. This is the denouement of the story; the listener should feel like they've been on a long journey with a successful conclusion."]]]
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
             {:href "/composers/chelsea-mcbride"}
             "Chelsea McBride"]]
           [:td "2:00"]
           [:td "4/4"]
           [:td "75"]]]]]]]
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

(defn show-html-genres-ballad [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-genres-ballad)})
