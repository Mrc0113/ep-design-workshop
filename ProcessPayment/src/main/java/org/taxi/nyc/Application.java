package org.taxi.nyc;

import java.time.Instant;
import java.util.UUID;
import java.util.function.Function;

import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.binder.BinderHeaders;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Function<RideUpdated1, Message<PaymentCharged>> processPayment() {
		  return rideUpdated -> {
			    logger.info("Received Ride Updated Event:" + rideUpdated);

			    // Process Payment
			    PaymentCharged pc = new PaymentCharged();
			    pc.setRideId(rideUpdated.getRideId());
			    pc.setAmountCharged(rideUpdated.getMeterReading());
			    pc.setPaymentStatus("accepted");
			    pc.setPaymentChargedId(UUID.randomUUID().toString());
			    pc.setInvoiceSystemId("PSG-" + RandomUtils.nextInt());
			    pc.setInformationSource("ProcessPayment Microservice");
			    pc.setTimestamp(Instant.now().toString());
			    pc.setEntityType("Driver");
			    
			    org.taxi.nyc.RideUpdated1.Driver driver = rideUpdated.getDriver();
			    pc.setDriver(new org.taxi.nyc.PaymentCharged.Driver(
			            driver.getDriverId(), driver.getRating(), driver.getLastName(), 
			            driver.getCarClass(), driver.getFirstName()));
			    
			    org.taxi.nyc.RideUpdated1.Passenger passenger = rideUpdated.getPassenger();
			    pc.setPassenger(new org.taxi.nyc.PaymentCharged.Passenger(
			              passenger.getPassengerId(), passenger.getRating(),
			              passenger.getLastName(), passenger.getFirstName()
			            ));

			    logger.info("Created PaymentCharged Event:" + pc);
			    
			    String topic = "test/taxinyc/YOUR_UNIQUE_NAME/backoffice/payment/charged/v1/accepted";
			    Message<PaymentCharged> message = MessageBuilder
			        .withPayload(pc)
			        .setHeader(BinderHeaders.TARGET_DESTINATION, topic)
			        .build();

			    return message;
			    
			  };
	}

}
