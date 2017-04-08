(ns example.phno-test
  (:require [clojure.test :refer :all]
            [example.phno :refer :all]))

(deftest parse-test
  (testing "parse"
    (let [phone-number (parse "202-762-1401" "US")]
      (is (valid? phone-number))
      (is (possible-number? phone-number))
      (is (= :is_possible (possible-number-with-reason phone-number)))
      (is (= :fixed_line_or_mobile (number-type phone-number)))
      (is (= 1 (.getCountryCode phone-number)))
      (is (= "+1 202-762-1401" (format-international phone-number)))
      (is (= "(202) 762-1401" (format-national phone-number)))
      (is (= "+12027621401" (format-e164 phone-number)))
      (is (= "tel:+1-202-762-1401" (format-rfc3966 phone-number)))
      )))

(deftest valid-test
  (testing "valid?"
    (is (valid? (parse "9495833161" "US")))
    (is (not (valid? (parse "5833161" "US"))))
    (is (not (valid? (parse "495833161" "US"))))
    (is (not (valid? (parse "833161" "US"))))))
