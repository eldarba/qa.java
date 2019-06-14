package e.loops.forDemo;

public class Demo2 {
	/*
	 * create a random number in the range 1-20 and print all numbers from 1 to that
	 * number
	 */
	public static void main(String[] args) {
		int r = (int) (Math.random() * 21);
		System.out.println(r);

		for (int i = 1; i <= r; i++) {
			System.out.print(i + ", ");
		}
	}

}
