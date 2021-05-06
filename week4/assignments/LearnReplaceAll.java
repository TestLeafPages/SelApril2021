package week4.assignments;

public class LearnReplaceAll {

	public static void main(String[] args) {
		String input = "$6125 price";
		
		String replaceAll = input.replaceAll("[^0-9]", "");
		
		System.out.println(replaceAll);

	}

}
