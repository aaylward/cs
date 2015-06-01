(ns clojure-fun.lists)

(defn my-reverse [input]
  (loop [in input out '()]
    (if (empty? in)
      out
      (recur (rest in) (cons (first in) out)))))
