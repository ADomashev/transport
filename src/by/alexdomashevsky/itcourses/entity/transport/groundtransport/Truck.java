package by.alexdomashevsky.itcourses.entity.transport.groundtransport;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.GroundTransport;
import by.alexdomashevsky.itcourses.util.TypeOfAttachmentEquipment;
import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public class Truck extends GroundTransport{
	
	private TypeOfAttachmentEquipment type;

	private Truck() {
	
	}

	public Truck(String name, int speed, TypeOfMovement typeOfMovement, double priceForTrip, 
				 double weightLimit,int wheel,TypeOfAttachmentEquipment type) {
		
		super(name, speed, typeOfMovement, priceForTrip, weightLimit, wheel);
		this.type = type;
	}

	public TypeOfAttachmentEquipment getType() {
		return type;
	}

	public void setType(TypeOfAttachmentEquipment type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Truck : " +super.toString()+"type=" + getType();
	}
	
	public static TruckBuilder createTruck() {
		return new Truck().new TruckBuilder();
	}
	
	public class TruckBuilder{
		
		private TruckBuilder() {
			
		}
		
		public TruckBuilder setName(String name) {
			Truck.this.setName(name);
			return this;
		}
		
		public TruckBuilder setSpeed(int speed) {
			Truck.this.setSpeed(speed);
			return this;
		}
		
		public TruckBuilder setTypeOfMovement(TypeOfMovement typeOfMovement) {
			Truck.this.setTypeOfMovement(typeOfMovement);
			return this;
		}
		
		public TruckBuilder setPriceForTrip(double priceForTrip) {
			Truck.this.setPriceForTrip(priceForTrip);
			return this;
		}
		
		public TruckBuilder setWeightLimit(double weightLimit) {
			Truck.this.setWeightLimit(weightLimit);
			return this;
		}
		
		public TruckBuilder setWheel(int wheel) {
			Truck.this.setWheel(wheel);
			return this;
		}
		
		public TruckBuilder setTypeOfAttachmentEquipment(TypeOfAttachmentEquipment type) {
			Truck.this.setType(type);
			return this;
		}
		
		public Truck build() {
			return Truck.this;
		}
		
	}
	
}
