(ns example.geocoder
  (:import [com.google.i18n.phonenumbers PhoneNumberToTimeZonesMapper]
           [com.google.i18n.phonenumbers.geocoding PhoneNumberOfflineGeocoder]
           [java.util Locale])
  (:gen-class))

(def offline-geocoder (PhoneNumberOfflineGeocoder/getInstance))
(def timezone-mapper (PhoneNumberToTimeZonesMapper/getInstance))

(defn get-description
  "get the description for a number"
  [phone-number]
  (.getDescriptionForNumber offline-geocoder phone-number Locale/ENGLISH))

(defn get-description-for-valid-number
  "get the description for a valid number"
  [phone-number]
  (.getDescriptionForValidNumber offline-geocoder phone-number Locale/ENGLISH))

(defn get-timezones
  "get the timezones for a number"
  [phone-number]
  (.getTimeZonesForGeographicalNumber timezone-mapper phone-number))


