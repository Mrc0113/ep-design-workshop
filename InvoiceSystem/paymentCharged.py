from enum import Enum
from typing import Sequence
from entity import Entity



class PaymentCharged(Entity):

    class Driver(Entity):

        def __init__(
                self,
                driverId: int,
                rating: int,
                lastName: str,
                carClass: str,
                firstName: str):
            self.driverId = driverId
            self.rating = rating
            self.lastName = lastName
            self.carClass = carClass
            self.firstName = firstName



    class Passenger(Entity):

        def __init__(
                self,
                passengerId: int,
                rating: int,
                lastName: str,
                firstName: str):
            self.passengerId = passengerId
            self.rating = rating
            self.lastName = lastName
            self.firstName = firstName



    def __init__(
            self,
            entityType: str,
            rideId: str,
            amountCharged: float,
            driver: Driver,
            paymentChargedId: str,
            passenger: Passenger,
            paymentStatus: str,
            invoiceSystemId: str,
            informationSource: str,
            timestamp: str):
        self.entityType = entityType
        self.rideId = rideId
        self.amountCharged = amountCharged
        self.driver = driver
        self.paymentChargedId = paymentChargedId
        self.passenger = passenger
        self.paymentStatus = paymentStatus
        self.invoiceSystemId = invoiceSystemId
        self.informationSource = informationSource
        self.timestamp = timestamp



