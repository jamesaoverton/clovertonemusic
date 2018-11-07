(ns clovertonemusic.chartspages
  (:require [clovertonemusic.chartdivs :as chartdivs]
            [clovertonemusic.catalogue :as catalogue]))

(def html-charts
  {"10-41-am" {:title "10:41AM - Clovertone Music"
               :contents chartdivs/ten-41-am
               :charts [:div#charts]
               :users [:div#users]}
   "2-dave-k" {:title "2 Dave K - Clovertone Music"
               :contents chartdivs/two-dave-k
               :charts [:div#charts]
               :users [:div#users]}
   "a-cool-breeze" {:title "A Cool Breeze - Clovertone Music"
                    :contents chartdivs/a-cool-breeze
                    :charts [:div#charts]
                    :users [:div#users]}
   "a-kingdoms-last-hope" {:title "A Kingdom's Last Hope - Clovertone Music"
                           :contents chartdivs/a-kingdoms-last-hope
                           :charts [:div#charts]
                           :users [:div#users]}
   "a-kingdoms-last-hope-jr" {:title "A Kingdom's Last Hope Jr. - Clovertone Music"
                              :contents chartdivs/a-kingdoms-last-hope-jr
                              :charts [:div#charts]
                              :users [:div#users]}
   "all-your-base" {:title "All Your Base - Clovertone Music"
                    :contents chartdivs/all-your-base
                    :charts [:div#charts]
                    :users [:div#users]}
   "a-long-kept-secret" {:title "A Long Kept Secret - Clovertone Music"
                         :contents chartdivs/a-long-kept-secret
                         :charts [:div#charts]
                         :users [:div#users]}
   "amazing-grace" {:title "Amazing Grace - Clovertone Music"
                    :contents chartdivs/amazing-grace
                    :charts [:div#charts]
                    :users [:div#users]}
   "ambleside" {:title "Ambleside - Clovertone Music"
                :contents chartdivs/ambleside
                :charts [:div#charts]
                :users [:div#users]}
   "ambleside-reprise" {:title "Ambleside (Reprise) - Clovertone Music"
                        :contents chartdivs/ambleside-reprise
                        :charts [:div#charts]
                        :users [:div#users]}
   "arcadian-autumn" {:title "Arcadian Autumn - Clovertone Music"
                      :contents chartdivs/arcadian-autumn
                      :charts [:div#charts]
                      :users [:div#users]}
   "arrival-of-the-pegasus" {:title "Arrival of the Pegasus - Clovertone Music"
                             :contents chartdivs/arrival-of-the-pegasus
                             :charts [:div#charts]
                             :users [:div#users]}
   "atlantic-crossing" {:title "Atlantic Crossing - Clovertone Music"
                        :contents chartdivs/atlantic-crossing
                        :charts [:div#charts]
                        :users [:div#users]}
   "at-long-last" {:title "At Long Last - Clovertone Music"
                   :contents chartdivs/at-long-last
                   :charts [:div#charts]
                   :users [:div#users]}
   "blue-heron" {:title "Blue Heron - Clovertone Music"
                 :contents chartdivs/blue-heron
                 :charts [:div#charts]
                 :users [:div#users]}
   "branta" {:title "Branta - Clovertone Music"
             :contents chartdivs/branta
             :charts [:div#charts]
             :users [:div#users]}
   "brown-and-tan" {:title "Brown and Tan - Clovertone Music"
                    :contents chartdivs/brown-and-tan
                    :charts [:div#charts]
                    :users [:div#users]}
   "canal-street-walk" {:title "Canal Street Walk - Clovertone Music"
                        :contents chartdivs/canal-street-walk
                        :charts [:div#charts]
                        :users [:div#users]}
   "chazz" {:title "Chazz - Clovertone Music"
            :contents chartdivs/chazz
            :charts [:div#charts]
            :users [:div#users]}
   "cloud-song" {:title "Cloud Song - Clovertone Music"
                 :contents chartdivs/cloud-song
                 :charts [:div#charts]
                 :users [:div#users]}
   "cowboy-countdown" {:title "Cowboy Countdown - Clovertone Music"
                       :contents chartdivs/cowboy-countdown
                       :charts [:div#charts]
                       :users [:div#users]}
   "crusin-at-30000" {:title "Crusin' at 30000 - Clovertone Music"
                      :contents chartdivs/crusin-at-30000
                      :charts [:div#charts]
                      :users [:div#users]}
   "dark-matter" {:title "Dark Matter - Clovertone Music"
                  :contents chartdivs/dark-matter
                  :charts [:div#charts]
                  :users [:div#users]}
   "detective-story" {:title "Detective Story - Clovertone Music"
                      :contents chartdivs/detective-story
                      :charts [:div#charts]
                      :users [:div#users]}
   "don-carlos-dream" {:title "Don Carlos' Dream - Clovertone Music"
                       :contents chartdivs/don-carlos-dream
                       :charts [:div#charts]
                       :users [:div#users]}
   "el-castor-loco" {:title "El Castor Loco - Clovertone Music"
                     :contents chartdivs/el-castor-loco
                     :charts [:div#charts]
                     :users [:div#users]}
   "electros-next-plot" {:title "Electro's Next Plot  - Clovertone Music"
                         :contents chartdivs/electros-next-plot
                         :charts [:div#charts]
                         :users [:div#users]}
   "electros-next-plot-jr" {:title "Electro's Next Plot (Jr.) - Clovertone Music"
                            :contents chartdivs/electros-next-plot-jr
                            :charts [:div#charts]
                            :users [:div#users]}
   "en-su-camino" {:title "En Su Camino - Clovertone Music"
                   :contents chartdivs/en-su-camino
                   :charts [:div#charts]
                   :users [:div#users]}
   "epitaph" {:title "Epitaph - Clovertone Music"
              :contents chartdivs/epitaph
              :charts [:div#charts]
              :users [:div#users]}
   "femis-flight" {:title "Femi's Flight - Clovertone Music"
                   :contents chartdivs/femis-flight
                   :charts [:div#charts]
                   :users [:div#users]}
   "first-x-free" {:title "First X Free - Clovertone Music"
                   :contents chartdivs/first-x-free
                   :charts [:div#charts]
                   :users [:div#users]}
   "foot-in-mouth" {:title "Foot in Mouth - Clovertone Music"
                    :contents chartdivs/foot-in-mouth
                    :charts [:div#charts]
                    :users [:div#users]}
   "four-more-to-go" {:title "Four More to Go - Clovertone Music"
                      :contents chartdivs/four-more-to-go
                      :charts [:div#charts]
                      :users [:div#users]}
   "friday-night-special" {:title "Friday Night Special - Clovertone Music"
                           :contents chartdivs/friday-night-special
                           :charts [:div#charts]
                           :users [:div#users]}
   "funk-out" {:title "Funk Out - Clovertone Music"
               :contents chartdivs/funk-out
               :charts [:div#charts]
               :users [:div#users]}
   "game-on" {:title "Game On! - Clovertone Music"
              :contents chartdivs/game-on
              :charts [:div#charts]
              :users [:div#users]}
   "gentlemen" {:title "Gentlemen - Clovertone Music"
                :contents chartdivs/gentlemen
                :charts [:div#charts]
                :users [:div#users]}
   "god-rest-ye" {:title "God Rest Ye Merry Gentlemen - Clovertone Music"
                  :contents chartdivs/god-rest-ye
                  :charts [:div#charts]
                  :users [:div#users]}
   "go-go-blues" {:title "Go Go Blues - Clovertone Music"
                  :contents chartdivs/go-go-blues
                  :charts [:div#charts]
                  :users [:div#users]}
   "good-king-w" {:title "Good King Wenceslas - Clovertone Music"
                  :contents chartdivs/good-king-w
                  :charts [:div#charts]
                  :users [:div#users]}
   "hamunaptra" {:title "Hamunaptra - Clovertone Music"
                 :contents chartdivs/hamunaptra
                 :charts [:div#charts]
                 :users [:div#users]}
   "hotel-mambo" {:title "Hotel Mambo - Clovertone Music"
                  :contents chartdivs/hotel-mambo
                  :charts [:div#charts]
                  :users [:div#users]}
   "in-dreams" {:title "In Dreams - Clovertone Music"
                :contents chartdivs/in-dreams
                :charts [:div#charts]
                :users [:div#users]}
   "intransitory" {:title "Intransitory - Clovertone Music"
                   :contents chartdivs/intransitory
                   :charts [:div#charts]
                   :users [:div#users]}
   "introduccion" {:title "Introduccion - Clovertone Music"
                   :contents chartdivs/introduccion
                   :charts [:div#charts]
                   :users [:div#users]}
   "joy-to-the-world" {:title "Joy to the World - Clovertone Music"
                       :contents chartdivs/joy-to-the-world
                       :charts [:div#charts]
                       :users [:div#users]}
   "julia" {:title "Julia - Clovertone Music"
            :contents chartdivs/julia
            :charts [:div#charts]
            :users [:div#users]}
   "junk" {:title "Junk - Clovertone Music"
           :contents chartdivs/junk
           :charts [:div#charts]
           :users [:div#users]}
   "la-cattura" {:title "La Cattura Di Salvatore Veloce - Clovertone Music"
                 :contents chartdivs/la-cattura
                 :charts [:div#charts]
                 :users [:div#users]}
   "la-maquina" {:title "La Maquina - Clovertone Music"
                 :contents chartdivs/la-maquina
                 :charts [:div#charts]
                 :users [:div#users]}
   "la-squadra-da-milano" {:title "La Squadra Da Milano - Clovertone Music"
                           :contents chartdivs/la-squadra-da-milano
                           :charts [:div#charts]
                           :users [:div#users]}
   "last-resorts" {:title "Last Resorts - Clovertone Music"
                   :contents chartdivs/last-resorts
                   :charts [:div#charts]
                   :users [:div#users]}
   "let-me-be" {:title "Let Me Be the Sugar in Your Tea - Clovertone Music"
                :contents chartdivs/let-me-be
                :charts [:div#charts]
                :users [:div#users]}
   "life-race" {:title "Life Race - Clovertone Music"
                :contents chartdivs/life-race
                :charts [:div#charts]
                :users [:div#users]}
   "lifted" {:title "Lifted - Clovertone Music"
             :contents chartdivs/lifted
             :charts [:div#charts]
             :users [:div#users]}
   "livvy-dear" {:title "Livvy Dear - Clovertone Music"
                 :contents chartdivs/livvy-dear
                 :charts [:div#charts]
                 :users [:div#users]}
   "lost-stories" {:title "Lost Stories - Clovertone Music"
                   :contents chartdivs/lost-stories
                   :charts [:div#charts]
                   :users [:div#users]}
   "mad-man-mambo" {:title "Mad Man Mambo - Clovertone Music"
                    :contents chartdivs/mad-man-mambo
                    :charts [:div#charts]
                    :users [:div#users]}
   "midnight-clear" {:title "It Came Upon a Midnight Clear - Clovertone Music"
                     :contents chartdivs/midnight-clear
                     :charts [:div#charts]
                     :users [:div#users]}
   "moatfield-shuffle" {:title "Moatfield Shuffle - Clovertone Music"
                        :contents chartdivs/moatfield-shuffle
                        :charts [:div#charts]
                        :users [:div#users]}
   "no-trespassing" {:title "No Trespassing - Clovertone Music"
                     :contents chartdivs/no-trespassing
                     :charts [:div#charts]
                     :users [:div#users]}
   "o-canada" {:title "O Canada - Clovertone Music"
               :contents chartdivs/o-canada
               :charts [:div#charts]
               :users [:div#users]}
   "on-the-ending-earth" {:title "On The Ending Earth - Clovertone Music"
                          :contents chartdivs/on-the-ending-earth
                          :charts [:div#charts]
                          :users [:div#users]}
   "petes-chune" {:title "Pete's Chune - Clovertone Music"
                  :contents chartdivs/petes-chune
                  :charts [:div#charts]
                  :users [:div#users]}
   "red-river-mud-pie" {:title "Red River Mud Pie - Clovertone Music"
                        :contents chartdivs/red-river-mud-pie
                        :charts [:div#charts]
                        :users [:div#users]}
   "river" {:title "River - Clovertone Music"
            :contents chartdivs/river
            :charts [:div#charts]
            :users [:div#users]}
   "roscos-big-hit" {:title "Rosco's Big Hit - Clovertone Music"
                     :contents chartdivs/roscos-big-hit
                     :charts [:div#charts]
                     :users [:div#users]}
   "sakura-lullaby" {:title "Sakura Lullaby - Clovertone Music"
                     :contents chartdivs/sakura-lullaby
                     :charts [:div#charts]
                     :users [:div#users]}
   "santiago-nights" {:title "Santiago Nights - Clovertone Music"
                      :contents chartdivs/santiago-nights
                      :charts [:div#charts]
                      :users [:div#users]}
   "shuswap-shuffle" {:title "Shuswap Shuffle - Clovertone Music"
                      :contents chartdivs/shuswap-shuffle
                      :charts [:div#charts]
                      :users [:div#users]}
   "silent-night" {:title "Silent Night - Clovertone Music"
                   :contents chartdivs/silent-night
                   :charts [:div#charts]
                   :users [:div#users]}
   "smooth" {:title "Smooth - Clovertone Music"
             :contents chartdivs/smooth
             :charts [:div#charts]
             :users [:div#users]}
   "sock-hop-be-bop" {:title "Sock Hop Be-Bop - Clovertone Music"
                      :contents chartdivs/sock-hop-be-bop
                      :charts [:div#charts]
                      :users [:div#users]}
   "sol-fiesta" {:title "Sol Fiesta - Clovertone Music"
                 :contents chartdivs/sol-fiesta
                 :charts [:div#charts]
                 :users [:div#users]}
   "something-simple" {:title "Something Simple - Clovertone Music"
                       :contents chartdivs/something-simple
                       :charts [:div#charts]
                       :users [:div#users]}
   "sometimes-i-feel" {:title "Sometimes I Feel Like a Muppet - Clovertone Music"
                       :contents chartdivs/sometimes-i-feel
                       :charts [:div#charts]
                       :users [:div#users]}
   "song-for-l" {:title "Song For L - Clovertone Music"
                 :contents chartdivs/song-for-l
                 :charts [:div#charts]
                 :users [:div#users]}
   "spirits" {:title "Spirits - Clovertone Music"
              :contents chartdivs/spirits
              :charts [:div#charts]
              :users [:div#users]}
   "state-of-mind" {:title "State of Mind - Clovertone Music"
                    :contents chartdivs/state-of-mind
                    :charts [:div#charts]
                    :users [:div#users]}
   "state-of-mind-reprise" {:title "State of Mind Reprise - Clovertone Music"
                            :contents chartdivs/state-of-mind-reprise
                            :charts [:div#charts]
                            :users [:div#users]}
   "stone-cold-strut" {:title "Stone Cold Strut - Clovertone Music"
                       :contents chartdivs/stone-cold-strut
                       :charts [:div#charts]
                       :users [:div#users]}
   "summer-on-my-mind" {:title "Summer on my Mind - Clovertone Music"
                        :contents chartdivs/summer-on-my-mind
                        :charts [:div#charts]
                        :users [:div#users]}
   "surface-tension" {:title "Surface Tension - Clovertone Music"
                      :contents chartdivs/surface-tension
                      :charts [:div#charts]
                      :users [:div#users]}
   "tango" {:title "Tango! - Clovertone Music"
            :contents chartdivs/tango
            :charts [:div#charts]
            :users [:div#users]}
   "that-look" {:title "That Look - Clovertone Music"
                :contents chartdivs/that-look
                :charts [:div#charts]
                :users [:div#users]}
   "the-dancehall-shake" {:title "The Dancehall Shake - Clovertone Music"
                          :contents chartdivs/the-dancehall-shake
                          :charts [:div#charts]
                          :users [:div#users]}
   "the-dirrty-dog" {:title "The Dirrty Dog - Clovertone Music"
                     :contents chartdivs/the-dirrty-dog
                     :charts [:div#charts]
                     :users [:div#users]}
   "the-fifth-beatle" {:title "The Fifth Beatle - Clovertone Music"
                       :contents chartdivs/the-fifth-beatle
                       :charts [:div#charts]
                       :users [:div#users]}
   "the-first-noel" {:title "The First Noel - Clovertone Music"
                     :contents chartdivs/the-first-noel
                     :charts [:div#charts]
                     :users [:div#users]}
   "the-gene-machine" {:title "The Gene Machine - Clovertone Music"
                       :contents chartdivs/the-gene-machine
                       :charts [:div#charts]
                       :users [:div#users]}
   "the-green-blues" {:title "The Green Blues - Clovertone Music"
                      :contents chartdivs/the-green-blues
                      :charts [:div#charts]
                      :users [:div#users]}
   "the-long-way-home" {:title "The Long Way Home - Clovertone Music"
                        :contents chartdivs/the-long-way-home
                        :charts [:div#charts]
                        :users [:div#users]}
   "the-path" {:title "The Path - Clovertone Music"
               :contents chartdivs/the-path
               :charts [:div#charts]
               :users [:div#users]}
   "the-phantom" {:title "The Phantom - Clovertone Music"
                  :contents chartdivs/the-phantom
                  :charts [:div#charts]
                  :users [:div#users]}
   "the-phone-dont-ring-jack" {:title "The Phone Don't Ring Jack - Clovertone Music"
                               :contents chartdivs/the-phone-dont-ring-jack
                               :charts [:div#charts]
                               :users [:div#users]}
   "the-pursuit" {:title "The Pursuit - Clovertone Music"
                  :contents chartdivs/the-pursuit
                  :charts [:div#charts]
                  :users [:div#users]}
   "the-test" {:title "The Test - Clovertone Music"
               :contents chartdivs/the-test
               :charts [:div#charts]
               :users [:div#users]}
   "the-wiggle" {:title "The Wiggle - Clovertone Music"
                 :contents chartdivs/the-wiggle
                 :charts [:div#charts]
                 :users [:div#users]}
   "thinking-in-circles" {:title "Thinking In Circles - Clovertone Music"
                          :contents chartdivs/thinking-in-circles
                          :charts [:div#charts]
                          :users [:div#users]}
   "this-buts-for-you" {:title "This But's for You! - Clovertone Music"
                        :contents chartdivs/this-buts-for-you
                        :charts [:div#charts]
                        :users [:div#users]}
   "train-track" {:title "Train Track - Clovertone Music"
                  :contents chartdivs/train-track
                  :charts [:div#charts]
                  :users [:div#users]}
   "tumbadora" {:title "Tumbadora - Clovertone Music"
                :contents chartdivs/tumbadora
                :charts [:div#charts]
                :users [:div#users]}
   "twilight-fall" {:title "The Twilight Fall - Clovertone Music"
                    :contents chartdivs/twilight-fall
                    :charts [:div#charts]
                    :users [:div#users]}
   "vista" {:title "Vista - Clovertone Music"
            :contents chartdivs/vista
            :charts [:div#charts]
            :users [:div#users]}
   "what-once-was" {:title "What Once Was - Clovertone Music"
                    :contents chartdivs/what-once-was
                    :charts [:div#charts]
                    :users [:div#users]}
   "wood-and-shadow" {:title "Wood & Shadow - Clovertone Music"
                      :contents chartdivs/wood-and-shadow
                      :charts [:div#charts]
                      :users [:div#users]}
   "yun-gia" {:title "Yun Gia - Clovertone Music"
              :contents chartdivs/yun-gia
              :charts [:div#charts]
              :users [:div#users]}
   "index" {:title "All Charts - Clovertone Music"
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "All Charts"]
                        [:p
                         "Here's a list of all our titles so you can browse from the oldest selections to our newest material."]]]
            :charts [:div#charts
                     (let [all-charts (reduce (fn [saved-charts next-chart]
                                                  (conj saved-charts (chartdivs/chart-to-html next-chart)))
                                              [:div#list] (:charts catalogue/catalogue))]
                       all-charts)]
            :users [:div#users]}})
