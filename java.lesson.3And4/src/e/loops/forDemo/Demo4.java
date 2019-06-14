package e.loops.forDemo;

public class Demo4 {

	/*
	 * create two random numbers in the range 1-20 and print all numbers between
	 * them from the first number to the second number
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 21);
		int b = (int) (Math.random() * 21);

		System.out.println(a);
		System.out.println(b);

		// int val = a < b ? 1 : -1; // ternary operator
		int val = 1;
		if (a > b) {
			val = -1;
		}

		for (int i = a; i != b; i += val) {
			System.out.print(i + ", ");
		}
		System.out.println(b);

	}

}
