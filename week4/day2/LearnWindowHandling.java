package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementById("home").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		Set<String> windowHandles = driver.getWindowHandles();
			
		//copy set into list
		List<String> handleList = new ArrayList<String>(windowHandles);
		
		//to get second item form the list
		String sencondHandle = handleList.get(1);
		
		//to switch the control to the second window
		driver.switchTo().window(sencondHandle);
				
		//to close the current window
		driver.close();
		
		driver.switchTo().window(handleList.get(0));
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		
		
		//to close all the window
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
