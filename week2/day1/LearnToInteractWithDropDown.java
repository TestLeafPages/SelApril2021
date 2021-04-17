package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;





public class LearnToInteractWithDropDown {
	
	
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElementById("username"); // shortcut to save in a variable cntrl+2(press together), press L
		username.sendKeys("Demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");

		// step1: locate the parent element (with select tag)
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");

		// step2: create object for Select class and pass the parent element as argument
		Select dd = new Select(source);

		// step3: select using visible text
		//dd.selectByVisibleText("Conference");
		
		//select using the value
		//dd.selectByValue("LEAD_CONFERENCE");
		
		//select by index
		//dd.selectByIndex(1);
		
		// to get all the options in a list
		List<WebElement> allOptions = dd.getOptions();// index starts from 0 and last item index is size()-1
		
		//to get the number items in the list
		int itemsCount = allOptions.size();
		
		//identify the index for the last item
		int lastIndex = itemsCount-1;
		
		//select by index - to select the last item
		dd.selectByIndex(lastIndex);
		
		
		//Repeat Step1,2,3 for another dropdown
		
		  WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");
		  Select dd1 = new Select(mc); 
		  dd1.selectByVisibleText("Automobile");
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// java wait
		Thread.sleep(2000);

		
		// driver.close();

	}

}
