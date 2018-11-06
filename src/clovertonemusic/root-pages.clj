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
                      chart-divs/o-canada
                      chart-divs/la-maquina
                      chart-divs/midnight-clear
                      chart-divs/roscos-big-hit
                      chart-divs/mad-man-mambo
                      chart-divs/ambleside
                      chart-divs/life-race
                      chart-divs/junk
                      chart-divs/the-long-way-home]]
            :users [:div#users]}})
