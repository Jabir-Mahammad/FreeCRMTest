package TestNG_Demo.conditions;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	@Test(invocationCount=5)
	public void Iterations()
	{
		System.out.println("Good Day");
	}
}
