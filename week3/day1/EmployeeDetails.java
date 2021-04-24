package week3.day1;

public class EmployeeDetails {
	
	public void findDetails(String name) {
		System.out.println("Employee info for: "+name);
	}
	
	public void findDetails(int empId) {
		System.out.println("Employee info for: "+empId);

	}
	
	public void findDetails(int empId, String name) {
		System.out.println("Employee info for: "+empId+" "+name);

	}
	
	public void findDetails(String email,int phNo) {
		System.out.println("Employee info for: "+phNo+" "+email);

	}
	
	

	public static void main(String[] args) {
		/*
		 * EmployeeDetails ed = new EmployeeDetails();
		 * 
		 * ed.findDetails("Hari"); ed.findDetails(100);
		 * 
		 * ed.findDetails(100, "Hari");
		 * 
		 * ed.findDetails("abc@gmail.com", 4535664);
		 */
		
		System.out.println('%');

	}

}
