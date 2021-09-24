package week3.day2;

public class Desktop implements Hardware, Software {

	public void desktopResource() {
		System.out.println("Desktop: Accer");
	}
	
	public void softwareResource() {
		System.out.println("Software: Updates");
	}
	
	public void hardwareResource() {
		System.out.println("Hardware: Spares");
	}
	
	public static void main(String[] args) {
		
		Desktop d1 = new Desktop();
		
		d1.desktopResource();
		d1.softwareResource();
		d1.hardwareResource();
	}
}
