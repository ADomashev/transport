package by.alexdomashevsky.itcourses.util;

import by.alexdomashevsky.itcourses.entity.transport.abstracttransport.Vehicle;
import by.alexdomashevsky.itcourses.entity.transportcompany.TransportCompany;

public class TransportCompanyUtil {
	private TransportCompanyUtil() {
		
	}
	
	public static void addVehicle(TransportCompany company,Vehicle vehicle) {
		Vehicle[] arrVehicle = company.getVehicle();
		if(arrVehicle == null) {
			arrVehicle = new Vehicle[] {vehicle};
			company.setVehicle(arrVehicle);
		}else {
			Vehicle[] tmp = new Vehicle[arrVehicle.length+1];
			for (int i = 0; i < arrVehicle.length; i++) {
				tmp[i]=arrVehicle[i];
			}
			tmp[tmp.length-1]=vehicle;
			company.setVehicle(tmp);
		}
	}
	
	public static void printVehicle(TransportCompany company) {
		if(company.getVehicle() != null) {
			Vehicle[] array =company.getVehicle();
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i].toString());
			}
		}
	}
	
	public static void sortByPriceForTrip (TransportCompany company) {
		if(company.getVehicle() != null) {
			quicksort(company.getVehicle(), 0, company.getVehicle().length-1);
		}
	}
	
	private static void quicksort(Vehicle [] arr,int first,int last) {
		int firstElem = first;
		int lastElem = last;
		double middle = arr[firstElem+(lastElem-firstElem)/2].getPriceForTrip();
		do {
			while(arr[firstElem].getPriceForTrip()<middle) {++firstElem;}
			while(arr[lastElem].getPriceForTrip()>middle) {--lastElem;}
			if(firstElem<=lastElem) {
				swap(arr,firstElem,lastElem);
				firstElem++;
				lastElem--;
			}
		}while(firstElem<=lastElem);
		if(first<lastElem) {quicksort(arr,first,lastElem);}
		if(firstElem<last) {quicksort(arr,firstElem,last);}
		
	}
	
	private static void swap (Vehicle [] arr,int firstElem,int lastElem) {
		Vehicle temp;
		temp=arr[firstElem];
		arr[firstElem]=arr[lastElem];
		arr[lastElem]=temp;
	}
	
	
	
}
