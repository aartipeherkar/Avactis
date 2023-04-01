package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class OrangeHRMTestNgAssignment1 {
	WebDriver driver;
  @Test
  public void orangeHRM() throws InterruptedException {
	  
	  WebElement username = driver.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  
	  WebElement Password = driver.findElement(By.name("password"));
	  Password.sendKeys("admin123");

	  //driver.findElement(By.name("password")).sendKeys("admin123");;

	  username.submit();
	  Thread.sleep(3000);

	 // driver.findElement(By.name("password")).clear();
    //  driver.findElement(By.name("password")).sendKeys("12345");  
	
	  String expectedPageTital = "OrangeHRM";
	  String actualPageTital =  driver.getTitle();
	  System.out.println("Actual Tital is "+ actualPageTital);
	  
 //  assertEquals(actualPageTital,expectedPageTital);
	  assertEquals(actualPageTital,expectedPageTital);
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver =new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);

  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
