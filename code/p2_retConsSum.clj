(defn consSumHelp [a x]
   (cond
      (empty? x) []
      :else (cons (+ a (first x)) (consSumHelp (+ a (first x)) (rest x)))
   )
)


(defn consSum [x]
    (consSumHelp 0 x))

