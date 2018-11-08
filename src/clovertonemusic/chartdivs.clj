(ns clovertonemusic.chartdivs
  (:require [clojure.string :as str]
            [clovertonemusic.data :as data]))

(defn chart-to-html
  [chart]
  (let [number (:chart-number chart)
        grade-number (:grade chart)
        grade-name (loop [[next-grade & remaining-grades] (:grades data/catalogue)]
                     (if (= (:grade-number next-grade) grade-number)
                       (:grade-name next-grade)
                       (recur remaining-grades)))
        chart-path (str "/charts/" (:filename chart))
        chart-name (:chart-name chart)
        composer-path (str "/composers/" (loop [[next-comp & remaining-comps] (:composers data/catalogue)]
                                           (if (= (:composer chart) (:composer-name next-comp))
                                             (:filename next-comp)
                                             (recur remaining-comps))))
        composer-name (:composer chart)
        price (:price chart)
        split-price (str/split (second (re-find #"\$(\S+)" "$1.00")) #"\.")
        category (:category chart)
        audio-path (str "/audio/" (:filename chart) ".mp3")
        preview-path (str "/preview/" (:filename chart) ".preview.pdf")
        purchase-email (:chart-name chart)
        customized-email (:chart-name chart)
        chart-notes (:notes chart)
        chart-details [:tbody
                       [:tr
                        [:td (:band-type chart)]
                        [:td (:genre chart)]
                        [:td [:a {:href composer-path} (:composer chart)]]
                        [:td (:duration chart)]
                        [:td (:meter chart)]
                        [:td (:tempo chart)]]]]

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
       [:div.genre category]
       [:div.grade grade-name]]
      [:a.purchase
       {:href
        (str "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20%22" purchase-email "%22.%0D%0A")}]
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
          (str "mailto:info@clovertonemusic.com?subject=Customized%20Charts%20from%20Clovertone%20Music&body=Hello%2C%0D%0A%0D%0AI%20would%20like%20to%20order%20a%20customized%20version%20of%20the%20chart%20%22"
               customized-email
               "%22.%0D%0A%0D%0AHere's%20some%20information%20about%20our%20band%2C%20including%20our%20instrumentation%2C%20who%20we%20would%20like%20to%20feature%2C%20and%20the%20difficult%20level%20that%20we%20can%20handle%3A%0D%0A%0D%0A%0D%0A%0D%0AI%20prefer%20to%20be%20contacted%0D%0A-%20by%20email%20at%20this%20address%0D%0A-%20by%20phone%3A%20my%20number%20is%20XXX-XXX-XXXX%2C%20and%20I%20am%20available%20between%20the%20hours%20of%20%0D%0A%0D%0A")}
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
