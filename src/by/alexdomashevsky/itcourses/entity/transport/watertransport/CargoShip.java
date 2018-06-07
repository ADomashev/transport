package by.alexdomashevsky.itcourses.entity.transport.watertransport;


import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.WaterTransport;
import by.alexdomashevsky.itcourses.util.TypeOfCargo;
import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public class CargoShip extends WaterTransport{	
	
	private TypeOfCargo typeOfCargo;
	
	private CargoShip() {
	
	}
	
	public CargoShip(String name, int speed, TypeOfMovement typeOfMovement,
			             double priceForTrip,int displacement,
			             double weightLimit, TypeOfCargo typeOfCargo) {
		
		super(name, speed, typeOfMovement, priceForTrip, displacement,weightLimit);
		this.typeOfCargo = typeOfCargo;
	}
	
	public TypeOfCargo getTypeOfCargo() {
		return typeOfCargo;
	}
	
	public void setTypeOfCargo(TypeOfCargo typeOfCargo) {
		this.typeOfCargo = typeOfCargo;
	}
	
	@Override
	public String toString() {
		return "CargoShip: "+super.toString()+", typeOfCargo=" + getTypeOfCargo();
	}
	
	public static CargoShipBuilder createCargoShip() {
		return new CargoShip().new CargoShipBuilder();
	}
	public class CargoShipBuilder{
		
		public CargoShipBuilder setName(String name) {
			CargoShip.this.setName(name);
			return this;
		}
		
		public CargoShipBuilder setSpeed(int speed) {
			CargoShip.this.setSpeed(speed);
			return this;
		}
		
		public CargoShipBuilder setTypeOfMovement(TypeOfMovement typeOfMovement) {
			CargoShip.this.setTypeOfMovement(typeOfMovement);
			return this;
		}
		
		public CargoShipBuilder setPriceForTrip(double priceForTrip) {
			CargoShip.this.setPriceForTrip(priceForTrip);
			return this;
		}
		
		public CargoShipBuilder setDisplacement(int displacement) {
			CargoShip.this.setDisplacement(displacement);
			return this;
		}
		
		public CargoShipBuilder setWeightLimit(double weightLimit) {
			CargoShip.this.setWeightLimit(weightLimit);
			return this;
		}
		
		public CargoShip build() {
			return CargoShip.this;
		}
	}
}
