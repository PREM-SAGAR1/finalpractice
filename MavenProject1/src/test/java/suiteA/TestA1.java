package suiteA;

import org.testng.annotations.Test;

public class TestA1
{
	@Test
	public void f() throws Exception
	{
		System.out.println("Starting testA1");
		
		Thread.sleep(3000);
		
		System.out.println("Ending TestA1");

		
	}

}
