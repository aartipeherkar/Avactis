package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class HandlingMultipleElements {
	WebDriver driver;

	@Test
	public void testAllGoogleLinks() {
		
		// 1.First get all the link in a list
		List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
		
	  
		 // 2. In a for loop print one by one link visible text and href attribute value
		for(WebElement oneLink:allGoogleLinks ) {
			System.out.println(oneLink.getText()+" - " + oneLink.getAttribute("href"));
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(options);
		//driver = new ChromeDriver(); // Webdriver is interfece

		driver.get("http://www.google.com");

	}

	@AfterMethod
	public void afterMethod() {
	}

}
