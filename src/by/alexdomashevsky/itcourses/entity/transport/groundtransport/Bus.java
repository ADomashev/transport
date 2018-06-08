package by.alexdomashevsky.itcourses.entity.transport.groundtransport;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.GroundTransport;
import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public class Bus extends GroundTransport{
	
	private boolean wifi;

	public Bus() {
		
	}

	public Bus(String name, int speed, TypeOfMovement typeOfMovement, double priceForTrip,
			   double weightLimit,int wheel, boolean wifi) {
		
		super(name, speed, typeOfMovement, priceForTrip, weightLimit, wheel);
		this.wifi = wifi;
	}

	public boolean getWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	@Override
	public String toString() {
		return "Bus: "+super.toString()+", wifi=" + getWifi() ;
	}
	
	public static BusBuilder createBus() {
		return new Bus().new BusBuilder();
	}
	
	public class BusBuilder{
		private BusBuilder() {
			
		}
		public BusBuilder setName(String name) {
			Bus.this.setName(name);
			return this;
		}
		
		public BusBuilder setSpeed(int speed) {
			Bus.this.setSpeed(speed);
			return this;
		}
		
		public BusBuilder setTypeOfMovement(TypeOfMovement typeOfMovement) {
			Bus.this.setTypeOfMovement(typeOfMovement);
			return this;
		}
		
		public BusBuilder setPriceForTrip(double priceForTrip) {
			Bus.this.setPriceForTrip(priceForTrip);
			return this;
		}
		
		public BusBuilder setWeightLimit(double weightLimit) {
			Bus.this.setWeightLimit(weightLimit);
			return this;
		}
		
		public BusBuilder setWheel(int wheel) {
			Bus.this.setWheel(wheel);
			return this;
		}
		
		public BusBuilder setWifi(boolean wifi) {
			Bus.this.setWifi(wifi);
			return this;
		}
		
		public Bus build() {
			return Bus.this;
		}
	}
	
	
}
