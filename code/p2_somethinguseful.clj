(defn hasEven [x]
   (cond
      (empty? x) false
      (== (mod (first x) 2) 0) true
      :else (hasEven (rest x))))
