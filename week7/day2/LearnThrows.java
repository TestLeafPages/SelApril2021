package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnThrows {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("./src/main/resources/config123.properties");
		
		
		System.out.println("End of program");
		
		

	}

}
