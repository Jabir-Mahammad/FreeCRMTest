package com.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		
		System.out.println(result.getName()+" test case is staarted");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Name of the test case passed: "+ result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		System.out.println(result.getName()+" is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println();
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
