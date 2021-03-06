package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tim/Documents/Code/Selenium-WebDriver-with-Java--Basics-to-Advanced-Frameworks/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/tim/Documents/Code/Selenium-WebDriver-with-Java--Basics-to-Advanced-Frameworks/geckodriver");
		System.setProperty("webdriver.edge.driver", "/Users/tim/Documents/Code/Selenium-WebDriver-with-Java--Basics-to-Advanced-Frameworks/edgedriver");
		
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
