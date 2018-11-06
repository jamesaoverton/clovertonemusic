(ns clovertonemusic.chart-divs)

(require '[clojure.string :as str])

(defn chart
  [number grade-number grade-name chart-path chart-name composer-path composer-name price
   genre audio-path preview-path purchase-email customized-email chart-notes chart-details]
  (let [split-price (str/split (second (re-find #"\$(\S+)" "$1.00")) #"\.")]
    [(keyword (str "div#" number ".chart.grade" grade-number))
     [:div.head
      [:h2.title [:a {:href chart-path} chart-name]]
      [:h3.name
       [:a
        {:href composer-path}
        (str "By " composer-name "\n")]]]
     [:div.body
      [:div.image
       [:div.genre-image.swing]
       [:div.genre genre]
       [:div.grade grade-name]]
      [:a.purchase
       {:href
        (str "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order" purchase-email)}]
      [:div.blank]
      [:div.price
       [:span.dollar-sign "$"]
       [:span.dollars (first split-price)]
       [:span.cents (second split-price)]]
      [:ul.actions
       [:li
        [:a#audio2.audio
         {:href audio-path}
         "▶   Listen\n"]]
       [:li
        [:a
         {:href preview-path, :target "_blank"}
         "Preview\n"]]
       [:li
        [:a
         {:href
          (str "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20the%20chart"
               customized-email
               "Here's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A")}
         "Customize\n"]]]
      chart-notes]
     [:table.details
      [:thead
       [:tr
        [:td "Band"]
        [:td "Genre"]
        [:td "Composer"]
        [:td "Duration"]
        [:td "Meter"]
        [:td "Tempo"]]]
      chart-details]]))

(def o-canada
  (chart 2 1 "Grade 1" "/charts/o-canada" "O Canada" "/composers/christian-overton"
         "Christian Overton" "$1.00" "swing" "/audio/o-canada.mp3"
         "/previews/o-canada.preview.pdf" "%20%22O%20Canada%22.%0D%0A"
         "%20%22O%20Canada%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This fun version of our national anthem is dedicated to all the band kids that have to stand or sit quietly through endless school ceremonies only to play a few notes. This arrangement is sort of a Dixieland march that should spice up any school function!"]
          [:p "Have fun!"]]
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
           [:td "180"]]]))

(def sock-hop-be-bop
  (chart 4 1 "Grade 1" "/charts/sock-hop-be-bop" "Sock Hop Be-Bop" "/composers/christian-overton"
         "Christian Overton" "$40.00" "swing" "/audio/sock-hop-be-bop.mp3"
         "/previews/sock-hop-be-bop.preview.pdf" "%20%22Sock%20Hop%20Be-Bop%22.%0D%0A"
         "%20%22Sock%20Hop%20Be-Bop%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Sock Hop Be-Bop\" is a fun 60s inspired groovy tune designed for young bands. It’s got a bit of chromatic fun for the saxes and punchy brass shots. Solos are for anyone!"]
          [:p "Other features:"]
          [:ul
           [:li "Lead tumpet to G"]
           [:li "Solos are Blues scale based"]]]
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
           [:td "120"]]]))

(def tango
  (chart 5 1 "Grade 1" "/charts/tango" "Tango!" "/composers/christian-overton"
         "Christian Overton" "$40.00" "other" "/audio/tango.mp3"
         "/previews/tango.preview.pdf" "%20the%20chart%20%22Tango!%22.%0D%0A"
         "%20%22Tango!%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Tango! puts a fresh spin on any young bands' library. It features some slinky Alto Saxophone and is a good opportunity to teach about the Harmonic Minor scale and maybe world music in general."]
          [:p "Other Features:"]
          [:ul
           [:li "Lead trumpet to G"]
           [:li "Clapping parts for the horns"]
           [:li "Improvising on the Harmonic Minor scale"]]]
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
           [:td "100"]]]))

(def sakura-lullaby
  (chart 6 1 "Grade 1" "/charts/sakura-lullaby" "Sakura Lullaby" "/composers/christian-overton"
         "Christian Overton" "$40.00" "ballad" "/audio/sakura-lullaby.mp3"
         "/previews/sakura-lullaby.preview.pdf" "%20%22Sakura%20Lullaby%22.%0D%0A"
         "%20%22Sakura%20Lullaby%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This song is a romantic Lullaby in 3/4 about the beautiful Japanese cherry blossom tree or Sakura. It is a ballad featuring the trombone. This selection is a good opportunity to teach about 3/4 time in jazz."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to G"]
           [:li "Improvising is beginner level"]]]
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
           [:td "90"]]]))

(def game-on
  (chart 11 1 "Grade 1" "/charts/game-on" "Game On!" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$40.00" "rock" "/audio/game-on.mp3"
         "/previews/game-on.preview.pdf" "%20%22Game%20On!%22.%0D%0A"
         "%20%22Game%20On!%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Game on!\" is a driving rock tune that’s a nice closer for your set. It’s a high energy feel that your students can really dig in on. The melody is catchy moves along with a purpose. A great crowd pleaser! Sample solos are provided for Alto and Tenor Sax."]
          [:p "Other features:"]
          [:ul
           [:li "Easy rock feel"]
           [:li "Optional fills for drums provided"]]]
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
           [:td "112"]]]))

(def at-long-last
  (chart 27 1 "Grade 1" "/charts/at-long-last" "At Long Last" "/composers/christian-overton"
         "Christian Overton" "$40.00" "latin" "/audio/at-long-last.mp3"
         "/previews/at-long-last.preview.pdf" "%20%22At%20Long%20Last%22.%0D%0A"
         "%20%22At%20Long%20Last%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"At Long Last\" is a romantic, smooth Bossa Nova ballad featuring improvising for any horn. This is a great tune to teach your students about quiet blend and balance throughout the band."]
          [:p "Other features:"]
          [:ul
           [:li "Melody across sections"]
           [:li "Full band unison soli"]
           [:li "Improvising on C major scale"]]]
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
           [:td "120"]]]))

(def hotel-mambo
  (chart 29 1 "Grade 1" "/charts/hotel-mambo" "Hotel Mambo" "/composers/christian-overton"
         "Christian Overton" "$40.00" "latin" "/audio/hotel-mambo.mp3"
         "/previews/hotel-mambo.preview.pdf" "%20%22Hotel%20Mambo%22.%0D%0A"
         "%20%22Hotel%20Mambo%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Hotel Mambo\" is a fun latin tune for young bands inspired by the classic mambo band sound. It features the saxophone section on the repeated mambo figure and the trumpets on the melody. The solo section is written for trombone solo, with a later section open for drums to improvise."]
          [:p "Other features:"]
          [:ul
           [:li "Fun ostinato"]
           [:li "Clapping parts for the horns"]
           [:li "Improvising on the mixolydian scale"]]]
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
           [:td "180"]]]))

(def petes-chune
  (chart 30 1 "Grade 1" "/charts/petes-chune" "Pete's Chune" "/composers/christian-overton"
         "Christian Overton" "$40.00" "other" "/audio/petes-chune.mp3"
         "/previews/petes-chune.preview.pdf" "%20%22Pete's%20Chune%22.%0D%0A"
         "%20%22Pete's%20Chune%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Pete’s Chune\" is a Reggae chart dedicated to my high school teacher Pete Scherzinger. He told me one day that no one ever writes Reggae for big band. While now they do! This tune is a relaxed feel that’s somewhere between cut time and regular 4/4. The little melodies throughout should be played as if they were being sung."]]
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
           [:td "160"]]]))

(def train-track
  (chart 32 1 "Grade 1" "/charts/train-track" "Train Track" "/composers/christian-overton"
         "Christian Overton" "$40.00" "swing" "/audio/train-track.mp3"
         "/previews/train-track.preview.pdf" "%20%22Train%20Track%22.%0D%0A"
         "%20%22Train%20Track%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Train Track\" is a groove tune emulating riding the rails. It features string unison sax work and some fun \"train whistle\" wah-wah’s in the brass. The bridge section has a old school T.V. cop show vibe. Improvising is for anyone and is on the blues scale."]
          [:p "Other features:"]
          [:ul
           [:li "Trumpet to G"]
           [:li "Saxophone and brass trading section"]
           [:li "Easy brass parts"]]]
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
           [:td "132"]]]))

(def all-your-base
  (chart 35 1 "Grade 1" "/charts/all-your-base" "All Your Base" "/composers/erik-patterson"
         "Erik Patterson" "$40.00" "rock" "/audio/all-your-base.mp3"
         "/previews/all-your-base.preview.pdf" "%20%22All%20Your%20Base%22.%0D%0A"
         "%20%22All%20Your%20Base%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"All Your Base\" is a medium rock tune written by versatile composer and guitarist Erik Patterson. It drives with a fun sense of urgency and features some rhythm section shots and some independent saxophone work. The name derives from internet gaming. See if your students can figure it out."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "110"]]]))

(def shuswap-shuffle
  (chart 36 1 "Grade 1" "/charts/shuswap-shuffle" "Shuswap Shuffle" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$40.00" "swing" "/audio/shuswap-shuffle.mp3"
         "/previews/shuswap-shuffle.preview.pdf" "%20%22Shuswap%20Shuffle%22.%0D%0A"
         "%20%22Shuswap%20Shuffle%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Andy Says: \"'Shuswap Shuffle\" is named for beautiful Shuswap Lake in British Columbia.  The piece was written with high school-level bands in mind and combines an accessible high-energy  feel with some rhythmic and technical challenges.  One important consideration for the band director is the creation of an authentic shuffle feel. Although written in 4/4 the underlying feel is 12/8, with all eighth notes played in a long-short triplet subdivision.\""]]
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
           [:td "100"]]]))

(def red-river-mud-pie
  (chart 37 1 "Grade 1" "/charts/red-river-mud-pie" "Red River Mud Pie" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$40.00" "swing" "/audio/red-river-mud-pie.mp3"
         "/previews/red-river-mud-pie.preview.pdf" "%20%22Red%20River%20Mud%20Pie%22.%0D%0A"
         "%20%22Red%20River%20Mud%20Pie%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Andy Says: \"The tune is essentially a long-form blues in F with a clapping 'breakdown' section followed by a more rock-oriented section in G for your guitar player to solo on before the melody is restated in a D.S. al fine. I’ll admit the feel on the guitar solo is closer to Magic Bus by \"The Who\" than a real Mississippi blues!\""]]
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
           [:td "124"]]]))

