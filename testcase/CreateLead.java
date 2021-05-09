package testcase;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "sendData")
	public void runCreateLead(String company, String fName,String lName) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();

	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		ReadExcel re = new ReadExcel();
		String[][] excelData = re.excelData("CreateLead");
		
		return excelData;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
