package week7.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWaitToAppear {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/appear.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElementByXPath("//b[contains(text(),'Voila')]");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
		String text = ele.getText();
		System.out.println(text);
		
		
		
		
		
		

	}

}