(def gentlemen
  (chart 60 1 "Grade 1" "/charts/gentlemen" "Gentlemen" "/composers/erik-patterson"
         "Erik Patterson" "$40.00" "rock" "/audio/gentlemen.mp3"
         "/previews/gentlemen.preview.pdf" "%20%22Gentlemen%22.%0D%0A"
         "%20%22Gentlemen%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Gentlemen” is a slinky  laid back rock tune written by versatile composer and guitarist Erik Patterson. It features all sections on an easy melody and has fun and simple chord changes to improvise on. It also has easy brass and rhythm section parts, and a written out guitar line."]
          [:p "Other Features:"]
          [:ul
           [:li "Easy trombone melody sections"]
           [:li "Fun guitar part"]]]
         [:tbody
          [:tr
           [:td "Jazz band"]
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "100"]]]))

(def la-cattura
  (chart 61 1 "Grade 1" "/charts/la-cattura" "La Cattura Di Salvatore Veloce" "/composers/erik-patterson"
         "Erik Patterson" "$40.00" "rock" "/audio/la-cattura.mp3"
         "/previews/la-cattura.preview.pdf" "%20%22La%20Cattura%20Di%20Salvatore%20Veloce%22.%0D%0A"
         "%20%22La%20Cattura%20Di%20Salvatore%20Veloce%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“La Cattura” is a Funky 70s rock tune by guitarist Erik Patterson. It’s inspiration comes from the genre of Spaghetti westerns. It has a catchy minor vibe and is felt in 2 throughout. It’s epic feel feature some strong sax section work as well as some great brass backgrounds."]
          [:p "Other Features:"]
          [:ul
           [:li "Fun guitar part"]
           [:li "Solos for alto or tenor sax"]
           [:li "Easy brass parts"]]]
         [:tbody
          [:tr
           [:td "Jazz band"]
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "100"]]]))

(def cowboy-countdown
  (chart 65 1 "Grade 1" "/charts/cowboy-countdown" "Cowboy Countdown" "/composers/christian-overton"
         "Christian Overton" "$40.00" "swing" "/audio/cowboy-countdown.mp3"
         "/previews/cowboy-countdown.preview.pdf" "%20%22Cowboy%20Countdown%22.%0D%0A"
         "%20%22Cowboy%20Countdown%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Cowboy Countdown” is a relaxed swinging bluesy tune that’s easy to line dance to! It was written to capture a bit of that cowboy swagger. It features blues scale improvising for any instrument, a simple call and response section and a raucous tag at the end that is sure to get your audience tapping along. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other features:"]
          [:ul
           [:li "Very sectional writing"]
           [:li "Easy trombone parts"]
           [:li "Stop time section"]]]
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
           [:td "120"]]]))

(def la-squadra-da-milano
  (chart 75 1 "Grade 1" "/charts/la-squadra-da-milano" "La Squadra Da Milano" "/composers/erik-patterson"
         "Erik Patterson" "$40.00" "rock" "/audio/la-squadra-da-milano.mp3"
         "/previews/la-squadra-da-milano.preview.pdf" "%20%22La%20Squadra%20Da%20Milano%22.%0D%0A"
         "%20%22La%20Squadra%20Da%20Milano%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“La Squadra Di Milano” is another great and groovy grade 1 rock tune thats more of a strut. It was inspired my Italian cop movies. It’s got some easy rhythms that are great for beginner bands but is still very musical and a lot of fun. It has melody sections in the saxes and as a full band and features a solo section written for alto sax. The attitude really comes though the music and will have your band wanting to play it week in and week out."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "120"]]]))

(def stone-cold-strut
  (chart 76 1 "Grade 1" "/charts/stone-cold-strut" "Stone Cold Strut" "/composers/erik-patterson"
         "Erik Patterson" "$40.00" "rock" "/audio/stone-cold-strut.mp3"
         "/previews/stone-cold-strut.preview.pdf" "%20%22Stone%20Cold%20Strut%22.%0D%0A"
         "%20%22Stone%20Cold%20Strut%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Stone Cold Strut” is a high energy rock tune with a great jump feel to it. This one is sure to get your audience’s head bopping and features strong section playing throughout. The rhythmic figures are simple but effective and the solo section is written for Tenor Sax. Check out the great build at the end!"]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Rock"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "120"]]]))

(def branta
  (chart 78 1 "Grade 1" "/charts/branta" "Branta" "/composers/tom-richards"
         "Tom Richards" "$40.00" "latin" "/audio/branta.mp3"
         "/previews/branta.preview.pdf" "%20%22Branta%22.%0D%0A"
         "%20%22Branta%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Branta” is a smooth minor salsa tune composed to feature flute. It’s a very memorable yet accessible chart which is a great introduction to latin music for a young band. Other than flute melody the chart also features some fun sax section work and easy brass parts."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Salsa"]
           [:td [:a {:href "/composers/tom-richards"} "Tom Richards"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "140"]]]))

(def moatfield-shuffle
  (chart 79 1 "Grade 1" "/charts/moatfield-shuffle" "Moatfield Shuffle" "/composers/tom-richards"
         "Tom Richards" "$40.00" "swing" "/audio/moatfield-shuffle.mp3"
         "/previews/moatfield-shuffle.preview.pdf" "%20%22Moatfield%20Shuffle%22.%0D%0A"
         "%20%22Moatfield%20Shuffle%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Moatfield Shuffle” is a straight-ahead swinger with solos for horns and rhythm section. The melody is designed to place emphasis on basic rhythm reading skills, with subtle variations to keep things interesting. "]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Shuffle"]
           [:td [:a {:href "/composers/tom-richards"} "Tom Richards"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "110"]]]))

(def blue-heron
  (chart 84 1 "Grade 1" "/charts/blue-heron" "Blue Heron" "/composers/christian-overton"
         "Christian Overton" "$40.00" "swing" "/audio/blue-heron.mp3"
         "/previews/blue-heron.preview.pdf" "%20%22Blue%20Heron%22.%0D%0A"
         "%20%22Blue%20Heron%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Blue Heron” is a cool jazz modal blues inspired by one of Ontario’s most majestic birds. It’s very representative of the cool jazz movement of the 1950’s made famous by Miles Davis which caught on strongly in the west coast. The melody is featured in the alto sax, tenor sax, and trumpet, then unison melodies in the saxes vs the brass. It’s a great way to introduce your students to section playing. Improvising can be for any player. !"]]
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
           [:td "120"]]]))

(def detective-story
  (chart 7 2 "Grade 2" "/charts/detective-story" "Detective Story" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/detective-story.mp3"
         "/previews/detective-story.preview.pdf" "%20%22Detective%20Story%22.%0D%0A"
         "%20%22Detective%20Story%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This chart is written with a real \"film noir\" type of sound. I'm picturing a 1920's  hard boiled detective in his daily grind. This tune let's your Bass player really dig in and offers some great opportunity for some bluesy sounds out of your sax section."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to G"]
           [:li "Minimal line independence"]
           [:li "Blues scale based solos"]]]
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
           [:td "100"]]]))

(def that-look
  (chart 9 2 "Grade 2" "/charts/that-look" "That Look" "/composers/christian-overton"
         "Christian Overton" "$50.00" "ballad" "/audio/that-look.mp3"
         "/previews/that-look.preview.pdf" "%20%22That%20Look%22.%0D%0A"
         "%20%22That%20Look%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"That Look\" is a slow dance shuffle ballad feature for the Alto Saxophone. It’s a classic recognizable style that we as professional musicians play in all the time. The melody is very singable and the harmony goes some nice places. It’s a good opportunity to share with your students a little bit about being a musician as a career, and playing this dance kind of music."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to G"]
           [:li "Improvising is Beginner level"]]]
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
           [:td "60"]]]))

(def atlantic-crossing
  (chart 10 2 "Grade 2" "/charts/atlantic-crossing" "Atlantic Crossing" "/composers/christian-overton"
         "Christian Overton" "$50.00" "other" "/audio/atlantic-crossing.mp3"
         "/previews/atlantic-crossing.preview.pdf" "%20%22Atlantic%20Crossing%22.%0D%0A"
         "%20%22Atlantic%20Crossing%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Atlantic crossing\" is a modal tune with a light straight 8ths feel. I wrote this to get the kind of feeling of being alone on the quiet water. It features some wave sound effects in the brass and some room for your trumpet soloist to blow. A good teaching opportunity is the Mixolydian scale and modal Jazz as a whole."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to F"]
           [:li "Wave effects in the horns"]
           [:li "Trumpet solo on the mixolydian scale"]]]
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
           [:td "100"]]]))

(def electros-next-plot-jr
  (chart 15 2 "Grade 2" "/charts/electros-next-plot-jr" "Electro's Next Plot (Jr.)" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/electros-next-plot-jr.mp3"
         "/previews/electros-next-plot-jr.preview.pdf" "%20%22Electro's%20Next%20Plot%20(Jr.)%22.%0D%0A"
         "%20%22Electro's%20Next%20Plot%20(Jr.)%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Electro’s Next Plot\" was inspired by T.V. music from when I was a kid, most notably in the comic book genre. This is a fun shuffle featuring your guitar player and some dirty saxophone section work. It’s a good opportunity to teach your students about the 12/8 feel and reading rhythms in this meter. Have your band let loose!"]
          [:p "Other features:"]
          [:ul
           [:li "Grade 2 Version"]
           [:li "Lead trumpet to G"]
           [:li "Blues scale improvisation"]]]
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
           [:td "72"]]]))

(def a-kingdoms-last-hope-jr
  (chart 31 2 "Grade 2" "/charts/a-kingdoms-last-hope-jr" "A Kingdom's Last Hope Jr." "/composers/christian-overton"
         "Christian Overton" "$50.00" "other" "/audio/a-kingdoms-last-hope-jr.mp3"
         "/previews/a-kingdoms-last-hope-jr.preview.pdf" "%20%22A%20Kingdom's%20Last%20Hope%20Jr.%22.%0D%0A"
         "%20%22A%20Kingdom's%20Last%20Hope%20Jr.%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"A Kingdom’s Last Hope\" is a story telling tune. The first section is the pleading villagers, followed by a gallant hero called to action, and then to monster section and eventual heroic victory. See if you can hear the imagery. This grade 2 version is a simplified version of the original recorded by the \"Composer's Collective Big Band\" designed for high school players."]]
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
           [:td "120"]]]))

(def cloud-song
  (chart 49 2 "Grade 2" "/charts/cloud-song" "Cloud Song" "/composers/christian-overton"
         "Christian Overton" "$50.00" "rock" "/audio/cloud-song.mp3"
         "/previews/cloud-song.preview.pdf" "%20%22Cloud%20Song%22.%0D%0A"
         "%20%22Cloud%20Song%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Cloud Song” is a simple straight 8ths tune written in homage to those of us with their heads stuck in the clouds. It’s written as an introduction to cross section playing, meaning that the musicians are often in unison with players in different sections not always with those beside them. It has a light rockish feel with a 50’s inspired Piano pattern."]
          [:p "Other Features:"]
          [:ul
           [:li "Simple melodies in counterpoint"]
           [:li "Solo written for Guitar"]]]
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
           [:td "120"]]]))

