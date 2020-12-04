package customers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerMethods {
	@Test
	public void createCustomer()
	{
		System.out.println("Customer created successful");
	}
	
	@Test
	public void modifyCustomer()
	{
		System.out.println("Customer modified successful");
	}
	
	@Test
	public void deleteCustomer()
	{
		System.out.println("Customer deleted successful");
	}
	
	
	@Before
	public void beforeDemo()
	{
		System.out.println("Customer's @Before Example");
	}
	
	@After
	public void afterDemo()
	{
		System.out.println("Customer's @After Example");
	}
	
	@BeforeClass
	public static void beforeClassDemo()
	{
		System.out.println("Customer's @BeforeClass Example");
	}
	
	@AfterClass
	public static void afterClassDemo()
	{
		System.out.println("Customer's @AfterClass Example");
	}
}
