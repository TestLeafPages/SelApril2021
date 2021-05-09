package testng.day2;

import org.testng.annotations.Test;

public class LearnTestAttributes {
	
	
	@Test(priority = -1, invocationCount=3)
	public void createLead() {
		System.out.println("create lead");

	}
	
	@Test //0
	public void editLead() {
		System.out.println("edit lead");

	}
	
	@Test(priority = 2, enabled = false)
	public void deleteLead() {
		System.out.println("delete lead");

	}

}
