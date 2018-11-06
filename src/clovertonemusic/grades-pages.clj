(ns clovertonemusic.grades-pages)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs])

(def html-grades
  {"one" {:title "Grade One - Clovertone Music"
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "Grade One"]
                      [:p
                       "Our grade 1 selections are for junior high school and advanced elementary school bands in their first years of playing."]]]
          :charts [:div#charts
                   [:div#listw
                    [:div#2.chart.grade1 (:head chart-divs/o-canada) (:body chart-divs/o-canada) (:details chart-divs/o-canada)]
                    [:div#4.chart.grade1 (:head chart-divs/sock-hop-be-bop) (:body chart-divs/sock-hop-be-bop) (:details chart-divs/sock-hop-be-bop)]
                    [:div#5.chart.grade1 (:head chart-divs/tango) (:body chart-divs/tango) (:details chart-divs/tango)]
                    [:div#6.chart.grade1 (:head chart-divs/sakura-lullaby) (:body chart-divs/sakura-lullaby) (:details chart-divs/sakura-lullaby)]
                    [:div#11.chart.grade1 (:head chart-divs/game-on) (:body chart-divs/game-on) (:details chart-divs/game-on)]
                    [:div#27.chart.grade1 (:head chart-divs/at-long-last) (:body chart-divs/at-long-last) (:details chart-divs/at-long-last)]
                    [:div#29.chart.grade1 (:head chart-divs/hotel-mambo) (:body chart-divs/hotel-mambo) (:details chart-divs/hotel-mambo)]
                    [:div#30.chart.grade1 (:head chart-divs/petes-chune) (:body chart-divs/petes-chune) (:details chart-divs/petes-chune)]
                    [:div#32.chart.grade1 (:head chart-divs/train-track) (:body chart-divs/train-track) (:details chart-divs/train-track)]
                    [:div#35.chart.grade1 (:head chart-divs/all-your-base) (:body chart-divs/all-your-base) (:details chart-divs/all-your-base)]
                    [:div#36.chart.grade1 (:head chart-divs/shuswap-shuffle) (:body chart-divs/shuswap-shuffle) (:details chart-divs/shuswap-shuffle)]
                    [:div#37.chart.grade1 (:head chart-divs/red-river-mud-pie) (:body chart-divs/red-river-mud-pie) (:details chart-divs/red-river-mud-pie)]
                    [:div#60.chart.grade1 (:head chart-divs/gentlemen) (:body chart-divs/gentlemen) (:details chart-divs/gentlemen)]
                    [:div#61.chart.grade1 (:head chart-divs/la-cattura) (:body chart-divs/la-cattura) (:details chart-divs/la-cattura)]
                    [:div#65.chart.grade1 (:head chart-divs/cowboy-countdown) (:body chart-divs/cowboy-countdown) (:details chart-divs/cowboy-countdown)]
                    [:div#75.chart.grade1 (:head chart-divs/la-squadra-da-milano) (:body chart-divs/la-squadra-da-milano) (:details chart-divs/la-squadra-da-milano)]
                    [:div#76.chart.grade1 (:head chart-divs/stone-cold-strut) (:body chart-divs/stone-cold-strut) (:details chart-divs/stone-cold-strut)]
                    [:div#78.chart.grade1 (:head chart-divs/branta) (:body chart-divs/branta) (:details chart-divs/branta)]
                    [:div#79.chart.grade1 (:head chart-divs/moatfield-shuffle) (:body chart-divs/moatfield-shuffle) (:details chart-divs/moatfield-shuffle)]
                    [:div#84.chart.grade1 (:head chart-divs/blue-heron) (:body chart-divs/blue-heron) (:details chart-divs/blue-heron)]]]
          :users [:div#users]}
   "two" {:title "Grade Two - Clovertone Music"
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "Grade Two"]
                      [:p
                       "These grade 2 charts are aimed at intermediate bands or good junior bands."]]]
          :charts [:div#charts
                   [:div#list
                    [:div#7.chart.grade2 (:head chart-divs/detective-story) (:body chart-divs/detective-story) (:details chart-divs/detective-story)]
                    [:div#9.chart.grade2 (:head chart-divs/that-look) (:body chart-divs/that-look) (:details chart-divs/that-look)]
                    [:div#10.chart.grade2 (:head chart-divs/atlantic-crossing) (:body chart-divs/atlantic-crossing) (:details chart-divs/atlantic-crossing)]
                    [:div#15.chart.grade2 (:head chart-divs/electros-next-plot-jr) (:body chart-divs/electros-next-plot-jr) (:details chart-divs/electros-next-plot-jr)]
                    [:div#31.chart.grade2 (:head chart-divs/a-kingdoms-last-hope-jr) (:body chart-divs/a-kingdoms-last-hope-jr) (:details chart-divs/a-kingdoms-last-hope-jr)]
                    [:div#49.chart.grade2 (:head chart-divs/cloud-song) (:body chart-divs/cloud-song) (:details chart-divs/cloud-song)]
                    [:div#52.chart.grade2 (:head chart-divs/let-me-be) (:body chart-divs/let-me-be) (:details chart-divs/let-me-be)]
                    [:div#54.chart.grade2 (:head chart-divs/lifted) (:body chart-divs/lifted) (:details chart-divs/lifted)]
                    [:div#64.chart.grade2 (:head chart-divs/a-long-kept-secret) (:body chart-divs/a-long-kept-secret) (:details chart-divs/a-long-kept-secret)]
                    [:div#66.chart.grade2 (:head chart-divs/crusin-at-30000) (:body chart-divs/crusin-at-30000) (:details chart-divs/crusin-at-30000)]
                    [:div#67.chart.grade2 (:head chart-divs/the-gene-machine) (:body chart-divs/the-gene-machine) (:details chart-divs/the-gene-machine)]
                    [:div#68.chart.grade2 (:head chart-divs/go-go-blues) (:body chart-divs/go-go-blues) (:details chart-divs/go-go-blues)]
                    [:div#71.chart.grade2 (:head chart-divs/en-su-camino) (:body chart-divs/en-su-camino) (:details chart-divs/en-su-camino)]
                    [:div#72.chart.grade2 (:head chart-divs/sometimes-i-feel) (:body chart-divs/sometimes-i-feel) (:details chart-divs/sometimes-i-feel)]
                    [:div#73.chart.grade2 (:head chart-divs/friday-night-special) (:body chart-divs/friday-night-special) (:details chart-divs/friday-night-special)]
                    [:div#74.chart.grade2 (:head chart-divs/god-rest-ye) (:body chart-divs/god-rest-ye) (:details chart-divs/god-rest-ye)]
                    [:div#86.chart.grade2 (:head chart-divs/the-first-noel) (:body chart-divs/the-first-noel) (:details chart-divs/the-first-noel)]
                    [:div#87.chart.grade2 (:head chart-divs/what-once-was) (:body chart-divs/what-once-was) (:details chart-divs/what-once-was)]
                    [:div#88.chart.grade2 (:head chart-divs/brown-and-tan) (:body chart-divs/brown-and-tan) (:details chart-divs/brown-and-tan)]
                    [:div#90.chart.grade2 (:head chart-divs/livvy-dear) (:body chart-divs/livvy-dear) (:details chart-divs/livvy-dear)]
                    [:div#92.chart.grade2 (:head chart-divs/summer-on-my-mind) (:body chart-divs/summer-on-my-mind) (:details chart-divs/summer-on-my-mind)]
                    [:div#93.chart.grade2 (:head chart-divs/good-king-w) (:body chart-divs/good-king-w) (:details chart-divs/good-king-w)]
                    [:div#95.chart.grade2 (:head chart-divs/no-trespassing) (:body chart-divs/no-trespassing) (:details chart-divs/no-trespassing)]
                    [:div#107.chart.grade2 (:head chart-divs/roscos-big-hit) (:body chart-divs/roscos-big-hit) (:details chart-divs/roscos-big-hit)]
                    [:div#108.chart.grade2 (:head chart-divs/the-long-way-home) (:body chart-divs/the-long-way-home) (:details chart-divs/the-long-way-home)]]]
          :users [:div#users]}
   "three" {:title "Grade Three - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Grade Three"]
                        [:p
                         "Here you will find senior band charts for players with a few years of experience."]]]
            :charts [:div#charts
                     [:div#list
                      [:div#3.chart.grade3 (:head chart-divs/the-pursuit) (:body chart-divs/the-pursuit) (:details chart-divs/the-pursuit)]
                      [:div#8.chart.grade3 (:head chart-divs/the-dirrty-dog) (:body chart-divs/the-dirrty-dog) (:details chart-divs/the-dirrty-dog)]
                      [:div#12.chart.grade3 (:head chart-divs/on-the-ending-earth) (:body chart-divs/on-the-ending-earth) (:details chart-divs/on-the-ending-earth)]
                      [:div#13.chart.grade3 (:head chart-divs/four-more-to-go) (:body chart-divs/four-more-to-go) (:details chart-divs/four-more-to-go)]
                      [:div#14.chart.grade3 (:head chart-divs/yun-gia) (:body chart-divs/yun-gia) (:details chart-divs/yun-gia)]
                      [:div#33.chart.grade3 (:head chart-divs/the-green-blues) (:body chart-divs/the-green-blues) (:details chart-divs/the-green-blues)]
                      [:div#34.chart.grade3 (:head chart-divs/arcadian-autumn) (:body chart-divs/arcadian-autumn) (:details chart-divs/arcadian-autumn)]
                      [:div#39.chart.grade3 (:head chart-divs/sol-fiesta) (:body chart-divs/sol-fiesta) (:details chart-divs/sol-fiesta)]
                      [:div#40.chart.grade3 (:head chart-divs/tumbadora) (:body chart-divs/tumbadora) (:details chart-divs/tumbadora)]
                      [:div#46.chart.grade3 (:head chart-divs/silent-night) (:body chart-divs/silent-night) (:details chart-divs/silent-night)]
                      [:div#47.chart.grade3 (:head chart-divs/joy-to-the-world) (:body chart-divs/joy-to-the-world) (:details chart-divs/joy-to-the-world)]
                      [:div#48.chart.grade3 (:head chart-divs/canal-street-walk) (:body chart-divs/canal-street-walk) (:details chart-divs/canal-street-walk)]
                      [:div#50.chart.grade3 (:head chart-divs/the-dancehall-shake) (:body chart-divs/the-dancehall-shake) (:details chart-divs/the-dancehall-shake)]
                      [:div#51.chart.grade3 (:head chart-divs/femis-flight) (:body chart-divs/femis-flight) (:details chart-divs/femis-flight)]
                      [:div#55.chart.grade3 (:head chart-divs/lost-stories) (:body chart-divs/lost-stories) (:details chart-divs/lost-stories)]
                      [:div#56.chart.grade3 (:head chart-divs/dark-matter) (:body chart-divs/dark-matter) (:details chart-divs/dark-matter)]
                      [:div#58.chart.grade3 (:head chart-divs/the-wiggle) (:body chart-divs/the-wiggle) (:details chart-divs/the-wiggle)]
                      [:div#69.chart.grade3 (:head chart-divs/the-test) (:body chart-divs/the-test) (:details chart-divs/the-test)]
                      [:div#70.chart.grade3 (:head chart-divs/el-castor-loco) (:body chart-divs/el-castor-loco) (:details chart-divs/el-castor-loco)]
                      [:div#77.chart.grade3 (:head chart-divs/the-phantom) (:body chart-divs/the-phantom) (:details chart-divs/the-phantom)]
                      [:div#83.chart.grade3 (:head chart-divs/don-carlos-dream) (:body chart-divs/don-carlos-dream) (:details chart-divs/don-carlos-dream)]
                      [:div#85.chart.grade3 (:head chart-divs/hamunaptra) (:body chart-divs/hamunaptra) (:details chart-divs/hamunaptra)]
                      [:div#94.chart.grade3 (:head chart-divs/introduccion) (:body chart-divs/introduccion) (:details chart-divs/introduccion)]
                      [:div#101.chart.grade3 (:head chart-divs/midnight-clear) (:body chart-divs/midnight-clear) (:details chart-divs/midnight-clear)]
                      [:div#102.chart.grade3 (:head chart-divs/life-race) (:body chart-divs/life-race) (:details chart-divs/life-race)]
                      [:div#103.chart.grade3 (:head chart-divs/junk) (:body chart-divs/junk) (:details chart-divs/junk)]
                      [:div#104.chart.grade3 (:head chart-divs/la-maquina) (:body chart-divs/la-maquina) (:details chart-divs/la-maquina)]
                      [:div#105.chart.grade3 (:head chart-divs/last-resorts) (:body chart-divs/last-resorts) (:details chart-divs/last-resorts)]
                      [:div#106.chart.grade3 (:head chart-divs/mad-man-mambo) (:body chart-divs/mad-man-mambo) (:details chart-divs/mad-man-mambo)]]]}
   "four" {:title "Grade Four - Clovertone Music"
           :contents [:div#contents
                      [:div#content.index
                       [:h1.title "Grade Four"]
                       [:p
                        "This is where you will find all of our advanced material written at professional level directed towards university bands or strong arts focused high schools. "]]]
           :charts [:div#charts
                    [:div#list
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
                     [:div#38.chart.grade4 (:head chart-divs/funk-out) (:body chart-divs/funk-out) (:details chart-divs/funk-out)]
                     [:div#41.chart.grade4 (:head chart-divs/vista) (:body chart-divs/vista) (:details chart-divs/vista)]
                     [:div#57.chart.grade4 (:head chart-divs/the-fifth-beatle) (:body chart-divs/the-fifth-beatle) (:details chart-divs/the-fifth-beatle)]
                     [:div#62.chart.grade4 (:head chart-divs/this-buts-for-you) (:body chart-divs/this-buts-for-you) (:details chart-divs/this-buts-for-you)]
                     [:div#63.chart.grade4 (:head chart-divs/surface-tension) (:body chart-divs/surface-tension) (:details chart-divs/surface-tension)]
                     [:div#80.chart.grade4 (:head chart-divs/santiago-nights) (:body chart-divs/santiago-nights) (:details chart-divs/santiago-nights)]
                     [:div#81.chart.grade4 (:head chart-divs/epitaph) (:body chart-divs/epitaph) (:details chart-divs/epitaph)]
                     [:div#91.chart.grade4 (:head chart-divs/song-for-l) (:body chart-divs/song-for-l) (:details chart-divs/song-for-l)]
                     [:div#96.chart.grade4 (:head chart-divs/state-of-mind) (:body chart-divs/state-of-mind) (:details chart-divs/state-of-mind)]
                     [:div#97.chart.grade4 (:head chart-divs/state-of-mind-reprise) (:body chart-divs/state-of-mind-reprise) (:details chart-divs/state-of-mind-reprise)]
                     [:div#98.chart.grade4 (:head chart-divs/river) (:body chart-divs/river) (:details chart-divs/river)]
                     [:div#99.chart.grade4 (:head chart-divs/julia) (:body chart-divs/julia) (:details chart-divs/julia)]
                     [:div#100.chart.grade4 (:head chart-divs/thinking-in-circles) (:body chart-divs/thinking-in-circles) (:details chart-divs/thinking-in-circles)]
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
