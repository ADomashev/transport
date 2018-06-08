package by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment;

public class Helmet extends Accessory {
	private Visor visor;

	public Helmet() {
		
	}
	
	public Helmet(String name, double price, String color) {
		super(name, price, color);
	}
	
	public Helmet(String name, double price, String color,Visor visor) {
		super(name, price, color);
		this.visor = visor;
	}

	public Visor getVisor() {
		return visor;
	}

	public void setVisor(Visor visor) {
		this.visor = visor;
	}

	@Override
	public String toString() {
		return "Helmet "+super.toString()+" with "+" visor=" + getVisor();
	}
	
}
