(ns digitalbird.easterntombstone.nocturnalhelium.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.easterntombstone.nocturnalhelium.core :refer :all]))
(deftest mock-is-test-passing (testing "passes") ((mock-is nil) true))
(deftest mock-is-test-failing (testing "fails") (is (thrown? RuntimeException ((mock-is (new RuntimeException)) false))))