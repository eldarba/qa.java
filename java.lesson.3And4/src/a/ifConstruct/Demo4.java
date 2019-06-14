package a.ifConstruct;

public class Demo4 {

	public static void main(String[] args) {
		int age = (int) (Math.random()*121);
		System.out.println("the age is: " + age);
		
		if(age >= 18 && age <= 23) {
			System.out.println("legal");
		}else {
			System.out.println("illegal");
		}
	}
}
