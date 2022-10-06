package org.tests;

import javax.management.openmbean.OpenDataException;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

public class LaunchBrowser
{
	@Test
	public void launchBrowserTest()
	{
		
		Configuration.browser="chrome";
		Configuration.headless=false;
		Configuration.baseUrl="https://www.google.com";
		//Configuration.browserBinary="D:\\Sep2022\\Drivers\\chromedriver.exe";
		Configuration.startMaximized=true;
		//System.setProperty("selenide.browserBinary","D:\\Sep2022\\Drivers\\chromedriver.exe");
		//System.setProperty("selenide.browser", "chrome");
		//mvn clean install -Dselenide.browser="firefox"---for jenkins
		
		Configuration.screenshots =false;
		open("/");
		$(By.name("q1")).setValue("Naveen Automation");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String header = $(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']")).getText();
	   System.out.println(header);
		Assert.assertEquals(header,"Welcome to Naveen AutomationLabs - naveen automationlabs");
	}

}
