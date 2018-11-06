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
                      [:div#2.chart.grade1 chart-divs/o-canada]
                      [:div#104.chart.grade3 chart-divs/la-maquina]
                      [:div#101.chart.grade3 chart-divs/midnight-clear]
                      [:div#107.chart.grade2 chart-divs/roscos-big-hit]
                      [:div#106.chart.grade3 chart-divs/mad-man-mambo]
                      [:div#109.chart.grade4 chart-divs/ambleside]
                      [:div#102.chart.grade3 chart-divs/life-race]
                      [:div#103.chart.grade3 chart-divs/junk]
                      [:div#108.chart.grade2 chart-divs/the-long-way-home]]]
            :users [:div#users]}})
