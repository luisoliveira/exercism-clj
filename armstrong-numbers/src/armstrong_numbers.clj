(ns armstrong-numbers)


(defn intdigest [in]
    (let [sequence (for [n (str in)](- (byte n) 48))
          digits (count sequence)]
      [sequence, digits]))



(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here
  (let [digested (intdigest num)]))

(println (armstrong-numbers/armstrong? 124151234))

