package org.tests;
import static com.codeborne.selenide.Selenide.*;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.WebDriverRunner;

public class WebDriverRunnerTest
{
	@Test
	public void myTest()
	{
		open("http://automationpractice.com");
		
		WebDriverRunner.clearBrowserCache();
		System.out.println(WebDriverRunner.url());
		
		Assert.assertTrue(WebDriverRunner.url().contains("automationpractice"));
				
  System.out.println( WebDriverRunner.isChrome());	
		
   if(WebDriverRunner.isChrome())
   {
	   System.out.println("click on button");
   }
   
   WebDriverRunner.getAndCheckWebDriver();
   
   System.out.println(WebDriverRunner.supportsJavascript());
		
  List<File> fileList = WebDriverRunner.getBrowserDownloadsFolder().files();
   
   System.out.println(fileList.size());
   
		WebDriverRunner.closeWebDriver();
		
	}

}
