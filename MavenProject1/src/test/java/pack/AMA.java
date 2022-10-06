package pack;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AMA 
{
	public WebDriver driver;

  @Test
  public void f()
  {
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Babu");
	 driver.findElement(By.id("nav-search-submit-button")).click();
  }
  @BeforeMethod
  @Parameters("browser")

  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://www.amazon.in");
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
