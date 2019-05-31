package a;

public class TVApplication {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		System.out.println(tv1.heigt);
		System.out.println(tv1.width);
		System.out.println(tv1.mode);
		
		tv1.powerOn();
		System.out.println(tv1.mode);
		System.out.println(tv2.mode);
		
		// dynamic methods are invoked by an object
		tv1.powerOn();
		// static methods are invoked by the class
		TV.tvInventor();
	}
}
