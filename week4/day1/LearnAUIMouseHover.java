package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUIMouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebElement men = driver.findElementByLinkText("Men");
		WebElement men = driver.findElementByXPath("//a[text()='Men']"); //ctnrl+2; L
		
		//create object for Actions class
		Actions builder = new Actions(driver);
		builder.moveToElement(men).perform(); //perform() is mandatory at the end
		
		
	}

}
