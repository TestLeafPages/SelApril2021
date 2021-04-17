package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		// Step1: to set up driver
		WebDriverManager.chromedriver().setup();

		// Step2: Open chrome browser - Create object for ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Step3: Load the application URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step4: to maximize the window
		driver.manage().window().maximize();

		// Step5: Locate the Username text field
		WebElement username = driver.findElementById("username"); // shortcut to save in a variable cntrl+2(press together), press L

		// Step6: to type value in a WebElement
		username.sendKeys("Demosalesmanager");

		// Step7: Locate using Name locator
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");

		// Step8: locate using className to interact login button
		driver.findElementByClassName("decorativeSubmit").click();

		// Step9: locate a link using linkText locator - to click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();

		// Step10: click on Leads link
		driver.findElementByLinkText("Leads").click();

		// Step11: click on Create Lead link
		driver.findElementByLinkText("Create Lead").click();

		// Step12: Enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");

		// Step13: Enter first name
		driver.findElementById("createLeadForm_firstName").sendKeys("Hari");

		// step14: Enter last name
		driver.findElementById("createLeadForm_lastName").sendKeys("R");

		// Step15: Click on Create Lead button
		driver.findElementByName("submitButton").click();

		// java wait
		Thread.sleep(2000);

		// Step16: to close the current browser
		driver.close();

	}

}
