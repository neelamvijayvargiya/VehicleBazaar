package io.sevenx.vehiclebazaar.data;

public class Car extends Vehicle {
	
		private double breakhorsePower;
		private String transmissionType;
		boolean powerSteering;
		private int numberOfSeats;
		
		public double getBreakhorsePower() {
			return breakhorsePower;
		}
		public void setBreakhorsePower(double breakhorsePower) {
			this.breakhorsePower = breakhorsePower;
		}
		public String getTransmissionType() {
			return transmissionType;
		}
		public void setTransmissionType(String transmissionType) {
			this.transmissionType = transmissionType;
		}
		public boolean isPowerSteering() {
			return powerSteering;
		}
		public void setPowerSteering(boolean powerSteering) {
			this.powerSteering = powerSteering;
		}
		public int getNumberOfSeats() {
			return numberOfSeats;
		}
		public void setNumberOfSeats(int numberOfSeats) {
			this.numberOfSeats = numberOfSeats;
		}
		
		
}
