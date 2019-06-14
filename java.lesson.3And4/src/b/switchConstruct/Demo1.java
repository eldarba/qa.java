package b.switchConstruct;

public class Demo1 {

	public static void main(String[] args) {
		int key = (int) (Math.random() * 4) + 1;
		key = 8;
		System.out.println(key);

		switch (key) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default:
			System.out.println("some other value");
		}
	}

}
