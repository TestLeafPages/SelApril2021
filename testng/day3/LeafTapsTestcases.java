package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestcases {
	
	@Test(groups = {"smoke","functional"})
	public void createLead() {
		
		System.out.println("CreateLead");
		throw new NoSuchElementException();
	}
	
	@Test(groups = {"smoke","functional"})
	public void editLead() {
		
		System.out.println("edit Lead");
	}
	
	@Test(groups = {"regression"}, dependsOnGroups = "smoke")
	public void deleteLead() {
		
		System.out.println("Delete Lead");
	}
	
	@Test(groups = {"functional"}, dependsOnGroups = "smoke")
	public void duplicateLead() {
		
		System.out.println("Duplicate Lead");
	}
	
	@Test(groups = {"regression"}, dependsOnGroups = "smoke")
	public void mergeLead() {
		System.out.println("Merge Lead");

	}

}