(def let-me-be
  (chart 52 2 "Grade 2" "/charts/let-me-be" "Let Me Be the Sugar in Your Tea" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/let-me-be.mp3"
         "/previews/let-me-be.preview.pdf" "%20%22Let%20Me%20Be%20the%20Sugar%20in%20Your%20Tea%22.%0D%0A"
         "%20%22Let%20Me%20Be%20the%20Sugar%20in%20Your%20Tea%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Let Me Be the Sugar in Your Tea” is inspired by the charming slow struts of Louis Armstrong. I’m picturing him swooning with a woman trying to win her over with his singing. The tune is a medium 2 step Dixieland feel featuring the solo trumpet on the melody."]
          [:p "Other Features:"]
          [:ul
           [:li "Improvising for Piano"]
           [:li "Sectional melody"]
           [:li "Solo trumpet to Ab"]]]
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
           [:td "96"]]]))

(def lifted
  (chart 54 2 "Grade 2" "/charts/lifted" "Lifted" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/lifted.mp3"
         "/previews/lifted.preview.pdf" "%20%22Lifted%22.%0D%0A"
         "%20%22Lifted%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Lifted” is a Gospel tune inspired by the great sound of gospel bands and choirs in churches all over the world. It features a chin’ solo for the trumpet, a great gospel 2 feel and even a “testifying” section at the end to bring the house down. In the middle of the tune you’ll also find a clapping breakdown section for your audience to join in."]
          [:p "Other Features:"]
          [:ul
           [:li "Improvising for trumpet"]
           [:li "Easy trombone parts"]
           [:li "Fun sax lines"]]]
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
           [:td "140"]]]))

(def a-long-kept-secret
  (chart 64 2 "Grade 2" "/charts/a-long-kept-secret" "A Long Kept Secret" "/composers/christian-overton"
         "Christian Overton" "$50.00" "ballad" "/audio/a-long-kept-secret.mp3"
         "/previews/a-long-kept-secret.preview.pdf" "%20%22A%20Long%20Kept%20Secret%22.%0D%0A"
         "%20%22A%20Long%20Kept%20Secret%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“A Long Kept Secret” is a warm straight eighths ballad filled with hints of nostalgia and reflection. It features a memorable yet searching melody written for alto saxophone. The bridge section moves and grows while the A sections play as a gentle release. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Great band feature as well as solo feature"]
           [:li "Memorable melody"]
           [:li "Modal improvising"]]]
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
           [:td "90"]]]))

(def crusin-at-30000
  (chart 66 2 "Grade 2" "/charts/crusin-at-30000" "Crusin' at 30000" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/crusin-at-30000.mp3"
         "/previews/crusin-at-30000.preview.pdf" "%20%22Crusin'%20at%2030000%22.%0D%0A"
         "%20%22Crusin'%20at%2030000%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Crusin’ at 30 000” is an up tempo swing tune that takes us on a journey from take off to the clouds and finally to a soft landing. It was written as for use as an introduction to faster tempos through accessible swing figures. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Modal improvising"]
           [:li "Drum solo trading fours"]]]
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
           [:td "200"]]]))

(def the-gene-machine
  (chart 67 2 "Grade 2" "/charts/the-gene-machine" "The Gene Machine" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/the-gene-machine.mp3"
         "/previews/the-gene-machine.preview.pdf" "%20%22The%20Gene%20Machine%22.%0D%0A"
         "%20%22The%20Gene%20Machine%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“The Gene Machine” is a 1940’s inspired jump swing tune written in tribute to the great Gene Krupa. It features plunger muted brass figures, call and response and some drum work in the style that Gene Krupa made famous. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Blues scale improvising"]
           [:li "Fun for every section of the band"]]]
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
           [:td "180"]]]))

(def go-go-blues
  (chart 68 2 "Grade 2" "/charts/go-go-blues" "Go Go Blues" "/composers/christian-overton"
         "Christian Overton" "$50.00" "rock" "/audio/go-go-blues.mp3"
         "/previews/go-go-blues.preview.pdf" "%20%22Go%20Go%20Blues%22.%0D%0A"
         "%20%22Go%20Go%20Blues%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Go Go Blues” is a fun and slinky rock tun inspired by 1960’s go go music. It features accessible figures, blues scale improvising for any instrument, and a lot of unison passages. The groove is easy to learn and will keep students and audiences wanting to hear it again and again. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Losts of stop time sections"]
           [:li "Strong sax parts"]
           [:li "Solos for any instrument"]]]
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
           [:td "120"]]]))

(def en-su-camino
  (chart 71 2 "Grade 2" "/charts/en-su-camino" "En Su Camino" "/composers/greg-crowe"
         "Greg Crowe" "$50.00" "latin" "/audio/en-su-camino.mp3"
         "/previews/en-su-camino.preview.pdf" "%20%22En%20Su%20Camino%22.%0D%0A"
         "%20%22En%20Su%20Camino%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This exciting new chart is from well known Winnipeg based educator Greg Crowe. It's a great Cha Cha that perfectly exemplifies the style of this romanic genre and is a great departure from the standard latin charts in the educational repertoire, a guaranteed hit with your band! It features solos for any horn on an easy diatonic progression and great melodic moments for every section."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Cha Cha"]
           [:td [:a {:href "/composers/greg-crowe"} "Greg Crowe"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "110"]]]))

(def sometimes-i-feel
  (chart 72 2 "Grade 2" "/charts/sometimes-i-feel" "Sometimes I Feel Like a Muppet" "/composers/chris-hunt"
         "Chris Hunt" "$50.00" "swing" "/audio/sometimes-i-feel.mp3"
         "/previews/sometimes-i-feel.preview.pdf" "%20%22Sometimes%20I%20Feel%20Like%20a%20Muppet%22.%0D%0A"
         "%20%22Sometimes%20I%20Feel%20Like%20a%20Muppet%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "The newest chart from composer Chris Hunt is a fun blues romp with a catchy repeated figure sure to get you hooked. It's got some classic swing rhythms great for teaching young bands about swing and a reasonable tempo to get them started. It's got some great parts for your saxes to dig in on and solos are written for anyone."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Swing"]
           [:td [:a {:href "/composers/chris-hunt"} "Chris Hunt"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "110"]]]))

(def friday-night-special
  (chart 73 2 "Grade 2" "/charts/friday-night-special" "Friday Night Special" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/friday-night-special.mp3"
         "/previews/friday-night-special.preview.pdf" "%20%22Friday%20Night%20Special%22.%0D%0A"
         "%20%22Friday%20Night%20Special%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Friday Night Special\" is a throwback to the classic days of live television where big bands backed up famous artists and celebrities. It’s a great high energy swing tune featuring some fast and fun figures that are great to teach your band about swing feel. It features a stop time sax soli and a huge build in the shout chorus. Solos are written for any horn."]]
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
           [:td "180"]]]))

(def god-rest-ye
  (chart 74 1 "Grade 2" "/charts/god-rest-ye" "God Rest Ye Merry Gentlemen" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/god-rest-ye.mp3"
         "/previews/god-rest-ye.preview.pdf" "%20%22God%20Rest%20Ye%20Merry%20Gentlemen%22.%0D%0A"
         "%20%22God%20Rest%20Ye%20Merry%20Gentlemen%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This arrangement is a fresh and fun version of a well loved Christmas classic. It starts off in a classical choral but quickly switches to a Benny Goodman inspired 1940s jump tune. It’s full of surprises and features multiple soloists trading back to back. It’s got some fun bassline figures in the trombones and some great swinging in the saxes and trumpets. This one’s sure to be the tune to remember at your Christmas concert."]]
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
           [:td "140"]]]))

(def the-first-noel
  (chart 86 2 "Grade 2" "/charts/the-first-noel" "The First Noel" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/the-first-noel.mp3"
         "/previews/the-first-noel.preview.pdf" "%20%22The%20First%20Noel%22.%0D%0A"
         "%20%22The%20First%20Noel%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This arrangement of “The First Noel” is a bluesy take on the Christmas classic everyone knows. It features easy blues improvising changes and a fresh horn feature in the development section. This is a sure way to spice up your Christmas concert! Improvising is written for any horn. "]]
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
           [:td "100"]]]))

(def what-once-was
  (chart 87 2 "Grade 2" "/charts/what-once-was" "What Once Was" "/composers/christian-overton"
         "Christian Overton" "$50.00" "ballad" "/audio/what-once-was.mp3"
         "/previews/what-once-was.preview.pdf" "%20%22What%20Once%20Was%22.%0D%0A"
         "%20%22What%20Once%20Was%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Was Once Was” is a nostalgic rock ballad featuring the alto saxophone. The melody is memorable and moves from feeling a sense of longing to more of a positive feel in the bridge. It also features juicy parts for the saxophone and trumpet sections as well as on opportunity to show off dynamically for the whole band. Improvising is almost exclusively 2 scales. This tune will be a welcome ballad addition to your festival repertoire."]]
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
           [:td "70"]]]))

(def brown-and-tan
  (chart 88 2 "Grade 2" "/charts/brown-and-tan" "Brown and Tan" "/composers/brad-harrison"
         "Brad Harrison" "$50.00" "rock" "/audio/brown-and-tan.mp3"
         "/previews/brown-and-tan.preview.pdf" "%20%22Brown%20and%20Tan%22.%0D%0A"
         "%20%22Brown%20and%20Tan%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Brown and Tan is a medium tempo feature for flute or alto saxophone reminiscent of the jazzy pop tunes of the 60’s and 70’s. The improvised section can be navigated using only the F major concert scale. Two full chorus band solis also allow the rest of the ensemble to shine as well."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Straight 8ths"]
           [:td
            [:a {:href "/composers/brad-harrison"} "Brad Harrison"]]
           [:td "6:00"]
           [:td "4/4 "]
           [:td "150"]]]))

(def livvy-dear
  (chart 90 2 "Grade 2" "/charts/livvy-dear" "Livvy Dear" "/composers/greg-crowe"
         "Greg Crowe" "$50.00" "swing" "/audio/livvy-dear.mp3"
         "/previews/livvy-dear.preview.pdf" "%20%22Livvy%20Dear%22.%0D%0A"
         "%20%22Livvy%20Dear%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Livvy Dear is a fun medium swing tune written to feature flute and trumpet. It's got classic swing figures essential for teaching jazz to beginners and is a rare opportunity to put the flute from and centre of the jazz band."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Swing"]
           [:td [:a {:href "/composers/greg-crowe"} "Greg Crowe"]]
           [:td "3:30"]
           [:td "4/4 "]
           [:td "132"]]]))

