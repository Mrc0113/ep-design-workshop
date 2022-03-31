# ProcessPayment

## Version 0.0.1

Description of Business Capability
Overview:
The ProcessPayment application solely exists in order to monitor for when Passenger Rides are completed such that final billing can be performed against the passengers credit card. Because this application will need to look up the passenger's billing information it is important that security be taken into account as it will need to be PCI compliant. 
Upon successful payment, the application shall emit an event to signify that payment has happened.
Technical Requirements
Java Version:  OpenJDK 11.0.4
Spring Cloud Version:  Hoxton.SR8
Number of Instances: 1
Cloud: AWS us-east
Security Level: PCI
Event Broker Profile: Solace
Source Code Repository
github repo
Terms of Use
N/A


