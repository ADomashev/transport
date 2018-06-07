package by.alexdomashevsky.itcourses.entity.transport.groundtransport;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.GroundTransport;
import by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment.Accessory;
import by.alexdomashevsky.itcourses.util.TypeOfMovement;

public class MotorBike extends GroundTransport{
	
	private Accessory[] accessory;

	public MotorBike() {
	
	}

	public MotorBike(String name, int speed, TypeOfMovement typeOfMovement, 
					 double priceForTrip, double weightLimit,int wheel, Accessory accessory) {
		
		super(name, speed, typeOfMovement, priceForTrip, weightLimit, wheel);
		
	}
	
//	TODO где создать метод addAccessory()  (в каком классе, в каком пакете)

	public void addAccessory() {
		
	}
	
}
