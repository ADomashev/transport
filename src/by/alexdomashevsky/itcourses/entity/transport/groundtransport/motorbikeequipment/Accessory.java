package by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment;

public abstract class Accessory {
	
	private String name;
	private double price;
	private String color;
	
	public Accessory() {
		
	}
	
	public Accessory(String name, double price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Accessory name=" + getName() + ", price=" + getPrice()+", color"+getColor();
	}
	
	
	
}
