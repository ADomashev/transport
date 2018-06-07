package by.alexdomashevsky.itcourses.entity.transport.abstracttransport;

import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public abstract class GroundTransport extends Vehicle {
	
	private int wheel;

	public GroundTransport() {
		
	}

	public GroundTransport(String name, int speed, TypeOfMovement typeOfMovement, 
						  double priceForTrip, double weightLimit,int wheel) {
		
		super(name, speed, typeOfMovement, priceForTrip, weightLimit);
		this.wheel = wheel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return " GroundTransport"+super.toString()+", wheel=" + getWheel();
	} 
	
}
