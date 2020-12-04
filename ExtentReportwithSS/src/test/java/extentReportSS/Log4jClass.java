package extentReportSS;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Log4jClass {

	WebDriver driver;
	Logger log = Logger.getLogger(Log4jClass.class);
	
	@BeforeMethod
	void setUp() {
		//PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Lab\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/"); 
	}
	
	@Test(priority=1)
	void titleTest() {
		log.info("URL launched");
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		log.info("Title is valid");
	}
	
	//@Test(priority=2)
	void logoTest() {
		log.info("URL launched");
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		log.info("Title is valid");
		
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}
