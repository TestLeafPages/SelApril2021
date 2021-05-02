package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://dev111627.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		

		/*
		 * //switch to frame using name or id driver.switchTo().frame("gsft_main123");
		 * 
		 * //switch frame using index //driver.switchTo().frame(1);
		 * 
		 * 
		 * WebElement eleFrame = driver.findElementByXPath("//iframe"); //switch to
		 * frame using WebElement driver.switchTo().frame(eleFrame);
		 * 
		 * 
		 * driver.findElementById("user_name").sendKeys("admin");
		 */

		driver.get("http://leafground.com/pages/frame.html");
		
		/*
		 * driver.switchTo().frame(0); driver.findElementById("Click").click();
		 * 
		 * 
		 * //to switch the control from frame to main page
		 * driver.switchTo().defaultContent();
		 * 
		 * 
		 * String text = driver.findElementByTagName("h1").getText();
		 * System.out.println(text);
		 */
		
		driver.switchTo().frame(1);//outer
		driver.switchTo().frame("frame2"); //inner
		driver.findElementById("Click1").click();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
