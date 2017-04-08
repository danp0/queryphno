(ns example.phno
  (:require [clojure.string :as string])
  (:import [com.google.i18n.phonenumbers PhoneNumberUtil
            PhoneNumberUtil$PhoneNumberFormat])
  (:gen-class))

(def phone-util-instance (PhoneNumberUtil/getInstance))

(defn format-e164
  "format number in E164 format"
  [phone-number]
  (.format
    phone-util-instance
    phone-number
    PhoneNumberUtil$PhoneNumberFormat/E164))

(defn format-international
  "format number in international format"
  [phone-number]
  (.format 
    phone-util-instance 
    phone-number 
    PhoneNumberUtil$PhoneNumberFormat/INTERNATIONAL))

(defn format-national
  "format number in national format"
  [phone-number]
  (.format
    phone-util-instance
    phone-number
    PhoneNumberUtil$PhoneNumberFormat/NATIONAL))

(defn format-rfc3966
  "format number in rfc3966 format"
  [phone-number]
  (.format
    phone-util-instance
    phone-number
    PhoneNumberUtil$PhoneNumberFormat/RFC3966))

(defn number-type
  "get the phone number type"
  [phone-number]
  (keyword
    (string/lower-case
      (str
        (.getNumberType phone-util-instance phone-number)))))

(defn parse
  "parse a phone number"
  [phone-number-string default-region]
  (let [parsed (.parse phone-util-instance phone-number-string default-region)]
    parsed))

(defn possible-number?
  "is the number a possible number"
  [phone-number]
  (.isPossibleNumber phone-util-instance phone-number))

(defn possible-number-with-reason
  "is the number a possible number with reason"
  [phone-number]
  (keyword
    (string/lower-case
      (str
        (.isPossibleNumberWithReason phone-util-instance phone-number)))))

(defn valid?
  "is a phone number valid"
  [phone-number]
  (.isValidNumber phone-util-instance phone-number))

