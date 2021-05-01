package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUIDragAndDropBy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement drag = driver.findElementById("draggable");
		
		Point location = drag.getLocation();
		System.out.println(location);
		
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		
		/*
		 * Actions builder = new Actions(driver); builder.dragAndDropBy(drag, 50,
		 * 50).perform();
		 */
		
		
	}

}
