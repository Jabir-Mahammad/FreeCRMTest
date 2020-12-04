package users;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class UserMethods {
	@Test
	public void createUser()
	{
		System.out.println("User created successful");
	}
	
	@Test
	public void modifyUser()
	{
		System.out.println("User modified successful");
	}
	
	@Ignore
	@Test
	public void deleteUser()
	{
		System.out.println("User deleted successful");
	}
	
	
	@Before
	public void beforeDemo()
	{
		System.out.println("User's @Before Example");
	}
	
	@After
	public void afterDemo()
	{
		System.out.println("User's @After Example");
	}
	
	@BeforeClass
	public static void beforeClassDemo()
	{
		System.out.println("User's @BeforeClass Example");
	}
	
	@AfterClass
	public static void afterClassDemo()
	{
		System.out.println("User's @AfterClass Example");
	}
}
