package week6.day1;

public class MyEmployees {
	
	static {
		System.out.println("static block of code");
	}

	public static void main(String[] args) {
		Employee.getDetails();
		System.out.println(Employee.compName);

	}

}
