(ns example.queryphno-test
  (:require [clojure.test :refer :all]
            [example.queryphno :refer :all])
  (:import [example queryphno PhoneNumberRequest]))

(deftest a-test
  (testing "1 == 1"
    (is (= 1 1))))

(deftest handler-test
  (testing "handler"
    (let [pnreq (doto (PhoneNumberRequest.)
                (.setPhoneNumber "2027621401")
                (.setDefaultRegion "US"))
          pnrsp (queryphno/handler pnreq)]
      (is (.getValid pnrsp))
      (is (= "+1 202-762-1401" (.getInternational pnrsp)))
      (is (= "(202) 762-1401" (.getNational pnrsp)))
      (is (= "+12027621401" (.getE164 pnrsp)))
      (is (= "tel:+1-202-762-1401" (.getRfc3966 pnrsp)))
      (is (= "Washington D.C." (.getLocation pnrsp)))
      )))


