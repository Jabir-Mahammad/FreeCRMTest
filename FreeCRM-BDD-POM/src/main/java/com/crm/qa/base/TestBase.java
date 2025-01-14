package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.cr.qa.util.TestUtil;
import com.cr.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	//WebDriver Fire Event classes
	public static EventFiringWebDriver eventfiringDriver;
	public static WebEventListener webEventListener;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Automation_Lab\\FreeCRMTest\\src\\main\\java\\com\\crm\\"
					+ "qa\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Automation_Lab\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Automation_Lab\\drivers\\geckodriver");
			driver = new ChromeDriver();
		}
			
		//creating webdriver fire evnt objects
		eventfiringDriver = new EventFiringWebDriver(driver);
		webEventListener = new WebEventListener();
		eventfiringDriver.register(webEventListener);
		driver =  eventfiringDriver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	

}
