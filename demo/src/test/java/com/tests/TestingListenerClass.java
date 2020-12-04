package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestingListenerClass {
	
	@Listeners(com.tests.TestListener.class)
	public class TestClass001 {
		
		@Test
		public void Login1() {
			System.out.println("Made Passed");
			Assert.assertTrue(true);
		}
		
		@Test
		public void Login2() {
			System.out.println("Made Failed");
			Assert.assertTrue(false);
		}
		
		@Test
		public void Login3() {
			throw new SkipException("Made skipped");
		}
	}

}
