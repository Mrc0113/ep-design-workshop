
package org.taxi.nyc;


import java.time.Instant;
import java.util.UUID;
import java.util.function.Function;

import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Function<RideUpdated, PaymentCharged> processPayment() {
		return rideUpdated -> {
			logger.info("Received Ride Updated Event:" + rideUpdated);
			//TODO Process Payment
			PaymentCharged pc = new PaymentCharged();
			pc.setRideId(rideUpdated.getRideId());
			pc.setAmountCharged(rideUpdated.getMeterReading());
			pc.setPaymentStatus("accepted");
			pc.setPaymentChargedId(UUID.randomUUID().toString());
			pc.setInvoiceSystemId("PSG-" + RandomUtils.nextInt());
			pc.setInformationSource("ProcessPayment Microservice");
			pc.setTimestamp(Instant.now().toString());
			pc.setEntityType("Driver");
			logger.info("Created PaymentCharged Event:" + pc);
			return pc;
		};
	}

}
