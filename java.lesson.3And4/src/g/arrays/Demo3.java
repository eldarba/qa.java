package g.arrays;

public class Demo3 {

	public static void main(String[] args) {
		
		// create an array
		int[] arr = new int[1000];
		// print array length
		System.out.println(arr.length + " elements");
		
		// populate array with data
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*11);
		}
		
		// print all array elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
