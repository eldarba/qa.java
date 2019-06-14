package a.ifConstruct;

public class Demo2RandomNumbers {

	public static void main(String[] args) {
		int a = 150;
		int b = 160;

		int r = (int) (Math.random() * (b - a + 1)) + a;

		System.out.println(r);

	}

}
