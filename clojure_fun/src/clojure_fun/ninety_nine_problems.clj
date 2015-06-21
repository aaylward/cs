(ns clojure-fun.ninety-nine-problems)

;(*) Find the last element of a list.
(defn my-last [input]
  (first (reverse input)))

;(*) Find the last but one element of a list.
(defn my-but-last [input]
  (first (rest (reverse input))))

;(*) Find the K'th element of a list.
(defn my-kth [input n]
  "indexed from 0"
  (loop [in input k n]
    (if (= k 0)
      (first in)
      (recur (rest in) (dec k)))))

;(*) Find the number of elements of a list.
(defn my-length [input]
  (loop [in input size 0]
    (if (empty? in)
      size
      (recur (rest in) (inc size)))))

;(*) Reverse a list.
(defn my-reverse [input]
  (loop [in input out '()]
    (if (empty? in)
      out
      (recur (rest in) (cons (first in) out)))))

;(*) Find out whether a list is a palindrome.
(defn my-palindrome [input]
  (= input (my-reverse input)))

