(in-ns 'clovertonemusic.core)

(def html-charts-index
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
      [:div#content.index
       [:h1.title "All Charts"]
       [:p
        "Here's a list of all our titles so you can browse from the oldest selections to our newest material."]]]
     [:div#charts
      [:div#list
       [:div#2.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/o-canada"} "O Canada"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22O%20Canada%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "1"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio2.audio
            {:href "/audio/o-canada.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/o-canada.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22O%20Canada%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This fun version of our national anthem is dedicated to all the band kids that have to stand or sit quietly through endless school ceremonies only to play a few notes. This arrangement is sort of a Dixieland march that should spice up any school function!"]
          [:p "Have fun!"]]]
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
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "2:00"]
           [:td "4/4"]
           [:td "180"]]]]]
       [:div#3.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/the-pursuit"} "The Pursuit"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Pursuit%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio3.audio
            {:href "/audio/the-pursuit.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-pursuit.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Pursuit%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"The Pursuit\" is an epic medium swing tune with a very New York modern Jazz type of sound. It features a challenging band soli section and room for Alto sax and drums to stretch out."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to high Bb"]
           [:li "Works in a wide tempo range"]
           [:li "Improvisaton difficulty intermediate"]
           [:li "Optional Bass trombone notes"]]]]
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
           [:td "4:30"]
           [:td "4/4"]
           [:td "112"]]]]]
       [:div#4.chart.grade1
        [:div.head
         [:h2.title
          [:a {:href "/charts/sock-hop-be-bop"} "Sock Hop Be-Bop"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Sock%20Hop%20Be-Bop%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio4.audio
            {:href "/audio/sock-hop-be-bop.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/sock-hop-be-bop.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Sock%20Hop%20Be-Bop%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Sock Hop Be-Bop\" is a fun 60s inspired groovy tune designed for young bands. It’s got a bit of chromatic fun for the saxes and punchy brass shots. Solos are for anyone!"]
          [:p "Other features:"]
          [:ul
           [:li "Lead tumpet to G"]
           [:li "Solos are Blues scale based"]]]]
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
           [:td "Groovy"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#5.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/tango"} "Tango!"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Tango!%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio5.audio {:href "/audio/tango.mp3"} "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/tango.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Tango!%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Tango! puts a fresh spin on any young bands' library. It features some slinky Alto Saxophone and is a good opportunity to teach about the Harmonic Minor scale and maybe world music in general."]
          [:p "Other Features:"]
          [:ul
           [:li "Lead trumpet to G"]
           [:li "Clapping parts for the horns"]
           [:li "Improvising on the Harmonic Minor scale"]]]]
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
           [:td "Tango"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "100"]]]]]
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
       [:div#13.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/four-more-to-go"} "Four More to Go"]]
         [:h3.name
          [:a {:href "/composers/allison-au"} "By Allison Au\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Four%20More%20to%20Go%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio13.audio
            {:href "/audio/four-more-to-go.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/four-more-to-go.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Four%20More%20to%20Go%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Four More to Go\" is a driving swing tune with some really great chord changes. It has a lot of forward momentum in the harmony and the shout chorus is based on the classic jazz turnaround, which builds into a nice climax. It’s got some nice saxophone sections and the improvising is open for any saxophone player."]
          [:p "Other features:"]
          [:ul [:li "Sax soli and full band soli"]]]]
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
           [:td [:a {:href "/composers/allison-au"} "Allison Au"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "185"]]]]]
       [:div#14.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/yun-gia"} "Yun Gia"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Yun%20Gia%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio14.audio
            {:href "/audio/yun-gia.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/yun-gia.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Yun%20Gia%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This fun Salsa tune was inspired by the mix of skill and youthful energy some kids have for music. It features some Sax trading for the Altos and Tenors as well as a trumpet solo. Also check out some powerful Brass moments and a slinky sax soli."]
          [:p "Other features:"]
          [:ul
           [:li "Strong trumpet parts"]
           [:li "Strong lead trombone part"]
           [:li "Athletic saxophone parts"]]]]
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
           [:td "Salsa"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "180"]]]]]
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
       [:div#16.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/2-dave-k"} "2 Dave K"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%222%20Dave%20K%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio16.audio
            {:href "/audio/2-dave-k.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/2-dave-k.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%222%20Dave%20K%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"2 Dave K\" was inspired by the modern Jazz sounds out of New York and pianist Dave Kikoski. This burning Jazz tune is the first track off the \"Composer's Collective Big Band\" self titled record and features piano, trombone, and trumpet along with an athletic sax soli in the middle. This challenging tune is great for a year long project and would be a great selection for competition repertoire."]]]
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
           [:td "Fast Swing"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "6:30"]
           [:td "4/4"]
           [:td "220"]]]]]
       [:div#17.chart.grade4
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/a-kingdoms-last-hope"}
           "A Kingdom's Last Hope"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22A%20Kingdom's%20Last%20Hope%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio17.audio
            {:href "/audio/a-kingdoms-last-hope.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/a-kingdoms-last-hope.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22A%20Kingdom's%20Last%20Hope%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"A Kingdom’s Last Hope\" a story telling tune. The first section is the pleading villagers, followed by a gallant hero called to action, and then to monster section and eventual heroic victory. See if you can hear the imagery. This track was featured on the \"Composer's Collective Big Band\" self titled record. It features the saxophone section doubling on clarinet and flute. Also featured are some evil plunger trombones and a Brass fanfare finale."]
          [:p "Other features:"]
          [:ul
           [:li
            "Sax section is: Soprano/flute, Alto/flute, 2 Tenor/clarinets, Bari/Bass Clarinet"]
           [:li "There is no Guitar part"]]]]
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
           [:td "7:30"]
           [:td "12/8"]
           [:td "120"]]]]]
       [:div#18.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/10-41-am"} "10:41AM"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%2210%3A41AM%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio18.audio
            {:href "/audio/10-41-am.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/10-41-am.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%2210%3A41AM%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"10:41AM\" is a melodic modern Jazz tune emulating the style of the great Kenny Wheeler. The dreamy changes and twin melodies make for a romantic, searching type of feel. It features the trombone and tenor sax on the main melody and in the improvising section. It also has some space for the drums at the end. This chart is a good opportunity to teach your students about a broken Jazz 2 feel and how it’s different than a 4 feel or from a 2 feel in the early days of Jazz."]]]
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
           [:td "Medium Swing"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "6:00"]
           [:td "4/4"]
           [:td "180"]]]]]
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
       [:div#20.chart.grade4
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/electros-next-plot"}
           "Electro's Next Plot "]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Electro's%20Next%20Plot%20%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio20.audio
            {:href "/audio/electros-next-plot.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/electros-next-plot.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Electro's%20Next%20Plot%20%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Electro’s Next Plot\" is a fun romp through the comic book cartoon genre. It switches between a blistering minor blues and a slow and dirty shuffle. This tune features the guitar and Baritone Sax and also has some great section playing for the saxophones. This one is great for bringing down the house at the end of your set."]]]
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
           [:td "7:00"]
           [:td "12/8"]
           [:td "60"]]]]]
       [:div#21.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/chazz"} "Chazz"]]
         [:h3.name
          [:a
           {:href "/composers/josh-grossman"}
           "By Josh Grossman\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Chazz%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio21.audio
            {:href "/audio/chazz.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/chazz.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Chazz%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Josh says: \"This tune, written in honour of my nephew, Chazz, features solo flugel horn, alto sax and guitar, and starts in a comfortablesamba groove.  A medium tempo and relatively straightforward lines should make it accessible to senior high school ensembles.\""]
          [:p "Other features:"]
          [:ul
           [:li "4 trumpet parts, and separate Solo Flugelhorn part"]
           [:li "Sax section is Soprano, Alto, 2 Tenors,  Bari Sax"]]]]
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
           [:td "Latin"]
           [:td
            [:a {:href "/composers/josh-grossman"} "Josh Grossman"]]
           [:td "8:00"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#22.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/amazing-grace"} "Amazing Grace"]]
         [:h3.name
          [:a
           {:href "/composers/josh-grossman"}
           "By Josh Grossman\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Amazing%20Grace%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio22.audio
            {:href "/audio/amazing-grace.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/amazing-grace.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Amazing%20Grace%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This arrangement of the popular spiritual is an excellent showcase for solo alto saxophone.  The straightforward chord progression and simple melody allow ample opportunity for experimentation and improvisation. Reasonable ranges and lots of resting time means this piece should be accessible to a variety of bands."]]]
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
           [:td "Gospel"]
           [:td
            [:a {:href "/composers/josh-grossman"} "Josh Grossman"]]
           [:td "7:00"]
           [:td "4/4"]
           [:td "84"]]]]]
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
       [:div#25.chart.grade4
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/the-phone-dont-ring-jack"}
           "The Phone Don't Ring Jack"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Phone%20Don't%20Ring%20Jack%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio25.audio
            {:href "/audio/the-phone-dont-ring-jack.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-phone-dont-ring-jack.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Phone%20Don't%20Ring%20Jack%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Andy says: \"This composition is a loving homage to the great Canadian trombonist/arranger/composer Ron Collier. The title is from an impassioned speech Ron once gave to a first-year jazz ensemble at Humber college warning of what their fate would be in the music business if they didn’t practice and get their “stuff” together.  And yes, I was in that ensemble. The Phone Don’t Ring Jack is a feature for trombone, with a trumpet solo on the double-time section. The trumpet solo could just as effectively be taken by one of the saxophones in the band. The difficulty level is advanced, with a challenging lead trumpet part (up to Eb) and fairly complex rhythms.\""]]]
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
           [:td "Shuffle"]
           [:td
            [:a
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "8:00"]
           [:td "12/8"]
           [:td "72"]]]]]
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
       [:div#27.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/at-long-last"} "At Long Last"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22At%20Long%20Last%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio27.audio
            {:href "/audio/at-long-last.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/at-long-last.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22At%20Long%20Last%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"At Long Last\" is a romantic, smooth Bossa Nova ballad featuring improvising for any horn. This is a great tune to teach your students about quiet blend and balance throughout the band."]
          [:p "Other features:"]
          [:ul
           [:li "Melody across sections"]
           [:li "Full band unison soli"]
           [:li "Improvising on C major scale"]]]]
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
           [:td "Bossa Nova"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#29.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/hotel-mambo"} "Hotel Mambo"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Hotel%20Mambo%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio29.audio
            {:href "/audio/hotel-mambo.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/hotel-mambo.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Hotel%20Mambo%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Hotel Mambo\" is a fun latin tune for young bands inspired by the classic mambo band sound. It features the saxophone section on the repeated mambo figure and the trumpets on the melody. The solo section is written for trombone solo, with a later section open for drums to improvise."]
          [:p "Other features:"]
          [:ul
           [:li "Fun ostinato"]
           [:li "Clapping parts for the horns"]
           [:li "Improvising on the mixolydian scale"]]]]
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
           [:td "Mambo"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "180"]]]]]
       [:div#30.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/petes-chune"} "Pete's Chune"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Pete's%20Chune%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio30.audio
            {:href "/audio/petes-chune.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/petes-chune.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Pete's%20Chune%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Pete’s Chune\" is a Reggae chart dedicated to my high school teacher Pete Scherzinger. He told me one day that no one ever writes Reggae for big band. While now they do! This tune is a relaxed feel that’s somewhere between cut time and regular 4/4. The little melodies throughout should be played as if they were being sung."]]]
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
           [:td "Reggae"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "160"]]]]]
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
       [:div#32.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/train-track"} "Train Track"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Train%20Track%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio32.audio
            {:href "/audio/train-track.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/train-track.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Train%20Track%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Train Track\" is a groove tune emulating riding the rails. It features string unison sax work and some fun \"train whistle\" wah-wah’s in the brass. The bridge section has a old school T.V. cop show vibe. Improvising is for anyone and is on the blues scale."]
          [:p "Other features:"]
          [:ul
           [:li "Trumpet to G"]
           [:li "Saxophone and brass trading section"]
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
           [:td "Jazz Band"]
           [:td "Shuffle"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "132"]]]]]
       [:div#33.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/the-green-blues"} "The Green Blues"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Green%20Blues%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio33.audio
            {:href "/audio/the-green-blues.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-green-blues.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Green%20Blues%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“The Green Blues” was written for the 2009 MusicFest Canada All Star Jazz Band under the direction of Denny Christianson. This tune is a really good vehicle for a strong band to show their stuff as soloists and sectional players. It features a sax soli, band soli, improvising for everyone and a nice big shout at the end."]
          [:p "Other features:"]
          [:ul
           [:li [:p "Strong sax section workout"]]
           [:li [:p "Trumpet 1 to high D"]]
           [:li [:p "Improvising on the 12 bar blues"]]]]]
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
           [:td "4:00"]
           [:td "4/4"]
           [:td "160"]]]]]
       [:div#34.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/arcadian-autumn"} "Arcadian Autumn"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Arcadian%20Autumn%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio34.audio
            {:href "/audio/arcadian-autumn.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/arcadian-autumn.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Arcadian%20Autumn%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Christian says: \"'Arcadian Autumn' is a relaxed jazz waltz featuring the saxophone section. I wrote it walking home on Arcadian Crescent on a perfect fall day. The pulse can be thought of in a fast 3 or a slow 1 feel. The bridge sections should be more washy and dreamy while the other sections can have more of a dancing feel.\""]]]
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
           [:td "3:30"]
           [:td "3/4"]
           [:td "120"]]]]]
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
       [:div#36.chart.grade1
        [:div.head
         [:h2.title
          [:a {:href "/charts/shuswap-shuffle"} "Shuswap Shuffle"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Shuswap%20Shuffle%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio36.audio
            {:href "/audio/shuswap-shuffle.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/shuswap-shuffle.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Shuswap%20Shuffle%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Andy Says: \"'Shuswap Shuffle\" is named for beautiful Shuswap Lake in British Columbia.  The piece was written with high school-level bands in mind and combines an accessible high-energy  feel with some rhythmic and technical challenges.  One important consideration for the band director is the creation of an authentic shuffle feel. Although written in 4/4 the underlying feel is 12/8, with all eighth notes played in a long-short triplet subdivision.\""]]]
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
           [:td "Shuffle"]
           [:td
            [:a
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#37.chart.grade1
        [:div.head
         [:h2.title
          [:a {:href "/charts/red-river-mud-pie"} "Red River Mud Pie"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Red%20River%20Mud%20Pie%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio37.audio
            {:href "/audio/red-river-mud-pie.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/red-river-mud-pie.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Red%20River%20Mud%20Pie%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Andy Says: \"The tune is essentially a long-form blues in F with a clapping 'breakdown' section followed by a more rock-oriented section in G for your guitar player to solo on before the melody is restated in a D.S. al fine. I’ll admit the feel on the guitar solo is closer to Magic Bus by \"The Who\" than a real Mississippi blues!\""]]]
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
           [:td "Bo Diddley"]
           [:td
            [:a
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "124"]]]]]
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
       [:div#39.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/sol-fiesta"} "Sol Fiesta"]]
         [:h3.name
          [:a
           {:href "/composers/maria-kundakcioglu"}
           "By Maria Kundakcioglu\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Sol%20Fiesta%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio39.audio
            {:href "/audio/sol-fiesta.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/sol-fiesta.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Sol%20Fiesta%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Maria says: \"This upbeat Latin song was created around the bass line, which was derived from a phrase my friend said in class one day. The arrangement gives each section of the band a chance to shine. There are some classic Latin syncopated rhythms throughout the arrangement and some challenging and fun brass parts.\""]
          [:p "Other features;"]
          [:ul
           [:li "Lead trumpet to high C"]
           [:li "Lead trombone to high C"]
           [:li "Syncopated Latin rhythms"]
           [:li "Improvised piano solo"]
           [:li "Drum set solo"]]]]
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
           [:td "Samba"]
           [:td
            [:a
             {:href "/composers/maria-kundakcioglu"}
             "Maria Kundakcioglu"]]
           [:td "6:00"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#40.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/tumbadora"} "Tumbadora"]]
         [:h3.name
          [:a
           {:href "/composers/maria-kundakcioglu"}
           "By Maria Kundakcioglu\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Tumbadora%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio40.audio
            {:href "/audio/tumbadora.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/tumbadora.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Tumbadora%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Maria says: \"Tumbadora is a salsa tune I wrote inspired by the role of the congas in Latin music. The feel and rhythms are reminiscent of the sound of the Latin ensembles I enjoy listening to. There is also a heavy influence of the piano in this arrangement which gives the piano player in your band an opportunity to be featured throughout as well as in an improvised section at letter D. You can include a conga player in addition to the drummer and they have a chance to trade solos in the open percussion solo section one bar before letter E. There are some fun brass parts throughout with some challenging rhythms. This is a driving arrangement that will give your whole band a good workout.\""]
          [:ul
           [:li "Other features"]
           [:li "Lead Trumpet to high C"]
           [:li "Lead Trombone to high B"]
           [:li "Percussion section solos"]
           [:li "Improvised piano solo"]]]]
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
           [:td "Latin Funk"]
           [:td
            [:a
             {:href "/composers/maria-kundakcioglu"}
             "Maria Kundakcioglu"]]
           [:td "5:30"]
           [:td "4/4"]
           [:td "120"]]]]]
       [:div#41.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/vista"} "Vista"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Vista%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio41.audio
            {:href "/audio/vista.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/vista.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Vista%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Andy says: \"I wrote most of 'Vista' while on a summer vacation with my family near Banff Alberta, and I'm sure the breath-taking mountain scenery had an affect on the outcome.  Overall I was going for a feeling of space or openness with this composition.  The 6/8 feel with eighth notes grouped in two's is obviously African-influenced, and was in fact inspired by a piece from Mauritius that I happened to hear on the radio.\""]
          [:p "Other Features:"]
          [:ul
           [:li [:p "Solo space for baritone sax and drums"]]
           [:li [:p "6/8 feel and 3/4 feel"]]]]]
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
           [:td "6/8 to 3/4"]
           [:td
            [:a
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "6:00"]
           [:td "6/8"]
           [:td "86"]]]]]
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
       [:div#47.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/joy-to-the-world"} "Joy to the World"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Joy%20to%20the%20World%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio47.audio
            {:href "/audio/joy-to-the-world.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/joy-to-the-world.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Joy%20to%20the%20World%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This arrangement is a Salsa twist on a Christmas favourite. It features some quirky lead lines and is a good introduction to Salsa rhythms for bands ready to take on a new challenge. Solos are marked for trumpet and drums."]
          [:p "Other Features:"]
          [:ul
           [:li "Good introduction to Salsa rhythms"]
           [:li "Section unison melodies"]
           [:li "Modern and fun to play"]]]]
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
           [:td "Salsa"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#48.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/canal-street-walk"} "Canal Street Walk"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Canal%20Street%20Walk%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio48.audio
            {:href "/audio/canal-street-walk.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/canal-street-walk.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Canal%20Street%20Walk%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Canal Street Walk” is a fun and raucous New Orleans street beat tune inspired by the city’s famous second line bands. It features unison melody lines in the horns, some great soli lines to dig in on and a danceable feel to get your band moving! Improvising is written for Baritone Saxophone."]
          [:p "Other Features:"]
          [:ul
           [:li "Horn section solis"]
           [:li "Bass Solo"]
           [:li "Lead trumpet to G"]]]]
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
           [:td "4:00"]
           [:td "4/4"]
           [:td "180"]]]]]
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
       [:div#50.chart.grade3
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/the-dancehall-shake"}
           "The Dancehall Shake"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Dancehall%20Shake%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio50.audio
            {:href "/audio/the-dancehall-shake.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-dancehall-shake.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Dancehall%20Shake%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"The Dance Hall Shake” is an infectious groove inspired by Jamaican dance hall rhythms. Its melodies are very rhythmic and are played in a call and answer type fashion. The sections are often divided in pairs and the lines are very specifically marked long and short to fit the style. This tune is a good teaching opportunity to talk about working on efficient and accurate articulations."]
          [:p "Other Features:"]
          [:ul
           [:li "Improvising for trombone and drums"]
           [:li "A lot of unison"]]]]
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
           [:td "Dance Hall"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "100"]]]]]
       [:div#51.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/femis-flight"} "Femi's Flight"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Femi's%20Flight%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio51.audio
            {:href "/audio/femis-flight.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/femis-flight.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Femi's%20Flight%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Femi’s Flight” is an afrobeat adventure inspired by the Nigerian afrobeat sound. It features an exciting 12/8 groove and a substantial amount of unison melody in the horns, This tune makes for a fresh change in the Jazz band repertoire with a world music flavour."]
          [:p "Other Features:"]
          [:ul
           [:li "A lot of unison"]
           [:li "Solos for Alto Saxophone and drums"]]]]
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
           [:td "Afro Beat"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:00"]
           [:td "12/8"]
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
       [:div#57.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/the-fifth-beatle"} "The Fifth Beatle"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Fifth%20Beatle%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio57.audio
            {:href "/audio/the-fifth-beatle.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-fifth-beatle.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Fifth%20Beatle%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Andy Says: This is my homage to legendary producer George Martin, who is often referred to as \"the fifth Beatle\" because of his impact on the classic recordings of the Fab Four.  It's basically a pop tune with a few surprises, most notably the 7/4 time signature.  There are also some polytonal chords inspired by the tape-looping on \"Sgt Pepper's Lonely Hearts Club Band\".   Elements of Beatles melodies and George Martin's instrumental arrangements crop up throughout."]
          [:p "Other Features:"]
          [:ul [:li "7/4 time signature"] [:li "Mutes for brass"]]]]
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
           [:td "Odd meter Str. 8ths"]
           [:td
            [:a
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "7:00"]
           [:td "7/4"]
           [:td "120"]]]]]
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
       [:div#62.chart.grade4
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/this-buts-for-you"}
           "This But's for You!"]]
         [:h3.name
          [:a
           {:href "/composers/terry-promane"}
           "By Terry Promane\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22This%20But's%20for%20You!%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio62.audio
            {:href "/audio/this-buts-for-you.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/this-buts-for-you.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22This%20But's%20for%20You!%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This But's For You is a great reharm by legendary Canadian vetran Terry Promane. This tune is a great project for an advanced group to really sink their teeth into and get some fantastic results."]
          [:p "Other Features:"]
          [:ul
           [:li "Solo written for trumpet"]
           [:li "Great sectional passages"]
           [:li "Horns only devlopment section"]]]]
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
            [:a {:href "/composers/terry-promane"} "Terry Promane"]]
           [:td "7:00"]
           [:td "4/4"]
           [:td "160"]]]]]
       [:div#63.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/surface-tension"} "Surface Tension"]]
         [:h3.name
          [:a {:href "/composers/jim-lewis"} "By Jim Lewis\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Surface%20Tension%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio63.audio
            {:href "/audio/surface-tension.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/surface-tension.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Surface%20Tension%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Surface Tension\" is an original by long time educator and trumpet player Jim Lewis. This tune is a great way to introduce your band to modern professional level big band matrerial at a tempo you can handle."]
          [:p "Other Features:"]
          [:ul
           [:li "Solos for piano and tenor sax"]
           [:li "A lot of independent playing"]]]]
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
           [:td [:a {:href "/composers/jim-lewis"} "Jim Lewis"]]
           [:td "6:00"]
           [:td "4/4"]
           [:td "160"]]]]]
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
       [:div#65.chart.grade1
        [:div.head
         [:h2.title
          [:a {:href "/charts/cowboy-countdown"} "Cowboy Countdown"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Cowboy%20Countdown%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio65.audio
            {:href "/audio/cowboy-countdown.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/cowboy-countdown.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Cowboy%20Countdown%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Cowboy Countdown” is a relaxed swinging bluesy tune that’s easy to line dance to! It was written to capture a bit of that cowboy swagger. It features blues scale improvising for any instrument, a simple call and response section and a raucous tag at the end that is sure to get your audience tapping along. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other features:"]
          [:ul
           [:li "Very sectional writing"]
           [:li "Easy trombone parts"]
           [:li "Stop time section"]]]]
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
           [:td "120"]]]]]
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
       [:div#69.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/the-test"} "The Test"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22The%20Test%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio69.audio
            {:href "/audio/the-test.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/the-test.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22The%20Test%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“The Test” is an exciting African inspired tune in 12/8 time that’s both challenging yet accessible. It features an agile melody for the saxophones and a modal solo section with improvising on a single scale. It also features a drum solo section and some simple bass improvising off the top. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Good introduction to 12/8"]
           [:li "Afro Cuban feel"]
           [:li "Sectional playing"]]]]
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
           [:td "12/8"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "4:00"]
           [:td "12/8"]
           [:td "120"]]]]]
       [:div#70.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/el-castor-loco"} "El Castor Loco"]]
         [:h3.name
          [:a
           {:href "/composers/andy-ballantyne"}
           "By Andy Ballantyne\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22El%20Castor%20Loco%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio70.audio
            {:href "/audio/el-castor-loco.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/el-castor-loco.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22El%20Castor%20Loco%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"El Castor Loco\" is a fantastic take on New York Salsa. It's got all the syncopated rhythmic fun you'd expect from a pro chart made accessible to young bands. The slippery sax soli is a perfect showcase for your section and the drums solo with full band shots will be the highlight of your set. It features solos for any horn and drums, as well as a fully notated piano intro montuno section."]]]
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
           [:td "Salsa"]
           [:td
            [:a
             {:href "/composers/andy-ballantyne"}
             "Andy Ballantyne"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "180"]]]]]
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
           [:td "140"]]]]]
       [:div#78.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/branta"} "Branta"]]
         [:h3.name
          [:a {:href "/composers/tom-richards"} "By Tom Richards\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Branta%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio78.audio
            {:href "/audio/branta.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/branta.preview.pdf", :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Branta%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Branta” is a smooth minor salsa tune composed to feature flute. It’s a very memorable yet accessible chart which is a great introduction to latin music for a young band. Other than flute melody the chart also features some fun sax section work and easy brass parts."]]]
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
           [:td "Salsa"]
           [:td [:a {:href "/composers/tom-richards"} "Tom Richards"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "140"]]]]]
       [:div#79.chart.grade1
        [:div.head
         [:h2.title
          [:a {:href "/charts/moatfield-shuffle"} "Moatfield Shuffle"]]
         [:h3.name
          [:a {:href "/composers/tom-richards"} "By Tom Richards\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Moatfield%20Shuffle%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio79.audio
            {:href "/audio/moatfield-shuffle.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/moatfield-shuffle.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Moatfield%20Shuffle%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Moatfield Shuffle” is a straight-ahead swinger with solos for horns and rhythm section. The melody is designed to place emphasis on basic rhythm reading skills, with subtle variations to keep things interesting. "]]]
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
           [:td "Shuffle"]
           [:td [:a {:href "/composers/tom-richards"} "Tom Richards"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "110"]]]]]
       [:div#80.chart.grade4
        [:div.head
         [:h2.title
          [:a {:href "/charts/santiago-nights"} "Santiago Nights"]]
         [:h3.name
          [:a {:href "/composers/jason-logue"} "By Jason Logue\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Santiago%20Nights%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio80.audio
            {:href "/audio/santiago-nights.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/santiago-nights.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Santiago%20Nights%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This is another Jason Logue. It’s a driving rock tune harmonically inspired by the Miles Davis classic So What. The melodies and solis slither through some tasty harmonic ideas and is balanced by being rhythmically simple. It features solos for any sax and any brass player and the improvisation is only over two chords so it’s great for any level of soloist."]]]
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
           [:td "Latin Rock"]
           [:td [:a {:href "/composers/jason-logue"} "Jason Logue"]]
           [:td "6:00"]
           [:td "4/4"]
           [:td "160"]]]]]
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
       [:div#83.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/don-carlos-dream"} "Don Carlos' Dream"]]
         [:h3.name
          [:a {:href "/composers/ewan-divitt"} "By Ewan Divitt\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.other]
          [:div.genre "other"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Don%20Carlos'%20Dream%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio83.audio
            {:href "/audio/don-carlos-dream.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/don-carlos-dream.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Don%20Carlos'%20Dream%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "Don Carlos' Dream is an intense Flamenco piece in 6/8 time. It features tight chord voicings to bring out the intensity of the piece, as well as an ostinato bass-line to anchor the ensemble.The drums can use a multitude of rimshots, castanets, and cymbals to create the feeling of dancing in the mountains of Andalusia, Spain. The piece features the melody and a solo for the baritone sax, as well as a solo for the piano. During the piano solo, the horn players clap a Flamenco pattern to simulate the rhythms of the castanets, and the stamping of Flamenco dancers.!"]]]
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
           [:td "6/8"]
           [:td [:a {:href "/composers/ewan-divitt"} "Ewan Divitt"]]
           [:td "6:00"]
           [:td "6/8"]
           [:td "172"]]]]]
       [:div#84.chart.grade1
        [:div.head
         [:h2.title [:a {:href "/charts/blue-heron"} "Blue Heron"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 1"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Blue%20Heron%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "40"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio84.audio
            {:href "/audio/blue-heron.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/blue-heron.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Blue%20Heron%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Blue Heron” is a cool jazz modal blues inspired by one of Ontario’s most majestic birds. It’s very representative of the cool jazz movement of the 1950’s made famous by Miles Davis which caught on strongly in the west coast. The melody is featured in the alto sax, tenor sax, and trumpet, then unison melodies in the saxes vs the brass. It’s a great way to introduce your students to section playing. Improvising can be for any player. !"]]]
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
           [:td "3:00"]
           [:td "3/4"]
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
       [:div#91.chart.grade4
        [:div.head
         [:h2.title [:a {:href "/charts/song-for-l"} "Song For L"]]
         [:h3.name
          [:a
           {:href "/composers/brad-cheeseman"}
           "By Brad Cheeseman\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 4"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Song%20For%20L%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "70"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio91.audio
            {:href "/audio/song-for-l.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/song-for-l.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Song%20For%20L%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "\"Song for L\" is a highly dynamic composition with a large dramatic arc. I wrote this piece to commemorate the accomplishments of a close family member. The melody begins as an exposed trombone feature, with minimal rhythm section support and builds to a triumphant conclusion highlighting the entire ensemble. There is an extended trumpet solo over a set of chord changes that weave in and out of the Eb / C minor tonality."]]]
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
           [:td "Jazz Waltz"]
           [:td
            [:a {:href "/composers/brad-cheeseman"} "Brad Cheeseman"]]
           [:td "4:30"]
           [:td "3/4"]
           [:td "192"]]]]]
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
       [:div#94.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/introduccion"} "Introduccion"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Introduccion%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio94.audio
            {:href "/audio/introduccion.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/introduccion.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Introduccion%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "“Introduccion” is a vibrant and energetic salsa tune that features simple version both 4/4 and 6/8 latin rhythms. This is a great way to get your band learning about Jazz inspired Latin America while getting inside the catchy phrases of the melody and backgrounds. Solos are for brass in the 4/4 sections with an nice bluesy developments section featuring alto saxophone later on."]]]
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
           [:td "Salsa"]
           [:td
            [:a
             {:href "/composers/christian-overton"}
             "Christian Overton"]]
           [:td "3:30"]
           [:td "2/2"]
           [:td "104"]]]]]
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
       [:div#101.chart.grade3
        [:div.head
         [:h2.title
          [:a
           {:href "/charts/midnight-clear"}
           "It Came Upon a Midnight Clear"]]
         [:h3.name
          [:a
           {:href "/composers/christian-overton"}
           "By Christian Overton\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.swing]
          [:div.genre "swing"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22It%20Came%20Upon%20a%20Midnight%20Clear%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio101.audio
            {:href "/audio/midnight-clear.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/midnight-clear.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22It%20Came%20Upon%20a%20Midnight%20Clear%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This updated arrangement of “It Came Upon A Midnight Clear” is as swinging as the holidays can get and features some some great section work as well as a solo melody for the trumpet. The chord changes underneath the melody sound fresh and fun while the solo section featured easy to play over chords and background parts."]]]
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
           [:td "4:30"]
           [:td "4/4"]
           [:td "120"]]]]]
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
       [:div#104.chart.grade3
        [:div.head
         [:h2.title [:a {:href "/charts/la-maquina"} "La Maquina"]]
         [:h3.name
          [:a {:href "/composers/greg-crowe"} "By Greg Crowe\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22La%20Maquina%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio104.audio
            {:href "/audio/la-maquina.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/la-maquina.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22La%20Maquina%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This Cuban inspired selection is composed with the people and rhythms of the town of La Maquina in mind. It's a great cultural learning opportunity for your students as well as a fun challenge to play! "]]]
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
           [:td "12/8"]
           [:td [:a {:href "/composers/greg-crowe"} "Greg Crowe"]]
           [:td "4:30"]
           [:td "12/8"]
           [:td "112"]]]]]
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
       [:div#106.chart.grade3
        [:div.head
         [:h2.title
          [:a {:href "/charts/mad-man-mambo"} "Mad Man Mambo"]]
         [:h3.name
          [:a {:href "/composers/jason-logue"} "By Jason Logue\n"]]]
        [:div.body
         [:div.image
          [:div.genre-image.latin]
          [:div.genre "latin"]
          [:div.grade "Grade 3"]]
         [:a.purchase
          {:href
           "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20the%20chart%20%22Mad%20Man%20Mambo%22.%0D%0A"}]
         [:div.blank]
         [:div.price
          [:span.dollar-sign "$"]
          [:span.dollars "60"]
          [:span.cents ".00"]]
         [:ul.actions
          [:li
           [:a#audio106.audio
            {:href "/audio/mad-man-mambo.mp3"}
            "▶   Listen\n"]]
          [:li
           [:a
            {:href "/previews/mad-man-mambo.preview.pdf",
             :target "_blank"}
            "Preview\n"]]
          [:li
           [:a
            {:href
             "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20%22Mad%20Man%20Mambo%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A"}
            "Customize\n"]]]
         [:div.notes
          [:p
           "This latin tune from Jason Logue is a fantastic party tune for the end of the set! It features lots of fun rhythms across the band and of course the drums. A guaranteed crowd pleaser."]]]
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
           [:td "Latin"]
           [:td [:a {:href "/composers/jason-logue"} "Jason Logue"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "200"]]]]]
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
           [:td "75"]]]]]
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

(defn show-html-charts-index [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-charts-index)})
