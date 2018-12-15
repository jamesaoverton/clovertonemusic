(ns clovertonemusic.html
  (:require [hiccup.core :as page]
            [markdown-to-hiccup.core :as m2h]
            [ring.util.codec :as codec]
            [ring.util.response :refer [response redirect]]
            [clojure.string :as string]
            [clovertonemusic.data :as data]))

(defn render-html
  "Wraps the four parameters passed as arguments in the generic HTML code that is used for every
  page in Clovertone."
  [{title :title, sorting :sorting, contents :contents, charts :charts, status :status}]
  {:status 200
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
             ;; The status function parameter goes here:
             [:div#status-box.right [:ul#status-menu] status]
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
               [:li "© 2017 Clovertone Music"]]]]
            ]])})

(defn user-status
  [user]
  (if user
    ;; TODO: IMPLEMENT ACCOUNT MANAGEMENT
    [:ul [:li [:a {:href "/"} "Account"]] [:li [:a {:href "/logout/"} "Log Out"]]]
    [:ul [:li [:a {:href "/login/"} "Log In / Sign Up"]]]))

(defn get-sorting
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
  [sort-param charts]
  (if-not sort-param
    ;; If no sort-parameter has been given, just return the charts back as is:
    charts
    ;; Otherwise:
    (letfn [(get-numeric-price [chart]
              (->> :price chart
                   (re-matches #"\$(\d+\.\d\d)")
                   (second)
                   (Float/parseFloat)))
            (get-numeric-duration [chart]
              (->> :duration chart
                   (re-matches #"(\d+)s")
                   (second)
                   (Integer/parseInt)))]

      (let [sort-key (keyword (first (string/split sort-param #":")))
            sort-dir (second (string/split sort-param #":"))
            ascending-charts
            (cond
              ;; Keys for price and duration need to be parsed and converted to numbers before sorting:
              (= sort-key :price) (sort-by get-numeric-price < charts)
              (= sort-key :duration) (sort-by get-numeric-duration < charts)
              ;; Sorting is done numerically for :grade and :tempo:
              (some #(= sort-key %) [:grade :tempo]) (sort-by #(Integer/parseInt (sort-key %)) < charts)
              ;; Sort is done in the default way in all other cases:
              :else (sort-by sort-key charts))]
        (if (= sort-dir "desc")
          (reverse ascending-charts)
          ascending-charts)))))

(defn construct-email
  [email chart-name]
  (let [email-contents (data/get-email-contents email)]
    (str "mailto:" (->> :to email-contents
                        (codec/url-encode))
         "?subject=" (->> :subject email-contents
                          (codec/url-encode))
         "&body=" (->> (string/replace (:body email-contents) #"<CHART>" chart-name)
                       (codec/url-encode)))))

(defn construct-readable-duration
  [seconds-string]
  ;; We can assume that the duration ends in 's'
  (let [total-seconds (Integer/parseInt (string/replace seconds-string #"s$" ""))
        minutes (quot total-seconds 60)
        seconds (mod total-seconds 60)]
    (format "%d:%02d" minutes seconds)))

(defn chart-to-html
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
       {:href (construct-email "purchase" (:chart-name chart))}
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
         {:href (construct-email "customize" (:chart-name chart))}
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
      :status (user-status (:user request))})))

(defn tweak-about-page
  [page-component]
  (if (= page-component :div)
    (keyword "div#content")
    (if (= (first page-component) :h1)
      (let [[h1 & rest] page-component]
        (vec (concat [(keyword (str "h1" ".title"))] rest)))
      page-component)))

(defn generate-about-contents
  [about-page user-info]
  (let [contents (->> about-page
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
     :sorting [:div#sorting]
     :contents contents
     :charts [:div#charts]
     :status (user-status user-info)}))

(defn render-about
  [request]
  (let [about-page (:page (:params request))]
    (try
      (render-html (generate-about-contents about-page (:user request)))
      ;; If the file doesn't exist, just return nothing, which should result in a 404 in the browser
      (catch java.io.FileNotFoundException ex))))

(defn render-charts
  [request]
  (let [chart (:page (:params request))
        chart-catentry (->> data/catalogue
                            :charts
                            (filter #(= (:filename %) chart))
                            (first))]
    (if-not (nil? chart-catentry)
      (render-html
       {:title (str (:chart-name chart-catentry) " - Clovertone Music")
        :sorting [:div#sorting]
        :contents [:div#contents
                   (->> data/catalogue
                        :charts
                        (filter #(= (:chart-number chart-catentry) (:chart-number %)))
                        (map chart-to-html)
                        (conj [:div#list]))]
        :charts [:div#charts]
        :status (user-status (:user request))})
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
          :status (user-status (:user request))})))))

(defn render-composers
  [request]
  (let [composer (:page (:params request))
        composer-catentry (->> data/catalogue
                               (:composers)
                               (filter #(= (:filename %) composer))
                               (first))]
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
        :status (user-status (:user request))})
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
          :charts [:div#charts]
          :status (user-status (:user request))})))))

(defn render-genres
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
        :status (user-status (:user request))}))))

(defn render-grades
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
        :status (user-status (:user request))}))))

(defn render-root
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
                      (sort-by #(Integer/parseInt (:featured %)))
                      (sort-charts (:sort (:params request)))
                      (map chart-to-html)
                      (conj [:div#list]))]
        :status (user-status (:user request))}))))

(defn render-user
  [request]
  request)

(defn generate-country-dropdown
  []
  [:select#new_user_country.select.new_user_info
   {:name "country" :onchange "enable_or_disable_other_field(\"new_user_country_other\", this.value);"}
   [:option {:value "Canada" :selected "selected"} "Canada"]
   [:option {:value "USA"} "USA"]
   [:option {:value "Other"} "Other"]])

(defn generate-province-dropdown
  []
  [:select#new_user_province.select.new_user_info
   {:name "province" :onchange "enable_or_disable_other_field(\"new_user_province_other\", this.value);"}
   [:option {:value "Other"} "Other"]
   [:option {:value "Alberta" :selected "selected"} "Alberta"]
   [:option {:value "British Columbia"} "British Columbia"]
   [:option {:value "Manitoba"} "Manitoba"]
   [:option {:value "New Brunswick"} "New Brunswick"]
   [:option {:value "Newfoundland and Labrador"} "Newfoundland and Labrador"]
   [:option {:value "Nova Scotia"} "Nova Scotia"]
   [:option {:value "Northwest Territories"} "Northwest Territories"]
   [:option {:value "Nunavut"} "Nunavut"]
   [:option {:value "Ontario"} "Ontario"]
   [:option {:value "Prince Edward Island"} "Prince Edward Island"]
   [:option {:value "Quebec"} "Quebec"]
   [:option {:value "Saskatchewan"} "Saskatchewan"]
   [:option {:value "Yukon"} "Yukon"]
   [:option {:value "Alabama"} "Alabama"]
   [:option {:value "Alaska"} "Alaska"]
   [:option {:value "Arizona"} "Arizona"]
   [:option {:value "Arkansas"} "Arkansas"]
   [:option {:value "California"} "California"]
   [:option {:value "Colorado"} "Colorado"]
   [:option {:value "Connecticut"} "Connecticut"]
   [:option {:value "Delaware"} "Delaware"]
   [:option {:value "District Of Columbia"} "District Of Columbia"]
   [:option {:value "Florida"} "Florida"]
   [:option {:value "Georgia"} "Georgia"]
   [:option {:value "Hawaii"} "Hawaii"]
   [:option {:value "Idaho"} "Idaho"]
   [:option {:value "Illinois"} "Illinois"]
   [:option {:value "Indiana"} "Indiana"]
   [:option {:value "Iowa"} "Iowa"]
   [:option {:value "Kansas"} "Kansas"]
   [:option {:value "Kentucky"} "Kentucky"]
   [:option {:value "Louisiana"} "Louisiana"]
   [:option {:value "Maine"} "Maine"]
   [:option {:value "Maryland"} "Maryland"]
   [:option {:value "Massachusetts"} "Massachusetts"]
   [:option {:value "Michigan"} "Michigan"]
   [:option {:value "Minnesota"} "Minnesota"]
   [:option {:value "Mississippi"} "Mississippi"]
   [:option {:value "Missouri"} "Missouri"]
   [:option {:value "Montana"} "Montana"]
   [:option {:value "Nebraska"} "Nebraska"]
   [:option {:value "Nevada"} "Nevada"]
   [:option {:value "New Hampshire"} "New Hampshire"]
   [:option {:value "New Jersey"} "New Jersey"]
   [:option {:value "New Mexico"} "New Mexico"]
   [:option {:value "New York"} "New York"]
   [:option {:value "North Carolina"} "North Carolina"]
   [:option {:value "North Dakota"} "North Dakota"]
   [:option {:value "Ohio"} "Ohio"]
   [:option {:value "Oklahoma"} "Oklahoma"]
   [:option {:value "Oregon"} "Oregon"]
   [:option {:value "Pennsylvania"} "Pennsylvania"]
   [:option {:value "Rhode Island"} "Rhode Island"]
   [:option {:value "South Carolina"} "South Carolina"]
   [:option {:value "South Dakota"} "South Dakota"]
   [:option {:value "Tennessee"} "Tennessee"]
   [:option {:value "Texas"} "Texas"]
   [:option {:value "Utah"} "Utah"]
   [:option {:value "Vermont"} "Vermont"]
   [:option {:value "Virginia"} "Virginia"]
   [:option {:value "Washington"} "Washington"]
   [:option {:value "West Virginia"} "West Virginia"]
   [:option {:value "Wisconsin"} "Wisconsin"]
   [:option {:value "Wyoming"} "Wyoming"]])

(defn generate-javascript-functions
  []
  (str
   "var toggle_login_form = function(section) {"
   "  if (section === 0) {"
   "    document.getElementById(\"returning_user_passwd_input\").setAttribute(\"required\", \"\");"
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
   "    document.getElementById(\"new_user_new_passwd\").removeAttribute(\"required\");"
   "    document.getElementById(\"new_user_retyped_passwd\").removeAttribute(\"required\");"
   "  }"
   "  else if (section === 1) {"
   "    document.getElementById(\"returning_user_passwd_input\").removeAttribute(\"required\");"
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
   "    document.getElementById(\"new_user_new_passwd\").setAttribute(\"required\", \"\");"
   "    document.getElementById(\"new_user_retyped_passwd\").setAttribute(\"required\", \"\");"
   "  }"
   "};"
   ""
   "var enable_or_disable_other_field = function(field, selected_option) {"
   "  if (selected_option === \"Other\") {"
   "    document.getElementById(field).removeAttribute(\"disabled\");"
   "    document.getElementById(field).setAttribute(\"required\", \"\");"
   "  }"
   "  else {"
   "    document.getElementById(field).setAttribute(\"disabled\", \"\");"
   "    document.getElementById(field).removeAttribute(\"required\");"
   "  }"
   "};"))

(defn render-login
  [request]
  (render-html {:title "Log In or Sign Up - Clovertone Music"
                :sorting [:div#sorting]
                :contents [:div#login.window
                           [:h2 "Log In or Sign Up"]
                           [:form.login_form {:action "/login/" :method "post"}
                            [:p#login_email
                             [:label "My email address is *"]
                             [:input {:name "email" :type "email" :required true}]]
                            [:p
                             [:input#new_user_radio {:name "user" :type "radio"
                                                     :onclick "toggle_login_form(1)"}]
                             [:label "I am a new user"]
                             [:br]
                             [:table#new_user_form_table
                              [:tr [:th] [:td [:br]]]
                              [:tr
                               [:td "Country *"]
                               [:td (generate-country-dropdown)]]
                              [:tr
                               [:td]
                               [:td [:input#new_user_country_other.new_user_info
                                     {:name "country_other" :type "text" :disabled true
                                      :placeholder "Specify if Other"}]]]
                              [:tr
                               [:td "Province/State *"]
                               [:td (generate-province-dropdown)]]
                              [:tr
                               [:td]
                               [:td [:input#new_user_province_other.new_user_info
                                     {:name "province_other" :type "text" :disabled true
                                      :placeholder "Specify if Other"}]]]
                              [:tr
                               [:td "City *"]
                               [:td [:input#new_user_city.new_user_info {:name "city" :type "text"}]]]
                              [:tr
                               [:td "Name *"]
                               [:td [:input#new_user_name.new_user_info {:name "name" :type "text"}]]]
                              [:tr
                               [:td "School or band name *"]
                               [:td [:input#new_user_band.new_user_info {:name "band_name" :type "text"}]]]
                              [:tr
                               [:td "Phone number"]
                               [:td [:input#new_user_phone.new_user_info {:name "phone" :type "text"}]]]
                              [:tr
                               [:td "Enter a new password *"]
                               [:td [:input#new_user_new_passwd.new_user_info
                                     {:name "new_password" :type "password"}]]]
                              [:tr
                               [:td "Re-type password *"]
                               [:td [:input#new_user_retyped_passwd.new_user_info
                                     {:name "retyped_password" :type "password"}]]]
                              [:tr
                               [:td "Sign up to our newsletter"]
                               [:td [:select#new_user_newsletter.select.new_user_info {:name "newsletter"}
                                     [:option {:value "0"} "No"]
                                     [:option {:value "1" :selected "selected"} "Yes"]]]]
                              [:tr [:td] [:td [:br]]]
                              [:tr
                               [:td [:input {:type "submit" :formaction "/signup/"
                                             :value "Sign up securely"}]]
                               [:td]]
                              (when (:nomatch (:params request))
                                [:p.error "Passwords do not match"])]
                             [:hr]
                             [:p#returning_user_info
                              [:input#returning_user_radio {:name "user" :type "radio" :checked true
                                                            :onclick "toggle_login_form(0)"}]
                              [:label "I am a returning user"]
                              [:label#returning_user_passwd "&nbsp;and my password is&nbsp;"
                               [:input#returning_user_passwd_input
                                {:name "password" :type "password" :required true}]]
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
                              ;; TODO: IMPLEMENT THIS:
                              [:a#returning_user_forgot {:href "/"} "Forgot your password?"]]]]
                           [:script (generate-javascript-functions)]]
                :charts [:div#charts]
                :status (user-status (:user request))}))

(defn post-login
  [{{username "email" password "password"} :form-params
    session :session :as req}]
  (let [user-db (data/get-user-db)
        user (data/get-user-by-username-and-password user-db username password)]
    (cond
      (nil? user) (redirect "/login/?notfound=true")
      (= user false) (redirect "/login/?wrongpw=true")
      :else (->> user
                 ;; If the credentials are ok, associate a session to the request that
                 ;; incorporates an :identity field associated with the user, and redirect
                 ;; to the home page:
                 :userid
                 (assoc session :identity)
                 (assoc (redirect "/") :session)))))

(defn post-signup
  [{{email "email" name "name" band_name "band_name" city "city"
     province "province" province_other "province_other"
     country "country" country_other "country_other"
     new_password "new_password" retyped_password "retyped_password"
     phone "phone" newsletter "newsletter"} :form-params
    session :session :as req}]
  (if-not (= retyped_password new_password)
    (redirect "/login/?signup=true&nomatch=true")
    (let [get-region (fn [region region-other]
                       (if (= region "Other")
                         region-other
                         region))
          activation-id (data/create-user! new_password name band_name city
                                           (get-region province province_other)
                                           (get-region country country_other)
                                           phone email newsletter)]
      (render-html {:title "Activation - Clovertone Music"
                    :sorting [:div#sorting]
                    :contents [:div#contents
                               [:div#login.window
                                [:h2 (str "Activation page for " name)]
                                [:p "An email has just been sent to "
                                 [:a {:href (str "mailto:" email)} email]
                                 " with a link to activate your account. Once activated, you will "
                                 "be able to login. THE LINK IS " [:a {:href (str "/activation/" activation-id)}
                                                                   "THIS."]]]]
                    :charts [:div#charts]
                    :status [:div#status]}))))

(defn process-and-render-activation
  [request]
  (let [activation-id (:activation-id (:params request))]
    (data/activate-user! activation-id)))

(defn get-logout
  [{session :session}]
  (assoc (redirect "/login/")
         :session (dissoc session :identity)))