(def summer-on-my-mind
  (chart 92 2 "Grade 2" "/charts/summer-on-my-mind" "Summer on my Mind" "/composers/tom-richards"
         "Tom Richards" "$50.00" "swing" "/audio/summer-on-my-mind.mp3"
         "/previews/summer-on-my-mind.preview.pdf" "%20%22Summer%20on%20my%20Mind%22.%0D%0A"
         "%20%22Summer%20on%20my%20Mind%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Summer on my Mind\" is a relaxed swing tune, evoking the easy days of summer. The trumpet and saxophone sections carry the tuneful melody while the rhythm section alternates between \"two-feel\" and \"four-feel\". The saxes and trombones have featured soli sections, and there are written solos (with chord changes) for alto/tenor, piano, bass, and drums."]]
         [:tbody
          [:tr
           [:td "Jazz Band "]
           [:td "Swing"]
           [:td [:a {:href "/composers/tom-richards"} "Tom Richards"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "128"]]]))

(def good-king-w
  (chart 93 2 "Grade 2" "/charts/good-king-w" "Good King Wenceslas" "/composers/christian-overton"
         "Christian Overton" "$50.00" "swing" "/audio/good-king-w.mp3"
         "/previews/good-king-w.preview.pdf" "%20%22Good%20King%20Wenceslas%22.%0D%0A"
         "%20%22Good%20King%20Wenceslas%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This version of this classic carol features swinging moments while still paying homage to classic renditions on the song. This fun and energetic version features great moments for brass and saxophone sections to shine and also has easy blowing changes. The mood of the piece shifts throughout creating a performance that’s interesting as well as great fun to play!"]]
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
           [:td "160"]]]))

(def no-trespassing
  (chart 95 2 "Grade 2" "/charts/no-trespassing" "No Trespassing" "/composers/christian-overton"
         "Christian Overton" "$50.00" "rock" "/audio/no-trespassing.mp3"
         "/previews/no-trespassing.preview.pdf" "%20%22No%20Trespassing%22.%0D%0A"
         "%20%22No%20Trespassing%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“No Trespassing” is a tough as nails strut inspired by the hip hop brass bands of modern New Orleans. It features lots of juicy brass and saxophone lines and is written in cut time for easy reading. This one is guaranteed to be a blast for students and audience members alike."]]
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
           [:td "100"]]]))

(def roscos-big-hit
  (chart 107 2 "Grade 2" "/charts/roscos-big-hit" "Rosco's Big Hit" "/composers/tom-richards"
         "Tom Richards" "$50.00" "swing" "/audio/roscos-big-hit.mp3"
         "/previews/roscos-big-hit.preview.pdf" "%20%22Rosco's%20Big%20Hit%22.%0D%0A"
         "%20%22Rosco's%20Big%20Hit%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "From the streets of New Orleans comes this party tune from Tom Richards. This is a great chance for students to learn about the street parade band culture in the crescent city and have fun doing it!"]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Dixieland"]
           [:td [:a {:href "/composers/tom-richards"} "Tom Richards"]]
           [:td "3:30"]
           [:td "4/4"]
           [:td "176"]]]))

(def the-long-way-home
  (chart 108 2 "Grade 2" "/charts/the-long-way-home" "The Long Way Home" "/composers/brad-harrison"
         "Brad Harrison" "$50.00" "ballad" "/audio/the-long-way-home.mp3"
         "/previews/the-long-way-home.preview.pdf" "%20%22The%20Long%20Way%20Home%22.%0D%0A"
         "%20%22The%20Long%20Way%20Home%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This rock ballad from Brad Harrison brings on the romance and features simple harmony and rhythms for beginning bands. It also is a great spotlight for your great alto sax player."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Rock Ballad"]
           [:td
            [:a {:href "/composers/brad-harrison"} "Brad Harrison"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "100"]]]))

(def the-pursuit
  (chart 3 3 "Grade 3" "/charts/the-pursuit" "The Pursuit" "/composers/christian-overton"
         "Christian Overton" "$60.00" "swing" "/audio/the-pursuit.mp3"
         "/previews/the-pursuit.preview.pdf" "%20%22The%20Pursuit%22.%0D%0A"
         "%20%22The%20Pursuit%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"The Pursuit\" is an epic medium swing tune with a very New York modern Jazz type of sound. It features a challenging band soli section and room for Alto sax and drums to stretch out."]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to high Bb"]
           [:li "Works in a wide tempo range"]
           [:li "Improvisaton difficulty intermediate"]
           [:li "Optional Bass trombone notes"]]]
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
           [:td "112"]]]))

(def the-dirrty-dog
  (chart 8 3 "Grade 3" "/charts/the-dirrty-dog" "The Dirrty Dog" "/composers/chris-hunt"
         "Chris Hunt" "$60.00" "rock" "/audio/the-dirrty-dog.mp3"
         "/previews/the-dirrty-dog.preview.pdf" "%20%22The%20Dirrty%20Dog%22.%0D%0A"
         "%20%22The%20Dirrty%20Dog%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This funky tune is inspired by a painting of a dirty looking hot dog. It’s great fun. This tune is a great opportunity to teach the difference between a half time feel vs a swing 4 feel and also the difference between swung 8ths funk and straight 8ths funk."]
          [:p "Other features:"]
          [:ul
           [:li "Optional high lead trumpet parts"]
           [:li
            "Fun parts for lead trombone, and solo parts for Tenor 2 and trumpet"]]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Funk"]
           [:td [:a {:href "/composers/chris-hunt"} "Chris Hunt"]]
           [:td "5:00"]
           [:td "4/4"]
           [:td "160"]]]))

(def on-the-ending-earth
  (chart 12 3 "Grade 3" "/charts/on-the-ending-earth" "On The Ending Earth" "/composers/erik-patterson"
         "Erik Patterson" "$60.00" "ballad" "/audio/on-the-ending-earth.mp3"
         "/previews/on-the-ending-earth.preview.pdf" "%20%22On%20The%20Ending%20Earth%22.%0D%0A"
         "%20%22On%20The%20Ending%20Earth%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"On the Ending Earth\" is an original composition written in the classic Big Band ballad style. This tasty tune is inspired in part by Mingus ballads and provokes thoughts of Big Band nostalgia. It features the solo Flugelhorn, with some juicy sax section parts and gentle brass playing. Use this chart to educate your students on the classic big band sound."]
          [:p "Other features:"]
          [:ul
           [:li "Improvising intermediate to advanced"]
           [:li "Lots of independent parts"]]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Ballad"]
           [:td
            [:a {:href "/composers/erik-patterson"} "Erik Patterson"]]
           [:td "3:15"]
           [:td "4/4"]
           [:td "70"]]]))

(def four-more-to-go
  (chart 13 3 "Grade 3" "/charts/four-more-to-go" "Four More to Go" "/composers/allison-au"
         "Allison Au" "$60.00" "swing" "/audio/four-more-to-go.mp3"
         "/previews/four-more-to-go.preview.pdf" "%20%22Four%20More%20to%20Go%22.%0D%0A"
         "%20%22Four%20More%20to%20Go%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Four More to Go\" is a driving swing tune with some really great chord changes. It has a lot of forward momentum in the harmony and the shout chorus is based on the classic jazz turnaround, which builds into a nice climax. It’s got some nice saxophone sections and the improvising is open for any saxophone player."]
          [:p "Other features:"]
          [:ul [:li "Sax soli and full band soli"]]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Swing"]
           [:td [:a {:href "/composers/allison-au"} "Allison Au"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "185"]]]))

(def yun-gia
  (chart 14 3 "Grade 3" "/charts/yun-gia" "Yun Gia" "/composers/christian-overton"
         "Christian Overton" "$60.00" "latin" "/audio/yun-gia.mp3"
         "/previews/yun-gia.preview.pdf" "%20%22Yun%20Gia%22.%0D%0A"
         "%20%22Yun%20Gia%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This fun Salsa tune was inspired by the mix of skill and youthful energy some kids have for music. It features some Sax trading for the Altos and Tenors as well as a trumpet solo. Also check out some powerful Brass moments and a slinky sax soli."]
          [:p "Other features:"]
          [:ul
           [:li "Strong trumpet parts"]
           [:li "Strong lead trombone part"]
           [:li "Athletic saxophone parts"]]]
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
           [:td "180"]]]))

(def the-green-blues
  (chart 33 3 "Grade 3" "/charts/the-green-blues" "The Green Blues" "/composers/christian-overton"
         "Christian Overton" "$70.00" "swing" "/audio/the-green-blues.mp3"
         "/previews/the-green-blues.preview.pdf" "%20%22The%20Green%20Blues%22.%0D%0A"
         "%20%22The%20Green%20Blues%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“The Green Blues” was written for the 2009 MusicFest Canada All Star Jazz Band under the direction of Denny Christianson. This tune is a really good vehicle for a strong band to show their stuff as soloists and sectional players. It features a sax soli, band soli, improvising for everyone and a nice big shout at the end."]
          [:p "Other features:"]
          [:ul
           [:li [:p "Strong sax section workout"]]
           [:li [:p "Trumpet 1 to high D"]]
           [:li [:p "Improvising on the 12 bar blues"]]]]
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
           [:td "160"]]]))

(def arcadian-autumn
  (chart 34 3 "Grade 3" "/charts/arcadian-autumn" "Arcadian Autumn" "/composers/christian-overton"
         "Christian Overton" "$60.00" "swing" "/audio/arcadian-autumn.mp3"
         "/previews/arcadian-autumn.preview.pdf" "%20%22Arcadian%20Autumn%22.%0D%0A"
         "%20%22Arcadian%20Autumn%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Christian says: \"'Arcadian Autumn' is a relaxed jazz waltz featuring the saxophone section. I wrote it walking home on Arcadian Crescent on a perfect fall day. The pulse can be thought of in a fast 3 or a slow 1 feel. The bridge sections should be more washy and dreamy while the other sections can have more of a dancing feel.\""]]
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
           [:td "120"]]]))

(def sol-fiesta
  (chart 39 3 "Grade 3" "/charts/sol-fiesta" "Sol Fiesta" "/composers/maria-kundakcioglu"
         "Maria Kundakcioglu" "$60.00" "latin" "/audio/sol-fiesta.mp3"
         "/previews/sol-fiesta.preview.pdf" "%20%22Sol%20Fiesta%22.%0D%0A"
         "%20%22Sol%20Fiesta%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Maria says: \"This upbeat Latin song was created around the bass line, which was derived from a phrase my friend said in class one day. The arrangement gives each section of the band a chance to shine. There are some classic Latin syncopated rhythms throughout the arrangement and some challenging and fun brass parts.\""]
          [:p "Other features;"]
          [:ul
           [:li "Lead trumpet to high C"]
           [:li "Lead trombone to high C"]
           [:li "Syncopated Latin rhythms"]
           [:li "Improvised piano solo"]
           [:li "Drum set solo"]]]
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
           [:td "100"]]]))

