package testng.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class RegressionTests {
	
	//packageName.ClassName.methodName
	@Test(dependsOnMethods = "testng.day2.SmokeTestCases.loginTest")
	public void createLead() {
		System.out.println("create lead");
	//	throw new NoSuchElementException();
	}
	
	@Test(dependsOnMethods = {"testng.day2.RegressionTests.createLead","testng.day2.SmokeTestCases.loginTest" })
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test
	public void deleteLead() {
		System.out.println("delete lead");

	}


}
