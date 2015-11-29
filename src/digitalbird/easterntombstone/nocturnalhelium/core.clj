(ns digitalbird.easterntombstone.nocturnalhelium.core)
(defn mock-is [failure] (fn [predicate] (if (.equals failure predicate) false true)))