package switches;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow1 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		WebDriver driver = new  ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com");
		
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		System.out.println(driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		while(!(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@alt='iwish'])[3]")))).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='slick-next slick-arrow']")).click();
			
		}
		driver.findElement(By.xpath("(//img[@alt='iwish'])[3]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		List<String> iwinds = new ArrayList<String>(windows);
		
		for(String i:iwinds)
		{
			System.out.println(i);
		}
		System.out.println(driver.getTitle()+"--->"+driver.getWindowHandle());
		
		driver.switchTo().window(iwinds.get(1));
        
		System.out.println(driver.getTitle()+"--->"+driver.getWindowHandle());

	}

}
