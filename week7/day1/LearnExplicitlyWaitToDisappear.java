package week7.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWaitToDisappear {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/disapper.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement eleDisappear = driver.findElementByXPath("//*[contains(text(),'going to disappear')]");
		
		
		//create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(eleDisappear));
		
		//Thread.sleep(10000);		
		String text = driver.findElementByTagName("strong").getText();
		System.out.println(text);
		
		
		
		

	}

}
