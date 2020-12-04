package extentReportSS;

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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ReporterType;

public class ExtentReportss {

	public static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;
	ITestResult listn;
	
	
	@BeforeTest
	 void setExtent() {
		
		extent  = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html");
		extent.addSystemInfo("Host", "Windows");
		extent.addSystemInfo("User Name", "Jabir");
		
		
		
	}
	
	@AfterTest
	void endExtent() { 
		extent.flush();
		extent.close();
	}
	
	
	@BeforeMethod
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Lab\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/"); 
	}
	
	@Test
	void titleTest() throws IOException {
		extentTest=extent.startTest("title test");
		String title =driver.getTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		extentTest.log(LogStatus.PASS, "Passed");
		extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(ExtentReportss.takeScreenshotAtEndOfTest(driver, "passed")));
		
	}
	
	@Test
	void test2() {
		extentTest=extent.startTest("test2");
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	void tearDown(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Tes case is failed"+result.getName());
			extentTest.log(LogStatus.FAIL, "Tes case is failed"+result.getThrowable());
			String srnshtPath = ExtentReportss.takeScreenshotAtEndOfTest(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(srnshtPath));
			
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Tes case is skipped"+result.getName());
		}
		
		extent.endTest(extentTest); 
		driver.quit();
	}
	
	public static String takeScreenshotAtEndOfTest(WebDriver driver, String name) throws IOException {
		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String destPath= System.getProperty("user.dir")+"/exceptionSS/"+System.currentTimeMillis()+".png";
		String destPath = System.getProperty("user.dir")+"/exceptionSS/screenshots/"+name+dateName+".png";
		File destination = new File(destPath);
		FileUtils.copyFile(srcFile, destination);
		return destPath;
	}
	
	
	
	
	
	
}
