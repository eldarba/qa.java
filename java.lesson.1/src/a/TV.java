package a;

public class TV {
	
	// מאפייני הטלוויזיה
	public int width = 100;
	public int heigt = 40;
	public String mode = "off";
	
	// פונקציות הטלוויזיה
	public void powerOn() {
		mode = "on";
	}
	public void powerOff() {
		mode = "off";
	}
	
	public static void tvInventor() {
		System.out.println("an American guy");
	}
	

}
