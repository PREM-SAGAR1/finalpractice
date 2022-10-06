
package org.tests;
import static com.codeborne.selenide.Selenide.*;

import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;

public class NavigationConcepts
{
	@Test
	
	public void navigateTest() throws Exception
	{
		open("https://www.google.com");
		System.out.println(title());
		
		Configuration.startMaximized=true;
		
		open("http://www.amazon.com");
		System.out.println(title());
		
		back();
		System.out.println(title());
		
		forward();
		System.out.println(title());
		
		back();
		System.out.println(title());
		
		Thread.sleep(5000);
		
		refresh();
		
	}

}
