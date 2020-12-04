 

package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

//using: webdriver.firefox.marionette
//for new version of firefox we can use  webdriver.gecko.driver
public class FirfoxDemo {

	public static void main(String[] args) {
		//FirefoxDemo1();
		FirefoxDemo2();
	}
	
	
	//this method only works for oleder version of Firefox, using "webdriver.firefox.marionette"
	static void FirefoxDemo1()

	{
		FirefoxDriver ch = null;
		try {
			System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\geckodriver.exe");
	        ch = new FirefoxDriver();
	        ch.manage().window().maximize();
	        ch.get("http://localhost/login.do");
	       Thread.sleep(2000);
	       
	      ch.findElement(By.name("username")).sendKeys("admin");
	      ch.findElement(By.name("pwd")).sendKeys("manager");
	   
	     ch.findElement(By.id("keepLoggedInLabel")).click();
	       ch.findElement(By.id("loginButton")).click();
	    Thread.sleep(4000);
	     ch.findElement(By.id("logoutLink")).click();
	   //  ch.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

		finally {
			ch=null;
		}
	}
	
	static void FirefoxDemo2()

	{
		FirefoxDriver ch = null;
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\geckodriver.exe");
	        ch = new FirefoxDriver();
	        ch.manage().window().maximize();
	        ch.get("http://localhost/login.do");
	       Thread.sleep(2000);
	       
	      ch.findElement(By.name("username")).sendKeys("admin");
	      ch.findElement(By.name("pwd")).sendKeys("manager");
	   
	     ch.findElement(By.id("keepLoggedInLabel")).click();
	       ch.findElement(By.id("loginButton")).click();
	    Thread.sleep(4000);
	     ch.findElement(By.id("logoutLink")).click();
	   //  ch.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

		finally {
			ch=null;
		}
	}
}
