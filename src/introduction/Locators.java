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
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("tim");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tim@optum.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tim.shores@optum.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tim@optum.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("555-123-4567");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		String message = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(message);
	}
}
