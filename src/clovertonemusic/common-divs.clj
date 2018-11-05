(ns clovertonemusic.common-divs)

(defn contents
  [title desc]
  [:div#contents [:div#content.index [:h1.title title] [:p desc]]])
