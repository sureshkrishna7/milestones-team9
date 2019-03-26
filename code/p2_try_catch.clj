(try
  (/ 2 0)
  (catch ArithmeticException e
    (.getMessage e))
  (finally
    (println "this will always print")))


