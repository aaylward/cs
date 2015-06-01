(ns clojure-fun.sequences-test
  (:require [clojure.test :refer :all]
            [clojure-fun.sequences :refer :all]))

(deftest my-reverse-test-list
  (testing "reverse a list"
    (is (= '(1 2 3 4 5) (my-reverse '(5 4 3 2 1))))))

(deftest my-reverse-test-empty
  (testing "reverse a list"
    (is (= '() (my-reverse '())))))

(deftest my-reverse-test-sequence
  (testing "reverse a list"
    (is (= [1 2 3 4 5] (my-reverse [5 4 3 2 1])))))


(deftest my-map-test-empty
  (testing "map an empty collection"
    (is (= '() (my-map identity '())))))

(deftest my-map-test-double
  (testing "double ints"
    (is (= '(2 4 6) (my-map (fn [x] (* 2 x)) '(1 2 3))))))

(deftest my-map-test-double-take
  (testing "double ints"
    (is (= '(0 2 4) (take 3(my-map (fn [x] (* 2 x)) (range)))))))
