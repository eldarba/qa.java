package a.ifConstruct;

public class Demo5 {

	public static void main(String[] args) {
		
		int grade = (int) (Math.random() * 101);
		System.out.println("the grade is: " + grade);
		
		if(grade <= 65) {
			System.out.println("Fail");
		}else if(grade <= 70) {
			System.out.println("enough");
		}else if(grade <= 80) {
			System.out.println("good");
		}else {
			System.out.println("great");
		}
		
		/*
		 * 0-65 - Fail
		 * 66-70 - enough
		 * 71-80 - good
		 * 81-100 - great
		 * */

	}
}
