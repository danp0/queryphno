(ns example.carrier
  (:import [com.google.i18n.phonenumbers PhoneNumberToCarrierMapper]
           [java.util Locale])
  (:gen-class))

(def carrier-mapper (PhoneNumberToCarrierMapper/getInstance))

(defn get-name
  "get the carrier name for a number"
  [phone-number]
  (.getNameForNumber carrier-mapper phone-number Locale/ENGLISH))