(def tumbadora
  (chart 40 3 "Grade 3" "/charts/tumbadora" "Tumbadora" "/composers/maria-kundakcioglu"
         "Maria Kundakcioglu" "$60.00" "latin" "/audio/tumbadora.mp3"
         "/previews/tumbadora.preview.pdf" "%20%22Tumbadora%22.%0D%0A"
         "%20%22Tumbadora%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Maria says: \"Tumbadora is a salsa tune I wrote inspired by the role of the congas in Latin music. The feel and rhythms are reminiscent of the sound of the Latin ensembles I enjoy listening to. There is also a heavy influence of the piano in this arrangement which gives the piano player in your band an opportunity to be featured throughout as well as in an improvised section at letter D. You can include a conga player in addition to the drummer and they have a chance to trade solos in the open percussion solo section one bar before letter E. There are some fun brass parts throughout with some challenging rhythms. This is a driving arrangement that will give your whole band a good workout.\""]
          [:ul
           [:li "Other features"]
           [:li "Lead Trumpet to high C"]
           [:li "Lead Trombone to high B"]
           [:li "Percussion section solos"]
           [:li "Improvised piano solo"]]]
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
           [:td "120"]]]))

(def silent-night
  (chart 46 3 "Grade 3" "/charts/silent-night" "Silent Night" "/composers/christian-overton"
         "Christian Overton" "$60.00" "ballad" "/audio/silent-night.mp3"
         "/previews/silent-night.preview.pdf" "%20%22Silent%20Night%22.%0D%0A"
         "%20%22Silent%20Night%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This classically inspired arrangement was written to really set the mood of a crisp, starlit winter’s night. It features lush section playing and some chances to show off independent section leaders. There is an improvising section for Alto Saxophone."]
          [:p "Other Features:"]
          [:ul
           [:li "Bb Major scale improvising"]
           [:li "Choral sections"]
           [:li "A fresh take on a classic Holiday standard"]]]
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
           [:td "90"]]]))

(def joy-to-the-world
  (chart 47 3 "Grade 3" "/charts/joy-to-the-world" "Joy to the World" "/composers/christian-overton"
         "Christian Overton" "$60.00" "latin" "/audio/joy-to-the-world.mp3"
         "/previews/joy-to-the-world.preview.pdf" "%20%22Joy%20to%20the%20World%22.%0D%0A"
         "%20%22Joy%20to%20the%20World%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This arrangement is a Salsa twist on a Christmas favourite. It features some quirky lead lines and is a good introduction to Salsa rhythms for bands ready to take on a new challenge. Solos are marked for trumpet and drums."]
          [:p "Other Features:"]
          [:ul
           [:li "Good introduction to Salsa rhythms"]
           [:li "Section unison melodies"]
           [:li "Modern and fun to play"]]]
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
           [:td "100"]]]))

(def canal-street-walk
  (chart 48 3 "Grade 3" "/charts/canal-street-walk" "Canal Street Walk" "/composers/christian-overton"
         "Christian Overton" "$60.00" "swing" "/audio/canal-street-walk.mp3"
         "/previews/canal-street-walk.preview.pdf" "%20%22Canal%20Street%20Walk%22.%0D%0A"
         "%20%22Canal%20Street%20Walk%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Canal Street Walk” is a fun and raucous New Orleans street beat tune inspired by the city’s famous second line bands. It features unison melody lines in the horns, some great soli lines to dig in on and a danceable feel to get your band moving! Improvising is written for Baritone Saxophone."]
          [:p "Other Features:"]
          [:ul
           [:li "Horn section solis"]
           [:li "Bass Solo"]
           [:li "Lead trumpet to G"]]]
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
           [:td "180"]]]))

(def the-dancehall-shake
  (chart 50 3 "Grade 3" "/charts/the-dancehall-shake" "The Dancehall Shake" "/composers/christian-overton"
         "Christian Overton" "$60.00" "other" "/audio/the-dancehall-shake.mp3"
         "/previews/the-dancehall-shake.preview.pdf" "%20%22The%20Dancehall%20Shake%22.%0D%0A"
         "%20%22The%20Dancehall%20Shake%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"The Dance Hall Shake” is an infectious groove inspired by Jamaican dance hall rhythms. Its melodies are very rhythmic and are played in a call and answer type fashion. The sections are often divided in pairs and the lines are very specifically marked long and short to fit the style. This tune is a good teaching opportunity to talk about working on efficient and accurate articulations."]
          [:p "Other Features:"]
          [:ul
           [:li "Improvising for trombone and drums"]
           [:li "A lot of unison"]]]
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
           [:td "100"]]]))

(def femis-flight
  (chart 51 3 "Grade 3" "/charts/femis-flight" "Femi's Flight" "/composers/christian-overton"
         "Christian Overton" "$60.00" "other" "/audio/femis-flight.mp3"
         "/previews/femis-flight.preview.pdf" "%20%22Femi's%20Flight%22.%0D%0A"
         "%20%22Femi's%20Flight%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Femi’s Flight” is an afrobeat adventure inspired by the Nigerian afrobeat sound. It features an exciting 12/8 groove and a substantial amount of unison melody in the horns, This tune makes for a fresh change in the Jazz band repertoire with a world music flavour."]
          [:p "Other Features:"]
          [:ul
           [:li "A lot of unison"]
           [:li "Solos for Alto Saxophone and drums"]]]
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
           [:td "120"]]]))

(def lost-stories
  (chart 55 3 "Grade 3" "/charts/lost-stories" "Lost Stories" "/composers/christian-overton"
         "Christian Overton" "$60.00" "rock" "/audio/lost-stories.mp3"
         "/previews/lost-stories.preview.pdf" "%20%22Lost%20Stories%22.%0D%0A"
         "%20%22Lost%20Stories%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Lost Stories” is a driving straight 8ths Jazz tune written for the 2010 Musicfest Canada Yamaha All Star Band under the direction of Terry Promane. It’s written in a professional band style but is definitely accessible for high school level players. It features improvising for Alto Sax and a climactic drum solo."]
          [:p "Other Features:"]
          [:ul
           [:li "Athletic sax parts"]
           [:li "Meaty brass parts"]
           [:li "Modern sound"]]]
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
           [:td "140"]]]))

(def dark-matter
  (chart 56 3 "Grade 3" "/charts/dark-matter" "Dark Matter" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$60.00" "ballad" "/audio/dark-matter.mp3"
         "/previews/dark-matter.preview.pdf" "%20%22Dark%20Matter%22.%0D%0A"
         "%20%22Dark%20Matter%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Andy Says: \"Dark Matter\"  is a musically sophisticated but technically accessible chart which features either alto or baritone sax in an extended feature.  The main theme is in a straight eighth ballad feel with the solo section and shout chorus in double-time swing.  The objective with this piece was to explore a more contemporary \"dark\" minor harmonic palette while keeping all the parts playable for young musicians."]
          [:p "Other Features:"]
          [:ul
           [:li "Mutes for trumpets"]
           [:li "Alternate Solo parts for Alto 1 or Bari Sax"]
           [:li "All exposed trombone parts cued in saxophones"]
           [:li "Guitar pedal effects"]]]
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
           [:td "76"]]]))

(def the-wiggle
  (chart 58 3 "Grade 3" "/charts/the-wiggle" "The Wiggle" "/composers/josh-grossman"
         "Josh Grossman" "$60.00" "rock" "/audio/the-wiggle.mp3"
         "/previews/the-wiggle.preview.pdf" "%20%22The%20Wiggle%22.%0D%0A"
         "%20%22The%20Wiggle%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Josh Says: \"The Wiggle is a straightforward funk chart that features many of the rhythms and feels students will discover as they play more in the genre.  Electric bass and keyboards (fender rhodes if you've got it) establish the groove off the top - make sure it's together and swing the 16th notes ever so slightly.\""]
          [:p "Other Features:"]
          [:ul
           [:li "1 chord solo sections"]
           [:li "Drum solo"]
           [:li "Simple introduction to swung 16ths"]]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Funk"]
           [:td
            [:a {:href "/composers/josh-grossman"} "Josh Grossman"]]
           [:td "4:30"]
           [:td "4/4"]
           [:td "100"]]]))

(def the-test
  (chart 69 3 "Grade 3" "/charts/the-test" "The Test" "/composers/christian-overton"
         "Christian Overton" "$60.00" "other" "/audio/the-test.mp3"
         "/previews/the-test.preview.pdf" "%20%22The%20Test%22.%0D%0A"
         "%20%22The%20Test%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“The Test” is an exciting African inspired tune in 12/8 time that’s both challenging yet accessible. It features an agile melody for the saxophones and a modal solo section with improvising on a single scale. It also features a drum solo section and some simple bass improvising off the top. This was recorded by the University of Toronto 10 o'clock Jazz Orchestra."]
          [:p "Other Features:"]
          [:ul
           [:li "Good introduction to 12/8"]
           [:li "Afro Cuban feel"]
           [:li "Sectional playing"]]]
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
           [:td "120"]]]))

(def el-castor-loco
  (chart 70 3 "Grade 3" "/charts/el-castor-loco" "El Castor Loco" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$60.00" "latin" "/audio/el-castor-loco.mp3"
         "/previews/el-castor-loco.preview.pdf" "%20%22El%20Castor%20Loco%22.%0D%0A"
         "%20%22El%20Castor%20Loco%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"El Castor Loco\" is a fantastic take on New York Salsa. It's got all the syncopated rhythmic fun you'd expect from a pro chart made accessible to young bands. The slippery sax soli is a perfect showcase for your section and the drums solo with full band shots will be the highlight of your set. It features solos for any horn and drums, as well as a fully notated piano intro montuno section."]]
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
           [:td "180"]]]))

(def the-phantom
  (chart 77 3 "Grade 3" "/charts/the-phantom" "The Phantom" "/composers/jason-logue"
         "Jason Logue" "$60.00" "swing" "/audio/the-phantom.mp3"
         "/previews/the-phantom.preview.pdf" "%20%22The%20Phantom%22.%0D%0A"
         "%20%22The%20Phantom%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This great tune is by Toronto trumpet player and composer Jason Logue. It’s a swinging chart that’s very much a throwback to the classic Blue Note era of the 50s and 60s . The catchy melody is dripping with style written for trumpets and tenor saxes."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Swing"]
           [:td [:a {:href "/composers/jason-logue"} "Jason Logue"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "140"]]]))

