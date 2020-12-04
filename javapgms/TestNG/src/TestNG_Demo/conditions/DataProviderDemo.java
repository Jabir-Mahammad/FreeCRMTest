package TestNG_Demo.conditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider(name="data1")
	public Object[][] testData()
	{
		return new Object[][] {{"admin","manager"},{"autouser1","mercury"}};
	}
	
	@Test(dataProvider="data1")
	public void loginToActiTime(String strUN, String strPWD)
	{
		WebDriver oBrowser = null;
		try {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("username")).sendKeys(strUN);
			oBrowser.findElement(By.name("pwd")).sendKeys(strPWD);
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
			
			oBrowser.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			oBrowser = null;
		}
	}
}
