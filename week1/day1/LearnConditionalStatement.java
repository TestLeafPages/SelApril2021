package week1.day1;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		
		int voterAge = 10;
		
		if(voterAge < 18) {
			System.out.println("minor");
		}
		
		else if(voterAge >=18 && voterAge < 60) {
			System.out.println("Adult");
		}
		
		else if(voterAge >= 60) {
			System.out.println("senior citizen");
		}
		
		//shortcut cntrl+shft+/ - block comment; cntrl+shift+\ - block uncomment
		/*
		 * if(voterAge >= 18) { System.out.println("Eligible to vote"); // executed if
		 * the condition is matching } else {
		 * System.out.println("Not Eligible to vote"); // executed if the condition is
		 * matching }
		 */
		
	}

}
