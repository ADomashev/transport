package by.alexdomashevsky.itcourses.entity.transport.watertransport;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.WaterTransport;
import by.alexdomashevsky.itcourses.util.TypeComfortClass;
import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public class Yacht extends WaterTransport {
	private TypeComfortClass comfortClass;

	private Yacht() {
		
	}

	public Yacht(String name, int speed, TypeOfMovement typeOfMovement,
					double priceForTrip, int displacement,
					TypeComfortClass comfortClass,double weightLimit) {
		
		super(name, speed, typeOfMovement, priceForTrip, displacement , weightLimit);
		this.comfortClass = comfortClass;
	}
	
	public TypeComfortClass getComfortClass() {
		return comfortClass;
	}

	public void setComfortClass(TypeComfortClass comfortClass) {
		this.comfortClass = comfortClass;
	}
	

	@Override
	public String toString() {
		return "Yacht: "+super.toString()+"comfortClass=" + getComfortClass();
	}

	public static YachtBuilder createYacht() {
		return new Yacht().new YachtBuilder();
	}
	
	public class YachtBuilder{
		private YachtBuilder() {
			
		}
		
		public YachtBuilder setName(String name) {
			Yacht.this.setName(name);
			return this;
		}
		
		public YachtBuilder setSpeed(int speed) {
			Yacht.this.setSpeed(speed);
			return this;
		}
		
		public YachtBuilder setTypeOfMovement(TypeOfMovement typeOfMovement) {
			Yacht.this.setTypeOfMovement(typeOfMovement);
			return this;
		}
		
		public YachtBuilder setPriceForTrip(double priceForTrip) {
			Yacht.this.setPriceForTrip(priceForTrip);
			return this;
		}
		
		public YachtBuilder setDisplacement(int displacement) {
			Yacht.this.setDisplacement(displacement);
			return this;
		}
		
		public YachtBuilder setComfortClass(TypeComfortClass comfortClass) {
			Yacht.this.setComfortClass(comfortClass);
			return this;
		}
		public YachtBuilder setWeightLimit(double weightLimit) {
			Yacht.this.setWeightLimit(weightLimit);
			return this;
		}
		
		public Yacht build() {
			return Yacht.this;
		}
	}
	
}
