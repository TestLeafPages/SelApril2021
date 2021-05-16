package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
	@When("Click on crmsfa link")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	@Then("MyHomePage should be displayed")
	public void verifyMyHomePage() {
		System.out.println("My Home Page is displayed");

	}

	
	
	
}
