package by.alexdomashevsky.itcourses.entity.transport.groundtransport;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.GroundTransport;
import by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment.Accessory;
import by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment.util.AccessoryUtil;
import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public class MotorBike extends GroundTransport{
	
	private Accessory[] accessory;

	private MotorBike() {
	
	}

	public MotorBike(String name, int speed, TypeOfMovement typeOfMovement, 
					 double priceForTrip, double weightLimit,int wheel, Accessory[] accessory) {
		
		super(name, speed, typeOfMovement, priceForTrip, weightLimit, wheel);
		this.accessory = accessory;
	}
	
	
//	TODO где создать метод addAccessory()  (в каком классе, в каком пакете)

	public Accessory[] getAccessory() {
		return accessory;
	}

	public void setAccessory(Accessory[] accessory) {
		this.accessory = accessory;
	}

	public void setAccessory(Accessory accessory) {
		AccessoryUtil.addAccessory(this, accessory);
	}
	
	public static MotoBuilder createMoto() {
		return new MotorBike().new MotoBuilder();
	}
	
	public class MotoBuilder{
		private MotoBuilder() {
			
		}
		public MotoBuilder setName(String name) {
			MotorBike.this.setName(name);
			return this;
		}
		
		public MotoBuilder setSpeed(int speed) {
			MotorBike.this.setSpeed(speed);
			return this;
		}
		
		public MotoBuilder setTypeOfMovement(TypeOfMovement typeOfMovement) {
			MotorBike.this.setTypeOfMovement(typeOfMovement);
			return this;
		}
		
		public MotoBuilder setPriceForTrip(double priceForTrip) {
			MotorBike.this.setPriceForTrip(priceForTrip);
			return this;
		}
		
		public MotoBuilder setWeightLimit(double weightLimit) {
			MotorBike.this.setWeightLimit(weightLimit);
			return this;
		}
		
		public MotoBuilder setWheel(int wheel) {
			MotorBike.this.setWheel(wheel);
			return this;
		}
		public MotoBuilder setAccessory(Accessory accessory) {
			MotorBike.this.setAccessory(accessory);
			return this;
		}
	}
	
}
