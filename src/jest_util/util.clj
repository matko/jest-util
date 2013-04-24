(ns jest-util.util)

(defmacro unless [condition & body]
  `(when (not ~condition)
     ~@body))
