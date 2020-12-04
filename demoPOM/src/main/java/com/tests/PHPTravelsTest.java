package com.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.utility.DriverUtility;

public class PHPTravelsTest {
	
	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;
	
	
	//selenium Grid execution
	@Parameters({"node", "browser"})
	@BeforeTest
	public void openTheApplication(String browser, String node) throws MalformedURLException {
		
		//driver = DriverUtility.initializeDriver("chrome");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		dc.setPlatform(Platform.ANY);
		
		driver = new RemoteWebDriver(new URL(node), dc);
		
		
		lp=PageFactory.initElements(driver, LoginPage.class);
		dp=PageFactory.initElements(driver, DashboardPage.class);
	}
	
	@AfterTest
	public void closeTheBrowser() {
		
		driver.quit();
	}
	
	@Test(priority=0)
	public void validateAdminTest() throws InterruptedException {
		
		lp.get();
		lp.loginAsAdmin("admin@phptravels.com", "demoadmin");
		Thread.sleep(1000);
		Assert.assertEquals(dp.getPageTitl(), "Dashboard");
		dp.LogoutAsAdmin();
		Thread.sleep(1000);
		Assert.assertEquals(lp.getPageTitle(), "Administator Login");
		
		
	}
}
