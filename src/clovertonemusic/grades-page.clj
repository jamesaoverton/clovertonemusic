(ns clovertonemusic.grades-page)

(load "common-divs")
(load "chart-divs")

(require '[clovertonemusic.common-divs :as common-divs]
         '[clovertonemusic.chart-divs :as chart-divs])

(def html-grades
  {"one" {:title "Grade One - Clovertone Music"
          :contents (common-divs/contents "Grade One"
                                          "Our grade 1 selections are for junior high school and advanced elementary school bands in their first years of playing.")
          :charts [:div#charts
                   [:div#listw
                    [:div#2.chart.grade1 chart-divs/o-canada]
                    [:div#4.chart.grade1 chart-divs/sock-hop-be-bop]
                    [:div#5.chart.grade1 chart-divs/tango]
                    [:div#6.chart.grade1 chart-divs/sakura-lullaby]
                    [:div#11.chart.grade1 chart-divs/game-on]
                    [:div#27.chart.grade1 chart-divs/at-long-last]
                    [:div#29.chart.grade1 chart-divs/hotel-mambo]
                    [:div#30.chart.grade1 chart-divs/petes-chune]
                    [:div#32.chart.grade1 chart-divs/train-track]
                    [:div#35.chart.grade1 chart-divs/all-your-base]
                    [:div#36.chart.grade1 chart-divs/shuswap-shuffle]
                    [:div#37.chart.grade1 chart-divs/red-river-mud-pie]
                    [:div#60.chart.grade1 chart-divs/gentlemen]
                    [:div#61.chart.grade1 chart-divs/la-cattura]
                    [:div#65.chart.grade1 chart-divs/cowboy-countdown]
                    [:div#75.chart.grade1 chart-divs/la-squadra-da-milano]
                    [:div#76.chart.grade1 chart-divs/stone-cold-strut]
                    [:div#78.chart.grade1 chart-divs/branta]
                    [:div#79.chart.grade1 chart-divs/moatfield-shuffle]
                    [:div#84.chart.grade1 chart-divs/blue-heron]]]
          :users [:div#users]}
   "two" {:title "Grade Two - Clovertone Music"
          :contents (common-divs/contents "Grade Two"
                                          "These grade 2 charts are aimed at intermediate bands or good junior bands.")
          :charts [:div#charts
                   [:div#list
                    [:div#7.chart.grade2 chart-divs/detective-story]
                    [:div#9.chart.grade2 chart-divs/that-look]
                    [:div#10.chart.grade2 chart-divs/atlantic-crossing]
                    [:div#15.chart.grade2 chart-divs/electros-next-plot-jr]
                    [:div#31.chart.grade2 chart-divs/a-kingdoms-last-hope-jr]
                    [:div#49.chart.grade2 chart-divs/cloud-song]
                    [:div#52.chart.grade2 chart-divs/let-me-be]
                    [:div#54.chart.grade2 chart-divs/lifted]
                    [:div#64.chart.grade2 chart-divs/a-long-kept-secret]
                    [:div#66.chart.grade2 chart-divs/crusin-at-30000]
                    [:div#67.chart.grade2 chart-divs/the-gene-machine]
                    [:div#68.chart.grade2 chart-divs/go-go-blues]
                    [:div#71.chart.grade2 chart-divs/en-su-camino]
                    [:div#72.chart.grade2 chart-divs/sometimes-i-feel]
                    [:div#73.chart.grade2 chart-divs/friday-night-special]
                    [:div#74.chart.grade2 chart-divs/god-rest-ye]
                    [:div#86.chart.grade2 chart-divs/the-first-noel]
                    [:div#87.chart.grade2 chart-divs/what-once-was]
                    [:div#88.chart.grade2 chart-divs/brown-and-tan]
                    [:div#90.chart.grade2 chart-divs/livvy-dear]
                    [:div#92.chart.grade2 chart-divs/summer-on-my-mind]
                    [:div#93.chart.grade2 chart-divs/good-king-w]
                    [:div#95.chart.grade2 chart-divs/no-trespassing]
                    [:div#107.chart.grade2 chart-divs/roscos-big-hit]
                    [:div#108.chart.grade2 chart-divs/the-long-way-home]]]
          :users [:div#users]}
   "three" {:title "Grade Three - Clovertone Music"
            :contents (common-divs/contents "Grade Three"
                                            "Here you will find senior band charts for players with a few years of experience.")
            :charts [:div#charts
                     [:div#list
                      [:div#3.chart.grade3 chart-divs/the-pursuit]
                      [:div#8.chart.grade3 chart-divs/the-dirrty-dog]
                      [:div#12.chart.grade3 chart-divs/on-the-ending-earth]
                      [:div#13.chart.grade3 chart-divs/four-more-to-go]
                      [:div#14.chart.grade3 chart-divs/yun-gia]
                      [:div#33.chart.grade3 chart-divs/the-green-blues]
                      [:div#34.chart.grade3 chart-divs/arcadian-autumn]
                      [:div#39.chart.grade3 chart-divs/sol-fiesta]
                      [:div#40.chart.grade3 chart-divs/tumbadora]
                      [:div#46.chart.grade3 chart-divs/silent-night]
                      [:div#47.chart.grade3 chart-divs/joy-to-the-world]
                      [:div#48.chart.grade3 chart-divs/canal-street-walk]
                      [:div#50.chart.grade3 chart-divs/the-dancehall-shake]
                      [:div#51.chart.grade3 chart-divs/femis-flight]
                      [:div#55.chart.grade3 chart-divs/lost-stories]
                      [:div#56.chart.grade3 chart-divs/dark-matter]
                      [:div#58.chart.grade3 chart-divs/the-wiggle]
                      [:div#69.chart.grade3 chart-divs/the-test]
                      [:div#70.chart.grade3 chart-divs/el-castor-loco]
                      [:div#77.chart.grade3 chart-divs/the-phantom]
                      [:div#83.chart.grade3 chart-divs/don-carlos-dream]
                      [:div#85.chart.grade3 chart-divs/hamunaptra]
                      [:div#94.chart.grade3 chart-divs/introduccion]
                      [:div#101.chart.grade3 chart-divs/midnight-clear]
                      [:div#102.chart.grade3 chart-divs/life-race]
                      [:div#103.chart.grade3 chart-divs/junk]
                      [:div#104.chart.grade3 chart-divs/la-maquina]
                      [:div#105.chart.grade3 chart-divs/last-resorts]
                      [:div#106.chart.grade3 chart-divs/mad-man-mambo]]]}
   "four" {:title "Grade Four - Clovertone Music"
           :contents (common-divs/contents "Grade Four"
                                           "This is where you will find all of our advanced material written at professional level directed towards university bands or strong arts focused high schools.")
           :charts [:div#charts
                    [:div#list
                     [:div#16.chart.grade4 chart-divs/two-dave-k]
                     [:div#17.chart.grade4 chart-divs/a-kingdoms-last-hope]
                     [:div#18.chart.grade4 chart-divs/ten-41-am]
                     [:div#19.chart.grade4 chart-divs/wood-and-shadow]
                     [:div#20.chart.grade4 chart-divs/electros-next-plot]
                     [:div#21.chart.grade4 chart-divs/chazz]
                     [:div#22.chart.grade4 chart-divs/amazing-grace]
                     [:div#23.chart.grade4 chart-divs/the-path]
                     [:div#25.chart.grade4 chart-divs/the-phone-dont-ring-jack]
                     [:div#26.chart.grade4 chart-divs/first-x-free]
                     [:div#38.chart.grade4 chart-divs/funk-out]
                     [:div#41.chart.grade4 chart-divs/vista]
                     [:div#57.chart.grade4 chart-divs/the-fifth-beatle]
                     [:div#62.chart.grade4 chart-divs/this-buts-for-you]
                     [:div#63.chart.grade4 chart-divs/surface-tension]
                     [:div#80.chart.grade4 chart-divs/santiago-nights]
                     [:div#81.chart.grade4 chart-divs/epitaph]
                     [:div#91.chart.grade4 chart-divs/song-for-l]
                     [:div#96.chart.grade4 chart-divs/state-of-mind]
                     [:div#97.chart.grade4 chart-divs/state-of-mind-reprise]
                     [:div#98.chart.grade4 chart-divs/river]
                     [:div#99.chart.grade4 chart-divs/julia]
                     [:div#100.chart.grade4 chart-divs/thinking-in-circles]
                     [:div#109.chart.grade4 chart-divs/ambleside]
                     [:div#110.chart.grade4 chart-divs/intransitory]
                     [:div#111.chart.grade4 chart-divs/twilight-fall]
                     [:div#112.chart.grade4 chart-divs/smooth]
                     [:div#113.chart.grade4 chart-divs/spirits]
                     [:div#114.chart.grade4 chart-divs/arrival-of-the-pegasus]
                     [:div#115.chart.grade4 chart-divs/foot-in-mouth]
                     [:div#116.chart.grade4 chart-divs/in-dreams]
                     [:div#117.chart.grade4 chart-divs/ambleside-reprise]
                     [:div#118.chart.grade4 chart-divs/something-simple]
                     [:div#119.chart.grade4 chart-divs/a-cool-breeze]]]
           :users [:div#users]}})
