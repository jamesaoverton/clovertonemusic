(ns clovertonemusic.charts-pages)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs])

(def html-charts
  {"10-41-am" {:title "10:41AM - Clovertone Music"
               :contents [:div#18.chart.grade4 (:head chart-divs/ten-41-am) (:body chart-divs/ten-41-am) (:details chart-divs/ten-41-am)]
               :charts [:div#charts]
               :users [:div#users]}
   "2-dave-k" {:title "2 Dave K - Clovertone Music"
               :contents [:div#16.chart.grade4 (:head chart-divs/two-dave-k) (:body chart-divs/two-dave-k) (:details chart-divs/two-dave-k)]
               :charts [:div#charts]
               :users [:div#users]}
   "a-cool-breeze" {:title "A Cool Breeze - Clovertone Music"
                    :contents [:div#119.chart.grade4 (:head chart-divs/a-cool-breeze) (:body chart-divs/a-cool-breeze) (:details chart-divs/a-cool-breeze)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "a-kingdoms-last-hope" {:title "A Kingdom's Last Hope - Clovertone Music"
                           :contents [:div#17.chart.grade4 (:head chart-divs/a-kingdoms-last-hope) (:body chart-divs/a-kingdoms-last-hope) (:details chart-divs/a-kingdoms-last-hope)]
                           :charts [:div#charts]
                           :users [:div#users]}
   "a-kingdoms-last-hope-jr" {:title "A Kingdom's Last Hope Jr. - Clovertone Music"
                              :contents [:div#31.chart.grade2 (:head chart-divs/a-kingdoms-last-hope-jr) (:body chart-divs/a-kingdoms-last-hope-jr) (:details chart-divs/a-kingdoms-last-hope-jr)]
                              :charts [:div#charts]
                              :users [:div#users]}
   "all-your-base" {:title "All Your Base - Clovertone Music"
                    :contents [:div#35.chart.grade1 (:head chart-divs/all-your-base) (:body chart-divs/all-your-base) (:details chart-divs/all-your-base)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "a-long-kept-secret" {:title "A Long Kept Secret - Clovertone Music"
                         :contents [:div#64.chart.grade2 (:head chart-divs/a-long-kept-secret) (:body chart-divs/a-long-kept-secret) (:details chart-divs/a-long-kept-secret)]
                         :charts [:div#charts]
                         :users [:div#users]}
   "amazing-grace" {:title "Amazing Grace - Clovertone Music"
                    :contents [:div#22.chart.grade4 (:head chart-divs/amazing-grace) (:body chart-divs/amazing-grace) (:details chart-divs/amazing-grace)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "ambleside" {:title "Ambleside - Clovertone Music"
                :contents [:div#109.chart.grade4 (:head chart-divs/ambleside) (:body chart-divs/ambleside) (:details chart-divs/ambleside)]
                :charts [:div#charts]
                :users [:div#users]}
   "ambleside-reprise" {:title "Ambleside (Reprise) - Clovertone Music"
                        :contents [:div#117.chart.grade4 (:head chart-divs/ambleside-reprise) (:body chart-divs/ambleside-reprise) (:details chart-divs/ambleside-reprise)]
                        :charts [:div#charts]
                        :users [:div#users]}
   "arcadian-autumn" {:title "Arcadian Autumn - Clovertone Music"
                      :contents [:div#34.chart.grade3 (:head chart-divs/arcadian-autumn) (:body chart-divs/arcadian-autumn) (:details chart-divs/arcadian-autumn)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "arrival-of-the-pegasus" {:title "Arrival of the Pegasus - Clovertone Music"
                             :contents [:div#114.chart.grade4 (:head chart-divs/arrival-of-the-pegasus) (:body chart-divs/arrival-of-the-pegasus) (:details chart-divs/arrival-of-the-pegasus)]
                             :charts [:div#charts]
                             :users [:div#users]}
   "atlantic-crossing" {:title "Atlantic Crossing - Clovertone Music"
                        :contents [:div#10.chart.grade2 (:head chart-divs/atlantic-crossing) (:body chart-divs/atlantic-crossing) (:details chart-divs/atlantic-crossing)]
                        :charts [:div#charts]
                        :users [:div#users]}
   "at-long-last" {:title "At Long Last - Clovertone Music"
                   :contents [:div#27.chart.grade1 (:head chart-divs/at-long-last) (:body chart-divs/at-long-last) (:details chart-divs/at-long-last)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "blue-heron" {:title "Blue Heron - Clovertone Music"
                 :contents [:div#84.chart.grade1 (:head chart-divs/blue-heron) (:body chart-divs/blue-heron) (:details chart-divs/blue-heron)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "branta" {:title "Branta - Clovertone Music"
             :contents [:div#78.chart.grade1 (:head chart-divs/branta) (:body chart-divs/branta) (:details chart-divs/branta)]
             :charts [:div#charts]
             :users [:div#users]}
   "brown-and-tan" {:title "Brown and Tan - Clovertone Music"
                    :contents [:div#88.chart.grade2 (:head chart-divs/brown-and-tan) (:body chart-divs/brown-and-tan) (:details chart-divs/brown-and-tan)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "canal-street-walk" {:title "Canal Street Walk - Clovertone Music"
                        :contents [:div#48.chart.grade3 (:head chart-divs/canal-street-walk) (:body chart-divs/canal-street-walk) (:details chart-divs/canal-street-walk)]
                        :charts [:div#charts]
                        :users [:div#users]}
   "chazz" {:title "Chazz - Clovertone Music"
            :contents [:div#21.chart.grade4 (:head chart-divs/chazz) (:body chart-divs/chazz) (:details chart-divs/chazz)]
            :charts [:div#charts]
            :users [:div#users]}
   "cloud-song" {:title "Cloud Song - Clovertone Music"
                 :contents [:div#49.chart.grade2 (:head chart-divs/cloud-song) (:body chart-divs/cloud-song) (:details chart-divs/cloud-song)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "cowboy-countdown" {:title "Cowboy Countdown - Clovertone Music"
                       :contents [:div#65.chart.grade1 (:head chart-divs/cowboy-countdown) (:body chart-divs/cowboy-countdown) (:details chart-divs/cowboy-countdown)]
                       :charts [:div#charts]
                       :users [:div#users]}
   "crusin-at-30000" {:title "Crusin' at 30000 - Clovertone Music"
                      :contents [:div#66.chart.grade2 (:head chart-divs/crusin-at-30000) (:body chart-divs/crusin-at-30000) (:details chart-divs/crusin-at-30000)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "dark-matter" {:title "Dark Matter - Clovertone Music"
                  :contents [:div#56.chart.grade3 (:head chart-divs/dark-matter) (:body chart-divs/dark-matter) (:details chart-divs/dark-matter)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "detective-story" {:title "Detective Story - Clovertone Music"
                      :contents [:div#7.chart.grade2 (:head chart-divs/detective-story) (:body chart-divs/detective-story) (:details chart-divs/detective-story)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "don-carlos-dream" {:title "Don Carlos' Dream - Clovertone Music"
                       :contents [:div#83.chart.grade3 (:head chart-divs/don-carlos-dream) (:body chart-divs/don-carlos-dream) (:details chart-divs/don-carlos-dream)]
                       :charts [:div#charts]
                       :users [:div#users]}
   "el-castor-loco" {:title "El Castor Loco - Clovertone Music"
                     :contents [:div#70.chart.grade3 (:head chart-divs/el-castor-loco) (:body chart-divs/el-castor-loco) (:details chart-divs/el-castor-loco)]
                     :charts [:div#charts]
                     :users [:div#users]}
   "electros-next-plot" {:title "Electro's Next Plot  - Clovertone Music"
                         :contents [:div#20.chart.grade4 (:head chart-divs/electros-next-plot) (:body chart-divs/electros-next-plot) (:details chart-divs/electros-next-plot)]
                         :charts [:div#charts]
                         :users [:div#users]}
   "electros-next-plot-jr" {:title "Electro's Next Plot (Jr.) - Clovertone Music"
                            :contents [:div#15.chart.grade2 (:head chart-divs/electros-next-plot-jr) (:body chart-divs/electros-next-plot-jr) (:details chart-divs/electros-next-plot-jr)]
                            :charts [:div#charts]
                            :users [:div#users]}
   "en-su-camino" {:title "En Su Camino - Clovertone Music"
                   :contents [:div#71.chart.grade2 (:head chart-divs/en-su-camino) (:body chart-divs/en-su-camino) (:details chart-divs/en-su-camino)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "epitaph" {:title "Epitaph - Clovertone Music"
              :contents [:div#81.chart.grade4 (:head chart-divs/epitaph) (:body chart-divs/epitaph) (:details chart-divs/epitaph)]
              :charts [:div#charts]
              :users [:div#users]}
   "femis-flight" {:title "Femi's Flight - Clovertone Music"
                   :contents [:div#51.chart.grade3 (:head chart-divs/femis-flight) (:body chart-divs/femis-flight) (:details chart-divs/femis-flight)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "first-x-free" {:title "First X Free - Clovertone Music"
                   :contents [:div#26.chart.grade4 (:head chart-divs/first-x-free) (:body chart-divs/first-x-free) (:details chart-divs/first-x-free)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "foot-in-mouth" {:title "Foot in Mouth - Clovertone Music"
                    :contents [:div#115.chart.grade4 (:head chart-divs/foot-in-mouth) (:body chart-divs/foot-in-mouth) (:details chart-divs/foot-in-mouth)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "four-more-to-go" {:title "Four More to Go - Clovertone Music"
                      :contents [:div#13.chart.grade3 (:head chart-divs/four-more-to-go) (:body chart-divs/four-more-to-go) (:details chart-divs/four-more-to-go)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "friday-night-special" {:title "Friday Night Special - Clovertone Music"
                           :contents [:div#73.chart.grade2 (:head chart-divs/friday-night-special) (:body chart-divs/friday-night-special) (:details chart-divs/friday-night-special)]
                           :charts [:div#charts]
                           :users [:div#users]}
   "funk-out" {:title "Funk Out - Clovertone Music"
               :contents [:div#38.chart.grade4 (:head chart-divs/funk-out) (:body chart-divs/funk-out) (:details chart-divs/funk-out)]
               :charts [:div#charts]
               :users [:div#users]}
   "game-on" {:title "Game On! - Clovertone Music"
              :contents [:div#11.chart.grade1 (:head chart-divs/game-on) (:body chart-divs/game-on) (:details chart-divs/game-on)]
              :charts [:div#charts]
              :users [:div#users]}
   "gentlemen" {:title "Gentlemen - Clovertone Music"
                :contents [:div#60.chart.grade1 (:head chart-divs/gentlemen) (:body chart-divs/gentlemen) (:details chart-divs/gentlemen)]
                :charts [:div#charts]
                :users [:div#users]}
   "god-rest-ye" {:title "God Rest Ye Merry Gentlemen - Clovertone Music"
                  :contents [:div#74.chart.grade2 (:head chart-divs/god-rest-ye) (:body chart-divs/god-rest-ye) (:details chart-divs/god-rest-ye)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "go-go-blues" {:title "Go Go Blues - Clovertone Music"
                  :contents [:div#68.chart.grade2 (:head chart-divs/go-go-blues) (:body chart-divs/go-go-blues) (:details chart-divs/go-go-blues)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "good-king-w" {:title "Good King Wenceslas - Clovertone Music"
                  :contents [:div#93.chart.grade2 (:head chart-divs/good-king-w) (:body chart-divs/good-king-w) (:details chart-divs/good-king-w)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "hamunaptra" {:title "Hamunaptra - Clovertone Music"
                 :contents [:div#85.chart.grade3 (:head chart-divs/hamunaptra) (:body chart-divs/hamunaptra) (:details chart-divs/hamunaptra)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "hotel-mambo" {:title "Hotel Mambo - Clovertone Music"
                  :contents [:div#29.chart.grade1 (:head chart-divs/hotel-mambo) (:body chart-divs/hotel-mambo) (:details chart-divs/hotel-mambo)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "in-dreams" {:title "In Dreams - Clovertone Music"
                :contents [:div#116.chart.grade4 (:head chart-divs/in-dreams) (:body chart-divs/in-dreams) (:details chart-divs/in-dreams)]
                :charts [:div#charts]
                :users [:div#users]}
   "intransitory" {:title "Intransitory - Clovertone Music"
                   :contents [:div#110.chart.grade4 (:head chart-divs/intransitory) (:body chart-divs/intransitory) (:details chart-divs/intransitory)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "introduccion" {:title "Introduccion - Clovertone Music"
                   :contents [:div#94.chart.grade3 (:head chart-divs/introduccion) (:body chart-divs/introduccion) (:details chart-divs/introduccion)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "joy-to-the-world" {:title "Joy to the World - Clovertone Music"
                       :contents [:div#47.chart.grade3 (:head chart-divs/joy-to-the-world) (:body chart-divs/joy-to-the-world) (:details chart-divs/joy-to-the-world)]
                       :charts [:div#charts]
                       :users [:div#users]}
   "julia" {:title "Julia - Clovertone Music"
            :contents [:div#99.chart.grade4 (:head chart-divs/julia) (:body chart-divs/julia) (:details chart-divs/julia)]
            :charts [:div#charts]
            :users [:div#users]}
   "junk" {:title "Junk - Clovertone Music"
           :contents [:div#103.chart.grade3 (:head chart-divs/junk) (:body chart-divs/junk) (:details chart-divs/junk)]
           :charts [:div#charts]
           :users [:div#users]}
   "la-cattura" {:title "La Cattura Di Salvatore Veloce - Clovertone Music"
                 :contents [:div#61.chart.grade1 (:head chart-divs/la-cattura) (:body chart-divs/la-cattura) (:details chart-divs/la-cattura)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "la-maquina" {:title "La Maquina - Clovertone Music"
                 :contents [:div#104.chart.grade3 (:head chart-divs/la-maquina) (:body chart-divs/la-maquina) (:details chart-divs/la-maquina)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "la-squadra-da-milano" {:title "La Squadra Da Milano - Clovertone Music"
                           :contents [:div#75.chart.grade1 (:head chart-divs/la-squadra-da-milano) (:body chart-divs/la-squadra-da-milano) (:details chart-divs/la-squadra-da-milano)]
                           :charts [:div#charts]
                           :users [:div#users]}
   "last-resorts" {:title "Last Resorts - Clovertone Music"
                   :contents [:div#105.chart.grade3 (:head chart-divs/last-resorts) (:body chart-divs/last-resorts) (:details chart-divs/last-resorts)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "let-me-be" {:title "Let Me Be the Sugar in Your Tea - Clovertone Music"
                :contents [:div#52.chart.grade2 (:head chart-divs/let-me-be) (:body chart-divs/let-me-be) (:details chart-divs/let-me-be)]
                :charts [:div#charts]
                :users [:div#users]}
   "life-race" {:title "Life Race - Clovertone Music"
                :contents [:div#102.chart.grade3 (:head chart-divs/life-race) (:body chart-divs/life-race) (:details chart-divs/life-race)]
                :charts [:div#charts]
                :users [:div#users]}
   "lifted" {:title "Lifted - Clovertone Music"
             :contents [:div#54.chart.grade2 (:head chart-divs/lifted) (:body chart-divs/lifted) (:details chart-divs/lifted)]
             :charts [:div#charts]
             :users [:div#users]}
   "livvy-dear" {:title "Livvy Dear - Clovertone Music"
                 :contents [:div#90.chart.grade2 (:head chart-divs/livvy-dear) (:body chart-divs/livvy-dear) (:details chart-divs/livvy-dear)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "lost-stories" {:title "Lost Stories - Clovertone Music"
                   :contents [:div#55.chart.grade3 (:head chart-divs/lost-stories) (:body chart-divs/lost-stories) (:details chart-divs/lost-stories)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "mad-man-mambo" {:title "Mad Man Mambo - Clovertone Music"
                    :contents [:div#106.chart.grade3 (:head chart-divs/mad-man-mambo) (:body chart-divs/mad-man-mambo) (:details chart-divs/mad-man-mambo)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "midnight-clear" {:title "It Came Upon a Midnight Clear - Clovertone Music"
                     :contents [:div#101.chart.grade3 (:head chart-divs/midnight-clear) (:body chart-divs/midnight-clear) (:details chart-divs/midnight-clear)]
                     :charts [:div#charts]
                     :users [:div#users]}
   "moatfield-shuffle" {:title "Moatfield Shuffle - Clovertone Music"
                        :contents [:div#79.chart.grade1 (:head chart-divs/moatfield-shuffle) (:body chart-divs/moatfield-shuffle) (:details chart-divs/moatfield-shuffle)]
                        :charts [:div#charts]
                        :users [:div#users]}
   "no-trespassing" {:title "No Trespassing - Clovertone Music"
                     :contents [:div#95.chart.grade2 (:head chart-divs/no-trespassing) (:body chart-divs/no-trespassing) (:details chart-divs/no-trespassing)]
                     :charts [:div#charts]
                     :users [:div#users]}
   "o-canada" {:title "O Canada - Clovertone Music"
               :contents [:div#2.chart.grade1 (:head chart-divs/o-canada) (:body chart-divs/o-canada) (:details chart-divs/o-canada)]
               :charts [:div#charts]
               :users [:div#users]}
   "on-the-ending-earth" {:title "On The Ending Earth - Clovertone Music"
                          :contents [:div#12.chart.grade3 (:head chart-divs/on-the-ending-earth) (:body chart-divs/on-the-ending-earth) (:details chart-divs/on-the-ending-earth)]
                          :charts [:div#charts]
                          :users [:div#users]}
   "petes-chune" {:title "Pete's Chune - Clovertone Music"
                  :contents [:div#30.chart.grade1 (:head chart-divs/petes-chune) (:body chart-divs/petes-chune) (:details chart-divs/petes-chune)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "red-river-mud-pie" {:title "Red River Mud Pie - Clovertone Music"
                        :contents [:div#37.chart.grade1 (:head chart-divs/red-river-mud-pie) (:body chart-divs/red-river-mud-pie) (:details chart-divs/red-river-mud-pie)]
                        :charts [:div#charts]
                        :users [:div#users]}
   "river" {:title "River - Clovertone Music"
            :contents [:div#98.chart.grade4 (:head chart-divs/river) (:body chart-divs/river) (:details chart-divs/river)]
            :charts [:div#charts]
            :users [:div#users]}
   "roscos-big-hit" {:title "Rosco's Big Hit - Clovertone Music"
                     :contents [:div#107.chart.grade2 (:head chart-divs/roscos-big-hit) (:body chart-divs/roscos-big-hit) (:details chart-divs/roscos-big-hit)]
                     :charts [:div#charts]
                     :users [:div#users]}
   "sakura-lullaby" {:title "Sakura Lullaby - Clovertone Music"
                     :contents [:div#6.chart.grade1 (:head chart-divs/sakura-lullaby) (:body chart-divs/sakura-lullaby) (:details chart-divs/sakura-lullaby)]
                     :charts [:div#charts]
                     :users [:div#users]}
   "santiago-nights" {:title "Santiago Nights - Clovertone Music"
                      :contents [:div#80.chart.grade4 (:head chart-divs/santiago-nights) (:body chart-divs/santiago-nights) (:details chart-divs/santiago-nights)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "shuswap-shuffle" {:title "Shuswap Shuffle - Clovertone Music"
                      :contents [:div#36.chart.grade1 (:head chart-divs/shuswap-shuffle) (:body chart-divs/shuswap-shuffle) (:details chart-divs/shuswap-shuffle)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "silent-night" {:title "Silent Night - Clovertone Music"
                   :contents [:div#46.chart.grade3 (:head chart-divs/silent-night) (:body chart-divs/silent-night) (:details chart-divs/silent-night)]
                   :charts [:div#charts]
                   :users [:div#users]}
   "smooth" {:title "Smooth - Clovertone Music"
             :contents [:div#112.chart.grade4 (:head chart-divs/smooth) (:body chart-divs/smooth) (:details chart-divs/smooth)]
             :charts [:div#charts]
             :users [:div#users]}
   "sock-hop-be-bop" {:title "Sock Hop Be-Bop - Clovertone Music"
                      :contents [:div#4.chart.grade1 (:head chart-divs/sock-hop-be-bop) (:body chart-divs/sock-hop-be-bop) (:details chart-divs/sock-hop-be-bop)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "sol-fiesta" {:title "Sol Fiesta - Clovertone Music"
                 :contents [:div#39.chart.grade3 (:head chart-divs/sol-fiesta) (:body chart-divs/sol-fiesta) (:details chart-divs/sol-fiesta)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "something-simple" {:title "Something Simple - Clovertone Music"
                       :contents [:div#118.chart.grade4 (:head chart-divs/something-simple) (:body chart-divs/something-simple) (:details chart-divs/something-simple)]
                       :charts [:div#charts]
                       :users [:div#users]}
   "sometimes-i-feel" {:title "Sometimes I Feel Like a Muppet - Clovertone Music"
                       :contents [:div#72.chart.grade2 (:head chart-divs/sometimes-i-feel) (:body chart-divs/sometimes-i-feel) (:details chart-divs/sometimes-i-feel)]
                       :charts [:div#charts]
                       :users [:div#users]}
   "song-for-l" {:title "Song For L - Clovertone Music"
                 :contents [:div#91.chart.grade4 (:head chart-divs/song-for-l) (:body chart-divs/song-for-l) (:details chart-divs/song-for-l)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "spirits" {:title "Spirits - Clovertone Music"
              :contents [:div#113.chart.grade4 (:head chart-divs/spirits) (:body chart-divs/spirits) (:details chart-divs/spirits)]
              :charts [:div#charts]
              :users [:div#users]}
   "state-of-mind" {:title "State of Mind - Clovertone Music"
                    :contents [:div#96.chart.grade4 (:head chart-divs/state-of-mind) (:body chart-divs/state-of-mind) (:details chart-divs/state-of-mind)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "state-of-mind-reprise" {:title "State of Mind Reprise - Clovertone Music"
                            :contents [:div#97.chart.grade4 (:head chart-divs/state-of-mind-reprise) (:body chart-divs/state-of-mind-reprise) (:details chart-divs/state-of-mind-reprise)]
                            :charts [:div#charts]
                            :users [:div#users]}
   "stone-cold-strut" {:title "Stone Cold Strut - Clovertone Music"
                       :contents [:div#76.chart.grade1 (:head chart-divs/stone-cold-strut) (:body chart-divs/stone-cold-strut) (:details chart-divs/stone-cold-strut)]
                       :charts [:div#charts]
                       :users [:div#users]}
   "summer-on-my-mind" {:title "Summer on my Mind - Clovertone Music"
                        :contents [:div#92.chart.grade2 (:head chart-divs/summer-on-my-mind) (:body chart-divs/summer-on-my-mind) (:details chart-divs/summer-on-my-mind)]
                        :charts [:div#charts]
                        :users [:div#users]}
   "surface-tension" {:title "Surface Tension - Clovertone Music"
                      :contents [:div#63.chart.grade4 (:head chart-divs/surface-tension) (:body chart-divs/surface-tension) (:details chart-divs/surface-tension)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "tango" {:title "Tango! - Clovertone Music"
            :contents [:div#5.chart.grade1 (:head chart-divs/tango) (:body chart-divs/tango) (:details chart-divs/tango)]
            :charts [:div#charts]
            :users [:div#users]}
   "that-look" {:title "That Look - Clovertone Music"
                :contents [:div#9.chart.grade2 (:head chart-divs/that-look) (:body chart-divs/that-look) (:details chart-divs/that-look)]
                :charts [:div#charts]
                :users [:div#users]}
   "the-dancehall-shake" {:title "The Dancehall Shake - Clovertone Music"
                          :contents [:div#50.chart.grade3 (:head chart-divs/the-dancehall-shake) (:body chart-divs/the-dancehall-shake) (:details chart-divs/the-dancehall-shake)]
                          :charts [:div#charts]
                          :users [:div#users]}
   "the-dirrty-dog" {:title "The Dirrty Dog - Clovertone Music"
                     :contents [:div#8.chart.grade3 (:head chart-divs/the-dirrty-dog) (:body chart-divs/the-dirrty-dog) (:details chart-divs/the-dirrty-dog)]
                     :charts [:div#charts]
                     :users [:div#users]}
   "the-fifth-beatle" {:title "The Fifth Beatle - Clovertone Music"
                       :contents [:div#57.chart.grade4 (:head chart-divs/the-fifth-beatle) (:body chart-divs/the-fifth-beatle) (:details chart-divs/the-fifth-beatle)]
                       :charts [:div#charts]
                       :users [:div#users]}
   "the-first-noel" {:title "The First Noel - Clovertone Music"
                     :contents [:div#86.chart.grade2 (:head chart-divs/the-first-noel) (:body chart-divs/the-first-noel) (:details chart-divs/the-first-noel)]
                     :charts [:div#charts]
                     :users [:div#users]}
   "the-gene-machine" {:title "The Gene Machine - Clovertone Music"
                       :contents [:div#67.chart.grade2 (:head chart-divs/the-gene-machine) (:body chart-divs/the-gene-machine) (:details chart-divs/the-gene-machine)]
                       :charts [:div#charts]
                       :users [:div#users]}
   "the-green-blues" {:title "The Green Blues - Clovertone Music"
                      :contents [:div#33.chart.grade3 (:head chart-divs/the-green-blues) (:body chart-divs/the-green-blues) (:details chart-divs/the-green-blues)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "the-long-way-home" {:title "The Long Way Home - Clovertone Music"
                        :contents [:div#108.chart.grade2 (:head chart-divs/the-long-way-home) (:body chart-divs/the-long-way-home) (:details chart-divs/the-long-way-home)]
                        :charts [:div#charts]
                        :users [:div#users]}
   "the-path" {:title "The Path - Clovertone Music"
               :contents [:div#23.chart.grade4 (:head chart-divs/the-path) (:body chart-divs/the-path) (:details chart-divs/the-path)]
               :charts [:div#charts]
               :users [:div#users]}
   "the-phantom" {:title "The Phantom - Clovertone Music"
                  :contents [:div#77.chart.grade3 (:head chart-divs/the-phantom) (:body chart-divs/the-phantom) (:details chart-divs/the-phantom)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "the-phone-dont-ring-jack" {:title "The Phone Don't Ring Jack - Clovertone Music"
                               :contents [:div#25.chart.grade4 (:head chart-divs/the-phone-dont-ring-jack) (:body chart-divs/the-phone-dont-ring-jack) (:details chart-divs/the-phone-dont-ring-jack)]
                               :charts [:div#charts]
                               :users [:div#users]}
   "the-pursuit" {:title "The Pursuit - Clovertone Music"
                  :contents [:div#3.chart.grade3 (:head chart-divs/the-pursuit) (:body chart-divs/the-pursuit) (:details chart-divs/the-pursuit)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "the-test" {:title "The Test - Clovertone Music"
               :contents [:div#69.chart.grade3 (:head chart-divs/the-test) (:body chart-divs/the-test) (:details chart-divs/the-test)]
               :charts [:div#charts]
               :users [:div#users]}
   "the-wiggle" {:title "The Wiggle - Clovertone Music"
                 :contents [:div#58.chart.grade3 (:head chart-divs/the-wiggle) (:body chart-divs/the-wiggle) (:details chart-divs/the-wiggle)]
                 :charts [:div#charts]
                 :users [:div#users]}
   "thinking-in-circles" {:title "Thinking In Circles - Clovertone Music"
                          :contents [:div#100.chart.grade4 (:head chart-divs/thinking-in-circles) (:body chart-divs/thinking-in-circles) (:details chart-divs/thinking-in-circles)]
                          :charts [:div#charts]
                          :users [:div#users]}
   "this-buts-for-you" {:title "This But's for You! - Clovertone Music"
                        :contents [:div#62.chart.grade4 (:head chart-divs/this-buts-for-you) (:body chart-divs/this-buts-for-you) (:details chart-divs/this-buts-for-you)]
                        :charts [:div#charts]
                        :users [:div#users]}
   "train-track" {:title "Train Track - Clovertone Music"
                  :contents [:div#32.chart.grade1 (:head chart-divs/train-track) (:body chart-divs/train-track) (:details chart-divs/train-track)]
                  :charts [:div#charts]
                  :users [:div#users]}
   "tumbadora" {:title "Tumbadora - Clovertone Music"
                :contents [:div#40.chart.grade3 (:head chart-divs/tumbadora) (:body chart-divs/tumbadora) (:details chart-divs/tumbadora)]
                :charts [:div#charts]
                :users [:div#users]}
   "twilight-fall" {:title "The Twilight Fall - Clovertone Music"
                    :contents [:div#111.chart.grade4 (:head chart-divs/twilight-fall) (:body chart-divs/twilight-fall) (:details chart-divs/twilight-fall)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "vista" {:title "Vista - Clovertone Music"
            :contents [:div#41.chart.grade4 (:head chart-divs/vista) (:body chart-divs/vista) (:details chart-divs/vista)]
            :charts [:div#charts]
            :users [:div#users]}
   "what-once-was" {:title "What Once Was - Clovertone Music"
                    :contents [:div#87.chart.grade2 (:head chart-divs/what-once-was) (:body chart-divs/what-once-was) (:details chart-divs/what-once-was)]
                    :charts [:div#charts]
                    :users [:div#users]}
   "wood-and-shadow" {:title "Wood & Shadow - Clovertone Music"
                      :contents [:div#19.chart.grade4 (:head chart-divs/wood-and-shadow) (:body chart-divs/wood-and-shadow) (:details chart-divs/wood-and-shadow)]
                      :charts [:div#charts]
                      :users [:div#users]}
   "yun-gia" {:title "Yun Gia - Clovertone Music"
              :contents [:div#14.chart.grade3 (:head chart-divs/yun-gia) (:body chart-divs/yun-gia) (:details chart-divs/yun-gia)]
              :charts [:div#charts]
              :users [:div#users]}
   "index" {:title "All Charts - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "All Charts"]
                        [:p
                         "Here's a list of all our titles so you can browse from the oldest selections to our newest material."]]]
            :charts [:div#charts
                     [:div#list
                      [:div#2.chart.grade1 (:head chart-divs/o-canada) (:body chart-divs/o-canada) (:details chart-divs/o-canada)]
                      [:div#3.chart.grade3 (:head chart-divs/the-pursuit) (:body chart-divs/the-pursuit) (:details chart-divs/the-pursuit)]
                      [:div#4.chart.grade1 (:head chart-divs/sock-hop-be-bop) (:body chart-divs/sock-hop-be-bop) (:details chart-divs/sock-hop-be-bop)]
                      [:div#5.chart.grade1 (:head chart-divs/tango) (:body chart-divs/tango) (:details chart-divs/tango)]
                      [:div#6.chart.grade1 (:head chart-divs/sakura-lullaby) (:body chart-divs/sakura-lullaby) (:details chart-divs/sakura-lullaby)]
                      [:div#7.chart.grade2 (:head chart-divs/detective-story) (:body chart-divs/detective-story) (:details chart-divs/detective-story)]
                      [:div#8.chart.grade3 (:head chart-divs/the-dirrty-dog) (:body chart-divs/the-dirrty-dog) (:details chart-divs/the-dirrty-dog)]
                      [:div#9.chart.grade2 (:head chart-divs/that-look) (:body chart-divs/that-look) (:details chart-divs/that-look)]
                      [:div#10.chart.grade2 (:head chart-divs/atlantic-crossing) (:body chart-divs/atlantic-crossing) (:details chart-divs/atlantic-crossing)]
                      [:div#11.chart.grade1 (:head chart-divs/game-on) (:body chart-divs/game-on) (:details chart-divs/game-on)]
                      [:div#12.chart.grade3 (:head chart-divs/on-the-ending-earth) (:body chart-divs/on-the-ending-earth) (:details chart-divs/on-the-ending-earth)]
                      [:div#13.chart.grade3 (:head chart-divs/four-more-to-go) (:body chart-divs/four-more-to-go) (:details chart-divs/four-more-to-go)]
                      [:div#14.chart.grade3 (:head chart-divs/yun-gia) (:body chart-divs/yun-gia) (:details chart-divs/yun-gia)]
                      [:div#15.chart.grade2 (:head chart-divs/electros-next-plot-jr) (:body chart-divs/electros-next-plot-jr) (:details chart-divs/electros-next-plot-jr)]
                      [:div#16.chart.grade4 (:head chart-divs/two-dave-k) (:body chart-divs/two-dave-k) (:details chart-divs/two-dave-k)]
                      [:div#17.chart.grade4 (:head chart-divs/a-kingdoms-last-hope) (:body chart-divs/a-kingdoms-last-hope) (:details chart-divs/a-kingdoms-last-hope)]
                      [:div#18.chart.grade4 (:head chart-divs/ten-41-am) (:body chart-divs/ten-41-am) (:details chart-divs/ten-41-am)]
                      [:div#19.chart.grade4 (:head chart-divs/wood-and-shadow) (:body chart-divs/wood-and-shadow) (:details chart-divs/wood-and-shadow)]
                      [:div#20.chart.grade4 (:head chart-divs/electros-next-plot) (:body chart-divs/electros-next-plot) (:details chart-divs/electros-next-plot)]
                      [:div#21.chart.grade4 (:head chart-divs/chazz) (:body chart-divs/chazz) (:details chart-divs/chazz)]
                      [:div#22.chart.grade4 (:head chart-divs/amazing-grace) (:body chart-divs/amazing-grace) (:details chart-divs/amazing-grace)]
                      [:div#23.chart.grade4 (:head chart-divs/the-path) (:body chart-divs/the-path) (:details chart-divs/the-path)]
                      [:div#25.chart.grade4 (:head chart-divs/the-phone-dont-ring-jack) (:body chart-divs/the-phone-dont-ring-jack) (:details chart-divs/the-phone-dont-ring-jack)]
                      [:div#26.chart.grade4 (:head chart-divs/first-x-free) (:body chart-divs/first-x-free) (:details chart-divs/first-x-free)]
                      [:div#27.chart.grade1 (:head chart-divs/at-long-last) (:body chart-divs/at-long-last) (:details chart-divs/at-long-last)]
                      [:div#29.chart.grade1 (:head chart-divs/hotel-mambo) (:body chart-divs/hotel-mambo) (:details chart-divs/hotel-mambo)]
                      [:div#30.chart.grade1 (:head chart-divs/petes-chune) (:body chart-divs/petes-chune) (:details chart-divs/petes-chune)]
                      [:div#31.chart.grade2 (:head chart-divs/a-kingdoms-last-hope-jr) (:body chart-divs/a-kingdoms-last-hope-jr) (:details chart-divs/a-kingdoms-last-hope-jr)]
                      [:div#32.chart.grade1 (:head chart-divs/train-track) (:body chart-divs/train-track) (:details chart-divs/train-track)]
                      [:div#33.chart.grade3 (:head chart-divs/the-green-blues) (:body chart-divs/the-green-blues) (:details chart-divs/the-green-blues)]
                      [:div#34.chart.grade3 (:head chart-divs/arcadian-autumn) (:body chart-divs/arcadian-autumn) (:details chart-divs/arcadian-autumn)]
                      [:div#35.chart.grade1 (:head chart-divs/all-your-base) (:body chart-divs/all-your-base) (:details chart-divs/all-your-base)]
                      [:div#36.chart.grade1 (:head chart-divs/shuswap-shuffle) (:body chart-divs/shuswap-shuffle) (:details chart-divs/shuswap-shuffle)]
                      [:div#37.chart.grade1 (:head chart-divs/red-river-mud-pie) (:body chart-divs/red-river-mud-pie) (:details chart-divs/red-river-mud-pie)]
                      [:div#38.chart.grade4 (:head chart-divs/funk-out) (:body chart-divs/funk-out) (:details chart-divs/funk-out)]
                      [:div#39.chart.grade3 (:head chart-divs/sol-fiesta) (:body chart-divs/sol-fiesta) (:details chart-divs/sol-fiesta)]
                      [:div#40.chart.grade3 (:head chart-divs/tumbadora) (:body chart-divs/tumbadora) (:details chart-divs/tumbadora)]
                      [:div#41.chart.grade4 (:head chart-divs/vista) (:body chart-divs/vista) (:details chart-divs/vista)]
                      [:div#46.chart.grade3 (:head chart-divs/silent-night) (:body chart-divs/silent-night) (:details chart-divs/silent-night)]
                      [:div#47.chart.grade3 (:head chart-divs/joy-to-the-world) (:body chart-divs/joy-to-the-world) (:details chart-divs/joy-to-the-world)]
                      [:div#48.chart.grade3 (:head chart-divs/canal-street-walk) (:body chart-divs/canal-street-walk) (:details chart-divs/canal-street-walk)]
                      [:div#49.chart.grade2 (:head chart-divs/cloud-song) (:body chart-divs/cloud-song) (:details chart-divs/cloud-song)]
                      [:div#50.chart.grade3 (:head chart-divs/the-dancehall-shake) (:body chart-divs/the-dancehall-shake) (:details chart-divs/the-dancehall-shake)]
                      [:div#51.chart.grade3 (:head chart-divs/femis-flight) (:body chart-divs/femis-flight) (:details chart-divs/femis-flight)]
                      [:div#52.chart.grade2 (:head chart-divs/let-me-be) (:body chart-divs/let-me-be) (:details chart-divs/let-me-be)]
                      [:div#54.chart.grade2 (:head chart-divs/lifted) (:body chart-divs/lifted) (:details chart-divs/lifted)]
                      [:div#55.chart.grade3 (:head chart-divs/lost-stories) (:body chart-divs/lost-stories) (:details chart-divs/lost-stories)]
                      [:div#56.chart.grade3 (:head chart-divs/dark-matter) (:body chart-divs/dark-matter) (:details chart-divs/dark-matter)]
                      [:div#57.chart.grade4 (:head chart-divs/the-fifth-beatle) (:body chart-divs/the-fifth-beatle) (:details chart-divs/the-fifth-beatle)]
                      [:div#58.chart.grade3 (:head chart-divs/the-wiggle) (:body chart-divs/the-wiggle) (:details chart-divs/the-wiggle)]
                      [:div#60.chart.grade1 (:head chart-divs/gentlemen) (:body chart-divs/gentlemen) (:details chart-divs/gentlemen)]
                      [:div#61.chart.grade1 (:head chart-divs/la-cattura) (:body chart-divs/la-cattura) (:details chart-divs/la-cattura)]
                      [:div#62.chart.grade4 (:head chart-divs/this-buts-for-you) (:body chart-divs/this-buts-for-you) (:details chart-divs/this-buts-for-you)]
                      [:div#63.chart.grade4 (:head chart-divs/surface-tension) (:body chart-divs/surface-tension) (:details chart-divs/surface-tension)]
                      [:div#64.chart.grade2 (:head chart-divs/a-long-kept-secret) (:body chart-divs/a-long-kept-secret) (:details chart-divs/a-long-kept-secret)]
                      [:div#65.chart.grade1 (:head chart-divs/cowboy-countdown) (:body chart-divs/cowboy-countdown) (:details chart-divs/cowboy-countdown)]
                      [:div#66.chart.grade2 (:head chart-divs/crusin-at-30000) (:body chart-divs/crusin-at-30000) (:details chart-divs/crusin-at-30000)]
                      [:div#67.chart.grade2 (:head chart-divs/the-gene-machine) (:body chart-divs/the-gene-machine) (:details chart-divs/the-gene-machine)]
                      [:div#68.chart.grade2 (:head chart-divs/go-go-blues) (:body chart-divs/go-go-blues) (:details chart-divs/go-go-blues)]
                      [:div#69.chart.grade3 (:head chart-divs/the-test) (:body chart-divs/the-test) (:details chart-divs/the-test)]
                      [:div#70.chart.grade3 (:head chart-divs/el-castor-loco) (:body chart-divs/el-castor-loco) (:details chart-divs/el-castor-loco)]
                      [:div#71.chart.grade2 (:head chart-divs/en-su-camino) (:body chart-divs/en-su-camino) (:details chart-divs/en-su-camino)]
                      [:div#72.chart.grade2 (:head chart-divs/sometimes-i-feel) (:body chart-divs/sometimes-i-feel) (:details chart-divs/sometimes-i-feel)]
                      [:div#73.chart.grade2 (:head chart-divs/friday-night-special) (:body chart-divs/friday-night-special) (:details chart-divs/friday-night-special)]
                      [:div#74.chart.grade2 (:head chart-divs/god-rest-ye) (:body chart-divs/god-rest-ye) (:details chart-divs/god-rest-ye)]
                      [:div#75.chart.grade1 (:head chart-divs/la-squadra-da-milano) (:body chart-divs/la-squadra-da-milano) (:details chart-divs/la-squadra-da-milano)]
                      [:div#76.chart.grade1 (:head chart-divs/stone-cold-strut) (:body chart-divs/stone-cold-strut) (:details chart-divs/stone-cold-strut)]
                      [:div#77.chart.grade3 (:head chart-divs/the-phantom) (:body chart-divs/the-phantom) (:details chart-divs/the-phantom)]
                      [:div#78.chart.grade1 (:head chart-divs/branta) (:body chart-divs/branta) (:details chart-divs/branta)]
                      [:div#79.chart.grade1 (:head chart-divs/moatfield-shuffle) (:body chart-divs/moatfield-shuffle) (:details chart-divs/moatfield-shuffle)]
                      [:div#80.chart.grade4 (:head chart-divs/santiago-nights) (:body chart-divs/santiago-nights) (:details chart-divs/santiago-nights)]
                      [:div#81.chart.grade4 (:head chart-divs/epitaph) (:body chart-divs/epitaph) (:details chart-divs/epitaph)]
                      [:div#83.chart.grade3 (:head chart-divs/don-carlos-dream) (:body chart-divs/don-carlos-dream) (:details chart-divs/don-carlos-dream)]
                      [:div#84.chart.grade1 (:head chart-divs/blue-heron) (:body chart-divs/blue-heron) (:details chart-divs/blue-heron)]
                      [:div#85.chart.grade3 (:head chart-divs/hamunaptra) (:body chart-divs/hamunaptra) (:details chart-divs/hamunaptra)]
                      [:div#86.chart.grade2 (:head chart-divs/the-first-noel) (:body chart-divs/the-first-noel) (:details chart-divs/the-first-noel)]
                      [:div#87.chart.grade2 (:head chart-divs/what-once-was) (:body chart-divs/what-once-was) (:details chart-divs/what-once-was)]
                      [:div#88.chart.grade2 (:head chart-divs/brown-and-tan) (:body chart-divs/brown-and-tan) (:details chart-divs/brown-and-tan)]
                      [:div#90.chart.grade2 (:head chart-divs/livvy-dear) (:body chart-divs/livvy-dear) (:details chart-divs/livvy-dear)]
                      [:div#91.chart.grade4 (:head chart-divs/song-for-l) (:body chart-divs/song-for-l) (:details chart-divs/song-for-l)]
                      [:div#92.chart.grade2 (:head chart-divs/summer-on-my-mind) (:body chart-divs/summer-on-my-mind) (:details chart-divs/summer-on-my-mind)]
                      [:div#93.chart.grade2 (:head chart-divs/good-king-w) (:body chart-divs/good-king-w) (:details chart-divs/good-king-w)]
                      [:div#94.chart.grade3 (:head chart-divs/introduccion) (:body chart-divs/introduccion) (:details chart-divs/introduccion)]
                      [:div#95.chart.grade2 (:head chart-divs/no-trespassing) (:body chart-divs/no-trespassing) (:details chart-divs/no-trespassing)]
                      [:div#96.chart.grade4 (:head chart-divs/state-of-mind) (:body chart-divs/state-of-mind) (:details chart-divs/state-of-mind)]
                      [:div#97.chart.grade4 (:head chart-divs/state-of-mind-reprise) (:body chart-divs/state-of-mind-reprise) (:details chart-divs/state-of-mind-reprise)]
                      [:div#98.chart.grade4 (:head chart-divs/river) (:body chart-divs/river) (:details chart-divs/river)]
                      [:div#99.chart.grade4 (:head chart-divs/julia) (:body chart-divs/julia) (:details chart-divs/julia)]
                      [:div#100.chart.grade4 (:head chart-divs/thinking-in-circles) (:body chart-divs/thinking-in-circles) (:details chart-divs/thinking-in-circles)]
                      [:div#101.chart.grade3 (:head chart-divs/midnight-clear) (:body chart-divs/midnight-clear) (:details chart-divs/midnight-clear)]
                      [:div#102.chart.grade3 (:head chart-divs/life-race) (:body chart-divs/life-race) (:details chart-divs/life-race)]
                      [:div#103.chart.grade3 (:head chart-divs/junk) (:body chart-divs/junk) (:details chart-divs/junk)]
                      [:div#104.chart.grade3 (:head chart-divs/la-maquina) (:body chart-divs/la-maquina) (:details chart-divs/la-maquina)]
                      [:div#105.chart.grade3 (:head chart-divs/last-resorts) (:body chart-divs/last-resorts) (:details chart-divs/last-resorts)]
                      [:div#106.chart.grade3 (:head chart-divs/mad-man-mambo) (:body chart-divs/mad-man-mambo) (:details chart-divs/mad-man-mambo)]
                      [:div#107.chart.grade2 (:head chart-divs/roscos-big-hit) (:body chart-divs/roscos-big-hit) (:details chart-divs/roscos-big-hit)]
                      [:div#108.chart.grade2 (:head chart-divs/the-long-way-home) (:body chart-divs/the-long-way-home) (:details chart-divs/the-long-way-home)]
                      [:div#109.chart.grade4 (:head chart-divs/ambleside) (:body chart-divs/ambleside) (:details chart-divs/ambleside)]
                      [:div#110.chart.grade4 (:head chart-divs/intransitory) (:body chart-divs/intransitory) (:details chart-divs/intransitory)]
                      [:div#111.chart.grade4 (:head chart-divs/twilight-fall) (:body chart-divs/twilight-fall) (:details chart-divs/twilight-fall)]
                      [:div#112.chart.grade4 (:head chart-divs/smooth) (:body chart-divs/smooth) (:details chart-divs/smooth)]
                      [:div#113.chart.grade4 (:head chart-divs/spirits) (:body chart-divs/spirits) (:details chart-divs/spirits)]
                      [:div#114.chart.grade4 (:head chart-divs/arrival-of-the-pegasus) (:body chart-divs/arrival-of-the-pegasus) (:details chart-divs/arrival-of-the-pegasus)]
                      [:div#115.chart.grade4 (:head chart-divs/foot-in-mouth) (:body chart-divs/foot-in-mouth) (:details chart-divs/foot-in-mouth)]
                      [:div#116.chart.grade4 (:head chart-divs/in-dreams) (:body chart-divs/in-dreams) (:details chart-divs/in-dreams)]
                      [:div#117.chart.grade4 (:head chart-divs/ambleside-reprise) (:body chart-divs/ambleside-reprise) (:details chart-divs/ambleside-reprise)]
                      [:div#118.chart.grade4 (:head chart-divs/something-simple) (:body chart-divs/something-simple) (:details chart-divs/something-simple)]
                      [:div#119.chart.grade4 (:head chart-divs/a-cool-breeze) (:body chart-divs/a-cool-breeze) (:details chart-divs/a-cool-breeze)]]]
            :users [:div#users]}})
