(ns digitalbird.easterntombstone.nocturnalhelium.core)
(defn mock-is [exception] (fn [predicate] (if predicate true (throw exception) true)))