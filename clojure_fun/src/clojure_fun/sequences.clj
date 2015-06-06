(ns clojure-fun.sequences)

(defn my-nth [input n]
  "eats it on negative `n`"
  (loop [in input counter n]
    (if (empty? in)
      nil
    (if (= counter 0)
      (first in)
      (recur (rest in) (dec counter))))))

(defn my-reverse [input]
  (loop [in input out '()]
    (if (empty? in)
      out
      (recur (rest in) (cons (first in) out)))))

(defn my-map [func col]
  (if (empty? col)
    '()
    (lazy-seq (cons (func (first col)) (my-map func (rest col))))))
