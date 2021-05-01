package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToInteractWithMultipleElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	//	List<WebElement> inputElements = driver.findElementsByClassName("inputLogin");
		
		List<WebElement> inputElements = driver.findElementsByTagName("input");
		
		
		for (WebElement eachElement : inputElements) {
			
			String attribute = eachElement.getAttribute("class");
			System.out.println(attribute);
			
		}
		
		//driver.findElementsByXPath("//input[@class='inputLogin']");

	}

}
