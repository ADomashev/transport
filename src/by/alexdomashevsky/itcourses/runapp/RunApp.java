package by.alexdomashevsky.itcourses.runapp;

import by.alexdomashevsky.itcourses.entity.transport.watertransport.Boat;
import by.alexdomashevsky.itcourses.entity.transport.watertransport.CargoShip;
import by.alexdomashevsky.itcourses.entity.transportcompany.TransportCompany;

public class RunApp {
	
	public static void main(String[] args) {
		TransportCompany company = new TransportCompany();
		
		Boat boat1 = Boat.createBoat().setNumberOfPaddle(4).setDisplacement(5).setPriceForTrip(23.0).build();
		Boat boat2 = Boat.createBoat().setNumberOfPaddle(100).setDisplacement(5).setName("boat1").setPriceForTrip(4.0).build();
		
		CargoShip cargoShip = CargoShip.createCargoShip().setPriceForTrip(4566.25).setSpeed(35).build();

		company.setVehicle(cargoShip);
		company.setVehicle(boat2);
		company.setVehicle(boat1);
		
		System.out.println("before");
		System.out.println();
		company.printVehicle();
		company.sortByPriceForTrip();
		System.out.println();
		System.out.println("after");
		company.printVehicle();
		
//		
//		System.out.println(boat1);
//		System.out.println(boat2);
//		System.out.println(boat1);
//		
//		System.out.println(cargoShip);
		
	}
}
