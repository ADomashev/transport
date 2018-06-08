package by.alexdomashevsky.itcourses.entity.transportcompany;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.Vehicle;
import by.alexdomashevsky.itcourses.util.TransportCompanyUtil;

public class TransportCompany {
	private Vehicle[] vehicle;

	public TransportCompany() {
		
	}

	public TransportCompany(Vehicle[] vehicle) {
		this.vehicle = vehicle;
	}

	public Vehicle[] getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle[] vehicle) {
		this.vehicle = vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		TransportCompanyUtil.addVehicle(this, vehicle);
	}
	
	public void sortByPriceForTrip () {
		TransportCompanyUtil.sortByPriceForTrip(this);
	}
	
	public void printVehicle() {
		TransportCompanyUtil.printVehicle(this);
	}
	
	
}