(def don-carlos-dream
  (chart 83 3 "Grade 3" "/charts/don-carlos-dream" "Don Carlos' Dream" "/composers/ewan-divitt"
         "Ewan Divitt" "$60.00" "other" "/audio/don-carlos-dream.mp3"
         "/previews/don-carlos-dream.preview.pdf" "%20%22Don%20Carlos'%20Dream%22.%0D%0A"
         "%20%22Don%20Carlos'%20Dream%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Don Carlos' Dream is an intense Flamenco piece in 6/8 time. It features tight chord voicings to bring out the intensity of the piece, as well as an ostinato bass-line to anchor the ensemble.The drums can use a multitude of rimshots, castanets, and cymbals to create the feeling of dancing in the mountains of Andalusia, Spain. The piece features the melody and a solo for the baritone sax, as well as a solo for the piano. During the piano solo, the horn players clap a Flamenco pattern to simulate the rhythms of the castanets, and the stamping of Flamenco dancers.!"]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "6/8"]
           [:td [:a {:href "/composers/ewan-divitt"} "Ewan Divitt"]]
           [:td "6:00"]
           [:td "6/8"]
           [:td "172"]]]))

(def hamunaptra
  (chart 85 3 "Grade 3" "/charts/hamunaptra" "Hamunaptra" "/composers/christian-overton"
         "Christian Overton" "$60.00" "rock" "/audio/hamunaptra.mp3"
         "/previews/hamunaptra.preview.pdf" "%20%22Hamunaptra%22.%0D%0A"
         "%20%22Hamunaptra%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Hamunaptra” is a spooky minor rock tune named after the fictional Egyptian city also known as the city of the dead.  The tune goes from a half X feel to a driving four feel in the bridge building back up to launch back into the main feel. The sax section and trumpet section are featured throughout with room for improvising for any horn and later on for piano. This one is sure to be a hit with students and audience members alike."]]
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
           [:td "180"]]]))

(def introduccion
  (chart 94 3 "Grade 3" "/charts/introduccion" "Introduccion" "/composers/christian-overton"
         "Christian Overton" "$60.00" "latin" "/audio/introduccion.mp3"
         "/previews/introduccion.preview.pdf" "%20%22Introduccion%22.%0D%0A"
         "%20%22Introduccion%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Introduccion” is a vibrant and energetic salsa tune that features simple version both 4/4 and 6/8 latin rhythms. This is a great way to get your band learning about Jazz inspired Latin America while getting inside the catchy phrases of the melody and backgrounds. Solos are for brass in the 4/4 sections with an nice bluesy developments section featuring alto saxophone later on."]]
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
           [:td "104"]]]))

(def midnight-clear
  (chart 101 3 "Grade 3" "/charts/midnight-clear" "It Came Upon a Midnight Clear" "/composers/christian-overton"
         "Christian Overton" "$60.00" "swing" "/audio/midnight-clear.mp3"
         "/previews/midnight-clear.preview.pdf" "%20%22It%20Came%20Upon%20a%20Midnight%20Clear%22.%0D%0A"
         "%20%22It%20Came%20Upon%20a%20Midnight%20Clear%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This updated arrangement of “It Came Upon A Midnight Clear” is as swinging as the holidays can get and features some some great section work as well as a solo melody for the trumpet. The chord changes underneath the melody sound fresh and fun while the solo section featured easy to play over chords and background parts."]]
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
           [:td "120"]]]))

(def life-race
  (chart 102 3 "Grade 3" "/charts/life-race" "Life Race" "/composers/christian-overton"
         "Christian Overton" "$60.00" "rock" "/audio/life-race.mp3"
         "/previews/life-race.preview.pdf" "%20%22Life%20Race%22.%0D%0A"
         "%20%22Life%20Race%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "“Life Race” is a high energy driving straight 8ths number that’s challenging but manageable for most bands and will be sure to have your group excited to come to rehearsal every week! It features the alto sax and a fun soli section for the whole band. There’s even some clapping for the audience to join in!"]]
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
           [:td "180"]]]))

(def junk
  (chart 103 3 "Grade 3" "/charts/junk" "Junk" "/composers/liam-gallagher"
         "Liam Gallagher" "$60.00" "rock" "/audio/junk.mp3"
         "/previews/junk.preview.pdf" "%20%22Junk%22.%0D%0A"
         "%20%22Junk%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Junk\" Is an accessible Jazz Funk tune with something to do for everyone! It's a nice introduction to cut time reading and has a groove your students will want to keep playing."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Funk"]
           [:td
            [:a {:href "/composers/liam-gallagher"} "Liam Gallagher"]]
           [:td "4:00"]
           [:td "4/4"]
           [:td "160"]]]))

(def la-maquina
  (chart 104 3 "Grade 3" "/charts/la-maquina" "La Maquina" "/composers/greg-crowe"
         "Greg Crowe" "$60.00" "latin" "/audio/la-maquina.mp3"
         "/previews/la-maquina.preview.pdf" "%20%22La%20Maquina%22.%0D%0A"
         "%20%22La%20Maquina%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This Cuban inspired selection is composed with the people and rhythms of the town of La Maquina in mind. It's a great cultural learning opportunity for your students as well as a fun challenge to play! "]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "12/8"]
           [:td [:a {:href "/composers/greg-crowe"} "Greg Crowe"]]
           [:td "4:30"]
           [:td "12/8"]
           [:td "112"]]]))

(def last-resorts
  (chart 105 3 "Grade 3" "/charts/last-resorts" "Last Resorts" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$60.00" "rock" "/audio/last-resorts.mp3"
         "/previews/last-resorts.preview.pdf" "%20%22Last%20Resorts%22.%0D%0A"
         "%20%22Last%20Resorts%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Last Resorts\" aims to capture a feeling of wistfulness and desperation - what happens when you're out of ideas to solve a problem? The whole piece floats between a light and swinging Afro-Cuban feel and a heavier, funky 4/4 groove, and features a trumpet solo over the latter groove, and a drum solo around ensemble shots/pads after an unaccompanied horn soli."]]
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
           [:td "100"]]]))

(def mad-man-mambo
  (chart 106 3 "Grade 3" "/charts/mad-man-mambo" "Mad Man Mambo" "/composers/jason-logue"
         "Jason Logue" "$60.00" "latin" "/audio/mad-man-mambo.mp3"
         "/previews/mad-man-mambo.preview.pdf" "%20%22Mad%20Man%20Mambo%22.%0D%0A"
         "%20%22Mad%20Man%20Mambo%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This latin tune from Jason Logue is a fantastic party tune for the end of the set! It features lots of fun rhythms across the band and of course the drums. A guaranteed crowd pleaser."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Latin"]
           [:td [:a {:href "/composers/jason-logue"} "Jason Logue"]]
           [:td "3:00"]
           [:td "4/4"]
           [:td "200"]]]))

(def two-dave-k
  (chart 16 4 "Grade 4" "/charts/2-dave-k" "2 Dave K" "/composers/christian-overton"
         "Christian Overton" "$70.00" "swing" "/audio/2-dave-k.mp3"
         "/previews/2-dave-k.preview.pdf" "%20%222%20Dave%20K%22.%0D%0A"
         "%20%222%20Dave%20K%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"2 Dave K\" was inspired by the modern Jazz sounds out of New York and pianist Dave Kikoski. This burning Jazz tune is the first track off the \"Composer's Collective Big Band\" self titled record and features piano, trombone, and trumpet along with an athletic sax soli in the middle. This challenging tune is great for a year long project and would be a great selection for competition repertoire."]]
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
           [:td "220"]]]))

(def a-kingdoms-last-hope
  (chart 17 4 "Grade 4" "/charts/a-kingdoms-last-hope" "A Kingdom's Last Hope" "/composers/christian-overton"
         "Christian Overton" "$70.00" "other" "/audio/a-kingdoms-last-hope.mp3"
         "/previews/a-kingdoms-last-hope.preview.pdf" "%20%22A%20Kingdom's%20Last%20Hope%22.%0D%0A"
         "%20%22A%20Kingdom's%20Last%20Hope%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"A Kingdom’s Last Hope\" a story telling tune. The first section is the pleading villagers, followed by a gallant hero called to action, and then to monster section and eventual heroic victory. See if you can hear the imagery. This track was featured on the \"Composer's Collective Big Band\" self titled record. It features the saxophone section doubling on clarinet and flute. Also featured are some evil plunger trombones and a Brass fanfare finale."]
          [:p "Other features:"]
          [:ul
           [:li
            "Sax section is: Soprano/flute, Alto/flute, 2 Tenor/clarinets, Bari/Bass Clarinet"]
           [:li "There is no Guitar part"]]]
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
           [:td "120"]]]))

(def ten-41-am
  (chart 18 4 "Grade 4" "/charts/10-41-am" "10:41AM" "/composers/christian-overton"
         "Christian Overton" "$70.00" "swing" "/audio/10-41-am.mp3"
         "/previews/10-41-am.preview.pdf" "%20%2210%3A41AM%22.%0D%0A"
         "%20%2210%3A41AM%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"10:41AM\" is a melodic modern Jazz tune emulating the style of the great Kenny Wheeler. The dreamy changes and twin melodies make for a romantic, searching type of feel. It features the trombone and tenor sax on the main melody and in the improvising section. It also has some space for the drums at the end. This chart is a good opportunity to teach your students about a broken Jazz 2 feel and how it’s different than a 4 feel or from a 2 feel in the early days of Jazz."]]
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
           [:td "180"]]]))

(def wood-and-shadow
  (chart 19 4 "Grade 4" "/charts/wood-and-shadow" "Wood & Shadow" "/composers/christian-overton"
         "Christian Overton" "$70.00" "ballad" "/audio/wood-and-shadow.mp3"
         "/previews/wood-and-shadow.preview.pdf" "%20%22Wood%20%26%20Shadow%22.%0D%0A"
         "%20%22Wood%20%26%20Shadow%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Wood & Shadow\" is a spooky selection as recorded by the \"Composer's Collective Big Band\" on their self titled release. This tune is a feature vehicle for the soprano saxophone, and also features the melody played by Bass Clarinet, Bass and Bass trombone creating a unique sound. It’s a nice change from the standard big band repertoire and will be a good work out for your woodwind section if they are saxophone players looking to double."]
          [:p "Other features:"]
          [:ul
           [:li
            "Woodwinds are: Soprano Sax, Flute, 2 Clarinets, Bass Clarinet"]]]
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
           [:td "88"]]]))

