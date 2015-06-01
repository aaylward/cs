(ns clojure-fun.lists-test
  (:require [clojure.test :refer :all]
            [clojure-fun.lists :refer :all]))

(deftest my-reverse-test
  (testing "reverse a seq"
    (is (= '(1 2 3 4 5) (my-reverse '(5 4 3 2 1))))))
