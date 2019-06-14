package e.loops.forDemo;

public class Demo5 {

	public static void main(String[] args) {
		
		int r = (int) (Math.random() * 10_001);
		int numberOfdigits = 0;
		int leftDigit = 0;
		int sumOfDigits = 0;

		System.out.println("the number: " + r);

		while (r != 0) {
			numberOfdigits++;
			sumOfDigits += r % 10;
			if (r < 10) {
				leftDigit = r;
			}
			r /= 10;
		}
		
		System.out.println("number of digits: " + numberOfdigits);
		System.out.println("left digit: " + leftDigit);
		System.out.println("sum of digits: " + sumOfDigits);

	}

}
