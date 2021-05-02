package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("home")).click();

		
		Set<String> windowHandles = driver.getWindowHandles();

		// copy set into list
		List<String> handleList = new ArrayList<String>(windowHandles);

		// to get second item form the list
		String sencondHandle = handleList.get(1);
		
		// to switch the control to the second window
		driver.switchTo().window(sencondHandle);
		
		driver.findElementByXPath("//img[@alt='Buttons']").click();
				
		driver.switchTo().window(handleList.get(0));
		driver.close();

	}

}
