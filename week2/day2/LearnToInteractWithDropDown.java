package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;





public class LearnToInteractWithDropDown {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		//pre condition comment
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
	driver.findElementByXPath("(//select)[5]").sendKeys("Appium");

	}

}
