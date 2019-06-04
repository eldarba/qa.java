package e.assignments;

public class Demo2 {
	
	static int x;
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x);
		
		x++;
		System.out.println(x);
		
		x--;
		System.out.println(x);
		
		x = 5;
		
		// 2 operations in one statement - assignment before output
		System.out.println(++x);
		
		// 2 operations in one statement - output before assignment 
		System.out.println(x++);
		
		System.out.println(x);
		
		// 2 operations in one statement - assignment before output
		System.out.println(x = x*2);
		
		System.out.println(x);
		
		
		
	}

}
