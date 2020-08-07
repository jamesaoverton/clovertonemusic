(ns clovertonemusic.html
  (:require [clojure.string :as string]
            [cheshire.core :as cheshire]
            [hiccup.core :as page]
            [java-time :as jtime]
            [markdown-to-hiccup.core :as m2h]
            [org.httpkit.client :as http]
            [paraman.core :as paraman]
            [postal.core :refer [send-message]]
            [ring.util.codec :as codec]
            [ring.util.response :refer [response file-response redirect]]
            [clovertonemusic.config :refer [config]]
            [clovertonemusic.data :as data]
            [clovertonemusic.log :as log]
            [clovertonemusic.utils :as utils]))


(def env
  "The runtime environment (dev, test, or prod), as read from the configuration map"
  (:env config))

;; Email addresses to use for various purposes:
(def activation-email-address (-> config
                                  :activation-email-address
                                  (get (keyword env))))
(def info-email-address (-> config
                            :info-email-address
                            (get (keyword env))))
(def support-email-address (-> config
                               :support-email-address
                               (get (keyword env))))

(defn get-recipient-email-for-env
  "Look into the configuration for the current environment. If a recipient email is defined, then
  return that instead of the one passed into the function. If no recipient email is defined (or if
  it is set to nil) for the current environment, then just return the email that has been passed"
  [email]
  (or (-> config
          :recipient-email-address
          (get (keyword env)))
      email))

(defn get-smtp-for-env
  "Return the appropriate SMTP server for the current environment (prod, test, or dev)"
  []
  (-> config
      :smtp-server
      (get (keyword env))))

(defn get-url-prefix-for-env
  "Return the appropriate URL prefix (http:// or https://) for the current environment
  (prod, test, or dev) and prepend it to the given string"
  [http-server]
  (-> config
      :http-prefix
      (get (keyword env))
      (str http-server)))

(defn get-url-for-env
  "Return the base URL for the server in the current environment"
  []
  (-> config
      :http-server
      (get (keyword env))
      (get-url-prefix-for-env)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to catalogue content
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

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
               ;; The copyright notice dynamically displays the current year:
               [:li (str "© " (->> (jtime/local-date) (jtime/format "yyyy"))
                         " Clovertone Music")]]]]]])})

(defn user-status
  "Generates the 'user status' links on clovertone pages. If the given user parameter is not nil,
  then links to the user's account, shopping cart, and to the logout route are generated, otherwise
  links to the shopping cart and to the login/signup page are generated."
  [user cart]
  (let [cart-link-label (cond
                          (empty? cart) "Cart Empty"
                          (= 1 (count cart)) "1 Item in Cart"
                          (< 1 (count cart)) (str (count cart) " Items in cart"))]
    (if user
      [:ul
       [:li [:a {:href "/cart/"} cart-link-label]]
       [:li [:a {:href "/account/"} "Account"]]
       [:li [:a {:href "/logout/"} "Log Out"]]]
      [:ul
       [:li [:a {:href "/cart/"} cart-link-label]]
       [:li [:a {:href "/login/"} "Log In / Sign Up"]]])))

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

