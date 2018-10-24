(in-ns 'clovertonemusic.core)

(def html-grades-three
 [:html
  {:lang "en-us"}
  [:head
   [:title "Grade Three - Clovertone Music"]
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
       [:h1.title "Grade Three"]
       [:p
        "Here you will find senior band charts for players with a few years of experience."]]]
     [:div#charts
      [:div#list
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
           [:td "200"]]]]]]]
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

(defn show-html-grades-three [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-grades-three)})
