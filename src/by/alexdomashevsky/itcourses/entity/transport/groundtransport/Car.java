package by.alexdomashevsky.itcourses.entity.transport.groundtransport;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.GroundTransport;
import by.alexdomashevsky.itcourses.util.TypeOfCar;
import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public class Car extends GroundTransport{
	
	private TypeOfCar typeOfCar;

	private Car() {
	
	}

	public Car(String name, int speed, TypeOfMovement typeOfMovement, double priceForTrip,
			   double weightLimit,int wheel,TypeOfCar typeOfCar) {
		
		super(name, speed, typeOfMovement, priceForTrip, weightLimit, wheel);
		this.typeOfCar = typeOfCar;
	}

	public TypeOfCar getTypeOfCar() {
		return typeOfCar;
	}

	public void setTypeOfCar(TypeOfCar typeOfCar) {
		this.typeOfCar = typeOfCar;
	}

	@Override
	public String toString() {
		return "Car "+super.toString()+" typeOfCar=" + getTypeOfCar();
	}
	
	public static CarBuilder createCar() {
		return new Car().new CarBuilder();
	}
	
	public class CarBuilder{
		private CarBuilder() {
			
		}
		
		public CarBuilder setName(String name) {
			Car.this.setName(name);
			return this;
		}
		
		public CarBuilder setSpeed(int speed) {
			Car.this.setSpeed(speed);
			return this;
		}
		
		public CarBuilder setTypeOfMovement(TypeOfMovement typeOfMovement) {
			Car.this.setTypeOfMovement(typeOfMovement);
			return this;
		}
		
		public CarBuilder setPriceForTrip(double priceForTrip) {
			Car.this.setPriceForTrip(priceForTrip);
			return this;
		}
		
		public CarBuilder setWeightLimit(double weightLimit) {
			Car.this.setWeightLimit(weightLimit);
			return this;
		}
		
		public CarBuilder setWheel(int wheel) {
			Car.this.setWheel(wheel);
			return this;
		}
		
		public CarBuilder setTypeOfCar(TypeOfCar typeOfCar) {
			Car.this.setTypeOfCar(typeOfCar);
			return this;
		}
		
		public Car build() {
			return Car.this;
		}
	}
}
