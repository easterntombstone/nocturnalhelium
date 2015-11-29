(ns digitalbird.easterntombstone.nocturnalhelium.core)
(defn mock-is [failure exception] (fn [predicate] (if (.equals failure predicate) (throw exception) true)))