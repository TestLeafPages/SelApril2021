package testng.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class SmokeTestCases {
	
	@Test
	public void loginTest() {
		System.out.println("Login test case");
		throw new NoSuchElementException();
	}

}