(defn get-numeric-price
  "Converts the price of the chart (in format '$00.00') to a number"
  [chart]
  (->> :price chart
       (re-matches #"\$(\d+\.\d\d)")
       (second)
       (utils/parse-as-number)))

(defn get-numeric-duration
  "Converts the duration of a chart (in the format '00s') to a number"
  [chart]
  (->> :duration chart
       (re-matches #"(\d+)s")
       (second)
       (utils/parse-as-number)))

(defn sort-charts
  "Sorts the given sequence of charts by the given sort parameter, where the latter is of the form
  <param>:<asc|desc>. E.g. tempo:asc to sort by tempo in ascending order."
  [sort-param charts]
  (if-not sort-param
    ;; If no sort-parameter has been given, just return the charts back as is:
    charts
    ;; Otherwise:
    (let [sort-key (keyword (first (string/split sort-param #":")))
          sort-dir (second (string/split sort-param #":"))
          ascending-charts
          (cond
            ;; Keys for price and duration need to be parsed and converted to numbers before sorting:
            (= sort-key :price) (sort-by get-numeric-price < charts)
            (= sort-key :duration) (sort-by get-numeric-duration < charts)
            ;; Sorting is done numerically for :grade and :tempo:
            (some #(= sort-key %) [:grade :tempo]) (sort-by #(utils/parse-as-number (sort-key %)) < charts)
            ;; Sort is done in the default way in all other cases:
            :else (sort-by sort-key charts))]
      (if (= sort-dir "desc")
        (reverse ascending-charts)
        ascending-charts))))

(defn construct-email-to-clovertone
  "Constructs an email inquiring about the given chart, using the email parameter as a key for
  searching through the markdown pages for the template corresponding to that parameter."
  [email chart-name]
  (let [email-contents (data/get-inquiry-email-contents email)]
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
  (let [total-seconds (utils/parse-as-number (string/replace seconds-string #"s$" ""))
        minutes (quot total-seconds 60)
        seconds (mod total-seconds 60)]
    (format "%d:%02d" minutes seconds)))

(defn chart-to-html
  "Converts a given chart catalogue entry to a HTML div. If the chart is not already in the
  shopping cart, this is indicated in the div by inviting the user to order it."
  [user cart chart]
  (let [number (:chart-number chart)
        price (re-matches #"\$(\d+)(\.\d\d)" (:price chart))
        composer-path (->> data/catalogue
                           :composers
                           (filter #(= (:composer chart) (:composer-name %)))
                           (first)
                           :filename
                           (str "/composers/"))
        chart-is-unowned (or (nil? user)
                             (nil? (->> user
                                        :userid
                                        data/get-user-purchases
                                        (map #(string/split (:charts %) #"\s*;\s*"))
                                        (filter (fn [charts] (some #(= (:filename chart) %) charts)))
                                        (first))))]
    [(keyword (str "div#" number ".chart.grade" (:grade chart)))
     [:div.head
      ;; Add a name to serve as an anchor for navigating back to this specific chart:
      [:h2.title [:a {:name (:filename chart) :href (str "/charts/" (:filename chart))}
                  (:chart-name chart)]]
      [:h3.name
       [:a
        {:href composer-path}
        (str "By " (:composer chart) "\n")]]]
     [:div.body
      [:div.image
       [(keyword (str "div.genre-image." (:category chart)))]
       [:div.genre (:category chart)]
       [:div.grade (str "Grade " (:grade chart))]]
      [:a.purchase
       (if chart-is-unowned
         {:href (str "/add-to-cart/" (:filename chart))}
         {:href "/account#purchase_history_head"})
       [:div.price
        (cond
          (some #(= (:filename chart) %) cart) [:div.order "In Cart"]
          chart-is-unowned [:div.order "Order!"]
          :else [:div.order.smaller "Purchased"])
        [:span.dollar-sign "$"]
        [:span.dollars (get price 1)]
        [:span.cents (get price 2)]]]
      [:ul.actions
       [:li
        [:a#audio2.audio
         {:href (str "/audio/" (:filename chart) ".mp3")}
         "▶   Listen"]]
       [:li
        [:a
         {:href (str "/previews/" (:filename chart) ".preview.pdf") :target "_blank"}
         "Preview"]]
       [:li
        [:a
         {:href (construct-email-to-clovertone "customize" (:chart-name chart))}
         "Customize"]]]
      [:div.notes (->> chart
                       :notes
                       (m2h/md->hiccup)
                       (m2h/component))]]
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
  [{user :user,
    {search-param :search, sort-param :sort, :as params} :params,
    {cart :cart, :as session} :session,
    :as request}]
  (let [search-string search-param
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
                    (sort-charts sort-param)
                    (map #(chart-to-html user cart %))
                    (conj [:div#list]))]
      :user-status (user-status user cart)})))

(defn generate-about-contents
  "Generates the contents of the given about page based on the markdown file in the data directory
  corresponding to that page."
  [about-page user-info cart-info]
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
     :user-status (user-status user-info cart-info)}))

(defn render-about
  "Renders the about page specified in the request. If the page is not found, return nil which
  should result in a 404."
  [{user :user, {about-page :page, :as params} :params, {cart :cart, :as session} :session,
    :as request}]
  (try
    (render-html (generate-about-contents about-page user cart))
    ;; If the file doesn't exist, just return nothing, which should result in a 404 in the browser
    (catch java.io.FileNotFoundException ex)))

(defn render-charts
  "Generates the charts page, for either all charts or for a specific chart."
  [{user :user,
    {chart :page, sort-param :sort, :as params} :params,
    {cart :cart, :as session} :session,
    :as request}]
  (let [chart-catentry (->> data/catalogue
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
                        (map #(chart-to-html user cart %))
                        (conj [:div#list]))]
        :user-status (user-status user cart)})
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
                        (sort-charts sort-param)
                        (map #(chart-to-html user cart %))
                        (conj [:div#list]))]
          :user-status (user-status user cart)})))))

(defn render-composers
  "Renders the composers page, either for a specific composer, or for all of them."
  [{user :user,
    {composer :page, sort-param :sort, :as params} :params,
    {cart :cart, :as session} :session,
    :as request}]
  (let [composer-catentry (->> data/catalogue
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
                   [:div#content
                    [:h1.title (:composer-name composer-catentry)]
                    [:img.float {:src (str "/images/" (:filename composer-catentry) ".jpg")}]
                    [:p (:notes composer-catentry)]]]
        :charts [:div#charts
                 (->> data/catalogue
                      :charts
                      (filter #(= (:composer-name composer-catentry) (:composer %)))
                      (sort-charts sort-param)
                      (map #(chart-to-html user cart %))
                      (conj [:div#list]))]
        :user-status (user-status user cart)})
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
          :user-status (user-status user cart)})))))

(defn render-genres
  "Render the genres page for the genre specified in the request."
  [{user :user,
    {genre :page, sort-param :sort, :as params} :params,
    {cart :cart, :as session} :session,
    :as request}]
  (let [genre-catentry (->> data/catalogue
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
                      (sort-charts sort-param)
                      (map #(chart-to-html user cart %))
                      (conj [:div#list]))]
        :user-status (user-status user cart)}))))

(defn render-grades
  "Render the grades page for the grade specified in the request."
  [{user :user,
    {grade :page, sort-param :sort, :as params} :params,
    {cart :cart, :as session} :session,
    :as request}]
  (let [grade-catentry (->> data/catalogue
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
                      (sort-charts sort-param)
                      (map #(chart-to-html user cart %))
                      (conj [:div#list]))]
        :user-status (user-status user cart)}))))

(defn render-root
  "Renders the root page whenever either no route or the /index route is specified"
  [{user :user,
    {rootpg :page, sort-param :sort, :as params} :params,
    {cart :cart, :as session} :session,
    :as request}]
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
                    (sort-by #(utils/parse-as-number (:featured %)))
                    (sort-charts sort-param)
                    (map #(chart-to-html user cart %))
                    (conj [:div#list]))]
      :user-status (user-status user cart)})))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to login/signup
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def countries ["Canada" "USA"])
(def provinces ["Alberta" "British Columbia" "Manitoba" "New Brunswick" "Newfoundland and Labrador"
                "Nova Scotia" "Northwest Territories" "Nunavut" "Ontario" "Prince Edward Island"
                "Quebec" "Saskatchewan" "Yukon" "Alabama" "Alaska" "Arizona" "Arkansas" "California"
                "Colorado" "Connecticut" "Delaware" "District Of Columbia" "Florida" "Georgia"
                "Hawaii" "Idaho" "Illinois" "Indiana" "Iowa" "Kansas" "Kentucky" "Louisiana" "Maine"
                "Maryland" "Massachusetts" "Michigan" "Minnesota" "Mississippi" "Missouri" "Montana"
                "Nebraska" "Nevada" "New Hampshire" "New Jersey" "New Mexico" "New York"
                "North Carolina" "North Dakota" "Ohio" "Oklahoma" "Oregon" "Pennsylvania"
                "Rhode Island" "South Carolina" "South Dakota" "Tennessee" "Texas" "Utah"
                "Vermont" "Virginia" "Washington" "West Virginia" "Wisconsin" "Wyoming"])

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
  [{user :user,
    {nomatch :nomatch, already-exists :already-exists, notfound :notfound, wrongpw :wrongpw,
     user-disabled :user-disabled, :as params} :params,
    {cart :cart, :as session} :session,
    :as request}]
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
                              (when nomatch
                                [:p.error "Passwords do not match"])
                              (when already-exists
                                [:p.error (str already-exists
                                               " is already associated with an account")])]
                             [:hr]
                             [:p#returning_user_info
                              [:input#returning_user_radio
                               {:name "user" :type "radio" :checked true
                                :onclick "toggle_login_form(0)" :onkeydown (js-suppress-enter)}]
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
                               (when user-disabled
                                 [:p.error "User not yet activated"])
                               (when notfound
                                 [:p.error "User not found"])
                               ;; If the request contains "wrongpw=true" then the user tried to
                               ;; login with a recognised email address but with an incorrect
                               ;; password.
                               (when wrongpw
                                 [:p.error "Incorrect password"])]
                              [:p [:a {:href "/forgotpw/"} "Forgot your password?"]]]]]
                           [:script (str (js-toggle-login-form) "\n"
                                         (js-enable-or-disable-other-field))]]
                :user-status (user-status user cart)}))

(defn send-activation-email
  "Sends an activation email to the user with the given activation id, using the given SMTP server"
  [email name activationid]
  (let [http-server (-> config
                        :http-server
                        (get (keyword env)))
        body (data/get-activation-email-contents name (-> (get-url-prefix-for-env http-server)
                                                          (str "/activation/")
                                                          (str activationid)))
        send-status (-> (get-smtp-for-env)
                        (send-message {:from activation-email-address
                                       :to [(get-recipient-email-for-env email)]
                                       :reply-to support-email-address
                                       :subject "Activate your clovertonemusic.com account"
                                       :body body}))]
    (when (not= (:error send-status) :SUCCESS)
      (log/error "Sending of activation email to" email "did not succeed (" send-status ")"))))

(defn send-reset-pw-email
  "Sends an email with a link to reset the user's password, generated using the given parameters"
  [email is-migration name resetpwid]
  (let [http-server (-> config
                        :http-server
                        (get (keyword env)))
        body (data/get-reset-pwid-email-contents is-migration
                                                 name
                                                 (-> (get-url-prefix-for-env http-server)
                                                     (str "/resetpw/")
                                                     (str resetpwid)))
        send-status (-> (get-smtp-for-env)
                        (send-message {:from support-email-address
                                       :to [(get-recipient-email-for-env email)]
                                       :reply-to support-email-address
                                       :subject "Reset your clovertonemusic.com password"
                                       :body body}))]
    (when (not= (:error send-status) :SUCCESS)
      (log/error "Sending of reset password email to" email "did not succeed (" send-status ")"))))

(defn render-renewpw
  "If the system has deleted the user's password, allow them to reset it."
  [{{email :email} :params
    :as request}]
  (render-html {:title "Reset Password - Clovertone Music"
                :contents [:div.window
                           [:h2 "Reset Your Password"]
                           [:p "The system has been updated since you last logged in. "
                            "We need to verify the email address '" email "'. "
                            "Please press the button below, "
                            "and you will receive a message in the next few minutes with "
                            "instructions for resetting your password."]
                           [:form {:action "/forgotpw/" :method "post"}
                            [:br]
                            [:div#forgot_pw
                             [:input {:name "email" :type "hidden" :required true :value email}]
                             [:input {:type "submit" :value "Reset"}]]
                            [:br]]]}))

(defn render-forgotpw
  "Implements the form by which a user can request to reset his/her password."
  [{user :user,
    {cart :cart, :as session} :session,
    {notfound :notfound, user-disabled :user-disabled, :as params} :params,
    :as request}]
  (render-html {:title "Forgot Password - Clovertone Music"
                :user-status (user-status user cart)
                :contents [:div.window
                           [:h2 "Forgot Your Password"]
                           [:p "Enter your email address in the form below. If it is on file with "
                            "us you will receive a message in the next few minutes with "
                            "instructions for resetting your password."]
                           [:form {:action "/forgotpw/" :method "post"}
                            [:br]
                            [:div#forgot_pw
                             (when user-disabled
                               [:p.error "User not yet activated"])
                             (when notfound
                               [:p.error "Email address not found"])
                             [:label [:b "Email:"]]
                             [:input {:name "email" :type "email" :required true}]
                             [:input {:type "submit" :value "Submit"}]]
                            [:br]]]}))

(defn post-forgotpw
  "Processes the first stage of a reset password request. I.e., looks up the given user email
  address, and if it exists, sends a link by email to the user enabling him to complete the
  process. Note that if the user loses or deletes that email, he should still be able to login
  with the correct password if he remembers it later."
  [{{email :email, is-migration :is-migration, :as params} :params,
    {cart :cart, :as session} :session,
    session-user :user, :as request}]
  (let [user (data/get-user-by-email email)]
    (cond (nil? user) (redirect "/forgotpw/?notfound=true")
          (data/user-is-disabled user) (redirect "/forgotpw/?user-disabled=true")
          :else (let [resetpwid (data/add-reset-password-id-to-user! (:userid user))]
                  (-> email
                      (get-recipient-email-for-env)
                      (send-reset-pw-email is-migration (:name user) resetpwid))
                  (render-html
                   {:title "Reset Password - Clovertone Music"
                    :contents [:div#contents
                               [:div#login.window
                                [:h2 (str "Reset password request in progress for " (:name user))]
                                [:p "An email has just been sent to "
                                 [:a {:href (str "mailto:" email)} email]
                                 " with a link to reset your password. Note: the email may have "
                                 "gone to your \"junk\" email folder. If you do not receive the "
                                 "email, please contact us at "
                                 [:a {:href (str "mailto:" support-email-address)}
                                  support-email-address]]]]
                    :user-status (user-status session-user cart)})))))

(defn post-signup
  "Handles the posting of the contents of the signup form. If the data is valid, a new user is
  created in the user db and an activation email is sent to the user containing a randomly generated
  activation id in a link for her to click on."
  [{{email "email" name "name" band_name "band_name" city "city"
     province "province" province_other "province_other"
     country "country" country_other "country_other"
     new_password "new_password" retyped_password "retyped_password"
     phone "phone" newsletter "newsletter"} :form-params,
    {cart :cart, :as session} :session,
    user :user,
    :as request}]
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
        ;; If activation id is blank it is because the email already exists in the db. In this case
        ;; just redirect to the login page:
        (redirect (str "/login/?already-exists=" email))
        ;; Otherwise, send the activation email and tell the user to look for it:
        (do
          (-> email
              (get-recipient-email-for-env)
              (send-activation-email name activationid))
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
                         [:a {:href (str "mailto:" support-email-address)}
                          support-email-address]]]]
            :user-status (user-status user cart)}))))))

(defn process-and-render-activation
  "Processes an activation request, and renders the HTML containing the result."
  [{user :user,
   {cart :cart, :as session} :session,
   {activationid :activationid, :as params} :params,
   :as request}]
  (if (data/activate-user! activationid)
    ;; If the activation was successful, direct the user to login:
    (render-html {:title "Activation - Clovertone Music"
                  :contents [:div#contents
                             [:div#login.window
                              [:h2 "Your account has been successfully activated."]
                              [:p "Click " [:a {:href "/login/"} "here"] " to login."]]]
                  :user-status (user-status user cart)})
    ;; Otherwise inform her of the bad request:
    (render-html {:title "Invalid Activation ID - Clovertone Music"
                  :contents [:div#contents
                             [:div#login.window
                              [:h2 "The submitted activation ID is invalid."]
                              [:p "For assistance, send an email to "
                               [:a {:href (str "mailto:" support-email-address)}
                                support-email-address]]]]
                  :page-status 400
                  :user-status (user-status user cart)})))

(defn process-and-input-password-reset
  "Processes a password reset request by first validating the reset password id given, fetching
  the user record associated with that id, and finally, presenting the user with a form
  to input her new password."
  [{session-user :user,
    {cart :cart, :as session} :session,
    {resetpwid :resetpwid, nomatch :nomatch, :as params} :params,
    :as request}]
  (let [user (data/get-user-by-resetpwid resetpwid)]
    (if-not user
    ;; If there is no user corresponding to the reset password id, inform the user:
    (render-html {:title "Invalid Reset Password ID - Clovertone Music"
                  :contents [:div#contents
                             [:div.window
                              [:h2 "The submitted reset password ID is invalid."]
                              [:p "For assistance, send an email to "
                               [:a {:href (str "mailto:" support-email-address)}
                                support-email-address]]]]
                  :page-status 400
                  :user-status (user-status user cart)})
    ;; Otherwise, render a password reset form:
    (render-html {:title "Reset Password - Clovertone Music"
                  :user-status (user-status session-user cart)
                  :contents [:div.window
                             [:h2 "Reset Password for " (:email user)]
                             [:form {:action "/resetpw/" :method "post"}
                              [:br]
                              [:div#reset_pw
                               (when nomatch
                                 [:p.error "Passwords do not match"])
                               [:div
                                [:label [:b "New password:"]]]
                               [:div
                                [:input {:name "password1" :type "password" :required true}]]
                               [:div
                                [:label [:b "Retype password:"]]]
                               [:div
                                [:input {:name "password2" :type "password" :required true}]]
                               [:div
                                [:input {:type "submit" :value "Submit"}]]]
                              [:input {:name "userid" :type "hidden" :value (:userid user)}]
                              [:input {:name "resetpwid" :type "hidden" :value resetpwid}]
                              [:br]]]}))))

(defn post-resetpw
  "Resets the user's password to the new one given, after first checking to make sure that the user
  has retyped her password correctly."
  [{{userid "userid", password1 "password1", password2 "password2", resetpwid "resetpwid"
     :as form-params} :form-params,
    session-user :user,
    {cart :cart, :as session} :session,
    :as request}]
  (if-not (= password1 password2)
    ;; If the inputted passwords don't match, then redirect back to the password reset page using
    ;; the given reset password id so that the user can try again.
    (redirect (str "/resetpw/" resetpwid "?nomatch=true"))
    ;; Otherwise, change the user's password to the given one:
    (do
      (data/change-user-password! userid password1)
      ;; Render a "password changed" page:
      (render-html {:title "Reset Password - Clovertone Music"
                    :contents [:div#contents
                               [:div.window
                                [:h2 "Your password has been successfully changed."]
                                [:p "Click " [:a {:href "/login/"} "here"] " to login."]]]
                    :user-status (user-status session-user cart)}))))

(defn post-login
  "Handles the posting of data when an existing user attempts to login to the system."
  [{{email "email" password "password"} :form-params
    session :session :as req}]
  (let [known-user (data/get-user-by-email email)
        valid-user (data/get-user-by-email-and-password email password)]
    (cond
      (nil? known-user) (redirect "/login/?notfound=true")
      (string/blank? (:password known-user)) (redirect (str "/renewpw/?email=" email))
      (= valid-user false) (redirect "/login/?wrongpw=true")
      (data/user-is-disabled valid-user) (redirect "/login/?user-disabled=true")
      :else (->> valid-user
                 ;; If the credentials are ok, associate a session to the request that
                 ;; incorporates an :identity field associated with the user, and redirect
                 ;; to the home page. The contents of the :identity field are whatever is returned
                 ;; by data/update-user-last-accessed-time!
                 :userid
                 (data/update-user-last-accessed-time!)
                 (assoc session :identity)
                 (data/remove-already-owned-charts-from-cart valid-user)
                 (assoc (redirect "/") :session)))))

(defn get-logout
  "Handles a logout request by stripping the :identity field from the session parameters and
  redirecting the user to the login page."
  [{session :session}]
  (assoc (redirect "/login/")
         :session (dissoc session :identity)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to user account info and admin
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn render-account
  "Renders the account page for a given user, displaying the user's purchase history and allowing
  the user to modify his/her personal information."
  [{user :user,
    {cart :cart, :as session} :session,
    {nomatch :nomatch, wrongpw :wrongpw, :as params} :params,
    :as request}]
  (let [make-purchase-div (fn [purchase]
                            ;; Generate a DIV containing the table rows with the information about
                            ;; the purchase
                            (let [charts (string/split (:charts purchase) #"\s*;\s*")
                                  get-chart-details (fn [chart]
                                                      (->> data/catalogue
                                                           :charts
                                                           (filter #(= (:filename %) chart))
                                                           (first)))
                                  get-composer (fn [chart]
                                                 (->> data/catalogue
                                                      :composers
                                                      (filter #(= (:composer-name %)
                                                                  (:composer chart)))
                                                      (first)))
                                  get-grade (fn [chart]
                                              (->> data/catalogue
                                                   :grades
                                                   (filter #(= (:grade-number %) (:grade chart)))
                                                   (first)))]
                              [:div
                               [:tr [:td.purchase_date (:date purchase)]]
                               (for [chart (map get-chart-details charts)]
                                 [:tr
                                  [:td
                                   [:a {:href (str "/charts/" (:filename chart))}
                                    (:chart-name chart)]]
                                  [:td
                                   [:a {:href (str "/composers/" (:filename (get-composer chart)))}
                                    (:composer chart)]]
                                  [:td
                                   (:grade-name (get-grade chart))]
                                  [:td
                                   (:subgenre chart)]
                                  [:td.download
                                   [:a.download
                                    {:href (str "/purchases/" (:purchaseid purchase) "/"
                                                (:filename chart) ".score.pdf")} "Score"]
                                   [:a.download
                                    {:href (str "/purchases/" (:purchaseid purchase) "/"
                                                (:filename chart) ".parts.pdf")} "Parts"]]])]))
        user-purchases (->> user
                            :userid
                            data/get-user-purchases
                            (sort-by #(:date %))
                            (reverse))
        user-province (:province user)
        user-country (:country user)]

    (render-html
     {:title "Account - Clovertone Music"
      :contents [:div#account.window
                 [:h2#account_info_head "Account Information"]
                 (when nomatch
                   [:p.error "New and re-typed passwords do not match."])
                 (when wrongpw
                   [:p.error "Could not change password. Your current password is incorrect."])
                 ;;[:br]
                 [:form {:action "/account-change/" :method "post"}
                  [:p
                   [:label#account_email "Email:&nbsp;"]
                   [:b (:email user)
                    [:input {:type "hidden" :value (:email user) :name "email"}]]
                   [:br]]
                  [:table#account_form_table
                   [:tr
                    [:td "Country"]
                    [:td (generate-country-dropdown "account" user-country)]]
                   [:tr
                    [:td]
                    [:td [:input#account_country_other.account_info
                          (merge {:name "country_other" :type "text"
                                  :placeholder "Specify if Other"
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
                          (merge {:name "province_other" :type "text"
                                  :placeholder "Specify if Other"
                                  :onkeydown (js-suppress-enter)
                                  :disabled (some #(= user-province %) provinces)}
                                 (when (not-any? #(= user-province %) provinces)
                                   {:value user-province}))]]]
                   [:tr
                    [:td "City"]
                    [:td [:input#account_city.account_info
                          {:name "city" :type "text"
                           :onkeydown (js-suppress-enter) :value (:city user)}]]]
                   [:tr
                    [:td "Name"]
                    [:td [:input#account_name.account_info
                          {:name "name" :type "text"
                           :onkeydown (js-suppress-enter) :value (:name user)}]]]
                   [:tr
                    [:td "School or band name"]
                    [:td [:input#account_band.account_info
                          {:name "band_name" :type "text"
                           :onkeydown (js-suppress-enter):value (:band user)}]]]
                   [:tr
                    [:td "Phone number"]
                    [:td [:input#account_phone.account_info
                          {:name "phone" :type "text"
                           :onkeydown (js-suppress-enter):value (:phone user)}]]]
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
                                    :selected (= (:newsletter user) "1")} "No"]
                          [:option {:value "1"
                                    :selected (= (:newsletter user) "1")} "Yes"]]]]
                   [:tr [:td] [:td [:br]]]]
                  [:input {:type "submit" :value "Modify account information"}]
                  [:span#login-status.status]
                  [:br][:br]]
                 [(keyword "h2#purchase_history_head") "Purchase History"]
                 (if (> (utils/parse-as-number (count user-purchases)) 0)
                   [:table#purchase_history_table (map make-purchase-div user-purchases)]
                   [:p "You haven't made any purchases yet"])
                 [:script (js-enable-or-disable-other-field)]]
      :user-status (user-status user cart)})))

(defn post-account-change
  "Handles the posting of data when the user modifies his/her account information."
  [{{email "email" name "name" band_name "band_name" city "city"
     province "province" province_other "province_other"
     country "country" country_other "country_other" current_password "current_password"
     new_password "new_password" retyped_password "retyped_password"
     phone "phone" newsletter "newsletter"} :form-params
    user :user,
    {cart :cart, :as session} :session,
    :as request}]
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
                          :user-status (user-status user cart)}))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Functions and Vars relating to purchases
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn add-to-cart
  "Add the given chart to the shopping cart associated with the browser session."
  [{{chart :chart, :as params} :params,
    {prevpage "referer", :as headers} :headers,
    session :session,
    :as request}]
  ;; Add the chart to the shopping cart, then navigate back to the anchor for the chart on the
  ;; previous page:
  (assoc (redirect (str prevpage "#" chart))
         :session (->> session
                       :cart
                       (set)
                       (clojure.set/union #{chart})
                       (assoc session :cart))))

(defn remove-from-cart
  "Removes the given chart from the shopping cart"
  [{{chart :chart, :as params} :params,
    {prevpage "referer", :as headers} :headers,
    session :session,
    :as request}]
  (let [current-load (->> session
                          :cart
                          (set))]
    ;; After removing the chart, navigate back to the previous page, which should be the shopping
    ;; cart page.
    (assoc (redirect prevpage)
           :session (->> chart
                         (disj current-load)
                         (assoc session :cart)))))

(defn get-cart-details
  "Given a cart, in the form of a list of chart filenames, return a list with the details of the
  chart corresponding to each chart filename."
  [cart]
  (->> data/catalogue
       :charts
       (filter (fn [chart] (some #(= (:filename chart) %) cart)))))

(defn calculate-subtotal
  "Calculate the total price (not including tax) for the items in the given detailed cart"
  [detailed-cart]
  (->> detailed-cart
       (map get-numeric-price)
       (reduce +)
       (double)))

(defn calculate-tax
  "Given a subtotal and information about the user, calculate the tax applicable to the user's
  region"
  [user subtotal]
  (cond
    ;; Ontario customers pay HST:
    (and (= (:province user) "Ontario") (= (:country user) "Canada"))
    {:name "Ontario HST" :rate "13%" :amount (* 0.13 subtotal)}
    ;; Other Canadian customers pay GST:
    (= (:country user) "Canada")
    {:name "GST" :rate "5%" :amount (* 0.05 subtotal)}
    ;; No taxes for non-Canadians:
    :else
    {:name "No Tax" :rate "0%" :amount 0.0}))

(defn generate-watermark
  "Generate a watermark string for the user that will be applied to his/her purchases"
  [user]
  (str "For use by " (:band user) ", " (:city user) ", " (:province user) ", " (:country user) "."))

(defn render-shopping-cart
  "Show the user's shopping cart in a HTML page."
  [{user :user,
    {thanks :thanks, :as params} :params,
    {cart :cart, :as session} :session,
    :as request}]
  (let [detailed-cart (get-cart-details cart)
        subtotal (calculate-subtotal detailed-cart)
        tax (calculate-tax user subtotal)
        watermark (generate-watermark user)
        ;; This is the HTML DIV to display when the shopping cart is not empty:
        shopping-cart-div [:div#shopping_cart
                           [:table
                            [:tr [:th "Chart"] [:th "Composer"] [:th "Grade"] [:th "Price"]]
                            (for [chart detailed-cart]
                              [:tr
                               [:td {:data-label "Chart"} (:chart-name chart)]
                               [:td {:data-label "Composer"} (:composer chart)]
                               [:td {:data-label "Grade"} (:grade chart)]
                               [:td {:data-label "Price"} (:price chart)]
                               [:td {:data-label ""}
                                [:a {:href (str "/remove-from-cart/" (:filename chart))}
                                 "remove"]]])
                            [:tr [:td] [:td] [:td] [:td [:hr]]]
                            [:tr [:th] [:th] [:th "Subtotal"]
                             [:td {:data-label "Subtotal"} (format "$%.2f" subtotal)]]
                            (if-not user
                              ;; If the user is not logged in, just tell the user that taxes may
                              ;; be applicable,
                              [:div [:tr [:th] [:th] [:td "Plus applicable taxes"]]]
                              ;; Otherwise determine the tax based on the user's location.
                              [:div
                               [:span
                                [:tr [:th] [:th] [:th (str (:name tax) "(" (:rate tax) ")")]
                                 [:td {:data-label (str (:name tax) "(" (:rate tax) ")")}
                                  (format "$%.2f" (:amount tax))]]
                                [:tr [:th] [:th] [:th "Total"]
                                 [:td {:data-label "Total"}
                                  (format "$%.2f" (+ (:amount tax) subtotal))]]]])]
                           [:br]
                           (if-not user
                             ;; If not logged in, suggest that the user do so:
                             [:p "To continue with your purchase, please "
                              [:a {:href "/login/"} "log in or sign up"] " for an account"]
                             ;; Otherwise show everything below
                             [:div
                              [:div.buy
                               [:form {:action "/buy-cart/" :method "post"}
                                [:input {:type "hidden" :name "subtotal" :value subtotal}]
                                [:input {:type "hidden" :name "taxrate" :value (:rate tax)}]
                                [:input {:type "hidden" :name "taxname" :value (:name tax)}]
                                [:input {:type "hidden" :name "taxes" :value (:amount tax)}]
                                [:input {:type "hidden" :name "total"
                                         :value (+ (:amount tax) subtotal)}]
                                [:input {:type "hidden" :name "watermark" :value watermark}]
                                [:input {:type "submit" :value "Buy now"}]]]
                              [:p [:b "Important! "] "You are purchasing an electronic copy of the "
                               "score and parts to these charts in "
                               [:a {:href "https://get.adobe.com/reader" :target "__blank"}
                                "Adobe PDF format"]
                               ". When your purchase is complete your will immediately be emailed "
                               "a link for downloading your files. Every page will be marked "
                               "with your school or band name and address as follows:"]
                              [:p [:b watermark]]])]]

    (render-html {:title "Shopping Cart - Clovertone Music"
                  :user-status (user-status user cart)
                  :contents [:div.window
                             [:h2 (str "Shopping cart" (when user (str " for " (:name user))))]
                             [:br]
                             (if-not (empty? cart)
                               shopping-cart-div
                               (if thanks
                                 [:p [:h3 "Thanks for your purchase!"]]
                                 [:p "Your shopping cart is empty"]))]})))

(defn render-stripe-checkout-error
  "Render an HTML page indicating that an error occurred while trying to get a checkout session id"
  [{user :user,
    {cart :cart, :as session} :session,
    :as request}]
  (render-html
   {:title "Stripe Error - Clovertone Music"
    :contents [:div#contents
               [:h1 "Stripe Error"]
               [:p "There was an error obtaining a checkout session ID from Stripe."
                [:p "For assistance, send an email to "
                 [:a {:href (str "mailto:" support-email-address)}
                  support-email-address]]]]
    :user-status (user-status user cart)}))

(defn complete-purchase
  "Complete the payment process by verifying that the given stripe-checkout-session-id is the right
  one for the current browser session, and that the purchase corresponding to that stripe session
  has been paid. If this is all true, the user's browser is redirected to a page displaying a
  'Thanks' message, otherwise an error is indicated to the user."
  [{user :user,
    {cart :cart, old-stripe-checkout-session-id :stripe-checkout-session-id, :as session} :session,
    {new-stripe-checkout-session-id :stripe-checkout-session-id, :as params} :params,
    :as request}]
  (if-not (= old-stripe-checkout-session-id new-stripe-checkout-session-id)
    ;; If the given checkout session id does not match the one we expect, redirect the browser to an
    ;; error page.
    (do
      (log/warn "GET request received for endpoint complete-purchase/ with invalid stripe checkout"
                "session id:" new-stripe-checkout-session-id "(was expecting:"
                old-stripe-checkout-session-id ")")
      (render-html {:title "Invalid Stripe Checkout Session ID - Clovertone Music"
                    :contents [:div#contents
                               [:h1 "Invalid Stripe Checkout Session ID"]
                                [:p (str "The supplied Stripe Checkout Session ID does not "
                                         "correspond to the one saved in the current session")
                                 [:p "For assistance, send an email to "
                                  [:a {:href (str "mailto:" support-email-address)}
                                   support-email-address]]]]
                    :user-status (user-status user cart)}))
    ;; Otherwise check to see if the purchase is marked as paid:
    (let [paid (->> data/purchases-db
                    (deref)
                    (filter #(= (:stripe-checkout-session-id %) new-stripe-checkout-session-id))
                    (first)
                    :payment-completed)]
      ;; If it is, then empty the user's shopping cart and display a "Thanks" message:
      (if (= (string/lower-case paid) "true")
        (assoc (redirect "/cart/?thanks=true")
               :session (-> session
                            (dissoc :cart)
                            (dissoc :stripe-checkout-session-id)))
        ;; Otherwise redirect the browser to an error page:
        (do
          (log/warn "In endpoint complete-purchase/, the purchase with id"
                    new-stripe-checkout-session-id "is not marked as paid. Check that the callback"
                    "URL is defined correctly in Stripe.")
          (render-html {:title "Problem Finalizing Purchase - Clovertone Music"
                        :contents [:div#contents
                                   [:h1 "Problem Finalizing Purchase"]
                                    [:p (str "The purchase corresponding to the given Stripe "
                                             "Checkout Session ID has not been marked as paid in "
                                             "the Clovertone database")
                                     [:p "For assistance, send an email to "
                                      [:a {:href (str "mailto:" support-email-address)}
                                       support-email-address]]]]
                        :user-status (user-status user cart)}))))))

(defn get-stripe-keys
  "Returns a map containing the publishable and secret key to use when communicating with the
  Stripe API"
  []
  (-> config
      :stripe-api-keys
      (get (keyword env))))

(defn create-stripe-checkout-payment-session
  "Given a shopping cart and information about the taxes applicable to the items in it, generate a
  checkout payment session in Stripe, with a line item corresponding to each item in the cart as
  well as one for the applicable taxes, and return the stripe-checkout-session-id."
  [taxes taxname taxrate cart]
  (let [detailed-cart (get-cart-details cart)
        line-items (conj
                    ;; Add a line item corresponding to each chart being purchased:
                    (vec (->> detailed-cart
                              (map (fn [chart]
                                     {"name" (:chart-name chart)
                                      "amount" (->> chart
                                                    (get-numeric-price)
                                                    (utils/parse-as-number)
                                                    (* 100)
                                                    (int))
                                      "currency" "cad"
                                      "quantity" 1}))))
                    ;; Add a line item for taxes if they are non-zero:
                    (let [tax-amount (->> taxes
                                          (utils/parse-as-number)
                                          (* 100)
                                          (int))]
                      (when-not (= 0 tax-amount)
                        {"name" (->> (str "(" taxrate ")")
                                     (str taxname " "))
                         "amount" tax-amount
                         "currency" "cad"
                         "quantity" "1"})))
        response (http/post "https://api.stripe.com/v1/checkout/sessions"
                            {:basic-auth [(:secret (get-stripe-keys)) ""]
                             :body (paraman/convert
                                    {:payment_method_types ["card"]
                                     :mode "payment"
                                     :line_items line-items
                                     :success_url (str (get-url-for-env)
                                                       "/complete-purchase/{CHECKOUT_SESSION_ID}")
                                     :cancel_url (str (get-url-for-env)
                                                      "/cart/")})})]
    (if-not (= (:status @response) 200)
      nil
      (-> @response
          (get :body)
          (cheshire/parse-string)
          (get "id")))))

(defn post-stripe-checkout-session-completed
  "Processes the webhook sent from Stripe's backend, marking the purchase corresponding to the
  given stripe checkout session id as paid."
  [{{{{id "id" :as object} "object" :as data} "data" :as body} :body :as request}]
  ;; Mark the purchase corresponding to the checkout session id as paid:
  (data/mark-as-paid! id)
  ;; Return an empty page. The default page-status returned by render-html is 200. That is all
  ;; that needs to be in the response
  (render-html {}))

(defn post-buy-cart
  "Process the user's request to purchase the items in her cart."
  [{user :user,
    {cart :cart, :as session} :session,
    {subtotal :subtotal, taxrate :taxrate, taxname :taxname, taxes :taxes, total :total,
     watermark :watermark, :as params} :params,
    :as request}]
  (let [stripe-checkout-session-id (create-stripe-checkout-payment-session taxes taxname taxrate cart)
        detailed-cart (get-cart-details cart)
        subtotal (calculate-subtotal detailed-cart)
        tax (calculate-tax user subtotal)
        taxamount (:amount tax)
        taxname (:name tax)
        taxrate (:rate tax)
        total (+ subtotal taxamount)
        watermark (generate-watermark user)]
    (if (or (empty? stripe-checkout-session-id) (nil? stripe-checkout-session-id))
      (redirect "/stripe-checkout-error")
      (do
        ;; Create a purchase in the database. Note that it will actually be marked as having been
        ;; paid until the user completes the payment on Stripe's web pages and the webhook indicating
        ;; the successful payment has been sent back to us.
        (data/create-purchase! (:userid user) cart subtotal taxrate taxname taxamount total
                               watermark stripe-checkout-session-id)
        (assoc
         (render-html {:title "Payment Processing - Clovertone Music"
                       :user-status (user-status user cart)
                       :contents [:div.window
                                  [:h2 "Redirecting you to Stripe"]
                                  [:script {:type "text/javascript",
                                            :src "https://js.stripe.com/v3/"}]
                                  [:script
                                   (str
                                    "var stripe = Stripe('" (:publishable (get-stripe-keys)) "');"
                                    "stripe.redirectToCheckout({"
                                    "  sessionId: '" stripe-checkout-session-id "'"
                                    "});")]]})
         ;; Add the stripe-checkout-session-id to the browser session:
         :session (assoc session :stripe-checkout-session-id stripe-checkout-session-id))))))

(defn render-purchase-file
  "Render the requested purchase file (a non-HTML resource) if it exists."
  [{{purchase-dir :purchase-dir, purchase-file :purchase-file} :params}]
  (let [full-purchase-path (data/get-full-purchase-path purchase-dir purchase-file)]
    (when full-purchase-path
      (file-response full-purchase-path))))
