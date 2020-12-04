package TestNG_Demo.conditions;

import org.testng.annotations.Test;

public class AlwaysRunDemo {

	@Test(timeOut=2000)
	public void loginToApp()
	{
		try {
			Thread.sleep(3000);
			System.out.println("Login is successful");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test(dependsOnMethods="loginToApp", alwaysRun=true)
	public void createAccount()
	{
		System.out.println("Account created successful");
	}
}
