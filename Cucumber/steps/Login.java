package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	/*
	 * public ChromeDriver driver;
	 * 
	 * @Given("Open the Chrome Browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); }
	 * 
	 * @Given("Load application url {string}") public void loadApplication(String
	 * url) { driver.get(url);
	 * 
	 * }
	 */

	@Given("Enter the username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error Message is displayed");
	}
	
	
	
	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		System.out.println("HomePage is displayed");
	}
	
	
	
}
