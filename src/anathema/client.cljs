(ns anathema.client
    (:require [rum.core :as rum]))

(enable-console-print!)

(def *state (atom {}))

(println "do me! do me! Do me again!")

(rum/defc dudebro
    []
  [:div "thing"])

(js/console.log "FIXME")

(rum/mount (dudebro) (.querySelector js/document "#app"))
