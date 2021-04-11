package week1.assignments;

public class FindArmstrongNumber {

	public static void main(String[] args) {
		int input = 153; //(1*1*1)+(5*5*5)+(3*3*3) = 153
		
		int orgNum = input;
		
		int sum = 0;
		
		int rem;
		
		while(input > 0) {
			
			rem = input % 10;
			System.out.println(rem);
			
			sum  = sum + (rem*rem*rem);
			System.out.println(sum);
			
			input = input / 10 ;
			System.out.println(input);
			
			
			
			System.out.println("***********************");
			
		}
		
		if(sum == orgNum) {
			System.out.println("Given number is an armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}
		
		
		
		
		

	}

}
