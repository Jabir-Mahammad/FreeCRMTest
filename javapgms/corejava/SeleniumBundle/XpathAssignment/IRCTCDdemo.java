package XpathAssignment;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCDdemo {

	public static void main(String[] args) {
		findTrains();

	}

	static void findTrains()
	{
		ChromeDriver ch = null;
		Robot robot = null;
		String xpath = null;
		try
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
 		    ch = new ChromeDriver();
 		    robot = new Robot();
 		   ch.manage().window().maximize();
 		    ch.get("https://www.irctc.co.in");
 		    Thread.sleep(7000);
 		   
 		  //choose from location
 		 xpath = "//input[@placeholder='From*']";
 		 ch.findElement(By.xpath(xpath)).click();
 		ch.findElement(By.xpath(xpath)).sendKeys("Bengaluru");
 		Thread.sleep(2000);
 		xpath="//div/ul/li[3]/span";
 		ch.findElement(By.xpath(xpath)).click();
 		
 		 //choose To location
		 xpath = "//input[@placeholder='To*']";
		 ch.findElement(By.xpath(xpath)).click();
		ch.findElement(By.xpath(xpath)).sendKeys("hyderabad");
		Thread.sleep(4000);
		xpath="//div/ul/li/span";
		ch.findElement(By.xpath(xpath)).click();
		
		//choose date 
		xpath= "//input[@placeholder='Journey Date(dd-mm-yyyy)*']";
		ch.findElement(By.xpath(xpath)).click();
		Thread.sleep(1000);
		xpath = "//table/tbody/tr[2]/td[5]";
		ch.findElement(By.xpath(xpath)).click();
		
		//type of train
		xpath="//*[@id='journeyClass']/div/div[3]";
		ch.findElement(By.xpath(xpath)).click();
		Thread.sleep(1000);
		xpath="//ul/li[6]/span";
		ch.findElement(By.xpath(xpath)).click();
		
		//search button
		xpath="//button[@class='search_btn']";
		ch.findElement(By.xpath(xpath)).click();
		
		
 		   
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			ch = null;
			 robot = null;
		    xpath = null;
		}
	}
}
