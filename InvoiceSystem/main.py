#!/usr/bin/env python3
import configparser
import logging
import time
import json

import messaging

from paymentCharged import PaymentCharged



# Config has the connection properties.
def getConfig():
    configParser = configparser.ConfigParser()
    configParser.read('config.ini')
    config = configParser['DEFAULT']
    return config


def taxinycBackofficePaymentChargedV1PaymentStatusDriverIdPassengerId(client, userdata, msg):
    jsonString = msg.payload.decode('utf-8')
    logging.info('Received json: ' + jsonString)
#    paymentCharged = PaymentCharged.from_json(jsonString)
#    logging.info('Received message: ' + str(paymentCharged))
    data = json.loads(jsonString)
    logging.info(data)


def main():
    logging.basicConfig(level=logging.INFO)
    logging.info('Start of main.')
    config = getConfig()

    taxinycBackofficePaymentChargedV1PaymentStatusDriverIdPassengerIdMessenger = messaging.Messaging(config, 'test/taxinyc/yourname/backoffice/payment/charged/v1/#', taxinycBackofficePaymentChargedV1PaymentStatusDriverIdPassengerId)
    taxinycBackofficePaymentChargedV1PaymentStatusDriverIdPassengerIdMessenger.loop_forever()

if __name__ == '__main__':
    main()

