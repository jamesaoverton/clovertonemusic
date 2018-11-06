(ns clovertonemusic.genres-pages)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs])

(def html-genres
  {"latin" {:title "Latin - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Latin"]
                        [:p
                         "This genre includes salsa, bossa nova, and samba. All these feels are a fun way to spice up your program and challege your rhythm section."]]]
            :charts [:div#charts
                     [:div#list
                      chart-divs/yun-gia
                      chart-divs/chazz
                      chart-divs/at-long-last
                      chart-divs/hotel-mambo
                      chart-divs/sol-fiesta
                      chart-divs/tumbadora
                      chart-divs/joy-to-the-world
                      chart-divs/el-castor-loco
                      chart-divs/en-su-camino
                      chart-divs/branta
                      chart-divs/santiago-nights
                      chart-divs/introduccion
                      chart-divs/la-maquina
                      chart-divs/mad-man-mambo]]
            :users [:div#users]}
   "swing" {:title "Swing - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Swing"]
                        [:p
                         "We have all tempos of swing from slow shuffles to burners. This is what jazz bands were created to play."]]]
            :charts [:div#charts
                     [:div#list
                      chart-divs/o-canada
                      chart-divs/the-pursuit
                      chart-divs/sock-hop-be-bop
                      chart-divs/detective-story
                      chart-divs/four-more-to-go
                      chart-divs/electros-next-plot-jr
                      chart-divs/two-dave-k
                      chart-divs/ten-41-am
                      chart-divs/electros-next-plot
                      chart-divs/amazing-grace
                      chart-divs/the-phone-dont-ring-jack
                      chart-divs/train-track
                      chart-divs/the-green-blues
                      chart-divs/arcadian-autumn
                      chart-divs/shuswap-shuffle
                      chart-divs/red-river-mud-pie
                      chart-divs/canal-street-walk
                      chart-divs/let-me-be
                      chart-divs/lifted
                      chart-divs/this-buts-for-you
                      chart-divs/surface-tension
                      chart-divs/cowboy-countdown
                      chart-divs/crusin-at-30000
                      chart-divs/the-gene-machine
                      chart-divs/sometimes-i-feel
                      chart-divs/friday-night-special
                      chart-divs/god-rest-ye
                      chart-divs/the-phantom
                      chart-divs/moatfield-shuffle
                      chart-divs/blue-heron
                      chart-divs/the-first-noel
                      chart-divs/livvy-dear
                      chart-divs/song-for-l
                      chart-divs/summer-on-my-mind
                      chart-divs/good-king-w
                      chart-divs/midnight-clear
                      chart-divs/roscos-big-hit]]
            :users [:div#users]}
   "ballad" {:title "Ballad - Clovertone Music"
             :contents [:div#contents
                        [:div#content.index
                         [:h1.title "Ballad"]
                         [:p
                          "In this genre you'll find rock ballads, swing ballads, 3/4 ballads and ballads for dancing. Find something for your festival repertoire here. "]]]
            :charts [:div#charts
                     [:div#list
                      chart-divs/sakura-lullaby
                      chart-divs/that-look
                      chart-divs/on-the-ending-earth
                      chart-divs/wood-and-shadow
                      chart-divs/silent-night
                      chart-divs/dark-matter
                      chart-divs/a-long-kept-secret
                      chart-divs/epitaph
                      chart-divs/what-once-was
                      chart-divs/state-of-mind
                      chart-divs/state-of-mind-reprise
                      chart-divs/the-long-way-home
                      chart-divs/ambleside
                      chart-divs/in-dreams
                      chart-divs/ambleside-reprise]]
            :users [:div#users]}
   "rock" {:title "Funk/Rock - Clovertone Music"
           :contents [:div#contents
                      [:div#content.index
                       [:h1.title "Funk/Rock"]
                       [:p
                        "Have fun with our wide selection of funk and rock tunes. A lot of crowd pleasers can be found here."]]]
           :charts [:div#charts
                    [:div#list
                     chart-divs/the-dirrty-dog
                     chart-divs/game-on
                     chart-divs/the-path
                     chart-divs/first-x-free
                     chart-divs/all-your-base
                     chart-divs/funk-out
                     chart-divs/cloud-song
                     chart-divs/lost-stories
                     chart-divs/the-wiggle
                     chart-divs/gentlemen
                     chart-divs/la-cattura
                     chart-divs/go-go-blues
                     chart-divs/la-squadra-da-milano
                     chart-divs/stone-cold-strut
                     chart-divs/hamunaptra
                     chart-divs/brown-and-tan
                     chart-divs/no-trespassing
                     chart-divs/river
                     chart-divs/julia
                     chart-divs/thinking-in-circles
                     chart-divs/life-race
                     chart-divs/junk
                     chart-divs/last-resorts
                     chart-divs/intransitory
                     chart-divs/twilight-fall
                     chart-divs/smooth
                     chart-divs/spirits
                     chart-divs/arrival-of-the-pegasus
                     chart-divs/foot-in-mouth
                     chart-divs/something-simple
                     chart-divs/a-cool-breeze]]
           :users [:div#users]}
   "other" {:title "Other - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Other"]
                        [:p
                         "We proudly carry feels not normally associated with jazz band. Look here to find world rhythms like reggae, afro beat, 12/8 feel, and odd meter feels."]]]
            :charts [:div#charts
                     [:div#list
                      chart-divs/tango
                      chart-divs/atlantic-crossing
                      chart-divs/a-kingdoms-last-hope
                      chart-divs/petes-chune
                      chart-divs/a-kingdoms-last-hope-jr
                      chart-divs/vista
                      chart-divs/the-dancehall-shake
                      chart-divs/femis-flight
                      chart-divs/the-fifth-beatle
                      chart-divs/the-test
                      chart-divs/don-carlos-dream]]
            :users [:div#users]}})
