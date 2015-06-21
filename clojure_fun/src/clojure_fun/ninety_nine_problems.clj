(ns clojure-fun.ninety-nine-problems)
;https://wiki.haskell.org/99_questions

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

;(**) Flatten a nested list structure.
(defn add-to-accum [item acc]
  (println item (not (list? item)) acc)
  (if (not (list? item))
    (cons item acc)
    (loop [in item out acc]
      (if (empty? in)
        out
        (recur (rest in) (cons (first in) out))) )))

(defn my-flatten [input]
  (println "got " input)
  (println)
  (letfn [(my-flatten-reverse [input acc]
    (if (empty? input)
      acc
      (recur (rest input) (add-to-accum (first input) acc))))]
    (my-reverse (my-flatten-reverse input '()) )))

