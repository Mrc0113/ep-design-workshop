
package org.taxi.nyc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentCharged {

	public PaymentCharged () {
	}
	public PaymentCharged (
		String rideId, 
		String entityType, 
		Double amountCharged, 
		Driver driver, 
		String paymentChargedId, 
		Passenger passenger, 
		String paymentStatus, 
		String invoiceSystemId, 
		String informationSource, 
		String timestamp) {
		this.rideId = rideId;
		this.entityType = entityType;
		this.amountCharged = amountCharged;
		this.driver = driver;
		this.paymentChargedId = paymentChargedId;
		this.passenger = passenger;
		this.paymentStatus = paymentStatus;
		this.invoiceSystemId = invoiceSystemId;
		this.informationSource = informationSource;
		this.timestamp = timestamp;
	}


	@JsonProperty("ride_id")
	private String rideId;
	@JsonProperty("entity_type")
	private String entityType;
	@JsonProperty("amount_charged")
	private Double amountCharged;
	private Driver driver;
	@JsonProperty("payment_charged_id")
	private String paymentChargedId;
	private Passenger passenger;
	@JsonProperty("payment_status")
	private String paymentStatus;
	@JsonProperty("invoice_system_id")
	private String invoiceSystemId;
	@JsonProperty("information_source")
	private String informationSource;
	private String timestamp;

	public String getRideId() {
		return rideId;
	}

	public PaymentCharged setRideId(String rideId) {
		this.rideId = rideId;
		return this;
	}


	public String getEntityType() {
		return entityType;
	}

	public PaymentCharged setEntityType(String entityType) {
		this.entityType = entityType;
		return this;
	}


	public Double getAmountCharged() {
		return amountCharged;
	}

	public PaymentCharged setAmountCharged(Double amountCharged) {
		this.amountCharged = amountCharged;
		return this;
	}


	public Driver getDriver() {
		return driver;
	}

	public PaymentCharged setDriver(Driver driver) {
		this.driver = driver;
		return this;
	}


	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Driver {

		public Driver () {
		}
		public Driver (
			Integer driverId, 
			Integer rating, 
			String lastName, 
			String carClass, 
			String firstName) {
			this.driverId = driverId;
			this.rating = rating;
			this.lastName = lastName;
			this.carClass = carClass;
			this.firstName = firstName;
		}


		@JsonProperty("driver_id")
		private Integer driverId;
		private Integer rating;
		@JsonProperty("last_name")
		private String lastName;
		@JsonProperty("car_class")
		private String carClass;
		@JsonProperty("first_name")
		private String firstName;

		public Integer getDriverId() {
			return driverId;
		}

		public Driver setDriverId(Integer driverId) {
			this.driverId = driverId;
			return this;
		}


		public Integer getRating() {
			return rating;
		}

		public Driver setRating(Integer rating) {
			this.rating = rating;
			return this;
		}


		public String getLastName() {
			return lastName;
		}

		public Driver setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}


		public String getCarClass() {
			return carClass;
		}

		public Driver setCarClass(String carClass) {
			this.carClass = carClass;
			return this;
		}


		public String getFirstName() {
			return firstName;
		}

		public Driver setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}


		public String toString() {
			return "Driver ["
			+ " driverId: " + driverId
			+ " rating: " + rating
			+ " lastName: " + lastName
			+ " carClass: " + carClass
			+ " firstName: " + firstName
			+ " ]";
		}
	}



	public String getPaymentChargedId() {
		return paymentChargedId;
	}

	public PaymentCharged setPaymentChargedId(String paymentChargedId) {
		this.paymentChargedId = paymentChargedId;
		return this;
	}


	public Passenger getPassenger() {
		return passenger;
	}

	public PaymentCharged setPassenger(Passenger passenger) {
		this.passenger = passenger;
		return this;
	}


	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Passenger {

		public Passenger () {
		}
		public Passenger (
			Integer passengerId, 
			Integer rating, 
			String lastName, 
			String firstName) {
			this.passengerId = passengerId;
			this.rating = rating;
			this.lastName = lastName;
			this.firstName = firstName;
		}


		@JsonProperty("passenger_id")
		private Integer passengerId;
		private Integer rating;
		@JsonProperty("last_name")
		private String lastName;
		@JsonProperty("first_name")
		private String firstName;

		public Integer getPassengerId() {
			return passengerId;
		}

		public Passenger setPassengerId(Integer passengerId) {
			this.passengerId = passengerId;
			return this;
		}


		public Integer getRating() {
			return rating;
		}

		public Passenger setRating(Integer rating) {
			this.rating = rating;
			return this;
		}


		public String getLastName() {
			return lastName;
		}

		public Passenger setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}


		public String getFirstName() {
			return firstName;
		}

		public Passenger setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}


		public String toString() {
			return "Passenger ["
			+ " passengerId: " + passengerId
			+ " rating: " + rating
			+ " lastName: " + lastName
			+ " firstName: " + firstName
			+ " ]";
		}
	}



	public String getPaymentStatus() {
		return paymentStatus;
	}

	public PaymentCharged setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}


	public String getInvoiceSystemId() {
		return invoiceSystemId;
	}

	public PaymentCharged setInvoiceSystemId(String invoiceSystemId) {
		this.invoiceSystemId = invoiceSystemId;
		return this;
	}


	public String getInformationSource() {
		return informationSource;
	}

	public PaymentCharged setInformationSource(String informationSource) {
		this.informationSource = informationSource;
		return this;
	}


	public String getTimestamp() {
		return timestamp;
	}

	public PaymentCharged setTimestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}


	public String toString() {
		return "PaymentCharged ["
		+ " rideId: " + rideId
		+ " entityType: " + entityType
		+ " amountCharged: " + amountCharged
		+ " driver: " + driver
		+ " paymentChargedId: " + paymentChargedId
		+ " passenger: " + passenger
		+ " paymentStatus: " + paymentStatus
		+ " invoiceSystemId: " + invoiceSystemId
		+ " informationSource: " + informationSource
		+ " timestamp: " + timestamp
		+ " ]";
	}
}

