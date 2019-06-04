package d.local.variables;

public class Demo1 {
	
	static int x;
	
	public static void main(String[] args) {
		int y = 0; // local variables must be initialized
		
		System.out.println(x);
		System.out.println(y);
		
		int x = 10;
		System.out.println(x = 200);
		
	}

}
