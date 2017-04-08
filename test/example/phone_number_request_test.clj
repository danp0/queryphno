(ns example.phone-number-request-test
  (:require [clojure.test :refer :all])
  (:import [example PhoneNumberRequest]))

(deftest PhoneNumberRequestTest
  (testing "PhoneNumberRequest"
    (let [pnr (doto (PhoneNumberRequest.)
                (.setPhoneNumber "2027621401")
                (.setDefaultRegion "US"))]
      (is (= "2027621401" (.getPhoneNumber pnr)))
      (is (= "US" (.getDefaultRegion pnr)))
      )))
