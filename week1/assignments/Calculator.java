package week1.assignments;

public class Calculator {

	public int add(int num1, int num2) {

		int sum = num1 + num2;

		return sum;
	}

	public double sub(double num1, double num2) {
		double result = num1 - num2;

		return result;
	}

	public double mul(double num1, double num2) {

		double result = num1 * num2;

		return result;

	}

	public int division(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(10, 20));
		
		double subRes = calc.sub(55.66, 45.12);
		System.out.println(subRes);
		
		System.out.println(calc.mul(25.67, 125.76));
		
		System.out.println(calc.division(100, 10));

	}

}
