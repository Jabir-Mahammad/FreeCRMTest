package fixRunOrder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecutionSequence {
	@Test
	public void display4()
	{
		System.out.println("display4 testScript");
	}
	
	@Test
	public void display1()
	{
		System.out.println("display1 testScript");
	}
	
	@Test
	public void display3()
	{
		System.out.println("display3 testScript");
	}
	
	@Test
	public void display5()
	{
		System.out.println("display5 testScript");
	}
	
}
