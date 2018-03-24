#!/bin/sh

SSL_DIR=$(cd $(dirname $0); pwd)

openssl genrsa -out ${SSL_DIR}/CA.key 4096
openssl req -x509 -sha256 -new -key ${SSL_DIR}/CA.key -out ${SSL_DIR}/CA.crt -days 36500 -subj /CN="LightPay Develop CA"
