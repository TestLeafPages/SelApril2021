package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToTakeScreenShot {

	public static void main(String[] args) throws IOException {
		
		Date date = new Date();
		String dateStr = date.toString();
		String newDateStr = dateStr.replaceAll(":", "-");
		
		
		  WebDriverManager.chromedriver().setup();
		  
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications"); ChromeDriver driver = new
		  ChromeDriver(options);
		  
		  driver.get("http://leafground.com"); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  
		  WebElement eleButton = driver.findElementByXPath("//h5[text()='Button']");
		  
		  //to take the screen shot of the browser
		//  File source = driver.getScreenshotAs(OutputType.FILE);
		  
		  //to take screenshot of an element 
		  File source =  eleButton.getScreenshotAs(OutputType.FILE);
		  
		  //set up target file location 
		  File target = new File("./snaps/Button_"+newDateStr+".png");
		  
		  //to copy source to target 
		  FileUtils.copyFile(source, target);
		  
		  
		 
		
	}

}
