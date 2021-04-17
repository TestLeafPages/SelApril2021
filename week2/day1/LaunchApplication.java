package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		//Set up the chrome driver
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Step1: to set up driver
		WebDriverManager.chromedriver().setup();
		

		//Step2: Open chrome browser - Create object for ChromeDriver
	    ChromeDriver driver = new ChromeDriver();
				
		//Step3: Load the application URL
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    //step4: to maximize the window
	    driver.manage().window().maximize();
	    
	    //step5: Locate the Username text field
	    WebElement username = driver.findElementById("username");  //shortcut to save in a variable cntrl+2(press together), press L
	   
	    //Step6: to type value in a WebElement
	    username.sendKeys("Demosalesmanager");
	    
	    
	    //Step7: Locate using Name locator
	    driver.findElementByName("PASSWORD").sendKeys("crmsfa");
	    
	    
	   //step8: locate using className to interact login button
	    driver.findElementByClassName("decorativeSubmit").click();
	    
	    
	    //step9: locate a link using linkText locator - to click CRM/SFA link
	    driver.findElementByLinkText("CRM/SFA").click();
	   
	    
	    
	    //java wait
	    Thread.sleep(2000);
	    
	    //Step5: to close the current browser
	    driver.close();

	}

}
