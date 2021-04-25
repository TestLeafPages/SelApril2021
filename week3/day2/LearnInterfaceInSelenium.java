package week3.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnInterfaceInSelenium {

	public static void main(String[] args) {
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("");
		driver.findElementById("username");

	}

}
