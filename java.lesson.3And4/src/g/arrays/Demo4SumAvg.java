package g.arrays;

public class Demo4SumAvg {

	public static void main(String[] args) {
		
		// create an array
		int[] arr = new int[25];
		// print array length
		System.out.println(arr.length + " elements");
		
		// populate array with data
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*11);
		}
		
		int sum = 0;
		// print all array elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (double)sum/arr.length);

	}

}
