package week7.day2;

public class LearnExceptionHandling {
	
	
	public int divide(int num1, int num2) {
		int num3;
		
		if(num2 < num1) {
			num3 = num1 / num2;
		}
		else {
			throw new ArithmeticException("divisor is greater than dividend");
		}
		
		return num3;

	}

	public static void main(String[] args) {
		
		LearnExceptionHandling leh = new LearnExceptionHandling();
		
		int res = leh.divide(10, 20);
		System.out.println(res);
		
		/*
		 * int x = 10; int y = 0;
		 * 
		 * //int[] num = { 10, 20, 30 };
		 * 
		 * int z;
		 * 
		 * try { z = x / y; System.out.println(z);
		 * 
		 * } finally { System.out.println("finally block"); }
		 * 
		 * System.out.println("End of program");
		 */

	}

}
