package TestNG_Demo.conditions;

import org.testng.annotations.Test;

public class TimeoutTest {

	@Test(timeOut=2000)
	public void TimeTakenToRun()
	{
		try {
			Thread.sleep(3000);
			System.out.println("Script executed & passed");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
