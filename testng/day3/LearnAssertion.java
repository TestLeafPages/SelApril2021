package testng.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		String actTitle = driver.getTitle();
		
		String expTitle = "TestLeaf Automation Platform";
		
		boolean displayed = driver.findElement(By.id("username")).isDisplayed();
		
		//Hard Assert
		//Assert.assertEquals(actTitle, expTitle);
		
		//Assert.assertTrue(displayed);
		//Assert.assertFalse(displayed);
		
		//Create object for soft assert
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actTitle, expTitle);
		
		
		
		/*
		 * if(expTitle.equals(actTitle)) { System.out.println("Pass"); } else {
		 * System.out.println("fail"); }
		 */
		
		
		System.out.println("Last line of my program");
		
		//mandatory method to be executed for Soft Assert
		softAssert.assertAll();
		
		
		
		/*
		 * driver.findElement(By.id("username")).sendKeys("Demo");
		 * driver.findElement(By.id("password")).sendKeys("test");
		 */

	}

}
