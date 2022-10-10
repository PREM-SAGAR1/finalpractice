package pageObjectModel;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM 

{
	WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod()
	  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		
	  }

  @Test
  public void f() 
  {
	  LoginPage  page = new LoginPage(driver);
	  page.login();
	  Assert.assertEquals(page.verifyErrorMessage(),"Authentication failed.");
	  
  }
 
  @AfterMethod
  public void afterMethod()
  {
	  
  }

}
