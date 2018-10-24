(ns clovertonemusic.core
  (:gen-class))

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io]
         '[clojure.tools.logging :as log]
         '[clj-logging-config.log4j :as log-config]
         '[org.httpkit.server :refer [run-server]]
         '[hiccup.core :as page]
         '[compojure.route :refer [files not-found]]
         '[compojure.handler :refer [site]]
         '[compojure.core :refer [defroutes GET POST PUT DELETE ANY context]]
         '[clojure.string :as str])

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

;; Load all of the functions for creating and interacting with the catalogue:
(load "core-catalogue-funcs")

;; Load all of the Clojure files implementing HTML pages.
;; Each of these defines a function: `show-html-<subdir>-<pagename>` that returns the data for
;; that page. E.g., `about/podcast` defines the function `show-html-about-podcast`.
;; These functions are used in the routing table implemented by `all-routes`.
(load "clj-html/index")
(load "clj-html/about/clinics")
(load "clj-html/about/clovertone-story")
(load "clj-html/about/commissions")
(load "clj-html/about/customization")
(load "clj-html/about/faq")
(load "clj-html/about/grading-system")
(load "clj-html/about/musician-roster")
(load "clj-html/about/podcast")
(load "clj-html/about/privacy-policy")
(load "clj-html/assets/not_found")
(load "clj-html/assets/server_error")
(load "clj-html/charts/10-41-am")
(load "clj-html/charts/2-dave-k")
(load "clj-html/charts/a-cool-breeze")
(load "clj-html/charts/a-kingdoms-last-hope")
(load "clj-html/charts/a-kingdoms-last-hope-jr")
(load "clj-html/charts/all-your-base")
(load "clj-html/charts/a-long-kept-secret")
(load "clj-html/charts/amazing-grace")
(load "clj-html/charts/ambleside")
(load "clj-html/charts/ambleside-reprise")
(load "clj-html/charts/arcadian-autumn")
(load "clj-html/charts/arrival-of-the-pegasus")
(load "clj-html/charts/atlantic-crossing")
(load "clj-html/charts/at-long-last")
(load "clj-html/charts/blue-heron")
(load "clj-html/charts/branta")
(load "clj-html/charts/brown-and-tan")
(load "clj-html/charts/canal-street-walk")
(load "clj-html/charts/chazz")
(load "clj-html/charts/cloud-song")
(load "clj-html/charts/cowboy-countdown")
(load "clj-html/charts/crusin-at-30000")
(load "clj-html/charts/dark-matter")
(load "clj-html/charts/detective-story")
(load "clj-html/charts/don-carlos-dream")
(load "clj-html/charts/el-castor-loco")
(load "clj-html/charts/electros-next-plot")
(load "clj-html/charts/electros-next-plot-jr")
(load "clj-html/charts/en-su-camino")
(load "clj-html/charts/epitaph")
(load "clj-html/charts/femis-flight")
(load "clj-html/charts/first-x-free")
(load "clj-html/charts/foot-in-mouth")
(load "clj-html/charts/four-more-to-go")
(load "clj-html/charts/friday-night-special")
(load "clj-html/charts/funk-out")
(load "clj-html/charts/game-on")
(load "clj-html/charts/gentlemen")
(load "clj-html/charts/god-rest-ye")
(load "clj-html/charts/go-go-blues")
(load "clj-html/charts/good-king-w")
(load "clj-html/charts/hamunaptra")
(load "clj-html/charts/hotel-mambo")
(load "clj-html/charts/index")
(load "clj-html/charts/in-dreams")
(load "clj-html/charts/intransitory")
(load "clj-html/charts/introduccion")
(load "clj-html/charts/joy-to-the-world")
(load "clj-html/charts/julia")
(load "clj-html/charts/junk")
(load "clj-html/charts/la-cattura")
(load "clj-html/charts/la-cattura-di-salvatore-veloce")
(load "clj-html/charts/la-maquina")
(load "clj-html/charts/la-squadra-da-milano")
(load "clj-html/charts/last-resorts")
(load "clj-html/charts/let-me-be")
(load "clj-html/charts/let-me-be-the-sugar-in-your-tea")
(load "clj-html/charts/life-race")
(load "clj-html/charts/lifted")
(load "clj-html/charts/livvy-dear")
(load "clj-html/charts/lost-stories")
(load "clj-html/charts/mad-man-mambo")
(load "clj-html/charts/midnight-clear")
(load "clj-html/charts/moatfield-shuffle")
(load "clj-html/charts/no-trespassing")
(load "clj-html/charts/o-canada")
(load "clj-html/charts/on-the-ending-earth")
(load "clj-html/charts/petes-chune")
(load "clj-html/charts/red-river-mud-pie")
(load "clj-html/charts/river")
(load "clj-html/charts/roscos-big-hit")
(load "clj-html/charts/sakura-lullaby")
(load "clj-html/charts/santiago-nights")
(load "clj-html/charts/shuswap-shuffle")
(load "clj-html/charts/silent-night")
(load "clj-html/charts/smooth")
(load "clj-html/charts/sock-hop-be-bop")
(load "clj-html/charts/sol-fiesta")
(load "clj-html/charts/something-simple")
(load "clj-html/charts/sometimes-i-feel")
(load "clj-html/charts/song-for-l")
(load "clj-html/charts/spirits")
(load "clj-html/charts/state-of-mind")
(load "clj-html/charts/state-of-mind-reprise")
(load "clj-html/charts/stone-cold-strut")
(load "clj-html/charts/summer-on-my-mind")
(load "clj-html/charts/surface-tension")
(load "clj-html/charts/tango")
(load "clj-html/charts/that-look")
(load "clj-html/charts/the-dancehall-shake")
(load "clj-html/charts/the-dirrty-dog")
(load "clj-html/charts/the-fifth-beatle")
(load "clj-html/charts/the-first-noel")
(load "clj-html/charts/the-gene-machine")
(load "clj-html/charts/the-green-blues")
(load "clj-html/charts/the-long-way-home")
(load "clj-html/charts/the-path")
(load "clj-html/charts/the-phantom")
(load "clj-html/charts/the-phone-dont-ring-jack")
(load "clj-html/charts/the-pursuit")
(load "clj-html/charts/the-test")
(load "clj-html/charts/the-wiggle")
(load "clj-html/charts/thinking-in-circles")
(load "clj-html/charts/this-buts-for-you")
(load "clj-html/charts/train-track")
(load "clj-html/charts/tumbadora")
(load "clj-html/charts/twilight-fall")
(load "clj-html/charts/vista")
(load "clj-html/charts/what-once-was")
(load "clj-html/charts/wood-and-shadow")
(load "clj-html/charts/yun-gia")
(load "clj-html/composers/allison-au")
(load "clj-html/composers/andy-ballantyne")
(load "clj-html/composers/brad-cheeseman")
(load "clj-html/composers/brad-harrison")
(load "clj-html/composers/chelsea-mcbride")
(load "clj-html/composers/chris-hunt")
(load "clj-html/composers/christian-overton")
(load "clj-html/composers/erik-patterson")
(load "clj-html/composers/ewan-divitt")
(load "clj-html/composers/greg-crowe")
(load "clj-html/composers/index")
(load "clj-html/composers/jason-logue")
(load "clj-html/composers/jim-lewis")
(load "clj-html/composers/josh-grossman")
(load "clj-html/composers/liam-gallagher")
(load "clj-html/composers/maria-kundakcioglu")
(load "clj-html/composers/michael-kundakcioglu")
(load "clj-html/composers/terry-promane")
(load "clj-html/composers/tom-richards")
(load "clj-html/genres/ballad")
(load "clj-html/genres/latin")
(load "clj-html/genres/other")
(load "clj-html/genres/rock")
(load "clj-html/genres/swing")
(load "clj-html/grades/four")
(load "clj-html/grades/one")
(load "clj-html/grades/three")
(load "clj-html/grades/two")

