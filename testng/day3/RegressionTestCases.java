package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class RegressionTestCases {
	
	@Test
	public void createLead() {
		
		System.out.println("CreateLead");
		
	}
	
	@Test
	public void editLead() {
		
		System.out.println("edit Lead");
		throw new NoSuchElementException();
	}
	
	@Test
	public void deleteLead() {
		
		System.out.println("Delete Lead");
	}
	
	@Test
	public void duplicateLead() {
		
		System.out.println("Duplicate Lead");
	}
	
	@Test
	public void mergeLead() {
		System.out.println("Merge Lead");

	}

}