(def electros-next-plot
  (chart 20 4 "Grade 4" "/charts/electros-next-plot" "Electro's Next Plot " "/composers/christian-overton"
         "Christian Overton" "$70.00" "swing" "/audio/electros-next-plot.mp3"
         "/previews/electros-next-plot.preview.pdf" "%20%22Electro's%20Next%20Plot%20%22.%0D%0A"
         "%20%22Electro's%20Next%20Plot%20%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Electro’s Next Plot\" is a fun romp through the comic book cartoon genre. It switches between a blistering minor blues and a slow and dirty shuffle. This tune features the guitar and Baritone Sax and also has some great section playing for the saxophones. This one is great for bringing down the house at the end of your set."]]
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
           [:td "60"]]]))

(def chazz
  (chart 21 4 "Grade 4" "/charts/chazz" "Chazz" "/composers/josh-grossman"
         "Josh Grossman" "$70.00" "latin" "/audio/chazz.mp3"
         "/previews/chazz.preview.pdf" "%20%22Chazz%22.%0D%0A"
         "%20%22Chazz%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Josh says: \"This tune, written in honour of my nephew, Chazz, features solo flugel horn, alto sax and guitar, and starts in a comfortablesamba groove.  A medium tempo and relatively straightforward lines should make it accessible to senior high school ensembles.\""]
          [:p "Other features:"]
          [:ul
           [:li "4 trumpet parts, and separate Solo Flugelhorn part"]
           [:li "Sax section is Soprano, Alto, 2 Tenors,  Bari Sax"]]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Latin"]
           [:td
            [:a {:href "/composers/josh-grossman"} "Josh Grossman"]]
           [:td "8:00"]
           [:td "4/4"]
           [:td "100"]]]))

(def amazing-grace
  (chart 22 4 "Grade 4" "/charts/amazing-grace" "Amazing Grace" "/composers/josh-grossman"
         "Josh Grossman" "$70.00" "swing" "/audio/amazing-grace.mp3"
         "/previews/amazing-grace.preview.pdf" "%20%22Amazing%20Grace%22.%0D%0A"
         "%20%22Amazing%20Grace%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This arrangement of the popular spiritual is an excellent showcase for solo alto saxophone.  The straightforward chord progression and simple melody allow ample opportunity for experimentation and improvisation. Reasonable ranges and lots of resting time means this piece should be accessible to a variety of bands."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Gospel"]
           [:td
            [:a {:href "/composers/josh-grossman"} "Josh Grossman"]]
           [:td "7:00"]
           [:td "4/4"]
           [:td "84"]]]))

(def the-path
  (chart 23 4 "Grade 4" "/charts/the-path" "The Path" "/composers/josh-grossman"
         "Josh Grossman" "$70.00" "rock" "/audio/the-path.mp3"
         "/previews/the-path.preview.pdf" "%20%22The%20Path%22.%0D%0A"
         "%20%22The%20Path%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This original composition takes the band through a variety of grooves. Some tricky rhythm section and horn lines, and the feel requires a more mature band; a strong lead trumpet is also required."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Gospel/Funk"]
           [:td
            [:a {:href "/composers/josh-grossman"} "Josh Grossman"]]
           [:td "6:30"]
           [:td "4/4"]
           [:td "90"]]]))

(def the-phone-dont-ring-jack
  (chart 25 4 "Grade 4" "/charts/the-phone-dont-ring-jack" "The Phone Don't Ring Jack" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$70.00" "swing" "/audio/the-phone-dont-ring-jack.mp3"
         "/previews/the-phone-dont-ring-jack.preview.pdf" "%20%22The%20Phone%20Don't%20Ring%20Jack%22.%0D%0A"
         "%20%22The%20Phone%20Don't%20Ring%20Jack%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Andy says: \"This composition is a loving homage to the great Canadian trombonist/arranger/composer Ron Collier. The title is from an impassioned speech Ron once gave to a first-year jazz ensemble at Humber college warning of what their fate would be in the music business if they didn’t practice and get their “stuff” together.  And yes, I was in that ensemble. The Phone Don’t Ring Jack is a feature for trombone, with a trumpet solo on the double-time section. The trumpet solo could just as effectively be taken by one of the saxophones in the band. The difficulty level is advanced, with a challenging lead trumpet part (up to Eb) and fairly complex rhythms.\""]]
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
           [:td "72"]]]))

(def first-x-free
  (chart 26 4 "Grade 4" "/charts/first-x-free" "First X Free" "/composers/chris-hunt"
         "Chris Hunt" "$70.00" "rock" "/audio/first-x-free.mp3"
         "/previews/first-x-free.preview.pdf" "%20%22First%20X%20Free%22.%0D%0A"
         "%20%22First%20X%20Free%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"First X’s Free\" goes from a mysterious driving straight 8th's feel to a groovy half time funk feel. It’s a high energy tune that will keep your band wanting to play week after week. It features the Soprano Saxophone and the Trombone. It also features some muted work by the brass and a chance to let your rhythm section let loose!"]
          [:p "Other Features:"]
          [:ul
           [:li
            "Woodwind section is Soprano, Alto 2 Tenors and Bari"]]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Straight 8ths"]
           [:td [:a {:href "/composers/chris-hunt"} "Chris Hunt"]]
           [:td "8:00"]
           [:td "4/4"]
           [:td "160"]]]))

(def funk-out
  (chart 38 4 "Grade 4" "/charts/funk-out" "Funk Out" "/composers/michael-kundakcioglu"
         "Michael Kundakcioglu" "$70.00" "rock" "/audio/funk-out.mp3"
         "/previews/funk-out.preview.pdf" "%20%22Funk%20Out%22.%0D%0A"
         "%20%22Funk%20Out%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Michael says: \"Funk Out is fun tune based on the early funk sounds of the 1960’s and ‘70’s. It features the lead alto sax in the rubato ballad opening section and gives the lead alto the opportunity to improvise over the chord changes at letter D. Check out the challenging syncopated sections which feature the horns trading rhythms reminiscent of Tower of Power.\""]
          [:p "Other features:"]
          [:ul
           [:li "Lead trumpet to high D"]
           [:li "Alto sax feature"]
           [:li "Challenging horn sectional parts"]]]
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
           [:td "120"]]]))

(def vista
  (chart 41 4 "Grade 4" "/charts/vista" "Vista" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$70.00" "other" "/audio/vista.mp3"
         "/previews/vista.preview.pdf" "%20%22Vista%22.%0D%0A"
         "%20%22Vista%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Andy says: \"I wrote most of 'Vista' while on a summer vacation with my family near Banff Alberta, and I'm sure the breath-taking mountain scenery had an affect on the outcome.  Overall I was going for a feeling of space or openness with this composition.  The 6/8 feel with eighth notes grouped in two's is obviously African-influenced, and was in fact inspired by a piece from Mauritius that I happened to hear on the radio.\""]
          [:p "Other Features:"]
          [:ul
           [:li [:p "Solo space for baritone sax and drums"]]
           [:li [:p "6/8 feel and 3/4 feel"]]]]
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
           [:td "86"]]]))

(def the-fifth-beatle
  (chart 57 4 "Grade 4" "/charts/the-fifth-beatle" "The Fifth Beatle" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$70.00" "other" "/audio/the-fifth-beatle.mp3"
         "/previews/the-fifth-beatle.preview.pdf" "%20%22The%20Fifth%20Beatle%22.%0D%0A"
         "%20%22The%20Fifth%20Beatle%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Andy Says: This is my homage to legendary producer George Martin, who is often referred to as \"the fifth Beatle\" because of his impact on the classic recordings of the Fab Four.  It's basically a pop tune with a few surprises, most notably the 7/4 time signature.  There are also some polytonal chords inspired by the tape-looping on \"Sgt Pepper's Lonely Hearts Club Band\".   Elements of Beatles melodies and George Martin's instrumental arrangements crop up throughout."]
          [:p "Other Features:"]
          [:ul [:li "7/4 time signature"] [:li "Mutes for brass"]]]
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
           [:td "120"]]]))

(def this-buts-for-you
  (chart 62 4 "Grade 4" "/charts/this-buts-for-you" "This But's for You!" "/composers/terry-promane"
         "Terry Promane" "$70.00" "swing" "/audio/this-buts-for-you.mp3"
         "/previews/this-buts-for-you.preview.pdf" "%20%22This%20But's%20for%20You!%22.%0D%0A"
         "%20%22This%20But's%20for%20You!%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This But's For You is a great reharm by legendary Canadian vetran Terry Promane. This tune is a great project for an advanced group to really sink their teeth into and get some fantastic results."]
          [:p "Other Features:"]
          [:ul
           [:li "Solo written for trumpet"]
           [:li "Great sectional passages"]
           [:li "Horns only devlopment section"]]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Swing"]
           [:td
            [:a {:href "/composers/terry-promane"} "Terry Promane"]]
           [:td "7:00"]
           [:td "4/4"]
           [:td "160"]]]))

(def surface-tension
  (chart 63 4 "Grade 4" "/charts/surface-tension" "Surface Tension" "/composers/jim-lewis"
         "Jim Lewis" "$70.00" "swing" "/audio/surface-tension.mp3"
         "/previews/surface-tension.preview.pdf" "%20%22Surface%20Tension%22.%0D%0A"
         "%20%22Surface%20Tension%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Surface Tension\" is an original by long time educator and trumpet player Jim Lewis. This tune is a great way to introduce your band to modern professional level big band matrerial at a tempo you can handle."]
          [:p "Other Features:"]
          [:ul
           [:li "Solos for piano and tenor sax"]
           [:li "A lot of independent playing"]]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Swing"]
           [:td [:a {:href "/composers/jim-lewis"} "Jim Lewis"]]
           [:td "6:00"]
           [:td "4/4"]
           [:td "160"]]]))

(def santiago-nights
  (chart 80 4 "Grade 4" "/charts/santiago-nights" "Santiago Nights" "/composers/jason-logue"
         "Jason Logue" "$70.00" "latin" "/audio/santiago-nights.mp3"
         "/previews/santiago-nights.preview.pdf" "%20%22Santiago%20Nights%22.%0D%0A"
         "%20%22Santiago%20Nights%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This is another Jason Logue. It’s a driving rock tune harmonically inspired by the Miles Davis classic So What. The melodies and solis slither through some tasty harmonic ideas and is balanced by being rhythmically simple. It features solos for any sax and any brass player and the improvisation is only over two chords so it’s great for any level of soloist."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Latin Rock"]
           [:td [:a {:href "/composers/jason-logue"} "Jason Logue"]]
           [:td "6:00"]
           [:td "4/4"]
           [:td "160"]]]))

