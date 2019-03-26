(defn hasEven [x]
     (if (empty? x) false) 
     (if (== (mod (first x) 2) 0) true (hasEven (rest x))))

