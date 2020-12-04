package com.tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsSample {
	
	ExtentHtmlReporter htmlRep;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeTest
	public void startReport() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\slenium3++Training\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String reprtPath= System.getProperty("user.dir")+"/extent-reports/"+ new SimpleDateFormat("dd-mm-yyyy hh-mm-s-ms").format(new Date())+".html";
        
		htmlRep = new ExtentHtmlReporter(reprtPath);
		extent = new ExtentReports();
	    extent.attachReporter(htmlRep);
	    extent.setSystemInfo("stream", "testing");
	    extent.setSystemInfo("Location", "BDC4");
	    extent.setSystemInfo("User Name", "Khabib");
	    
	    htmlRep.config().setDocumentTitle("Sample Test Reports");
	    htmlRep.config().setReportName("Sample Test Reports");
	    htmlRep.config().setTheme(Theme.DARK);
	}
	
	@Test
	public void method1() {
		
		logger = extent.createTest("Test Method 1");
		logger.log(Status.INFO, MarkupHelper.createLabel("Running the method 1", ExtentColor.GREY));
		Assert.assertTrue(true);
	}
	
	@Test
	public void method2() {
		
		logger = extent.createTest("Test Method 2");
		logger.log(Status.INFO, MarkupHelper.createLabel("Running the method 2", ExtentColor.GREY));
		driver.get("https://www.google.com/");
		Assert.assertTrue(false);
	}
	
	@Test
	public void method3() {
		
		logger = extent.createTest("Test Method 3");
		logger.log(Status.INFO, MarkupHelper.createLabel("Running the method 3", ExtentColor.GREY));
		throw new SkipException("skipping this test!!!!!!!");
	}
	
	@AfterMethod
	public void getResults(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.SUCCESS) {
			
			logger.log(Status.PASS, MarkupHelper.createLabel("Test Passed:"+ result.getName(), ExtentColor.GREY));
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			
			logger.log(Status.SKIP, MarkupHelper.createLabel("Test Skipped:"+ result.getName(), ExtentColor.ORANGE));
		}
		
        else if(result.getStatus()==ITestResult.FAILURE) {
			
			logger.log(Status.FAIL, MarkupHelper.createLabel("Test Failed:"+ result.getName(), ExtentColor.RED));
			
			TakesScreenshot snap = (TakesScreenshot) driver;
			File src = snap.getScreenshotAs(OutputType.FILE);
			String imagepath = System.getProperty("user.dir")+"/extent-reports/snapshots_"+result.getName()+".png"; FileUtils.copyFile(src, new File(imagepath));
			
			logger.addScreenCaptureFromPath(imagepath, result.getName());
		}
	}
	
	@AfterTest
	public void endReport() {
		
		driver.quit();
		extent.flush();
	}

}
