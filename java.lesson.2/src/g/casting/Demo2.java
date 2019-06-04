package g.casting;

public class Demo2 {

	public static void main(String[] args) {
		long a = 999999999999999999L;
		float b = a;
		/*
		 * even though long is 64 bit, float (32 bit) can have much bigger values
		 */

		System.out.println(a);
		System.out.println(b);

		b *= 2;
		System.out.println(b);
		b *= 2;
		System.out.println(b);
	}
}
