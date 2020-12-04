package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

	
	@Test(enabled=false)
	void test1() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=1)
	void test2() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=-1)
	void test3() {
		Assert.assertTrue(true);
	}
	
	@Test()
	void test4() {
		Assert.assertTrue(true);
	}
}
