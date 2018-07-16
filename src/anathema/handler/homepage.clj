(ns anathema.handler.homepage
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response] 
            [clojure.java.io :as io]
            [integrant.core :as ig]))


(defmethod ig/init-key :anathema.handler/homepage [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (io/resource "anathema/handler/home/page.html")]))
