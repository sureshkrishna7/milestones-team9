(defn retOdd [x]
   (cond
      (empty? x) []
      (empty? (rest x)) x
      :else (cons (first x) (retOdd (rest (rest x))))
   )
)

