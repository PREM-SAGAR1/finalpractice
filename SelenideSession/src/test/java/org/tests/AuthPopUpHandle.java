package org.tests;
import static com.codeborne.selenide.Selenide.*;

import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;


public class AuthPopUpHandle
{
	@Test

	public void authPopTest() throws Exception
	{
		//open("https://the-internet.herokuapp.com/basic_auth");
	
		//open("https://the-internet.herokuapp.com/basic_auth", 
//				"","admin","admin");

		Configuration.browser="firefox";
		
		//System.setProperty("selenide.browser","firefox");
		open(new URL("https://the-internet.herokuapp.com/basic_auth"),"", "admin","admin");
		
		Thread.sleep(3000);
		String text =$(By.cssSelector("div.example")).getText();
	
		System.out.println(text);
	Assert.assertTrue(text.contains("Congratulations"));
	
	}

}
