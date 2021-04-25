package week3.day2;

public class TNGovt extends FinanceMinistry{

	public void covidTreatmentLoan() {
		System.out.println("10000");

	}
	
	
	
	public void agriLoanforFarmers() {
		System.out.println("2000");
		
	}
	
	public void eduLoan() {
		System.out.println("10000");
	}

	
	public static void main(String[] args) {
		FinanceMinistry tng = new TNGovt();
		tng.agriLoanforFarmers();
		tng.covidTreatmentLoan();
		
		
	}
}
