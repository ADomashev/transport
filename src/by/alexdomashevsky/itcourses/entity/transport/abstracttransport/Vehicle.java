package by.alexdomashevsky.itcourses.entity.transport.abstracttransport;


import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public abstract class Vehicle {
	
	private String name;
	private int speed;
	private TypeOfMovement typeOfMovement;
	private double priceForTrip;
	private double weightLimit;
//	TODO
//	private int numberOfPasenger;
	
	public Vehicle() {
	}

	public Vehicle(String name, int speed, TypeOfMovement typeOfMovement, double priceForTrip,double weightLimit) {
		this.name = name;
		this.speed = speed;
		this.typeOfMovement = typeOfMovement;
		this.priceForTrip = priceForTrip;
		this.weightLimit = weightLimit;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public TypeOfMovement getTypeOfMovement() {
		return typeOfMovement;
	}
	
	public void setTypeOfMovement(TypeOfMovement typeOfMovement) {
		this.typeOfMovement = typeOfMovement;
	}
	
	public double getPriceForTrip() {
		return priceForTrip;
	}
	
	public void setPriceForTrip(double priceForTrip) {
		this.priceForTrip = priceForTrip;
	}
	
	
	public double getWeightLimit() {
		return weightLimit;
	}

	public void setWeightLimit(double weightLimit) {
		this.weightLimit = weightLimit;
	}

	public double travelTime(int distance) {
		return distance/getSpeed();
	}
	
	@Override
	public String toString() {
		return "name=" + getName() + ", speed=" + getSpeed()  + ", typeOfMovement=" + getTypeOfMovement()
				+ ", priceForTrip=" + getPriceForTrip() + ", weightLimit" + getWeightLimit();
	}
	
	
	
	

}
