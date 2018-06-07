package by.alexdomashevsky.itcourses.entity.transport.abstracttransport;

import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public abstract class WaterTransport extends Vehicle{
	
	private int displacement;
	

	public WaterTransport() {
		
	}

	public WaterTransport(String name, int speed, TypeOfMovement typeOfMovement, double priceForTrip,int displacement,double weightLimit) {
		super(name, speed, typeOfMovement, priceForTrip, weightLimit);
		this.displacement = displacement;
	}


	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	@Override
	public String toString() {
		return "WaterTransport "+super.toString()+", displacement=" + getDisplacement();
	}
	
	
}
