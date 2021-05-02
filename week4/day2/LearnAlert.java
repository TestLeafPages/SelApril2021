package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		
		driver.findElementByXPath("//button[text()='OK']").click();
		
		
		
		//driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		//to switch the control from main page to the alert
		/*
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * String text = alert.getText(); System.out.println(text);
		 * 
		 * alert.accept();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElementByXPath("//button[text()='Confirm Box']").click();
		 * 
		 * Alert alert2 = driver.switchTo().alert();
		 * 
		 * String text2 = alert2.getText(); System.out.println(text2);
		 * //alert2.dismiss(); alert2.accept();
		 * 
		 * //driver.switchTo().alert().dismiss();
		 */		
		/*
		 * driver.findElementByXPath("//button[text()='Prompt Box']").click(); Alert
		 * alert3 = driver.switchTo().alert();
		 * 
		 * String text3 = alert3.getText(); System.out.println(text3);
		 * 
		 * alert3.sendKeys("Hari Software Solutions"); Thread.sleep(5000);
		 * 
		 * alert3.accept();
		 */
		
	}

}
