package TestNG_Demo.conditions;

import org.testng.annotations.Test;

public class GroupsDemo {
	@Test(groups="CAR")
	public void Car1()
	{
		System.out.println("Car1 script");
	}
	
	@Test(groups="CAR")
	public void Car2()
	{
		System.out.println("Car2 script");
	}
	
	@Test(groups="CAR")
	public void Car3()
	{
		System.out.println("Car3 script");
	}
	
	@Test(groups="SCOOTER")
	public void Scooter1()
	{
		System.out.println("Scooter1 script");
	}
	
	@Test(groups="SCOOTER")
	public void Scooter2()
	{
		System.out.println("Scooter2 script");
	}
	
	@Test(groups= {"CAR","SCOOTER"})
	public void BMW()
	{
		System.out.println("BMW belongs to both groups");
	}
}
