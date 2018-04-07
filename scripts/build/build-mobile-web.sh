#!/bin/sh

SCRIPT_DIR=$(cd $(dirname $0); pwd)

rm -rf ${SCRIPT_DIR}/../../lightpay-backend/src/main/resources/static/

CURRENT_DIR=$(pwd)
cd ${SCRIPT_DIR}/../../lightpay-mobile-web/
npm run build
if [ $? -ne 0 ]; then
  cd ${CURRENT_DIR}
  exit 9;
fi
cd ${CURRENT_DIR}

cp -r ${SCRIPT_DIR}/../../lightpay-mobile-web/dist/ ${SCRIPT_DIR}/../../lightpay-backend/src/main/resources/static/
