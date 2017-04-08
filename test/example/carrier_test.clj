(ns example.carrier-test
  (:require [clojure.test :refer :all]
            [example.carrier :refer :all]
            [example.phno :as phno]))

(deftest get-name-test
  (testing "get-name"
    (let [phone-number (phno/parse "798765432" "CH")]
      (is (=  "Swisscom" (get-name phone-number)))
      )))
