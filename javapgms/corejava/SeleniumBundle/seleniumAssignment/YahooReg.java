package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooReg {

	public static void main(String[] args) {
		
		yahooReg();
	}
	static void yahooReg()

	{
		ChromeDriver ch = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
	        ch = new ChromeDriver();
	        ch.manage().window().maximize();
	        ch.get("https://www.google.com/");
	       Thread.sleep(2000);
	   
	       ch.findElement(By.name("q")).sendKeys("yahoo registration");
	      Thread.sleep(2000);
	      ch.findElement(By.name("btnK")).click();
	      Thread.sleep(2000);
	      ch.findElement(By.className("LC20lb")).click();
	      Thread.sleep(3000);
	      ch.findElement(By.id("usernamereg-firstName")).sendKeys("Jabir");
	      ch.findElement(By.id("usernamereg-lastName")).sendKeys("mahammad");
	      ch.findElement(By.id("usernamereg-yid")).sendKeys("mahammad@yahoo.com");
	      ch.findElement(By.id("usernamereg-password")).sendKeys("123456");
	      ch.findElement(By.id("usernamereg-phone")).sendKeys("7259418407");
	     // ch.findElement(By.id("usernamereg-month")).sendKeys("may");
	      ch.findElement(By.id("usernamereg-day")).sendKeys("22");
	      ch.findElement(By.id("usernamereg-year")).sendKeys("1996");
	      ch.findElement(By.id("usernamereg-freeformGender")).sendKeys("Male");
	      
		}catch(Exception e)
		{
			System.out.println(e);
		}

		finally {
			ch=null;
		}
	}
}
