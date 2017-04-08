# queryphno

An aws lambda function to parse a phone number.

## Building

You will need [lein](https://leiningen.org) to build this project.
You need to create an uberjar:
```
lein uberjar
```
Create a lambda role for your function and place it in the file
*role.txt*. Then run the function to create the lambda:
```
./create_lambda_function.sh
```
If you need to update your function, then run the update function:
```
./update_lambda_function.sh
```
## Usage
To call the lambda function, place a phone number and region in a file called
*input.txt*:

```
{
  "phoneNumber": "2027621401",
  "defaultRegion": "US"
}
```
Then run the invoke script:
```
./invoke_lambda_function.sh

{
    "StatusCode": 200
}
{"valid":true,"international":"+1 202-762-1401","national":"(202) 762-1401","e164":"+12027621401","rfc3966":"tel:+1-202-762-1401","location":"Washington D.C."}
```
### Bugs

...

## License

Copyright © 2017 D. Pollind

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

