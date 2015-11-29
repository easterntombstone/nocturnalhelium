(ns digitalbird.easterntombstone.nocturnalhelium.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.easterntombstone.nocturnalhelium.core :refer :all]))
(deftest is-passing-test (testing "the happy path") (is ((mock-is "nothing") "something")))
(deftest is-passing-failing (testing "the sad path") (is (= ((mock-is "something") "something") false)))
