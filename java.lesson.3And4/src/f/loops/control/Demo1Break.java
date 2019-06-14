package f.loops.control;

public class Demo1Break {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i==5) {
				break; // exit the loop
			}
		}
	}

}
