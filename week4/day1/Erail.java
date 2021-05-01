package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement fromStation = driver.findElementById("txtStationFrom");
		fromStation.clear();
		fromStation.sendKeys("ms");
		fromStation.sendKeys(Keys.TAB);
		
		WebElement toStation = driver.findElementById("txtStationTo");
		toStation.clear();
		toStation.sendKeys("mdu");
		toStation.sendKeys(Keys.TAB);
		
		driver.findElementById("chkSelectDateOnly").click();
		
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int rowCount = rows.size();
		
		List<String> trainNames = new ArrayList<String>();
				
		for (int i = 1; i <= rowCount; i++) {
			
			String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			
			trainNames.add(trainName);
		}
		
		
		Set<String> trainNamesSet = new LinkedHashSet<String>(trainNames);
		
		if(trainNames.size() == trainNamesSet.size()) {
			System.out.println("No duplicate names");
		}
		else {
			System.out.println("duplicate names are there in the train names");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
