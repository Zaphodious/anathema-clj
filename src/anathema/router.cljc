(ns anathema.router
  (:require [bidi.core :as bidi]
            [clojure.java.io :as io]
            [integrant.core :as ig]))




(defmethod ig/init-key :anathema.router/site [_ options]
  (fn [n]
    [::response/ok (io/resource "anathema/handler/home/page.html")]))

