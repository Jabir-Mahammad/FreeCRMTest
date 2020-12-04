package TestNG_Demo.conditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	@Test
	public void loginToActiTime1()
	{
		WebDriver oBrowser = null;
		try {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
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
	
	
	@Test
	public void loginToActiTime2()
	{
		WebDriver oBrowser = null;
		try {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Library\\drivers\\IEDriverServer.exe");
			oBrowser = new InternetExplorerDriver();
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
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
	
	
	@Test
	public void loginToActiTime3()
	{
		WebDriver oBrowser = null;
		try {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
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
