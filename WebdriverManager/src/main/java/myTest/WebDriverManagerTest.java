package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	WebDriver driver;
	@BeforeMethod
	void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	void googleTitle(){
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
}
