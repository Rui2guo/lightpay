#!/bin/sh

SSL_DIR=$(cd $(dirname $0); pwd)

openssl genrsa -out ${SSL_DIR}/server.key 4096
if [ $? -ne 0 ]; then
  exit 9;
fi

openssl req -new -out ${SSL_DIR}/server.csr -key ${SSL_DIR}/server.key -subj "/CN=LightPay Develop Server"
if [ $? -ne 0 ]; then
  exit 9;
fi

echo subjectAltName=DNS.1:localhost,IP.1:$1 > ${SSL_DIR}/san.ext
if [ $? -ne 0 ]; then
  exit 9;
fi

openssl \
x509 \
-req \
-sha256 \
-in ${SSL_DIR}/server.csr \
-out ${SSL_DIR}/server.crt \
-CAkey ${SSL_DIR}/CA.key \
-CA ${SSL_DIR}/CA.crt \
-days 36500 \
-CAcreateserial \
-extfile ${SSL_DIR}/san.ext
if [ $? -ne 0 ]; then
  exit 9;
fi

openssl pkcs12 -export -name tomcat -passout pass:password -out ${SSL_DIR}/keystore-local.p12 -in ${SSL_DIR}/server.crt -inkey ${SSL_DIR}/server.key
if [ $? -ne 0 ]; then
  exit 9;
fi

cp ${SSL_DIR}/server.crt ${SSL_DIR}/../../lightpay-mobile-web/ssl/
cp ${SSL_DIR}/server.key ${SSL_DIR}/../../lightpay-mobile-web/ssl/
cp ${SSL_DIR}/keystore-local.p12 ${SSL_DIR}/../../lightpay-backend/src/main/resources/

echo "\nDevelopSSL created!!"
