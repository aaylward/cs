(ns clojure-fun.ninety-nine-problems)

(defn my-last [input]
  (first (reverse input)))

(defn my-but-last [input]
  (first (rest (reverse input))))

(defn my-nth [input n]
  "indexed from 0"
  (loop [in input k n]
    (if (= k 0)
      (first in)
      (recur (rest in) (dec k)))))

(defn my-length [input]
  (loop [in input size 0]
    (if (empty? in)
      size
      (recur (rest in) (inc size)))))

(defn my-reverse [input]
  (loop [in input out '()]
    (if (empty? in)
      out
      (recur (rest in) (cons (first in) out)))))

(defn my-palindrome [input]
  (= input (my-reverse input)))

