package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tim/Documents/Code/Selenium-WebDriver-with-Java--Basics-to-Advanced-Frameworks/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("tim");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); 
	}
}
