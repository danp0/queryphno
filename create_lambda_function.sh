#!/usr/bin/env bash

if [ -f role.txt ]
then
  aws lambda create-function \
    --region us-west-2 \
    --function-name QueryPhoneNumber \
    --description "Submit phone numbers for parsing" \
    --zip-file fileb://./target/queryphno-0.1.0-SNAPSHOT-standalone.jar \
    --role $(cat role.txt) \
    --handler example.queryphno::handler \
    --runtime java8 \
    --memory 512 \
    --timeout 10
else
  echo "enter the lambda role in role.txt"
fi

