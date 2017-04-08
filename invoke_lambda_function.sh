#!/usr/bin/env bash

aws lambda invoke \
  --invocation-type RequestResponse \
  --function-name QueryPhoneNumber \
  --region us-west-2 \
  --payload file://./input.txt \
  output.txt

cat output.txt
