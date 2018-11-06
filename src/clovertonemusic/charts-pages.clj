(ns clovertonemusic.charts-pages)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs])

(def html-charts
  {"10-41-am" {:title "10:41AM - Clovertone Music"
               :contents chart-divs/ten-41-am
               :charts [:div#charts]
               :users [:div#users]}
   "2-dave-k" {:title "2 Dave K - Clovertone Music"
               :contents chart-divs/two-dave-k
               :charts [:div#charts]
               :users [:div#users]}
   "a-cool-breeze" {:title "A Cool Breeze - Clovertone Music"
                    :contents chart-divs/a-cool-breeze
                    :charts [:div#charts]
                    :users [:div#users]}
   "a-kingdoms-last-hope" {:title "A Kingdom's Last Hope - Clovertone Music"
                           :contents chart-divs/a-kingdoms-last-hope
                           :charts [:div#charts]
                           :users [:div#users]}
   "a-kingdoms-last-hope-jr" {:title "A Kingdom's Last Hope Jr. - Clovertone Music"
                              :contents chart-divs/a-kingdoms-last-hope-jr
                              :charts [:div#charts]
                              :users [:div#users]}
   "all-your-base" {:title "All Your Base - Clovertone Music"
                    :contents chart-divs/all-your-base
                    :charts [:div#charts]
                    :users [:div#users]}
   "a-long-kept-secret" {:title "A Long Kept Secret - Clovertone Music"
                         :contents chart-divs/a-long-kept-secret
                         :charts [:div#charts]
                         :users [:div#users]}
   "amazing-grace" {:title "Amazing Grace - Clovertone Music"
                    :contents chart-divs/amazing-grace
                    :charts [:div#charts]
                    :users [:div#users]}
   "ambleside" {:title "Ambleside - Clovertone Music"
                :contents chart-divs/ambleside
                :charts [:div#charts]
                :users [:div#users]}
   "ambleside-reprise" {:title "Ambleside (Reprise) - Clovertone Music"
                        :contents chart-divs/ambleside-reprise
                        :charts [:div#charts]
                        :users [:div#users]}
   "arcadian-autumn" {:title "Arcadian Autumn - Clovertone Music"
                      :contents chart-divs/arcadian-autumn
                      :charts [:div#charts]
                      :users [:div#users]}
   "arrival-of-the-pegasus" {:title "Arrival of the Pegasus - Clovertone Music"
                             :contents chart-divs/arrival-of-the-pegasus
                             :charts [:div#charts]
                             :users [:div#users]}
   "atlantic-crossing" {:title "Atlantic Crossing - Clovertone Music"
                        :contents chart-divs/atlantic-crossing
                        :charts [:div#charts]
                        :users [:div#users]}
   "at-long-last" {:title "At Long Last - Clovertone Music"
                   :contents chart-divs/at-long-last
                   :charts [:div#charts]
                   :users [:div#users]}
   "blue-heron" {:title "Blue Heron - Clovertone Music"
                 :contents chart-divs/blue-heron
                 :charts [:div#charts]
                 :users [:div#users]}
   "branta" {:title "Branta - Clovertone Music"
             :contents chart-divs/branta
             :charts [:div#charts]
             :users [:div#users]}
   "brown-and-tan" {:title "Brown and Tan - Clovertone Music"
                    :contents chart-divs/brown-and-tan
                    :charts [:div#charts]
                    :users [:div#users]}
   "canal-street-walk" {:title "Canal Street Walk - Clovertone Music"
                        :contents chart-divs/canal-street-walk
                        :charts [:div#charts]
                        :users [:div#users]}
   "chazz" {:title "Chazz - Clovertone Music"
            :contents chart-divs/chazz
            :charts [:div#charts]
            :users [:div#users]}
   "cloud-song" {:title "Cloud Song - Clovertone Music"
                 :contents chart-divs/cloud-song
                 :charts [:div#charts]
                 :users [:div#users]}
   "cowboy-countdown" {:title "Cowboy Countdown - Clovertone Music"
                       :contents chart-divs/cowboy-countdown
                       :charts [:div#charts]
                       :users [:div#users]}
   "crusin-at-30000" {:title "Crusin' at 30000 - Clovertone Music"
                      :contents chart-divs/crusin-at-30000
                      :charts [:div#charts]
                      :users [:div#users]}
   "dark-matter" {:title "Dark Matter - Clovertone Music"
                  :contents chart-divs/dark-matter
                  :charts [:div#charts]
                  :users [:div#users]}
   "detective-story" {:title "Detective Story - Clovertone Music"
                      :contents chart-divs/detective-story
                      :charts [:div#charts]
                      :users [:div#users]}
   "don-carlos-dream" {:title "Don Carlos' Dream - Clovertone Music"
                       :contents chart-divs/don-carlos-dream
                       :charts [:div#charts]
                       :users [:div#users]}
   "el-castor-loco" {:title "El Castor Loco - Clovertone Music"
                     :contents chart-divs/el-castor-loco
                     :charts [:div#charts]
                     :users [:div#users]}
   "electros-next-plot" {:title "Electro's Next Plot  - Clovertone Music"
                         :contents chart-divs/electros-next-plot
                         :charts [:div#charts]
                         :users [:div#users]}
   "electros-next-plot-jr" {:title "Electro's Next Plot (Jr.) - Clovertone Music"
                            :contents chart-divs/electros-next-plot-jr
                            :charts [:div#charts]
                            :users [:div#users]}
   "en-su-camino" {:title "En Su Camino - Clovertone Music"
                   :contents chart-divs/en-su-camino
                   :charts [:div#charts]
                   :users [:div#users]}
   "epitaph" {:title "Epitaph - Clovertone Music"
              :contents chart-divs/epitaph
              :charts [:div#charts]
              :users [:div#users]}
   "femis-flight" {:title "Femi's Flight - Clovertone Music"
                   :contents chart-divs/femis-flight
                   :charts [:div#charts]
                   :users [:div#users]}
   "first-x-free" {:title "First X Free - Clovertone Music"
                   :contents chart-divs/first-x-free
                   :charts [:div#charts]
                   :users [:div#users]}
   "foot-in-mouth" {:title "Foot in Mouth - Clovertone Music"
                    :contents chart-divs/foot-in-mouth
                    :charts [:div#charts]
                    :users [:div#users]}
   "four-more-to-go" {:title "Four More to Go - Clovertone Music"
                      :contents chart-divs/four-more-to-go
                      :charts [:div#charts]
                      :users [:div#users]}
   "friday-night-special" {:title "Friday Night Special - Clovertone Music"
                           :contents chart-divs/friday-night-special
                           :charts [:div#charts]
                           :users [:div#users]}
   "funk-out" {:title "Funk Out - Clovertone Music"
               :contents chart-divs/funk-out
               :charts [:div#charts]
               :users [:div#users]}
   "game-on" {:title "Game On! - Clovertone Music"
              :contents chart-divs/game-on
              :charts [:div#charts]
              :users [:div#users]}
   "gentlemen" {:title "Gentlemen - Clovertone Music"
                :contents chart-divs/gentlemen
                :charts [:div#charts]
                :users [:div#users]}
   "god-rest-ye" {:title "God Rest Ye Merry Gentlemen - Clovertone Music"
                  :contents chart-divs/god-rest-ye
                  :charts [:div#charts]
                  :users [:div#users]}
   "go-go-blues" {:title "Go Go Blues - Clovertone Music"
                  :contents chart-divs/go-go-blues
                  :charts [:div#charts]
                  :users [:div#users]}
   "good-king-w" {:title "Good King Wenceslas - Clovertone Music"
                  :contents chart-divs/good-king-w
                  :charts [:div#charts]
                  :users [:div#users]}
   "hamunaptra" {:title "Hamunaptra - Clovertone Music"
                 :contents chart-divs/hamunaptra
                 :charts [:div#charts]
                 :users [:div#users]}
   "hotel-mambo" {:title "Hotel Mambo - Clovertone Music"
                  :contents chart-divs/hotel-mambo
                  :charts [:div#charts]
                  :users [:div#users]}
   "in-dreams" {:title "In Dreams - Clovertone Music"
                :contents chart-divs/in-dreams
                :charts [:div#charts]
                :users [:div#users]}
   "intransitory" {:title "Intransitory - Clovertone Music"
                   :contents chart-divs/intransitory
                   :charts [:div#charts]
                   :users [:div#users]}
   "introduccion" {:title "Introduccion - Clovertone Music"
                   :contents chart-divs/introduccion
                   :charts [:div#charts]
                   :users [:div#users]}
   "joy-to-the-world" {:title "Joy to the World - Clovertone Music"
                       :contents chart-divs/joy-to-the-world
                       :charts [:div#charts]
                       :users [:div#users]}
   "julia" {:title "Julia - Clovertone Music"
            :contents chart-divs/julia
            :charts [:div#charts]
            :users [:div#users]}
   "junk" {:title "Junk - Clovertone Music"
           :contents chart-divs/junk
           :charts [:div#charts]
           :users [:div#users]}
   "la-cattura" {:title "La Cattura Di Salvatore Veloce - Clovertone Music"
                 :contents chart-divs/la-cattura
                 :charts [:div#charts]
                 :users [:div#users]}
   "la-maquina" {:title "La Maquina - Clovertone Music"
                 :contents chart-divs/la-maquina
                 :charts [:div#charts]
                 :users [:div#users]}
   "la-squadra-da-milano" {:title "La Squadra Da Milano - Clovertone Music"
                           :contents chart-divs/la-squadra-da-milano
                           :charts [:div#charts]
                           :users [:div#users]}
   "last-resorts" {:title "Last Resorts - Clovertone Music"
                   :contents chart-divs/last-resorts
                   :charts [:div#charts]
                   :users [:div#users]}
   "let-me-be" {:title "Let Me Be the Sugar in Your Tea - Clovertone Music"
                :contents chart-divs/let-me-be
                :charts [:div#charts]
                :users [:div#users]}
   "life-race" {:title "Life Race - Clovertone Music"
                :contents chart-divs/life-race
                :charts [:div#charts]
                :users [:div#users]}
   "lifted" {:title "Lifted - Clovertone Music"
             :contents chart-divs/lifted
             :charts [:div#charts]
             :users [:div#users]}
   "livvy-dear" {:title "Livvy Dear - Clovertone Music"
                 :contents chart-divs/livvy-dear
                 :charts [:div#charts]
                 :users [:div#users]}
   "lost-stories" {:title "Lost Stories - Clovertone Music"
                   :contents chart-divs/lost-stories
                   :charts [:div#charts]
                   :users [:div#users]}
   "mad-man-mambo" {:title "Mad Man Mambo - Clovertone Music"
                    :contents chart-divs/mad-man-mambo
                    :charts [:div#charts]
                    :users [:div#users]}
   "midnight-clear" {:title "It Came Upon a Midnight Clear - Clovertone Music"
                     :contents chart-divs/midnight-clear
                     :charts [:div#charts]
                     :users [:div#users]}
   "moatfield-shuffle" {:title "Moatfield Shuffle - Clovertone Music"
                        :contents chart-divs/moatfield-shuffle
                        :charts [:div#charts]
                        :users [:div#users]}
   "no-trespassing" {:title "No Trespassing - Clovertone Music"
                     :contents chart-divs/no-trespassing
                     :charts [:div#charts]
                     :users [:div#users]}
   "o-canada" {:title "O Canada - Clovertone Music"
               :contents chart-divs/o-canada
               :charts [:div#charts]
               :users [:div#users]}
   "on-the-ending-earth" {:title "On The Ending Earth - Clovertone Music"
                          :contents chart-divs/on-the-ending-earth
                          :charts [:div#charts]
                          :users [:div#users]}
   "petes-chune" {:title "Pete's Chune - Clovertone Music"
                  :contents chart-divs/petes-chune
                  :charts [:div#charts]
                  :users [:div#users]}
   "red-river-mud-pie" {:title "Red River Mud Pie - Clovertone Music"
                        :contents chart-divs/red-river-mud-pie
                        :charts [:div#charts]
                        :users [:div#users]}
   "river" {:title "River - Clovertone Music"
            :contents chart-divs/river
            :charts [:div#charts]
            :users [:div#users]}
   "roscos-big-hit" {:title "Rosco's Big Hit - Clovertone Music"
                     :contents chart-divs/roscos-big-hit
                     :charts [:div#charts]
                     :users [:div#users]}
   "sakura-lullaby" {:title "Sakura Lullaby - Clovertone Music"
                     :contents chart-divs/sakura-lullaby
                     :charts [:div#charts]
                     :users [:div#users]}
   "santiago-nights" {:title "Santiago Nights - Clovertone Music"
                      :contents chart-divs/santiago-nights
                      :charts [:div#charts]
                      :users [:div#users]}
   "shuswap-shuffle" {:title "Shuswap Shuffle - Clovertone Music"
                      :contents chart-divs/shuswap-shuffle
                      :charts [:div#charts]
                      :users [:div#users]}
   "silent-night" {:title "Silent Night - Clovertone Music"
                   :contents chart-divs/silent-night
                   :charts [:div#charts]
                   :users [:div#users]}
   "smooth" {:title "Smooth - Clovertone Music"
             :contents chart-divs/smooth
             :charts [:div#charts]
             :users [:div#users]}
   "sock-hop-be-bop" {:title "Sock Hop Be-Bop - Clovertone Music"
                      :contents chart-divs/sock-hop-be-bop
                      :charts [:div#charts]
                      :users [:div#users]}
   "sol-fiesta" {:title "Sol Fiesta - Clovertone Music"
                 :contents chart-divs/sol-fiesta
                 :charts [:div#charts]
                 :users [:div#users]}
   "something-simple" {:title "Something Simple - Clovertone Music"
                       :contents chart-divs/something-simple
                       :charts [:div#charts]
                       :users [:div#users]}
   "sometimes-i-feel" {:title "Sometimes I Feel Like a Muppet - Clovertone Music"
                       :contents chart-divs/sometimes-i-feel
                       :charts [:div#charts]
                       :users [:div#users]}
   "song-for-l" {:title "Song For L - Clovertone Music"
                 :contents chart-divs/song-for-l
                 :charts [:div#charts]
                 :users [:div#users]}
   "spirits" {:title "Spirits - Clovertone Music"
              :contents chart-divs/spirits
              :charts [:div#charts]
              :users [:div#users]}
   "state-of-mind" {:title "State of Mind - Clovertone Music"
                    :contents chart-divs/state-of-mind
                    :charts [:div#charts]
                    :users [:div#users]}
   "state-of-mind-reprise" {:title "State of Mind Reprise - Clovertone Music"
                            :contents chart-divs/state-of-mind-reprise
                            :charts [:div#charts]
                            :users [:div#users]}
   "stone-cold-strut" {:title "Stone Cold Strut - Clovertone Music"
                       :contents chart-divs/stone-cold-strut
                       :charts [:div#charts]
                       :users [:div#users]}
   "summer-on-my-mind" {:title "Summer on my Mind - Clovertone Music"
                        :contents chart-divs/summer-on-my-mind
                        :charts [:div#charts]
                        :users [:div#users]}
   "surface-tension" {:title "Surface Tension - Clovertone Music"
                      :contents chart-divs/surface-tension
                      :charts [:div#charts]
                      :users [:div#users]}
   "tango" {:title "Tango! - Clovertone Music"
            :contents chart-divs/tango
            :charts [:div#charts]
            :users [:div#users]}
   "that-look" {:title "That Look - Clovertone Music"
                :contents chart-divs/that-look
                :charts [:div#charts]
                :users [:div#users]}
   "the-dancehall-shake" {:title "The Dancehall Shake - Clovertone Music"
                          :contents chart-divs/the-dancehall-shake
                          :charts [:div#charts]
                          :users [:div#users]}
   "the-dirrty-dog" {:title "The Dirrty Dog - Clovertone Music"
                     :contents chart-divs/the-dirrty-dog
                     :charts [:div#charts]
                     :users [:div#users]}
   "the-fifth-beatle" {:title "The Fifth Beatle - Clovertone Music"
                       :contents chart-divs/the-fifth-beatle
                       :charts [:div#charts]
                       :users [:div#users]}
   "the-first-noel" {:title "The First Noel - Clovertone Music"
                     :contents chart-divs/the-first-noel
                     :charts [:div#charts]
                     :users [:div#users]}
   "the-gene-machine" {:title "The Gene Machine - Clovertone Music"
                       :contents chart-divs/the-gene-machine
                       :charts [:div#charts]
                       :users [:div#users]}
   "the-green-blues" {:title "The Green Blues - Clovertone Music"
                      :contents chart-divs/the-green-blues
                      :charts [:div#charts]
                      :users [:div#users]}
   "the-long-way-home" {:title "The Long Way Home - Clovertone Music"
                        :contents chart-divs/the-long-way-home
                        :charts [:div#charts]
                        :users [:div#users]}
   "the-path" {:title "The Path - Clovertone Music"
               :contents chart-divs/the-path
               :charts [:div#charts]
               :users [:div#users]}
   "the-phantom" {:title "The Phantom - Clovertone Music"
                  :contents chart-divs/the-phantom
                  :charts [:div#charts]
                  :users [:div#users]}
   "the-phone-dont-ring-jack" {:title "The Phone Don't Ring Jack - Clovertone Music"
                               :contents chart-divs/the-phone-dont-ring-jack
                               :charts [:div#charts]
                               :users [:div#users]}
   "the-pursuit" {:title "The Pursuit - Clovertone Music"
                  :contents chart-divs/the-pursuit
                  :charts [:div#charts]
                  :users [:div#users]}
   "the-test" {:title "The Test - Clovertone Music"
               :contents chart-divs/the-test
               :charts [:div#charts]
               :users [:div#users]}
   "the-wiggle" {:title "The Wiggle - Clovertone Music"
                 :contents chart-divs/the-wiggle
                 :charts [:div#charts]
                 :users [:div#users]}
   "thinking-in-circles" {:title "Thinking In Circles - Clovertone Music"
                          :contents chart-divs/thinking-in-circles
                          :charts [:div#charts]
                          :users [:div#users]}
   "this-buts-for-you" {:title "This But's for You! - Clovertone Music"
                        :contents chart-divs/this-buts-for-you
                        :charts [:div#charts]
                        :users [:div#users]}
   "train-track" {:title "Train Track - Clovertone Music"
                  :contents chart-divs/train-track
                  :charts [:div#charts]
                  :users [:div#users]}
   "tumbadora" {:title "Tumbadora - Clovertone Music"
                :contents chart-divs/tumbadora
                :charts [:div#charts]
                :users [:div#users]}
   "twilight-fall" {:title "The Twilight Fall - Clovertone Music"
                    :contents chart-divs/twilight-fall
                    :charts [:div#charts]
                    :users [:div#users]}
   "vista" {:title "Vista - Clovertone Music"
            :contents chart-divs/vista
            :charts [:div#charts]
            :users [:div#users]}
   "what-once-was" {:title "What Once Was - Clovertone Music"
                    :contents chart-divs/what-once-was
                    :charts [:div#charts]
                    :users [:div#users]}
   "wood-and-shadow" {:title "Wood & Shadow - Clovertone Music"
                      :contents chart-divs/wood-and-shadow
                      :charts [:div#charts]
                      :users [:div#users]}
   "yun-gia" {:title "Yun Gia - Clovertone Music"
              :contents chart-divs/yun-gia
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
                      chart-divs/o-canada
                      chart-divs/the-pursuit
                      chart-divs/sock-hop-be-bop
                      chart-divs/tango
                      chart-divs/sakura-lullaby
                      chart-divs/detective-story
                      chart-divs/the-dirrty-dog
                      chart-divs/that-look
                      chart-divs/atlantic-crossing
                      chart-divs/game-on
                      chart-divs/on-the-ending-earth
                      chart-divs/four-more-to-go
                      chart-divs/yun-gia
                      chart-divs/electros-next-plot-jr
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
                      chart-divs/at-long-last
                      chart-divs/hotel-mambo
                      chart-divs/petes-chune
                      chart-divs/a-kingdoms-last-hope-jr
                      chart-divs/train-track
                      chart-divs/the-green-blues
                      chart-divs/arcadian-autumn
                      chart-divs/all-your-base
                      chart-divs/shuswap-shuffle
                      chart-divs/red-river-mud-pie
                      chart-divs/funk-out
                      chart-divs/sol-fiesta
                      chart-divs/tumbadora
                      chart-divs/vista
                      chart-divs/silent-night
                      chart-divs/joy-to-the-world
                      chart-divs/canal-street-walk
                      chart-divs/cloud-song
                      chart-divs/the-dancehall-shake
                      chart-divs/femis-flight
                      chart-divs/let-me-be
                      chart-divs/lifted
                      chart-divs/lost-stories
                      chart-divs/dark-matter
                      chart-divs/the-fifth-beatle
                      chart-divs/the-wiggle
                      chart-divs/gentlemen
                      chart-divs/la-cattura
                      chart-divs/this-buts-for-you
                      chart-divs/surface-tension
                      chart-divs/a-long-kept-secret
                      chart-divs/cowboy-countdown
                      chart-divs/crusin-at-30000
                      chart-divs/the-gene-machine
                      chart-divs/go-go-blues
                      chart-divs/the-test
                      chart-divs/el-castor-loco
                      chart-divs/en-su-camino
                      chart-divs/sometimes-i-feel
                      chart-divs/friday-night-special
                      chart-divs/god-rest-ye
                      chart-divs/la-squadra-da-milano
                      chart-divs/stone-cold-strut
                      chart-divs/the-phantom
                      chart-divs/branta
                      chart-divs/moatfield-shuffle
                      chart-divs/santiago-nights
                      chart-divs/epitaph
                      chart-divs/don-carlos-dream
                      chart-divs/blue-heron
                      chart-divs/hamunaptra
                      chart-divs/the-first-noel
                      chart-divs/what-once-was
                      chart-divs/brown-and-tan
                      chart-divs/livvy-dear
                      chart-divs/song-for-l
                      chart-divs/summer-on-my-mind
                      chart-divs/good-king-w
                      chart-divs/introduccion
                      chart-divs/no-trespassing
                      chart-divs/state-of-mind
                      chart-divs/state-of-mind-reprise
                      chart-divs/river
                      chart-divs/julia
                      chart-divs/thinking-in-circles
                      chart-divs/midnight-clear
                      chart-divs/life-race
                      chart-divs/junk
                      chart-divs/la-maquina
                      chart-divs/last-resorts
                      chart-divs/mad-man-mambo
                      chart-divs/roscos-big-hit
                      chart-divs/the-long-way-home
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
