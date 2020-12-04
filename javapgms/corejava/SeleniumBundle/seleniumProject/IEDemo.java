package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEDemo {

	public static void main(String[] args) {
	     iedriver();
		
	}

	static void iedriver()

	{
		InternetExplorerDriver ch = null;
		try {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\IEDriverServer.exe");
	        ch = new InternetExplorerDriver();
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
	     
	     /*for some IE versions
	     Robot rb = new Robot();
	     robot.keyPress(keyEvent.VK_ENTER);
	     Thread.sleep(2000);
	     robot.keyRelease(keyEvent.VK_ENTER)*/	
	     
	     	}catch(Exception e)
		{
			System.out.println(e);
		}

		finally {
			ch=null;
		}
	}
	

}
