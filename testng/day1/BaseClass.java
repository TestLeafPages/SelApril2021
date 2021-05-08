package testng.day1;

import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	@BeforeClass
	public void preCondition() {
		System.out.println("common pre condition");

	}

}