;; Load and validate the catalogue from the .csv files on disk. Everything is loaded 'as is' to
;; begin with, and then validated table by table.
(def catalogue
  (let [raw-catalogue (load-catalogue)]
    ;; Each key in the catalogue represents a 'table', i.e. a vector of 'rows' (hashmaps).
    ;; Tables are validated one at a time:
    (reduce (fn [tables next-key]
              (assoc tables next-key (validate-table next-key raw-catalogue)))
            {} (keys raw-catalogue))))

(defroutes all-routes
  (GET "/" [] show-html-index)
  (context "/assets" []
           (GET "/not_found" [] show-html-assets-not_found)
           (GET "/server_error" [] show-html-assets-server_error))
  (context "/about" []
           (GET "/clinics" [] show-html-about-clinics)
           (GET "/clovertone-story" [] show-html-about-clovertone-story)
           (GET "/commissions" [] show-html-about-commissions)
           (GET "/customization" [] show-html-about-customization)
           (GET "/faq" [] show-html-about-faq)
           (GET "/grading-system" [] show-html-about-grading-system)
           (GET "/musician-roster" [] show-html-about-musician-roster)
           (GET "/podcast" [] show-html-about-podcast)
           (GET "/privacy-policy" [] show-html-about-privacy-policy))
  (context "/genres" []
           (GET "/ballad" [] show-html-genres-ballad)
           (GET "/latin" [] show-html-genres-latin)
           (GET "/other" [] show-html-genres-other)
           (GET "/rock" [] show-html-genres-rock)
           (GET "/swing" [] show-html-genres-swing))
  (context "/grades" []
           (GET "/four" [] show-html-grades-four)
           (GET "/one" [] show-html-grades-one)
           (GET "/three" [] show-html-grades-three)
           (GET "/two" [] show-html-grades-two))
  (context "/composers" []
           (GET "/" [] show-html-composers-index)
           (GET "/allison-au" [] show-html-composers-allison-au)
           (GET "/andy-ballantyne" [] show-html-composers-andy-ballantyne)
           (GET "/brad-cheeseman" [] show-html-composers-brad-cheeseman)
           (GET "/brad-harrison" [] show-html-composers-brad-harrison)
           (GET "/chelsea-mcbride" [] show-html-composers-chelsea-mcbride)
           (GET "/chris-hunt" [] show-html-composers-chris-hunt)
           (GET "/christian-overton" [] show-html-composers-christian-overton)
           (GET "/erik-patterson" [] show-html-composers-erik-patterson)
           (GET "/ewan-divitt" [] show-html-composers-ewan-divitt)
           (GET "/greg-crowe" [] show-html-composers-greg-crowe)
           (GET "/index" [] show-html-composers-index)
           (GET "/jason-logue" [] show-html-composers-jason-logue)
           (GET "/jim-lewis" [] show-html-composers-jim-lewis)
           (GET "/josh-grossman" [] show-html-composers-josh-grossman)
           (GET "/liam-gallagher" [] show-html-composers-liam-gallagher)
           (GET "/maria-kundakcioglu" [] show-html-composers-maria-kundakcioglu)
           (GET "/michael-kundakcioglu" [] show-html-composers-michael-kundakcioglu)
           (GET "/terry-promane" [] show-html-composers-terry-promane)
           (GET "/tom-richards" [] show-html-composers-tom-richards))
  (context "/charts" []
           (GET "/" [] show-html-charts-index)
           (GET "/10-41-am" [] show-html-charts-10-41-am)
           (GET "/2-dave-k" [] show-html-charts-2-dave-k)
           (GET "/a-cool-breeze" [] show-html-charts-a-cool-breeze)
           (GET "/a-kingdoms-last-hope" [] show-html-charts-a-kingdoms-last-hope)
           (GET "/a-kingdoms-last-hope-jr" [] show-html-charts-a-kingdoms-last-hope-jr)
           (GET "/all-your-base" [] show-html-charts-all-your-base)
           (GET "/a-long-kept-secret" [] show-html-charts-a-long-kept-secret)
           (GET "/amazing-grace" [] show-html-charts-amazing-grace)
           (GET "/ambleside" [] show-html-charts-ambleside)
           (GET "/ambleside-reprise" [] show-html-charts-ambleside-reprise)
           (GET "/arcadian-autumn" [] show-html-charts-arcadian-autumn)
           (GET "/arrival-of-the-pegasus" [] show-html-charts-arrival-of-the-pegasus)
           (GET "/atlantic-crossing" [] show-html-charts-atlantic-crossing)
           (GET "/at-long-last" [] show-html-charts-at-long-last)
           (GET "/blue-heron" [] show-html-charts-blue-heron)
           (GET "/branta" [] show-html-charts-branta)
           (GET "/brown-and-tan" [] show-html-charts-brown-and-tan)
           (GET "/canal-street-walk" [] show-html-charts-canal-street-walk)
           (GET "/chazz" [] show-html-charts-chazz)
           (GET "/cloud-song" [] show-html-charts-cloud-song)
           (GET "/cowboy-countdown" [] show-html-charts-cowboy-countdown)
           (GET "/crusin-at-30000" [] show-html-charts-crusin-at-30000)
           (GET "/dark-matter" [] show-html-charts-dark-matter)
           (GET "/detective-story" [] show-html-charts-detective-story)
           (GET "/don-carlos-dream" [] show-html-charts-don-carlos-dream)
           (GET "/el-castor-loco" [] show-html-charts-el-castor-loco)
           (GET "/electros-next-plot" [] show-html-charts-electros-next-plot)
           (GET "/electros-next-plot-jr" [] show-html-charts-electros-next-plot-jr)
           (GET "/en-su-camino" [] show-html-charts-en-su-camino)
           (GET "/epitaph" [] show-html-charts-epitaph)
           (GET "/femis-flight" [] show-html-charts-femis-flight)
           (GET "/first-x-free" [] show-html-charts-first-x-free)
           (GET "/foot-in-mouth" [] show-html-charts-foot-in-mouth)
           (GET "/four-more-to-go" [] show-html-charts-four-more-to-go)
           (GET "/friday-night-special" [] show-html-charts-friday-night-special)
           (GET "/funk-out" [] show-html-charts-funk-out)
           (GET "/game-on" [] show-html-charts-game-on)
           (GET "/gentlemen" [] show-html-charts-gentlemen)
           (GET "/god-rest-ye" [] show-html-charts-god-rest-ye)
           (GET "/go-go-blues" [] show-html-charts-go-go-blues)
           (GET "/good-king-w" [] show-html-charts-good-king-w)
           (GET "/hamunaptra" [] show-html-charts-hamunaptra)
           (GET "/hotel-mambo" [] show-html-charts-hotel-mambo)
           (GET "/index" [] show-html-charts-index)
           (GET "/in-dreams" [] show-html-charts-in-dreams)
           (GET "/intransitory" [] show-html-charts-intransitory)
           (GET "/introduccion" [] show-html-charts-introduccion)
           (GET "/joy-to-the-world" [] show-html-charts-joy-to-the-world)
           (GET "/julia" [] show-html-charts-julia)
           (GET "/junk" [] show-html-charts-junk)
           (GET "/la-cattura" [] show-html-charts-la-cattura)
           (GET "/la-cattura-di-salvatore-veloce" [] show-html-charts-la-cattura-di-salvatore-veloce)
           (GET "/la-maquina" [] show-html-charts-la-maquina)
           (GET "/la-squadra-da-milano" [] show-html-charts-la-squadra-da-milano)
           (GET "/last-resorts" [] show-html-charts-last-resorts)
           (GET "/let-me-be" [] show-html-charts-let-me-be)
           (GET "/let-me-be-the-sugar-in-your-tea" [] show-html-charts-let-me-be-the-sugar-in-your-tea)
           (GET "/life-race" [] show-html-charts-life-race)
           (GET "/lifted" [] show-html-charts-lifted)
           (GET "/livvy-dear" [] show-html-charts-livvy-dear)
           (GET "/lost-stories" [] show-html-charts-lost-stories)
           (GET "/mad-man-mambo" [] show-html-charts-mad-man-mambo)
           (GET "/midnight-clear" [] show-html-charts-midnight-clear)
           (GET "/moatfield-shuffle" [] show-html-charts-moatfield-shuffle)
           (GET "/no-trespassing" [] show-html-charts-no-trespassing)
           (GET "/o-canada" [] show-html-charts-o-canada)
           (GET "/on-the-ending-earth" [] show-html-charts-on-the-ending-earth)
           (GET "/petes-chune" [] show-html-charts-petes-chune)
           (GET "/red-river-mud-pie" [] show-html-charts-red-river-mud-pie)
           (GET "/river" [] show-html-charts-river)
           (GET "/roscos-big-hit" [] show-html-charts-roscos-big-hit)
           (GET "/sakura-lullaby" [] show-html-charts-sakura-lullaby)
           (GET "/santiago-nights" [] show-html-charts-santiago-nights)
           (GET "/shuswap-shuffle" [] show-html-charts-shuswap-shuffle)
           (GET "/silent-night" [] show-html-charts-silent-night)
           (GET "/smooth" [] show-html-charts-smooth)
           (GET "/sock-hop-be-bop" [] show-html-charts-sock-hop-be-bop)
           (GET "/sol-fiesta" [] show-html-charts-sol-fiesta)
           (GET "/something-simple" [] show-html-charts-something-simple)
           (GET "/sometimes-i-feel" [] show-html-charts-sometimes-i-feel)
           (GET "/song-for-l" [] show-html-charts-song-for-l)
           (GET "/spirits" [] show-html-charts-spirits)
           (GET "/state-of-mind" [] show-html-charts-state-of-mind)
           (GET "/state-of-mind-reprise" [] show-html-charts-state-of-mind-reprise)
           (GET "/stone-cold-strut" [] show-html-charts-stone-cold-strut)
           (GET "/summer-on-my-mind" [] show-html-charts-summer-on-my-mind)
           (GET "/surface-tension" [] show-html-charts-surface-tension)
           (GET "/tango" [] show-html-charts-tango)
           (GET "/that-look" [] show-html-charts-that-look)
           (GET "/the-dancehall-shake" [] show-html-charts-the-dancehall-shake)
           (GET "/the-dirrty-dog" [] show-html-charts-the-dirrty-dog)
           (GET "/the-fifth-beatle" [] show-html-charts-the-fifth-beatle)
           (GET "/the-first-noel" [] show-html-charts-the-first-noel)
           (GET "/the-gene-machine" [] show-html-charts-the-gene-machine)
           (GET "/the-green-blues" [] show-html-charts-the-green-blues)
           (GET "/the-long-way-home" [] show-html-charts-the-long-way-home)
           (GET "/the-path" [] show-html-charts-the-path)
           (GET "/the-phantom" [] show-html-charts-the-phantom)
           (GET "/the-phone-dont-ring-jack" [] show-html-charts-the-phone-dont-ring-jack)
           (GET "/the-pursuit" [] show-html-charts-the-pursuit)
           (GET "/the-test" [] show-html-charts-the-test)
           (GET "/the-wiggle" [] show-html-charts-the-wiggle)
           (GET "/thinking-in-circles" [] show-html-charts-thinking-in-circles)
           (GET "/this-buts-for-you" [] show-html-charts-this-buts-for-you)
           (GET "/train-track" [] show-html-charts-train-track)
           (GET "/tumbadora" [] show-html-charts-tumbadora)
           (GET "/twilight-fall" [] show-html-charts-twilight-fall)
           (GET "/vista" [] show-html-charts-vista)
           (GET "/what-once-was" [] show-html-charts-what-once-was)
           (GET "/wood-and-shadow" [] show-html-charts-wood-and-shadow)
           (GET "/yun-gia" [] show-html-charts-yun-gia))
  (not-found "<p>Page not found.</p>")) ;; all other, return 404

(defn -main
  [& args]
  ;; At startup, print the catalogue represented as a tree:
  ;; TODO: MAKE THIS OPTIONAL WITH A COMMAND-LINE SWITCH
  (print-tree catalogue)

  ;; Start the http server
  (log/info "Starting HTTP server on port 8080. Press Ctrl-C to exit.")
  (run-server (site #'all-routes) {:port 8080}))
