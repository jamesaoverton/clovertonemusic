(ns clovertonemusic.html
  (:require [clojure.tools.logging :as log]
            [clj-logging-config.log4j :as log-config]
            [hiccup.core :as page]
            [markdown-to-hiccup.core :as m2h]
            [ring.util.codec :as codec]
            [ring.util.response :refer [file-response redirect]]
            [postal.core :refer [send-message]]
            [clojure.string :as string]
            [clovertonemusic.data :as data]
            [clovertonemusic.utils :as utils]))

(log-config/set-logger!
 :pattern "%d - %p %m%n"
 :level :info)

(defn render-html
  "Main template for HTML page generation. Wraps the four parameters passed as arguments in the
  generic HTML code that is used for every page in Clovertone."
  [{title :title, sorting :sorting, contents :contents, charts :charts, user-status :user-status,
    page-status :page-status, :or {sorting [:div#sorting]
                                   contents [:div#contents]
                                   charts [:div#charts]
                                   user-status [:div#status]
                                   page-status 200}}]
  ;; page-status parameter goes here:
  {:status page-status
   :headers {"Content-Type" "text/html"}
   :body (page/html
          [:html
           {:lang "en-us"}
           [:head
            ;; title parameter goes here:
            [:title title]
            [:meta {:http-equiv "content-type", :content "text/html; charset=utf-8"}]
            [:meta {:name "description", :content "Clovertone Music"}]
            "<!-- meta(name=\"author\", content=\"James A. Overton, james@overton.ca\")-->"
            [:meta {:name "viewport", :content "width=device-width, initial-scale=1.0"}]
            [:link {:rel "shortcut icon", :type "image/x-icon", :href "/favicon.ico"}]
            [:link {:rel "stylesheet", :type "text/css", :href "/application.css"}]
            [:script {:type "text/javascript", :src "https://use.typekit.com/uzg4nir.js"}]
            [:script "try{Typekit.load();}catch(e){}"]]
           [:body
            [:div#page
             [:div#clover-box.left
              [:a {:href "/"} [:img {:width "105", :height "90", :src "/assets/clover.png"}]]]
             [:div#banner-box.right [:a {:href "/"}] [:h1 "Clovertone Music"]]
             ;; The user-status function parameter goes here:
             [:div#status-box.right [:ul#status-menu] user-status]
             [:div#rule]
             [:div#nav-box.right
              [:ul.top-menu
               [:li.first [:a {:href "/about/clovertone-story"} "About"]]
               [:li [:a {:href "/about/customization"} "Customization"]]
               [:li [:a {:href "/about/clinics"} "Clinics"]]
               [:li [:a {:href "/about/commissions"} "Commissions"]]
               [:li [:a {:href "/composers/"} "Composers"]]
               [:li [:a {:href "/about/faq"} "FAQ"]]]]
             [:div#search-box.box.left
              [:form
               [:input#search {:type "text", :name "search", :placeholder "Search"}]]]
             ;; The contents, sorting, and charts function parameters go here:
             [:div#main.right contents sorting charts]
             [:div#audio-box]
             [:div#catalogue-box.box.left
              [:h2 "Catalogue"]
              [:ul [:li [:a.all {:href "/charts/"} "All Charts"]]]]
             [:div#grades-box.box.left
              [:h3 "Level"]
              [:ul
               [:li.grade1 [:a {:href "/grades/one"} "Grade One\n"]]
               [:li.grade2 [:a {:href "/grades/two"} "Grade Two\n"]]
               [:li.grade3 [:a {:href "/grades/three"} "Grade Three\n"]]
               [:li.grade4 [:a {:href "/grades/four"} "Grade Four\n"]]]]
             [:div#genres-box.box.left
              [:h3 "Genre"]
              [:ul
               [:li [:a {:href "/genres/latin"} "Latin"]]
               [:li [:a {:href "/genres/ballad"} "Ballad"]]
               [:li [:a {:href "/genres/rock"} "Funk / Rock"]]
               [:li [:a {:href "/genres/swing"} "Swing"]]
               [:li [:a {:href "/genres/other"} "Other"]]]]
             [:div#misc-box.box.left
              [:ul
               [:li [:a {:href "/about/grading-system"} "Grade System"]]
               [:li [:a.musicians {:href "/about/musician-roster"} "Musicians"]]]]
             [:div#follow-box.box.left
              [:h2 "Follow Us"]
              [:ul
               [:li [:a {:href "/about/podcast"} "Podcast"]]
               "<!--li: a RSS-->"
               [:li [:a {:href "http://www.facebook.com/pages/Clovertone-Music/148289658545365"}
                     "Facebook\n"]]
               [:li [:a {:href "http://www.twitter.com/clovertone"} "Twitter\n"]]]]
             [:div#footer
              [:ul
               [:li [:a {:href "/about/privacy-policy"} "Privacy Policy\n"]]
               [:li "© 2019 Clovertone Music"]]]]
            ]])})

(defn user-status
  "Generates the 'user status' links on clovertone pages. Depending on whether the given user
  parameter is nil or not, either links to the account and logout routes are generated, or a
  link to the login page."
  [user]
  (if user
    [:ul [:li [:a {:href "/account/"} "Account"]] [:li [:a {:href "/logout/"} "Log Out"]]]
    [:ul [:li [:a {:href "/login/"} "Log In / Sign Up"]]]))

(defn get-sorting
  "Generates the links and arrows used for sorting entries on clovertone pages. If page-params is
  supplied, then these are appended to each of the sort links as URL parameters."
  ([page-params]
   ;; page-params (optional) is a list representing whatever other page parameters were present
   ;; prior to the sort request (e.g. ["search=searchstr" "president=Trump" ...])
   (let [href-suffix (when page-params
                       (->> page-params
                            (string/join "&")
                            (str "&")))]
     [:ul#sort
      "Sort By:"
      ;; The sort keys must correspond to chart column names as specified in `data.clj`
      [:li "Name"
       [:a {:href (str "?sort=chart-name:asc" href-suffix)} "&nbsp;&#x25B3;"]
       [:a {:href (str "?sort=chart-name:desc" href-suffix)} "&nbsp;&#x25BD;"]]
      [:li "Composer"
       [:a {:href (str "?sort=composer:asc" href-suffix)} "&nbsp;&#x25B3;"]
       [:a {:href (str "?sort=composer:desc" href-suffix)} "&nbsp;&#x25BD;"]]
      [:li "Grade"
       [:a {:href (str "?sort=grade:asc" href-suffix)} "&nbsp;&#x25B3;"]
       [:a {:href (str "?sort=grade:desc" href-suffix)} "&nbsp;&#x25BD;"]]
      [:li "Genre"
       [:a {:href (str "?sort=category:asc" href-suffix)} "&nbsp;&#x25B3;"]
       [:a {:href (str "?sort=category:desc" href-suffix)} "&nbsp;&#x25BD;"]]
      [:li "Subgenre"
       [:a {:href (str "?sort=subgenre:asc" href-suffix)} "&nbsp;&#x25B3;"]
       [:a {:href (str "?sort=subgenre:desc" href-suffix)} "&nbsp;&#x25BD;"]]
      [:li "Price"
       [:a {:href (str "?sort=price:asc" href-suffix)} "&nbsp;&#x25B3;"]
       [:a {:href (str "?sort=price:desc" href-suffix)} "&nbsp;&#x25BD;"]]
      [:li "Duration"
       [:a {:href (str "?sort=duration:asc" href-suffix)} "&nbsp;&#x25B3;"]
       [:a {:href (str "?sort=duration:desc" href-suffix)} "&nbsp;&#x25BD;"]]
      [:li "Tempo"
       [:a {:href (str "?sort=tempo:asc" href-suffix)} "&nbsp;&#x25B3;"]
       [:a {:href (str "?sort=tempo:desc" href-suffix)} "&nbsp;&#x25BD;"]]]))
  ([]
   ;; If no page parameters are passed, call thyself again with nil:
   (get-sorting nil)))

(defn sort-charts
  "Sorts the given sequence of charts by the given sort parameter, where the latter is of the form
  <param>:<asc|desc>. E.g. tempo:asc to sort by tempo in ascending order."
  [sort-param charts]
  (if-not sort-param
    ;; If no sort-parameter has been given, just return the charts back as is:
    charts
    ;; Otherwise:
    (letfn [(get-numeric-price [chart]
              (->> :price chart
                   (re-matches #"\$(\d+\.\d\d)")
                   (second)
                   (utils/parse-number)))
            (get-numeric-duration [chart]
              (->> :duration chart
                   (re-matches #"(\d+)s")
                   (second)
                   (utils/parse-number)))]

      (let [sort-key (keyword (first (string/split sort-param #":")))
            sort-dir (second (string/split sort-param #":"))
            ascending-charts
            (cond
              ;; Keys for price and duration need to be parsed and converted to numbers before sorting:
              (= sort-key :price) (sort-by get-numeric-price < charts)
              (= sort-key :duration) (sort-by get-numeric-duration < charts)
              ;; Sorting is done numerically for :grade and :tempo:
              (some #(= sort-key %) [:grade :tempo]) (sort-by #(utils/parse-number (sort-key %)) < charts)
              ;; Sort is done in the default way in all other cases:
              :else (sort-by sort-key charts))]
        (if (= sort-dir "desc")
          (reverse ascending-charts)
          ascending-charts)))))

(defn construct-email-to-clovertone
  "Constructs an email inquiring about the given chart, using the email parameter as a key for
  searching through the markdown pages for the template corresponding to that parameter."
  [email chart-name]
  ;; TODO: Fill in the from field with the user's email if the user happens to be logged in.
  (let [email-contents (data/get-email-contents email)]
    (str "mailto:" (->> :to email-contents
                        (codec/url-encode))
         "?subject=" (->> :subject email-contents
                          (codec/url-encode))
         "&body=" (->> (string/replace (:body email-contents) #"<CHART>" chart-name)
                       (codec/url-encode)))))

(defn construct-readable-duration
  "Converts a string of the form Ns (e.g. 120s) to one of the form MM:ss (e.g. 2:00)."
  [seconds-string]
  ;; We can assume that the duration ends in 's'
  (let [total-seconds (utils/parse-number (string/replace seconds-string #"s$" ""))
        minutes (quot total-seconds 60)
        seconds (mod total-seconds 60)]
    (format "%d:%02d" minutes seconds)))

(defn chart-to-html
  "Converts a given chart catalogue entry to a HTML div"
  [chart]
  (let [number (:chart-number chart)
        price (re-matches #"\$(\d+)(\.\d\d)" (:price chart))
        grade-name (->> data/catalogue
                        :grades
                        (filter #(= (:grade-number %) (:grade chart)))
                        (first)
                        :grade-name)
        composer-path (->> data/catalogue
                           :composers
                           (filter #(= (:composer chart) (:composer-name %)))
                           (first)
                           :filename
                           (str "/composers/"))]
    [(keyword (str "div#" number ".chart.grade" (:grade chart)))
     [:div.head
      [:h2.title [:a {:href (str "/charts/" (:filename chart))} (:chart-name chart)]]
      [:h3.name
       [:a
        {:href composer-path}
        (str "By " (:composer chart) "\n")]]]
     [:div.body
      [:div.image
       [(keyword (str "div.genre-image." (:category chart)))]
       [:div.genre (:category chart)]
       [:div.grade grade-name]]
      [:a.purchase
       {:href (construct-email-to-clovertone "purchase" (:chart-name chart))}
       [:div.blank]
       [:div.price
        [:span.dollar-sign "$"]
        [:span.dollars (get price 1)]
        [:span.cents (get price 2)]]]
      [:ul.actions
       [:li
        [:a#audio2.audio
         {:href (str "/audio/" (:filename chart) ".mp3")}
         "▶   Listen\n"]]
       [:li
        [:a
         {:href (str "/previews/" (:filename chart) ".preview.pdf") :target "_blank"}
         "Preview\n"]]
       [:li
        [:a
         {:href (construct-email-to-clovertone "customize" (:chart-name chart))}
         "Customize\n"]]]
      (:notes chart)]
     [:table.details
      [:thead
       [:tr
        [:td "Band"]
        [:td "Subgenre"]
        [:td "Composer"]
        [:td "Duration"]
        [:td "Meter"]
        [:td "Tempo"]]]
      [:tbody
       [:tr
        [:td (:band-type chart)]
        [:td (:subgenre chart)]
        [:td [:a {:href composer-path} (:composer chart)]]
        [:td (construct-readable-duration (:duration chart))]
        [:td (:meter chart)]
        [:td (:tempo chart)]]]]]))

(defn render-search
  "Renders the results of a search request"
  [request]
  (let [search-string (:search (:params request))
        search-string-in-chart
        (fn [chart]
          ;; Note: we do not filter on either category or grade since these
          ;; filters are easily accessible from the side menu
          (or
           (string/index-of (string/lower-case (:chart-name chart))
                            (string/lower-case search-string))
           (string/index-of (string/lower-case (:composer chart))
                            (string/lower-case search-string))
           (string/index-of (string/lower-case (:band-type chart))
                            (string/lower-case search-string))
           (string/index-of (string/lower-case (:tempo chart))
                            (string/lower-case search-string))
           (string/index-of (string/lower-case (:meter chart))
                            (string/lower-case search-string))
           (string/index-of (string/lower-case (->> :duration chart
                                                    (construct-readable-duration)))
                            (string/lower-case search-string))
           ;; For price, require the query string to either lead or end with a "$",
           ;; and don't require the cents:
           (and
            (or
             (nth (re-matches #"\$(\d+)(\.\d{2})?" search-string) 1)
             (nth (re-matches #"(\d+)(\.\d{2})?\$" search-string) 1))
            (string/index-of (:price chart)
                             (string/replace search-string #"\$" "")))
           (string/index-of (string/lower-case (:subgenre chart))
                            (string/lower-case search-string))
           (string/index-of (string/lower-case (:notes chart))
                            (string/lower-case search-string))))]
    (render-html
     {:title "Search Results - Clovertone Music"
      :sorting [:div#sorting (get-sorting [(str "search=" search-string)])]
      :contents [:div#contents
                 [:div#content.index
                  [:h1.title "Search Results: " search-string]]]
      :charts [:div#charts
               (->> data/catalogue
                    :charts
                    (filter search-string-in-chart)
                    (sort-charts (:sort (:params request)))
                    (map chart-to-html)
                    (conj [:div#list]))]
      :user-status (user-status (:user request))})))

(defn generate-about-contents
  "Generates the contents of the given about page based on the markdown file in the data directory
  corresponding to that page."
  [about-page user-info]
  (let [tweak-about-page (fn [page-component]
                           ;; If the given page component is a H1 element, then assign it the
                           ;; class 'title'.
                           (if (= page-component :div)
                             (keyword "div#content")
                             (if (= (first page-component) :h1)
                               (let [[h1 & rest] page-component]
                                 (vec (concat [(keyword (str "h1" ".title"))] rest)))
                               page-component)))
        contents (->> about-page
                      (data/get-about-page-contents)
                      (m2h/md->hiccup)
                      (m2h/component)
                      (map tweak-about-page)
                      (vec)
                      (conj [:div#contents]))
        title (->> :h1.title
                   (m2h/hiccup-in contents)
                   (last))]
    {:title (str title " - Clovertone Music")
     :contents contents
     :user-status (user-status user-info)}))

(defn render-about
  "Renders the about page specified in the request. If the page is not found, return nil which
  should result in a 404."
  [request]
  (let [about-page (:page (:params request))]
    (try
      (render-html (generate-about-contents about-page (:user request)))
      ;; If the file doesn't exist, just return nothing, which should result in a 404 in the browser
      (catch java.io.FileNotFoundException ex))))

(defn render-charts
  "Generates the charts page, for either all charts or for a specific chart."
  [request]
  (let [chart (:page (:params request))
        chart-catentry (->> data/catalogue
                            :charts
                            (filter #(= (:filename %) chart))
                            (first))]
    ;; If a catalogue entry is found for the requested chart, then render it:
    (if-not (nil? chart-catentry)
      (render-html
       {:title (str (:chart-name chart-catentry) " - Clovertone Music")
        :contents [:div#contents
                   (->> data/catalogue
                        :charts
                        (filter #(= (:chart-number chart-catentry) (:chart-number %)))
                        (map chart-to-html)
                        (conj [:div#list]))]
        :user-status (user-status (:user request))})
      ;; Otherwise if there was no requested chart, render all charts. If, on the other hand, there
      ;; was a requested chart but no corresponding catalogue entry, then the result will be a 404.
      (when (nil? chart)
        (render-html
         {:title "All Charts - Clovertone Music"
          :sorting [:div#sorting (get-sorting)]
          :contents [:div#contents
                     [:div#content.index
                      [:h1.title "All Charts"]
                      [:p (data/get-index-file-contents "charts")]]]
          :charts [:div#charts
                   (->> data/catalogue
                        (:charts)
                        (sort-charts (:sort (:params request)))
                        (map chart-to-html)
                        (conj [:div#list]))]
          :user-status (user-status (:user request))})))))

(defn render-composers
  "Renders the composers page, either for a specific composer, or for all of them."
  [request]
  (let [composer (:page (:params request))
        composer-catentry (->> data/catalogue
                               (:composers)
                               (filter #(= (:filename %) composer))
                               (first))]
    ;; If the composer is found in the catalogue, render it. Otherwise if no composer was specified
    ;; render all composers, otherwise a 404 will be returned.
    (if-not (nil? composer-catentry)
      (render-html
       {:title (str (:composer-name composer-catentry) " - Clovertone Music")
        :sorting [:div#sorting (get-sorting)]
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:composer-name composer-catentry)]
                    [:img.float {:src (str "/images/" (:filename composer-catentry) ".jpg")}]
                    [:p (:notes composer-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      :charts
                      (filter #(= (:composer-name composer-catentry) (:composer %)))
                      (sort-charts (:sort (:params request)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :user-status (user-status (:user request))})
      (when (nil? composer)
        (render-html
         {:title "Composers - Clovertone Music"
          :sorting [:div#sorting (get-sorting)]
          :contents [:div#contents
                     [:div#content
                      [:h1.title "Composers"]
                      [:p (data/get-index-file-contents "composers")]
                      (into [:ul.composers]
                            (map (fn [composer-catentry]
                                   [:li
                                    [:a.composer {:href (str "/composers/" (:filename composer-catentry))}
                                     [:div.image
                                      [:img
                                       {:width "140",
                                        :height "140",
                                        :src (str "/images/" (:filename composer-catentry) "-140.jpg")}]]
                                     [:div.name (:composer-name composer-catentry)]]])
                                 (:composers data/catalogue)))]]
          :user-status (user-status (:user request))})))))

(defn render-genres
  "Render the genres page for the genre specified in the request."
  [request]
  (let [genre (:page (:params request))
        genre-catentry (->> data/catalogue
                            :genres
                            (filter #(= (:filename %) genre))
                            (first))]
    (when genre-catentry
      (render-html
       {:title (str (:genre-name genre-catentry) " - Clovertone Music")
        :sorting [:div#sorting (get-sorting)]
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:genre-name genre-catentry)]
                    [:p (:notes genre-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      :charts
                      (filter #(= (:filename genre-catentry) (:category %)))
                      (sort-charts (:sort (:params request)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :user-status (user-status (:user request))}))))

(defn render-grades
  "Render the grades page for the grade specified in the request."
  [request]
  (let [grade (:page (:params request))
        grade-catentry (->> data/catalogue
                            :grades
                            (filter #(= (:filename %) grade))
                            (first))]
    (when grade-catentry
      (render-html
       {:title (str (:grade-name grade-catentry) " - Clovertone Music")
        :sorting [:div#sorting (get-sorting)]
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title (:grade-name grade-catentry)]
                    [:p (:notes grade-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      :charts
                      (filter #(= (:grade-number grade-catentry) (:grade %)))
                      (sort-charts (:sort (:params request)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :user-status (user-status (:user request))}))))

(defn render-root
  "Renders the root page whenever either no route or the /index route is specified"
  [request]
  (let [rootpg (:page (:params request))]
    (when (or (nil? rootpg) (= "index" rootpg))
      (render-html
       {:title "Home - Clovertone Music."
        :sorting [:div#sorting (get-sorting)]
        :contents [:div#contents
                   [:div#content.index
                    [:h1.title "Home"]
                    [:p (data/get-index-file-contents "index")]]]
        :charts [:div#charts
                 (->> data/catalogue
                      :charts
                      (filter #(not= (:featured %) "0"))
                      (sort-by #(utils/parse-number (:featured %)))
                      (sort-charts (:sort (:params request)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :user-status (user-status (:user request))}))))

(def countries ["Canada" "USA"])
(def provinces ["Alberta" "British Columbia" "Manitoba" "New Brunswick" "Newfoundland and Labrador"
                "Nova Scotia" "Northwest Territories" "Nunavut" "Ontario" "Quebec" "Saskatchewan"
                "Yukon" "Alabama" "Alaska" "Arizona" "Arkansas" "California" "Colorado"
                "Connecticut" "Delaware" "District Of Columbia" "Florida" "Georgia" "Hawaii"
                "Idaho" "Illinois" "Indiana" "Iowa" "Kansas" "Kentucky" "Louisiana" "Maine"
                "Maryland" "Massachusetts" "Michigan" "Minnesota" "Mississippi" "Missouri" "Montana"
                "Nebraska" "Nevada" "New Hampshire" "New Jersey" "New Mexico" "New York"
                "North Carolina" "North Dakota" "Ohio" "Oklahoma" "Oregon" "Pennsylvania"
                "Rhode Island" "South Carolina" "South Dakota" "Tennessee" "Texas" "Utah"
                "Vermont" "Virginia" "Washington" "West Virginia" "Wisconsin""Wyoming"])

(defn generate-country-dropdown
  "Generates a select box with dropdown for Country. If 'Other' is specified this triggers
  activation of an optional additional field (specified elsewhere). Note that this requires that
  you add a [:script] tag to the HTML page which defines the javascript function used to activate
  the additional field. If called with the optional current-country parameter, then that country
  is selected by default."
  ([type current-country]
   (let [select-tag (keyword (str "select#" type "_country.select." type "_info"))
         action (str "enable_or_disable_other_field(\"" type "_country_other\", this.value);")]
     [select-tag
      {:name "country" :onchange action}
      [:option {:value "" :disabled true :selected (nil? current-country)}]
      [:option {:value "Other" :selected (and (not (nil? current-country))
                                              (not-any? #(= current-country %) countries))} "Other"]
      (for [country countries]
        [:option {:value country :selected (= current-country country)} country])]))
  ([type]
   (generate-country-dropdown type nil)))

(defn generate-province-dropdown
  "Generates a select box with dropdown for Province/State. If 'Other' is specified this triggers
  activation of an optional additional field (specified elsewhere). Note that this requires that
  you add a [:script] tag to the HTML page which defines the javascript function used to activate
  the additional field. If called with the optional current-province parameter, then that province
  is selected by default."
  ([type current-province]
   (let [select-tag (keyword (str "select#" type "_province.select." type "_info"))
         action (str "enable_or_disable_other_field(\"" type "_province_other\", this.value);")]
     [select-tag
      {:name "province" :onchange action}
      [:option {:value "" :disabled true :selected (nil? current-province)}]
      [:option {:value "Other" :selected (and
                                          (not (nil? current-province))
                                          (not-any? #(= current-province %) provinces))} "Other"]
      (for [province provinces]
        [:option {:value province :selected (= current-province province)} province])]))
  ([type]
   (generate-province-dropdown type nil)))

(defn js-toggle-login-form
  "Generates a javascript function to toggle the login form between new and returning user modes"
  []
  (str
   "var toggle_login_form = function(section) {"
   "  if (section === 0) {"
   "    document.getElementById(\"returning_user_password_input\").setAttribute(\"required\", \"\");"
   "    document.getElementById(\"new_user_name\").removeAttribute(\"required\");"
   "    document.getElementById(\"new_user_band\").removeAttribute(\"required\");"
   "    document.getElementById(\"new_user_city\").removeAttribute(\"required\");"
   "    document.getElementById(\"new_user_province\").removeAttribute(\"required\");"
   "    document.getElementById(\"new_user_country\").removeAttribute(\"required\");"
   "    if (document.getElementById(\"new_user_province\").value === \"Other\") {"
   "      document.getElementById(\"new_user_province_other\").removeAttribute(\"required\");"
   "    }"
   "    if (document.getElementById(\"new_user_country\").value === \"Other\") {"
   "      document.getElementById(\"new_user_country_other\").removeAttribute(\"required\");"
   "    }"
   "    document.getElementById(\"new_user_new_password\").removeAttribute(\"required\");"
   "    document.getElementById(\"new_user_retyped_password\").removeAttribute(\"required\");"
   "  }"
   "  else if (section === 1) {"
   "    document.getElementById(\"returning_user_password_input\").removeAttribute(\"required\");"
   "    document.getElementById(\"new_user_name\").setAttribute(\"required\", \"\");"
   "    document.getElementById(\"new_user_band\").setAttribute(\"required\", \"\");"
   "    document.getElementById(\"new_user_city\").setAttribute(\"required\", \"\");"
   "    document.getElementById(\"new_user_province\").setAttribute(\"required\", \"\");"
   "    document.getElementById(\"new_user_country\").setAttribute(\"required\", \"\");"
   "    if (document.getElementById(\"new_user_province\").value === \"Other\") {"
   "      document.getElementById(\"new_user_province_other\").setAttribute(\"required\", \"\");"
   "    }"
   "    if (document.getElementById(\"new_user_country\").value === \"Other\") {"
   "      document.getElementById(\"new_user_country_other\").setAttribute(\"required\", \"\");"
   "    }"
   "    document.getElementById(\"new_user_new_password\").setAttribute(\"required\", \"\");"
   "    document.getElementById(\"new_user_retyped_password\").setAttribute(\"required\", \"\");"
   "  }"
   "};"))

(defn js-enable-or-disable-other-field
  "Generates the javascript to enable the optional 'Other' field when 'Other' is specified in the
  Country or Province dropdowns."
  []
  (str
   ""
   "var enable_or_disable_other_field = function(field, selected_option) {"
   "  if (selected_option === \"Other\") {"
   "    document.getElementById(field).removeAttribute(\"disabled\");"
   "    document.getElementById(field).setAttribute(\"required\", \"\");"
   "  }"
   "  else {"
   "    document.getElementById(field).value = \"\";"
   "    document.getElementById(field).setAttribute(\"disabled\", \"\");"
   "    document.getElementById(field).removeAttribute(\"required\");"
   "  }"
   "};"))

(defn js-suppress-enter
  "Generates javascript code to suppress the enter key in an input element"
  []
  (str "return (event.keyCode!=13);"))

(defn render-login
  "Renders the login/signup form"
  [request]
  (render-html {:title "Log In or Sign Up - Clovertone Music"
                :contents [:div#login.window
                           [:h2 "Log In or Sign Up"]
                           [:form.login_form {:action "/login/" :method "post"}
                            [:p#login_email
                             [:label "My email address is *"]
                             [:input {:name "email" :type "email" :required true
                                      :onkeydown (js-suppress-enter)}]]
                            [:p
                             [:input#new_user_radio
                              {:name "user" :type "radio" :onclick "toggle_login_form(1)"
                               :onkeydown (js-suppress-enter)}]
                             [:label "I am a new user"]
                             [:br]
                             [:table#new_user_form_table
                              [:tr [:th] [:td [:br]]]
                              [:tr
                               [:td "Country *"]
                               [:td (generate-country-dropdown "new_user")]]
                              [:tr
                               [:td]
                               [:td [:input#new_user_country_other.new_user_info
                                     {:name "country_other" :type "text" :disabled true
                                      :placeholder "Specify if Other"
                                      :onkeydown (js-suppress-enter)}]]]
                              [:tr
                               [:td "Province/State *"]
                               [:td (generate-province-dropdown "new_user")]]
                              [:tr
                               [:td]
                               [:td [:input#new_user_province_other.new_user_info
                                     {:name "province_other" :type "text" :disabled true
                                      :placeholder "Specify if Other"
                                      :onkeydown (js-suppress-enter)}]]]
                              [:tr
                               [:td "City *"]
                               [:td [:input#new_user_city.new_user_info
                                     {:name "city" :type "text"
                                      :onkeydown (js-suppress-enter)}]]]
                              [:tr
                               [:td "Name *"]
                               [:td [:input#new_user_name.new_user_info
                                     {:name "name" :type "text"
                                      :onkeydown (js-suppress-enter)}]]]
                              [:tr
                               [:td "School or band name *"]
                               [:td [:input#new_user_band.new_user_info
                                     {:name "band_name" :type "text"
                                      :onkeydown (js-suppress-enter)}]]]
                              [:tr
                               [:td "Phone number"]
                               [:td [:input#new_user_phone.new_user_info
                                     {:name "phone" :type "text"
                                      :onkeydown (js-suppress-enter)}]]]
                              [:tr
                               [:td "Enter a new password *"]
                               [:td [:input#new_user_new_password.new_user_info
                                     {:name "new_password" :type "password"
                                      :onkeydown (js-suppress-enter)}]]]
                              [:tr
                               [:td "Re-type password *"]
                               [:td [:input#new_user_retyped_password.new_user_info
                                     {:name "retyped_password" :type "password"
                                      :onkeydown (js-suppress-enter)}]]]
                              [:tr
                               [:td "Sign up to our newsletter"]
                               [:td [:select#new_user_newsletter.select.new_user_info {:name "newsletter"}
                                     [:option {:value "0"} "No"]
                                     [:option {:value "1" :selected true} "Yes"]]]]
                              [:tr [:td] [:td [:br]]]
                              [:tr
                               [:td [:input {:type "submit" :formaction "/signup/"
                                             :value "Sign up securely"}]]
                               [:td]]
                              (when (:nomatch (:params request))
                                [:p.error "Passwords do not match"])
                              (when (:already-exists (:params request))
                                [:p.error (str (:already-exists (:params request))
                                               " is already associated with an account")])]
                             [:hr]
                             [:p#returning_user_info
                              [:input#returning_user_radio
                               {:name "user" :type "radio" :checked true :onclick "toggle_login_form(0)"
                                :onkeydown (js-suppress-enter)}]
                              [:label "I am a returning user"]
                              [:label#returning_user_password "&nbsp;and my password is&nbsp;"
                               [:input#returning_user_password_input
                                {:name "password" :type "password" :required true
                                 :onkeydown (js-suppress-enter)}]]
                              [:br]
                              [:br]
                              [:input#returning_user_submit {:type "submit"
                                                             :value "Sign in securely"}]
                              [:span#login-status.status
                               ;; If the request contains "notfound=true" then the user tried to
                               ;; login with an unrecognised email address
                               (when (:notfound (:params request))
                                 [:p.error "User not found"])
                               ;; If the request contains "wrongpw=true" then the user tried to login
                               ;; with a recognised email address but with an incorrect password.
                               (when (:wrongpw (:params request))
                                 [:p.error "Incorrect password"])]
                              [:br][:br]
                              ;; TODO: Implement forgot my password
                              [:a#returning_user_forgot {:href "/"} "Forgot your password?"]]]]
                           [:script (str (js-toggle-login-form) "\n" (js-enable-or-disable-other-field))]]
                :user-status (user-status (:user request))}))

(defn send-activation-email
  "Sends an activation email to the user with the given activation id, using the given SMTP server"
  [email name server activationid]
  ;; TODO: Get the contents of the activation email from a markdown file.
  (let [body (str "Dear " name ",\n\n"
                  "Please click on the link below to verify your email address and activate your "
                  "Clovertone account. If you cannot click on the link, please copy and paste it "
                  "into your browser.\n\n"
                  ;; TODO: Change this to https eventually:
                  "http://" server "/activation/" activationid "\n\n"
                  "If you did not request to sign up for a Clovertone account, you can safely "
                  "ignore this message.\n\n"
                  "Sincerely,\n"
                  "The Clovertone team")
        ;; conn holds the connection parameters for the smtp server. Setting it to nil results in
        ;; delivery through the local mail system.
        ;; TODO: the SMTP server parameters should be set inside a config or markdown file and
        ;; pulled from there.
        ;; See: https://github.com/drewr/postal and http://www.rkn.io/2014/03/20/clojure-cookbook-email/
        conn nil
        send-status (send-message conn {:from "activation@clovertonemusic.com"
                                        :to [email]
                                        :reply-to "info@clovertonemusic.com"
                                        :subject "Activate your clovertonemusic.com account"
                                        :body body})]
    (when (not= (:error send-status) :SUCCESS)
      (log/error "Sending of email to" email "did not succeed (" send-status ")"))))

(defn post-signup
  "Handles the posting of the contents of the signup form. If the data is valid, a new user is
  created in the user db and an activation email is sent to the user containing a randomly generated
  activation id in a link for her to click on."
  [{{email "email" name "name" band_name "band_name" city "city"
     province "province" province_other "province_other"
     country "country" country_other "country_other"
     new_password "new_password" retyped_password "retyped_password"
     phone "phone" newsletter "newsletter"} :form-params
    session :session :as request}]
  (if-not (= retyped_password new_password)
    ;; If the submitted passwords do not match, then just redirect to the login page, adding a
    ;; parameter to the URL to indicate the nature of the problem:
    (redirect "/login/?nomatch=true")
    ;; Otherwise, create the user, email the activation id that was generated during creation to
    ;; the user, and then inform the user of what is happening:
    (let [get-region (fn [region region-other]
                       (if (= region "Other")
                         region-other
                         region))
          activationid (data/create-user! new_password name band_name city
                                          (get-region province province_other)
                                          (get-region country country_other)
                                          phone email newsletter)]
      (if-not activationid
        ;; If activation id is nil it is because the email already exists in the db. In this case
        ;; just redirect to the login page:
        (redirect (str "/login/?already-exists=" email))
        ;; Otherwise, send the activation email and tell the user to look for it:
        (do
          (send-activation-email email name (get (:headers request) "host") activationid)
          (render-html
           {:title "Activation - Clovertone Music"
            :contents [:div#contents
                       [:div#login.window
                        [:h2 (str "Activation in progress for " name)]
                        [:p "An email has just been sent to "
                         [:a {:href (str "mailto:" email)} email]
                         " with a link to activate your account. Once activated, you "
                         "will be able to login. Note: the email may have gone to your \"junk\" "
                         "email folder. If you do not receive the email, please contact us at "
                         ;; TODO: Define this email address somewhere central
                         ;; (e.g., a markdown page)
                         [:a {:href "mailto:info@clovertone.com"} "info@clovertone.com"]]]]
            :user-status (user-status (:user request))}))))))

(defn process-and-render-activation
  "Processes an activation request, and renders the HTML containing the result."
  [request]
  (let [activationid (:activationid (:params request))]
    (if (data/activate-user! activationid)
      ;; If the activation was successful, direct the user to login:
      (render-html {:title "Activation - Clovertone Music"
                    :contents [:div#contents
                               [:div#login.window
                                [:h2 "Your account has been successfully activated."]
                                [:p "Click " [:a {:href "/login/"} "here"] " to login."]]]
                    :user-status (user-status (:user request))})
      ;; Otherwise inform her of the bad request:
      (render-html {:title "Invalid Activation ID - Clovertone Music"
                    :contents [:div#contents
                               [:div#login.window
                                [:h2 "The submitted activation ID is invalid."]
                                [:p "For assistance, send an email to "
                                 [:a {:href "mailto:info@clovertone.com"} "info@clovertone.com"]]]]
                    :page-status 400
                    :user-status (user-status (:user request))}))))

(defn post-login
  "Handles the posting of data when an existing user attempts to login to the system."
  [{{email "email" password "password"} :form-params
    session :session :as req}]
  (let [user (data/get-user-by-email-and-password email password)]
    (cond
      (nil? user) (redirect "/login/?notfound=true")
      (= user false) (redirect "/login/?wrongpw=true")
      :else (->> user
                 ;; If the credentials are ok, associate a session to the request that
                 ;; incorporates an :identity field associated with the user, and redirect
                 ;; to the home page. The contents of the :identity field are whatever is returned
                 ;; by data/update-user-last-accessed-time!
                 :userid
                 (data/update-user-last-accessed-time!)
                 (assoc session :identity)
                 (assoc (redirect "/") :session)))))

(defn get-logout
  "Handles a logout request by stripping the :identity field from the session parameters and
  redirecting the user to the login page."
  [{session :session}]
  (assoc (redirect "/login/")
         :session (dissoc session :identity)))

(defn render-purchase-file
  "Render the requested purchase file (a non-HTML resource) if it exists."
  [{{purchase-dir :purchase-dir, purchase-file :purchase-file} :params}]
  (let [full-purchase-path (data/get-full-purchase-path purchase-dir purchase-file)]
    (when full-purchase-path
      (file-response full-purchase-path))))

(defn render-account
  "Renders the account page for a given user, displaying the user's purchase history and allowing
  the user to modify his/her personal information."
  [request]
  (let [make-purchase-row (fn [purchase]
                            (let [chart (->> data/catalogue
                                             :charts
                                             (filter #(= (:filename %) (:chart purchase)))
                                             (first))
                                  composer (->> data/catalogue
                                                :composers
                                                (filter #(= (:composer-name %) (:composer chart)))
                                                (first))
                                  grade (->> data/catalogue
                                             :grades
                                             (filter #(= (:grade-number %) (:grade chart)))
                                             (first))]
                              [:tr
                               [:td (:date purchase)]
                               [:td [:a {:href (str "/charts/" (:filename chart))}
                                     (:chart-name chart)]]
                               [:td [:a {:href (str "/composers/" (:filename composer))}
                                     (:composer chart)]]
                               [:td (:grade-name grade)]
                               [:td (:subgenre chart)]
                               [:td
                                [:table
                                 [:tr
                                  [:td
                                   [:span.download
                                    [:a
                                     {:href (str "/purchases/" (:purchaseid purchase) "/"
                                                 (:filename chart) ".score.pdf")} "Score"]]
                                   [:span.download
                                    [:a
                                     {:href (str "/purchases/" (:purchaseid purchase) "/"
                                                 (:filename chart) ".parts.pdf")} "Parts"]]]]]]]))
        user-purchases (->> request
                            :user
                            :userid
                            data/get-user-purchases
                            (sort-by #(:date %))
                            (reverse))
        user-province (:province (:user request))
        user-country (:country (:user request))]

    (render-html
     {:title "Account - Clovertone Music"
      :contents [:div#account.window
                 [:h2 "Account Information"]
                 (when (:nomatch (:params request))
                   [:p.error "New and re-typed passwords do not match."])
                 (when (:wrongpw (:params request))
                   [:p.error "Could not change password. Your current password is incorrect."])
                 [:br]
                 [:form {:action "/account-change/" :method "post"}
                  [:p
                   [:label "Email&nbsp;"]
                   [:b (:email (:user request))
                    [:input {:type "hidden" :value (:email (:user request)) :name "email"}]]
                   [:br]
                   [:a {:href "/account-email/"} [:small "Change my email address"]]]
                  [:table#account_form_table
                   [:tr
                    [:td "Country"]
                    [:td (generate-country-dropdown "account" user-country)]]
                   [:tr
                    [:td]
                    [:td [:input#account_country_other.account_info
                          (merge {:name "country_other" :type "text" :placeholder "Specify if Other"
                                  :onkeydown (js-suppress-enter)
                                  :disabled (some #(= user-country %) countries)}
                                 (when (not-any? #(= user-country %) countries)
                                   {:value user-country}))]]]
                   [:tr
                    [:td "Province/State"]
                    [:td (generate-province-dropdown "account" user-province)]]
                   [:tr
                    [:td]
                    [:td [:input#account_province_other.account_info
                          (merge {:name "province_other" :type "text" :placeholder "Specify if Other"
                                  :onkeydown (js-suppress-enter)
                                  :disabled (some #(= user-province %) provinces)}
                                 (when (not-any? #(= user-province %) provinces)
                                   {:value user-province}))]]]
                   [:tr
                    [:td "City"]
                    [:td [:input#account_city.account_info
                          {:name "city" :type "text"
                           :onkeydown (js-suppress-enter) :value (:city (:user request))}]]]
                   [:tr
                    [:td "Name"]
                    [:td [:input#account_name.account_info
                          {:name "name" :type "text"
                           :onkeydown (js-suppress-enter) :value (:name (:user request))}]]]
                   [:tr
                    [:td "School or band name"]
                    [:td [:input#account_band.account_info
                          {:name "band_name" :type "text"
                           :onkeydown (js-suppress-enter):value (:band (:user request))}]]]
                   [:tr
                    [:td "Phone number"]
                    [:td [:input#account_phone.account_info
                          {:name "phone" :type "text"
                           :onkeydown (js-suppress-enter):value (:phone (:user request))}]]]
                   [:tr
                    [:td "Current password"]
                    [:td [:input#account_current_password.account_info
                          {:name "current_password" :type "password"
                           :onkeydown (js-suppress-enter)}]]]
                   [:tr
                    [:td "New password"]
                    [:td [:input#account_new_password.account_info
                          {:name "new_password" :type "password"
                           :onkeydown (js-suppress-enter)}]]]
                   [:tr
                    [:td "Re-type new password"]
                    [:td [:input#account_retyped_password.account_info
                          {:name "retyped_password" :type "password"
                           :onkeydown (js-suppress-enter)}]]]
                   [:tr
                    [:td "Sign up to our newsletter"]
                    [:td [:select#account_newsletter.select.account_info {:name "newsletter"}
                          [:option {:value "0"
                                    :selected (= (:newsletter (:user request)) "1")} "No"]
                          [:option {:value "1"
                                    :selected (= (:newsletter (:user request)) "1")} "Yes"]]]]
                   [:tr [:td] [:td [:br]]]]
                  [:input {:type "submit" :value "Modify account information"}]
                  [:span#login-status.status]
                  [:br][:br]]
                 [:h2 "Purchase History"]
                 [:div#purchase_history
                  (if (> (utils/parse-number (count user-purchases)) 0)
                    [:table (map make-purchase-row user-purchases)]
                    [:p "You haven't made any purchases yet"])]
                 [:script (js-enable-or-disable-other-field)]]
      :user-status (user-status (:user request))})))

(defn post-account-change
  "Handles the posting of data when the user modifies his/her account information."
  [{{email "email" name "name" band_name "band_name" city "city"
     province "province" province_other "province_other"
     country "country" country_other "country_other" current_password "current_password"
     new_password "new_password" retyped_password "retyped_password"
     phone "phone" newsletter "newsletter"} :form-params
    session :session :as request}]
  (cond
    ;; If the user has entered a new password but the retyped password does not match it, redirect
    ;; back to the page while indicating the problem:
    (and (not= "" new_password) (not (= retyped_password new_password)))
    (redirect "/account/?nomatch=true")
    ;; If the user has entered a new password but has not supplied the correct current password,
    ;; redirect back to the page while indicating the problem:
    (and (not= "" new_password)
         (not (data/get-user-by-email-and-password email current_password)))
    (redirect "/account/?wrongpw=true")
    ;; In all other cases, post the data. If the user has entered a value for the current password
    ;; and/or in the retyped password field, but no new password, then all of these will be ignored
    ;; but the other data will be posted.
    :else (do
            (data/modify-account-information! (:form-params request))
            (render-html {:title "Account - Clovertone Music"
                          :contents [:div#contents
                                     [:div#login.window
                                      [:h3 "Your account details have been successfully changed."]]]
                          :user-status (user-status (:user request))}))))


(defn render-account-email
  "Renders the 'change email' page"
  [request]
  (render-html
   {:title "Change Account Email - Clovertone Music"
    :contents [:div#account.window
               [:h2 "Change the email address associated with your account"]
               (when (:nomatch (:params request))
                 [:p.error "New and re-typed email addresses do not match."])
               (when (:already-exists (:params request))
                 [:p.error "That email address is already assigned"])
               [:br]
               [:p "Current email address:&nbsp;" [:b (:email (:user request))]]
               [:form {:action "/account-email-change/" :method "post"}
                [:div [:label "New email address"]]
                [:div [:input {:name "new_email" :type "email" :onkeydown (js-suppress-enter)
                               :required true}]]
                [:div [:label "Re-type new email address"]]
                [:div [:input {:name "retyped_email" :type "email" :onkeydown (js-suppress-enter)
                               :required true}]]
                [:br]
                [:div [:input {:type "submit" :value "Submit"}]]
                [:span#login-status.status]
                [:br][:br]]
               [:script (js-enable-or-disable-other-field)]]
    :user-status (user-status (:user request))}))


(defn post-account-email-change
  "Handles the posting of data when the user modifies his/her email address."
  [{{new-email "new_email" retyped-email "retyped_email"} :form-params
    user :user
    session :session :as request}]
  (cond
    ;; If the new and retyped emails don't match, then redirect to the change email page while
    ;; indicating the problem:
    (not= new-email retyped-email) (redirect "/account-email/?nomatch=true")
    ;; If the new email already exists, redirect back while indicating the problem:
    (data/get-user-by-email new-email) (redirect "/account-email/?already-exists=true")
    ;; Otherwise process the request. Note that this is not fully implemented. Probably the best
    ;; way to implement this will be to generate an email with an activation id to the new address
    ;; similary to the way it is done when creating a new user.
    :else (render-html
           {:title "Not yet implemented"
            :contents [:p.window "Online email modification is not yet implemented. If you would like to "
                       "change the email address associated with your account, email us at "
                       [:a {:href "mailto:info@clovertonemusic.com"} "info@clovertonemusic.com"]]
            :user-status (user-status user)})))
