package by.alexdomashevsky.itcourses.entity.transport.watertransport;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.WaterTransport;
import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public class Boat extends WaterTransport {
	
	private int numberOfPaddle;
	
	private Boat() {
		
	}

	public Boat(String name, int speed, TypeOfMovement typeOfMovement, double priceForTrip, int displacement,int numberOfPaddle,double weightLimit) {
		super(name, speed, typeOfMovement, priceForTrip, displacement,weightLimit);
		this.numberOfPaddle = numberOfPaddle;
	}

	public int getNumberOfPaddle() {
		return numberOfPaddle;
	}

	public void setNumberOfPaddle(int numberOfPaddle) {
		this.numberOfPaddle = numberOfPaddle;
	}

	@Override
	public String toString() {
		return "Boat: "+super.toString()+" numberOfPaddle=" + getNumberOfPaddle();
	}
	
	public static BoatBuilder createBoat() {
		return new Boat().new BoatBuilder();
	}
	
	public class BoatBuilder {
		
		private BoatBuilder() {
			
		}
		
		public BoatBuilder setNumberOfPaddle(int numberOfPaddle) {
			Boat.this.numberOfPaddle = numberOfPaddle;
			return this;
		}
		public BoatBuilder setDisplacement(int displacement) {
			Boat.this.setDisplacement(displacement);
			return this;
		}
		public BoatBuilder setName(String name) {
			Boat.this.setName(name);
			return this;
		}
		public BoatBuilder setSpeed(int speed) {
			Boat.this.setSpeed(speed);
			return this;
		}
		public BoatBuilder setTypeOfMovement(TypeOfMovement typeOfMovement) {
			Boat.this.setTypeOfMovement(typeOfMovement);;
			return this;
		}
		public BoatBuilder setPriceForTrip(double priceForTrip) {
			Boat.this.setPriceForTrip(priceForTrip);
			return this;
		}
		public BoatBuilder setWeightLimit(double weightLimit) {
			Boat.this.setWeightLimit(weightLimit);
			return this;
		}
		
		public Boat build() {
			return Boat.this;
		}
	}
	
	
}
