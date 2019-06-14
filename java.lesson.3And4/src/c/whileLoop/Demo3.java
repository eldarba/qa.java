package c.whileLoop;

public class Demo3 {
	
	public static void main(String[] args) {
		
		int c = 1;
		
		while(c <= 10) {
			int r = (int) (Math.random()*11);
			System.out.println(r);
			c++;
		}
		
	}
}
