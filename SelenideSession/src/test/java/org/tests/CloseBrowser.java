package org.tests;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

public class CloseBrowser
{
	@Test
	public void closeBrowserTest() throws Exception
	{
		
		open(" ");//parent window--0
		
		Configuration.startMaximized=true;
		
		System.out.println(title());
		
		$(By.xpath("//li[@class='youtube']")).click();//child---1
		
//		switchTo().window(1);
//		
//		System.out.println(title());
//		
//		Thread.sleep(2000);
//		
//		closeWindow();
//		
//		switchTo().window(0);
//		
//		System.out.println(title());
//		
	Thread.sleep(2000);
		
		closeWebDriver();
		
		
	}

}
