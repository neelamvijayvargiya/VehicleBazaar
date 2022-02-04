package io.sevenx.vehiclebazaar.data;

public class Bike extends Vehicle{
	private double power;
	private int numberOfGears;
	private String tyreType;
	boolean discBreak;
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	public String getTyreType() {
		return tyreType;
	}
	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}
	public boolean isDiscBreak() {
		return discBreak;
	}
	public void setDiscBreak(boolean discBreak) {
		this.discBreak = discBreak;
		
	}
}
	
	
