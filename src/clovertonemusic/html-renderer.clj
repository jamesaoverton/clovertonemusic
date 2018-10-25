(in-ns 'clovertonemusic.core)

(def html-index
  [:html
   {:lang "en-us"}
   [:head
    [:title "Home - Clovertone Music"]
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
        [:h1.title "Home"]
        [:p
         "Welcome to Clovertone Music, we are a sheet music publisher specializing in the educational jazz band market. Our library is completely Canadian and features some of our countries top composers. Fill out your repertoire with Canadian content and feel good about supporting Canadian musicians!"]]]
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

(defn show-html-index
  [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-index)})

