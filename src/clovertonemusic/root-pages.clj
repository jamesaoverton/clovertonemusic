(ns clovertonemusic.root-pages)

;; This file contains the HTML code used for pages in the root directory

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs])

(def html-root
  {"index" {:title "Home - Clovertone Music."
            :contents [:div#contents
                       [:div#content.index
                        [:h1.title "Home"]
                        [:p
                         "Welcome to Clovertone Music, we are a sheet music publisher specializing in the educational jazz band market. Our library is completely Canadian and features some of our countries top composers. Fill out your repertoire with Canadian content and feel good about supporting Canadian musicians!"]]]
            :charts [:div#charts
                     [:div#list
                      [:div#2.chart.grade1 (:head chart-divs/o-canada) (:body chart-divs/o-canada) (:details chart-divs/o-canada)]
                      [:div#104.chart.grade3 (:head chart-divs/la-maquina) (:body chart-divs/la-maquina) (:details chart-divs/la-maquina)]
                      [:div#101.chart.grade3 (:head chart-divs/midnight-clear) (:body chart-divs/midnight-clear) (:details chart-divs/midnight-clear)]
                      [:div#107.chart.grade2 (:head chart-divs/roscos-big-hit) (:body chart-divs/roscos-big-hit) (:details chart-divs/roscos-big-hit)]
                      [:div#106.chart.grade3 (:head chart-divs/mad-man-mambo) (:body chart-divs/mad-man-mambo) (:details chart-divs/mad-man-mambo)]
                      [:div#109.chart.grade4 (:head chart-divs/ambleside) (:body chart-divs/ambleside) (:details chart-divs/ambleside)]
                      [:div#102.chart.grade3 (:head chart-divs/life-race) (:body chart-divs/life-race) (:details chart-divs/life-race)]
                      [:div#103.chart.grade3 (:head chart-divs/junk) (:body chart-divs/junk) (:details chart-divs/junk)]
                      [:div#108.chart.grade2 (:head chart-divs/the-long-way-home) (:body chart-divs/the-long-way-home) (:details chart-divs/the-long-way-home)]]]
            :users [:div#users]}})
