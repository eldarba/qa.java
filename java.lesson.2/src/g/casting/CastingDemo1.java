package g.casting;

public class CastingDemo1 {

	public static void main(String[] args) {
		byte a = 127;
		short b = a; // implicit casting
		b += 299;
		byte c = (byte) b; // explicit casting - can overflow

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
