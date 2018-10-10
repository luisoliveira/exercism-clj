(ns armstrong-numbers)

(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here
  (def seqy (for [n (str num)](- (byte n) 48)))
  (def digy (count seqy))
  (def sumy (reduce + (map #(int (Math/pow % digy)) seqy)))
  (= num sumy))
