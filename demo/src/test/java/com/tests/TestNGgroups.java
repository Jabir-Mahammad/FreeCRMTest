package com.tests;

import org.testng.annotations.Test;

public class TestNGgroups {

	
	@Test(groups="Smoke")
	public void metod1() {
		
		System.out.println("Method1: Smoke Test");
	}
	
	@Test(groups="Smoke")
	public void metod2() {
		
		System.out.println("Method1: Smoke Test");
	}
	
	@Test(groups="Regression")
	public void metod3() {
		
		System.out.println("Method1: Smoke Test");
	}
	
	@Test(groups="Regression")
	public void metod4() {
		
		System.out.println("Method1: Smoke Test");
	}
	
	@Test(groups= {"Smoke", "Regression"})
	public void metod5() {
		
		System.out.println("Method1: Smoke Test");
	}
	
}
