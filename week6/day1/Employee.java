package week6.day1;

public class Employee {
	
	int empId;
	String empName;
	static String compName;
	
	Employee(int id, String name,String company){
		empId = id;
		empName = name;
		compName = company;
		
	}
	
	public void printEmployeeDetails() {
		System.out.println(empId+" "+empName+" "+compName);

	}
	
	
	public static void getDetails() {
		System.out.println("employee details");
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(100,"Hari","TestLeaf");
		Employee emp2 = new Employee(200,"Prasad","TestLeaf Pvt Ltd");
		
		emp1.printEmployeeDetails();
		emp2.printEmployeeDetails();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
