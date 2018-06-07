package by.alexdomashevsky.itcourses.runapp;

import by.alexdomashevsky.itcourses.entity.transport.watertransport.Boat;
import by.alexdomashevsky.itcourses.entity.transport.watertransport.CargoShip;

public class RunApp {
	
	public static void main(String[] args) {
		
		Boat boat1 = Boat.createBoat().setNumberOfPaddle(4).setDisplacement(5).build();
		Boat boat2 = Boat.createBoat().setNumberOfPaddle(100).setDisplacement(5).setName("boat1").build();
		
		CargoShip cargoShip = CargoShip.createCargoShip().setPriceForTrip(4566.25).setSpeed(35).build();
		
		System.out.println(boat1);
		System.out.println(boat2);
		System.out.println(boat1);
		
		System.out.println(cargoShip);
		
	}
}
