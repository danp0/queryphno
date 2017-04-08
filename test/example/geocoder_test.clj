(ns example.geocoder-test
  (:require [clojure.test :refer :all]
            [clojure.string :as string]
            [example.geocoder :refer :all]
            [example.phno :as phno]))

(deftest get-description-test
  (testing "get-description"
    (let [phone-number (phno/parse "202-762-1401" "US")]
      (is (= "Washington D.C." (get-description phone-number)))
      (is (= "Washington D.C." (get-description-for-valid-number phone-number)))
      (is (= "America/New_York" (string/join ", " (get-timezones phone-number))))
      )))
