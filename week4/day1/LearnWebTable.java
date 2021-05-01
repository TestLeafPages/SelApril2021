package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		//to get the rowCount
		List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		int rowCount = rows.size();
				
		for (int i = 2; i <= rowCount; i++) { //row
			//to get the cell count
			List<WebElement> data = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
			int dataCount = data.size();
			
			for (int j = 1; j <= dataCount; j++) { //column
				
				if(j==3) {
					driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]/input").click();
				}else {
					
					String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
					System.out.println(text);
				}
				
			}
			
		}
		

		
	}
}
