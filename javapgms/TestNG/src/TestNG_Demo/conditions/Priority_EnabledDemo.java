package TestNG_Demo.conditions;

import org.testng.annotations.Test;

public class Priority_EnabledDemo {
	@Test(priority=2)
	public void createUser()
	{
		System.out.println("User created successful");
	}
	
	@Test(priority=0, enabled=false)
	public void modifyUser()
	{
		System.out.println("User modified successful");
	}
	
	@Test(priority=1)
	public void deleteUser()
	{
		System.out.println("User deleted successful");
	}
}
