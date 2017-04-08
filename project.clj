(defproject queryphno "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [com.amazonaws/aws-lambda-java-core "1.0.0"]
                 [com.googlecode.libphonenumber/libphonenumber "8.0.0"]
                 [com.googlecode.libphonenumber/geocoder "2.59"]
                 [com.googlecode.libphonenumber/carrier "1.49"]]
  :java-source-paths ["src/java"]
  :aot
  :all)
