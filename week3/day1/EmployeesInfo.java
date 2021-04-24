package week3.day1;


public class EmployeesInfo {
	int empId;
	String empName;
	boolean empStatus;

	
	EmployeesInfo(){
		//this(200,"Prasad",true);
		System.out.println("Default Constructor");
	}
	
	EmployeesInfo(int empId, String empName, boolean empStatus){
	
		this.empId = empId;
	    this.empName = empName;
		this.empStatus = empStatus;
		
	}
	
	public void empDetails() {
		
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empStatus);

	}
	
		public static void main(String[] args) {
		
		// ClassName objectName = new constructor;
		EmployeesInfo ei = new EmployeesInfo(100,"Hari",true);
		
		  ei.empDetails();
				
		/*
		 * System.out.println(ei.empId); System.out.println(ei.empName);
		 * System.out.println(ei.empStatus);
		 */
		 
		
		
		
		
	}

}
