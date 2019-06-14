package a.ifConstruct;

public class Demo3 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);

		System.out.println(a + ", " + b);

		int max = a;
		if (b > a) {
			max = b;
		}
		
		System.out.println(max);

	}

}
