#!/usr/bin/env bash

aws lambda update-function-code \
  --function-name QueryPhoneNumber \
  --zip-file fileb://./target/queryphno-0.1.0-SNAPSHOT-standalone.jar

