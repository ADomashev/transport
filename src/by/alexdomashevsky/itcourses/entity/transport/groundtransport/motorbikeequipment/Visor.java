package by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment;

public class Visor {

	private boolean tint;
	public Visor() {
		
	}
	public Visor( boolean tint) {
		
		this.tint = tint;
	}
	
	public boolean isTint() {
		return tint;
	}
	public void setTint(boolean tint) {
		this.tint = tint;
	}
	
	@Override
	public String toString() {
		
//		����� �� ���� �������� tint - true , ���������� �����
		return "Visor: "+super.toString()+", tint=" + isTint();
	}
	
	
}
