(ns ubik.commons.core
 (:require [taoensso.encore :refer [debugf]]
           [taoensso.sente :as sente]))

(def anim-ids
  (let [face-anim-ids (into (sorted-map) (map (fn [type] [type (range 20)]) [:top :center :bottom]))
        bg-anim-ids (range 3)]
    (assoc face-anim-ids :bg bg-anim-ids)))

(def face-anim-types (into #{} (keys (dissoc anim-ids :bg))))
