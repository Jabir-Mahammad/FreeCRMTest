package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentOnMethods {
	
	@Test
	public void signIn() {
		
		System.out.println("Performing SigIn");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods= {"signIn"})
	public void login() {
		
		System.out.println("Performing login");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout() {
		
		System.out.println("Performing logout");
		
	}

}