(def epitaph
  (chart 81 4 "Grade 4" "/charts/epitaph" "Epitaph" "/composers/andy-ballantyne"
         "Andy Ballantyne" "$70.00" "ballad" "/audio/epitaph.mp3"
         "/previews/epitaph.preview.pdf" "%20%22Epitaph%22.%0D%0A"
         "%20%22Epitaph%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Epitaph is a reflective modern composition dedicated to a remarkable young musician who sadly left us too soon. The simple expressive melody is contrasted with a dense pan-diatonic harmonic pallet. While the technical demands are not extreme, this piece offers many challenges in terms of blend and rhythmic complexity. In addition to a strong tenor saxophone soloist with good harmonic knowledge, the rhythm section must be confident and sensitive to the soloist throughout. "]]
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
           [:td "90"]]]))

(def song-for-l
  (chart 91 4 "Grade 4" "/charts/song-for-l" "Song For L" "/composers/brad-cheeseman"
         "Brad Cheeseman" "$70.00" "swing" "/audio/song-for-l.mp3"
         "/previews/song-for-l.preview.pdf" "%20%22Song%20For%20L%22.%0D%0A"
         "%20%22Song%20For%20L%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Song for L\" is a highly dynamic composition with a large dramatic arc. I wrote this piece to commemorate the accomplishments of a close family member. The melody begins as an exposed trombone feature, with minimal rhythm section support and builds to a triumphant conclusion highlighting the entire ensemble. There is an extended trumpet solo over a set of chord changes that weave in and out of the Eb / C minor tonality."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Jazz Waltz"]
           [:td
            [:a {:href "/composers/brad-cheeseman"} "Brad Cheeseman"]]
           [:td "4:30"]
           [:td "3/4"]
           [:td "192"]]]))

(def state-of-mind
  (chart 96 4 "Grade 4" "/charts/state-of-mind" "State of Mind" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "ballad" "/audio/state-of-mind.mp3"
         "/previews/state-of-mind.preview.pdf" "%20%22State%20of%20Mind%22.%0D%0A"
         "%20%22State%20of%20Mind%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"State of Mind\" depicts the pause being taken at the fork in the road, as one faces a tough life-changing decision, and does not use the guitar, bass, or drums. It is meant to be pretty and hopeful, and even the fastest lines should be fluid in execution."]]
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
           [:td "80"]]]))

(def state-of-mind-reprise
  (chart 97 4 "Grade 4" "/charts/state-of-mind-reprise" "State of Mind Reprise" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "ballad" "/audio/state-of-mind-reprise.mp3"
         "/previews/state-of-mind-reprise.preview.pdf" "%20%22State%20of%20Mind%20Reprise%22.%0D%0A"
         "%20%22State%20of%20Mind%20Reprise%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"State of Mind (reprise)\" is the counterpart to \"State of Mind\" and also does not use guitar, bass or drums. The life-changing decision has now been made, and this is the point where one moves on with their life - hence the uplifting resolution at the end of the piece."]]
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
           [:td "80"]]]))

(def river
  (chart 98 4 "Grade 4" "/charts/river" "River" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/river.mp3"
         "/previews/river.preview.pdf" "%20%22River%22.%0D%0A"
         "%20%22River%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"River\" is about reflecting on one's troubles in the midst of the peace, calm, and strength of the eponymous river. The phrases\nhere should be smoothly articulated throughout, and the brass should be regal sounding wherever possible."]]
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
           [:td "160"]]]))

(def julia
  (chart 99 4 "Grade 4" "/charts/julia" "Julia" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/julia.mp3"
         "/previews/julia.preview.pdf" "%20%22Julia%22.%0D%0A"
         "%20%22Julia%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Julia\" is inspired by a long-lost friend, someone who was incredibly important at one point and then just fell off the map. This piece features lush ensemble passages, a challenging soprano sax feature, and a modulation into and out of double-time."]]
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
           [:td "120"]]]))

(def thinking-in-circles
  (chart 100 4 "Grade 4" "/charts/thinking-in-circles" "Thinking In Circles" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/thinking-in-circles.mp3"
         "/previews/thinking-in-circles.preview.pdf" "%20%22Thinking%20In%20Circles%22.%0D%0A"
         "%20%22Thinking%20In%20Circles%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Thinking In Circles\" is about negative thought spirals and inner conflict. This features an extended section without the drums and a slow-down/speed-up much like a wind-up toy."]]
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
           [:td "132"]]]))

(def ambleside
  (chart 109 4 "Grade 4" "/charts/ambleside" "Ambleside" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "ballad" "/audio/ambleside.mp3"
         "/previews/ambleside.preview.pdf" "%20%22Ambleside%22.%0D%0A"
         "%20%22Ambleside%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "\"Ambleside\" embodies the peace and stillness of a quiet afternoon near the Guardian at Ambleside Park in West Vancouver...but an Ambleside surrounded by orange clouds and purple skies - closer to a Jovian moon. "]]
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
           [:td "75"]]]))

(def intransitory
  (chart 110 4 "Grade 4" "/charts/intransitory" "Intransitory" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/intransitory.mp3"
         "/previews/intransitory.preview.pdf" "%20%22Intransitory%22.%0D%0A"
         "%20%22Intransitory%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Inspired by a day of terrible commuting, \"Intransitory\" embodies all of the feelings of being a long-distance commuter - constantly in motion, often exhausted."]]
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
           [:td "177"]]]))

(def twilight-fall
  (chart 111 4 "Grade 4" "/charts/twilight-fall" "The Twilight Fall" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/twilight-fall.mp3"
         "/previews/twilight-fall.preview.pdf" "%20%22The%20Twilight%20Fall%22.%0D%0A"
         "%20%22The%20Twilight%20Fall%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Picture your six-year-old self, in onesie pajamas (or whatever you wore when you were six), falling through a purple sky with orange clouds. Until you land, in a carnival – broken, tilted Ferris wheel on one side, dusty, abandoned carousel, chipped paint, fading, on the other. You see the gates open, and the buttons for the carousel are exposed in front of you, so you approach, teddy bear in one hand, the other outstretched to turn on the machine – when grey, translucent spirits, begin to swirl around your head."]]
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
           [:td "65"]]]))

(def smooth
  (chart 112 4 "Grade 4" "/charts/smooth" "Smooth" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/smooth.mp3"
         "/previews/smooth.preview.pdf" "%20%22Smooth%22.%0D%0A"
         "%20%22Smooth%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "After the worst day of your life, you end up running into the person you least wanted to see...and try to impress them into coming back into your life. It's not as excellent a start as you were hoping, to say the least"]]
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
           [:td "72"]]]))

(def spirits
  (chart 113 4 "Grade 4" "/charts/spirits" "Spirits" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/spirits.mp3"
         "/previews/spirits.preview.pdf" "%20%22Spirits%22.%0D%0A"
         "%20%22Spirits%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "A follow up to \"Smooth\", this piece begins as a Broadway style playoff and takes a moody turn into the dark side of your mind, coming to an unsteady resolution as your walk takes you home and into bed."]]
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
           [:td "70"]]]))

(def arrival-of-the-pegasus
  (chart 114 4 "Grade 4" "/charts/arrival-of-the-pegasus" "Arrival of the Pegasus" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/arrival-of-the-pegasus.mp3"
         "/previews/arrival-of-the-pegasus.preview.pdf" "%20%22Arrival%20of%20the%20Pegasus%22.%0D%0A"
         "%20%22Arrival%20of%20the%20Pegasus%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Based on the Six Theme from Battlestar: Galactica, and the plot from season 3, episode 4 of that show, this piece envisions an epic battle in space, from start to finish."]]
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
           [:td "175"]]]))

(def foot-in-mouth
  (chart 115 4 "Grade 4" "/charts/foot-in-mouth" "Foot in Mouth" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/foot-in-mouth.mp3"
         "/previews/foot-in-mouth.preview.pdf" "%20%22Foot%20in%20Mouth%22.%0D%0A"
         "%20%22Foot%20in%20Mouth%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "Imagine yourself 30 years older than you are, with friends you've known for decades, gossiping around a campfire or a dinner table. When you look back on your experiences, will you be proud of them? Or will you think of yourselves as foolish?"]]
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
           [:td "70"]]]))

(def in-dreams
  (chart 116 4 "Grade 4" "/charts/in-dreams" "In Dreams" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "ballad" "/audio/in-dreams.mp3"
         "/previews/in-dreams.preview.pdf" "%20%22In%20Dreams%22.%0D%0A"
         "%20%22In%20Dreams%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "You are asleep, in a dimension that does not belong to you, and your faithful friend and guide has led you to the end of the road. It's time for you to wake up and return home, but first, you get a chance to say goodbye."]]
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
           [:td "80"]]]))

(def ambleside-reprise
  (chart 117 4 "Grade 4" "/charts/ambleside-reprise" "Ambleside (Reprise)" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "ballad" "/audio/ambleside-reprise.mp3"
         "/previews/ambleside-reprise.preview.pdf" "%20%22Ambleside%20(Reprise)%22.%0D%0A"
         "%20%22Ambleside%20(Reprise)%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "s the partner to \"Ambleside\", this reprise should be brighter and more resolute, and can move a little more quickly in tempo. This is the denouement of the story; the listener should feel like they've been on a long journey with a successful conclusion."]]
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
           [:td "75"]]]))

(def something-simple
  (chart 118 4 "Grade 4" "/charts/something-simple" "Something Simple" "/composers/chelsea-mcbride"
         "Chelsea McBride" "$70.00" "rock" "/audio/something-simple.mp3"
         "/previews/something-simple.preview.pdf" "%20%22Something%20Simple%22.%0D%0A"
         "%20%22Something%20Simple%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This is a celebratory piece - about all things that are good about love, and friends, and a solid groove. \"Something Simple\" was written to close a concert on my 21st birthday, and we've used it to close every show since."]]
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
           [:td "185"]]]))

(def a-cool-breeze
  (chart 119 4 "Grade 4" "/charts/a-cool-breeze" "A Cool Breeze" "/composers/terry-promane"
         "Terry Promane" "$70.00" "rock" "/audio/a-cool-breeze.mp3"
         "/previews/a-cool-breeze.preview.pdf" "%20%22A%20Cool%20Breeze%22.%0D%0A"
         "%20%22A%20Cool%20Breeze%22.%0D%0A%0D%0A"
         [:div.notes
          [:p
           "This jazz fusion inspired tune has a great mood and feel that your students will grab onto. A great reward for mature sounding bands! It features the trumpet and soprano sax."]]
         [:tbody
          [:tr
           [:td "Jazz Band"]
           [:td "Rock"]
           [:td
            [:a {:href "/composers/terry-promane"} "Terry Promane"]]
           [:td "5:30"]
           [:td "4/4"]
           [:td "100"]]]))
