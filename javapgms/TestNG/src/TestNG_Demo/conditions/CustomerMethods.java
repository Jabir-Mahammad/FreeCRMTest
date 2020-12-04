package TestNG_Demo.conditions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Customer's @BeforeSuite demo");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Customer's @AfterSuite demo");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Customer's @BeforeTest demo");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Customer's @AfterTest demo");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Customer's @BeforeClass demo");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Customer's @AfterClass demo");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Customer's @BeforeMethod demo");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Customer's @AfterMethod demo");
	}
	
	@Test(groups="CAR")
	public void Car1()
	{
		System.out.println("Car1 method");
	}
	
	@Test(groups="CAR")
	public void Car2()
	{
		System.out.println("Car2 method");
	}
	
	@BeforeGroups("CAR")
	public void beforeGroups()
	{
		System.out.println("Customer's @BeforeGroups demo");
	}
	
	
	@AfterGroups("CAR")
	public void afterGroups()
	{
		System.out.println("Customer's @AfterGroups demo");
	}
}
