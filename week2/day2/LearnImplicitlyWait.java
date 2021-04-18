package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// step to implement implicitly wait
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		//Thread.sleep(20000);

		driver.findElementById("username").sendKeys("Demosalesmanager");

		driver.findElementById("password123").sendKeys("crmsfa");

	}

}
