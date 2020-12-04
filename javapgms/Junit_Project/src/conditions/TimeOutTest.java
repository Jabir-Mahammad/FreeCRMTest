package conditions;

import org.junit.Test;

public class TimeOutTest {
	@Test(timeout=2000)
	public void login()
	{
		try {
			Thread.sleep(1500);
			System.out.println("Executing login test case");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
