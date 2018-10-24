(in-ns 'clovertonemusic.core)

(def html-genres-swing
 [:html
  {:lang "en-us"}
  [:head
   [:title "Swing - Clovertone Music"]
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
       [:h1.title "Swing"]
       [:p
        "We have all tempos of swing from slow shuffles to burners. This is what jazz bands were created to play."]]]
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
           [:td "176"]]]]]]]
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

(defn show-html-genres-swing [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (page/html html-genres-swing)})
