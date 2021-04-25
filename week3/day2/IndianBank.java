package week3.day2;

public class IndianBank implements CIBIL{

	public void minimumBalance() {
		System.out.println("1000");
	}

	public void maxLoanAmount() {
		System.out.println("1000000");
		
	}

	public void creditScore() {
		System.out.println("8");
		
	}
	
	public static void main(String[] args) {
		IndianBank ib = new IndianBank();
		
		ib.minimumBalance();
		ib.maxLoanAmount();
		ib.creditScore();
		
	}

}
