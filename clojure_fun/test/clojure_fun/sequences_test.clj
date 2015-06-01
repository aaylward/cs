(ns clojure-fun.sequences-test
  (:require [clojure.test :refer :all]
            [clojure-fun.sequences :refer :all]))

(deftest my-reverse-test
  (testing "reverse a seq"
    (is (= '(1 2 3 4 5) (my-reverse '(5 4 3 2 1))))))
