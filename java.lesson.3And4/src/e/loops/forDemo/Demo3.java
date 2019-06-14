package e.loops.forDemo;

public class Demo3 {

	/*
	 * create two random numbers in the range 1-20 and print all numbers from the
	 * smaller number to the larger number
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 21);
		int b = (int) (Math.random() * 21);
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a + ", " + b);

		for (int i = a; i <= b; i++) {
			System.out.print(i + ", ");
		}
	}

}
