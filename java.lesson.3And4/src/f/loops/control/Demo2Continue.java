package f.loops.control;

public class Demo2Continue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i==5) {
				continue; // jump to a new iteration
			}
			System.out.println(i);
		}
	}

}
