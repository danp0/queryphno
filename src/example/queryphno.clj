(ns example.queryphno
  (:import [example PhoneNumberResponse PhoneNumberRequest])
  (:require [example.phno :as phno]
            [example.geocoder :as geocoder])
  (:gen-class
    :methods [^:static [handler [example.PhoneNumberRequest] example.PhoneNumberResponse]]))

(defn -handler [request]
  (let [phone-number (phno/parse (.getPhoneNumber request) (.getDefaultRegion request))]
    (if (phno/valid? phone-number)
      (doto
        (PhoneNumberResponse.)
        (.setValid true)
        (.setInternational (phno/format-international phone-number))
        (.setNational (phno/format-national phone-number))
        (.setE164 (phno/format-e164 phone-number))
        (.setRfc3966 (phno/format-rfc3966 phone-number))
        (.setLocation (geocoder/get-description phone-number)))
      (doto
        (PhoneNumberResponse.)
        (.setValid false)))))


