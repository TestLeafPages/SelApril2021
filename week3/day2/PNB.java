package week3.day2;

public class PNB implements RBI, CIBIL{

	public void creditScore() {
		System.out.println("8");
		
	}

	public void minimumBalance() {
		System.out.println("3000");
		
	}

	public void maxLoanAmount() {
		System.out.println("250000");
		
	}
	
	
	public void engineersLoan() {
		System.out.println("PNB special loan");

	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		PNB pnb = new PNB();
		
		pnb.creditScore();
		pnb.maxLoanAmount();
		pnb.minimumBalance();
	}

}
