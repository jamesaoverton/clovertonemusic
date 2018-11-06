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
                    chart-divs/o-canada
                    chart-divs/sock-hop-be-bop
                    chart-divs/tango
                    chart-divs/sakura-lullaby
                    chart-divs/game-on
                    chart-divs/at-long-last
                    chart-divs/hotel-mambo
                    chart-divs/petes-chune
                    chart-divs/train-track
                    chart-divs/all-your-base
                    chart-divs/shuswap-shuffle
                    chart-divs/red-river-mud-pie
                    chart-divs/gentlemen
                    chart-divs/la-cattura
                    chart-divs/cowboy-countdown
                    chart-divs/la-squadra-da-milano
                    chart-divs/stone-cold-strut
                    chart-divs/branta
                    chart-divs/moatfield-shuffle
                    chart-divs/blue-heron]]
          :users [:div#users]}
   "two" {:title "Grade Two - Clovertone Music"
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "Grade Two"]
                      [:p
                       "These grade 2 charts are aimed at intermediate bands or good junior bands."]]]
          :charts [:div#charts
                   [:div#list
                    chart-divs/detective-story
                    chart-divs/that-look
                    chart-divs/atlantic-crossing
                    chart-divs/electros-next-plot-jr
                    chart-divs/a-kingdoms-last-hope-jr
                    chart-divs/cloud-song
                    chart-divs/let-me-be
                    chart-divs/lifted
                    chart-divs/a-long-kept-secret
                    chart-divs/crusin-at-30000
                    chart-divs/the-gene-machine
                    chart-divs/go-go-blues
                    chart-divs/en-su-camino
                    chart-divs/sometimes-i-feel
                    chart-divs/friday-night-special
                    chart-divs/god-rest-ye
                    chart-divs/the-first-noel
                    chart-divs/what-once-was
                    chart-divs/brown-and-tan
                    chart-divs/livvy-dear
                    chart-divs/summer-on-my-mind
                    chart-divs/good-king-w
                    chart-divs/no-trespassing
                    chart-divs/roscos-big-hit
                    chart-divs/the-long-way-home]]
          :users [:div#users]}
   "three" {:title "Grade Three - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Grade Three"]
                        [:p
                         "Here you will find senior band charts for players with a few years of experience."]]]
            :charts [:div#charts
                     [:div#list
                      chart-divs/the-pursuit
                      chart-divs/the-dirrty-dog
                      chart-divs/on-the-ending-earth
                      chart-divs/four-more-to-go
                      chart-divs/yun-gia
                      chart-divs/the-green-blues
                      chart-divs/arcadian-autumn
                      chart-divs/sol-fiesta
                      chart-divs/tumbadora
                      chart-divs/silent-night
                      chart-divs/joy-to-the-world
                      chart-divs/canal-street-walk
                      chart-divs/the-dancehall-shake
                      chart-divs/femis-flight
                      chart-divs/lost-stories
                      chart-divs/dark-matter
                      chart-divs/the-wiggle
                      chart-divs/the-test
                      chart-divs/el-castor-loco
                      chart-divs/the-phantom
                      chart-divs/don-carlos-dream
                      chart-divs/hamunaptra
                      chart-divs/introduccion
                      chart-divs/midnight-clear
                      chart-divs/life-race
                      chart-divs/junk
                      chart-divs/la-maquina
                      chart-divs/last-resorts
                      chart-divs/mad-man-mambo]]
            :users [:div#users]}
   "four" {:title "Grade Four - Clovertone Music"
           :contents [:div#contents
                      [:div#content.index
                       [:h1.title "Grade Four"]
                       [:p
                        "This is where you will find all of our advanced material written at professional level directed towards university bands or strong arts focused high schools. "]]]
           :charts [:div#charts
                    [:div#list
                     chart-divs/two-dave-k
                     chart-divs/a-kingdoms-last-hope
                     chart-divs/ten-41-am
                     chart-divs/wood-and-shadow
                     chart-divs/electros-next-plot
                     chart-divs/chazz
                     chart-divs/amazing-grace
                     chart-divs/the-path
                     chart-divs/the-phone-dont-ring-jack
                     chart-divs/first-x-free
                     chart-divs/funk-out
                     chart-divs/vista
                     chart-divs/the-fifth-beatle
                     chart-divs/this-buts-for-you
                     chart-divs/surface-tension
                     chart-divs/santiago-nights
                     chart-divs/epitaph
                     chart-divs/song-for-l
                     chart-divs/state-of-mind
                     chart-divs/state-of-mind-reprise
                     chart-divs/river
                     chart-divs/julia
                     chart-divs/thinking-in-circles
                     chart-divs/ambleside
                     chart-divs/intransitory
                     chart-divs/twilight-fall
                     chart-divs/smooth
                     chart-divs/spirits
                     chart-divs/arrival-of-the-pegasus
                     chart-divs/foot-in-mouth
                     chart-divs/in-dreams
                     chart-divs/ambleside-reprise
                     chart-divs/something-simple
                     chart-divs/a-cool-breeze]]
           :users [:div#users]}})
