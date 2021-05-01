package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllCheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

		List<WebElement> allCheckboxes = driver
				.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input");
		
		//allCheckboxes.get(3).click();
		
		  for (WebElement eachCheckbox : allCheckboxes) {
			  eachCheckbox.click(); 
			  }
		 

	}
}
