package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "PayPal India";
		
		char[] charArray = input.toCharArray();
		
		Set<Character> setValues = new LinkedHashSet<Character>();
		
		for (char ch : charArray) {
			setValues.add(ch);
		}
		
		for (Character eachChar : setValues) {
			if (eachChar!=' ') {
				System.out.print(eachChar);
			}
			
		}

	}

}
