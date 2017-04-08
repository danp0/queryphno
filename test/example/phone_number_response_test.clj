(ns example.phone-number-response-test
  (:require [clojure.test :refer :all])
  (:import [example PhoneNumberResponse]))

(deftest PhoneNumberResponseTest
  (testing "PhoneNumberResponse"
    (let [pnr (doto (PhoneNumberResponse.)
                (.setValid true)
                (.setInternational "+1 202-762-1401")
                (.setNational "(202) 762-1401")
                (.setE164 "+12027621401")
                (.setRfc3966 "tel:+1-202-762-1401")
                (.setLocation "Washington D.C."))]
      (is (.getValid pnr))
      (is (= "+1 202-762-1401" (.getInternational pnr)))
      (is (= "(202) 762-1401" (.getNational pnr)))
      (is (= "+12027621401" (.getE164 pnr)))
      (is (= "tel:+1-202-762-1401" (.getRfc3966 pnr)))
      (is (= "Washington D.C." (.getLocation pnr))))))

