package week3.day2;

public class IBMdu extends IndianBank{
	
	public void agriLoan() {
		System.out.println("100000");

	}
	public static void main(String[] args) {
		
		IBMdu ibm = new IBMdu();
		
		ibm.agriLoan();
		ibm.minimumBalance();
		ibm.maxLoanAmount();
		ibm.creditScore();
		
		
	}

}
