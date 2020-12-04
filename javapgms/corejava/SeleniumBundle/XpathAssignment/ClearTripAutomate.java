package XpathAssignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAutomate {

	public static void main(String[] args) {
		clearTripflight();

	}

	static void clearTripflight()
	{
		WebDriver ch = null;
	    String xpath=null;
	    Robot robot=null;
	    Select dropdown = null;
		try
		{
			
			
			  //handle push notifications
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
		    ch = new ChromeDriver(options);
		    robot = new Rob
		    		ot();
		    
		    ch.get("https://www.cleartrip.com");
		    Thread.sleep(4000);
		   
		String str11 = ch.getTitle();
		System.out.println(str11);
		    
		   ch.manage().window().maximize();
		   Thread.sleep(3000);
		 
		   xpath="//input[@id='RoundTrip']";
		    ch.findElement(By.xpath(xpath)).click();
		    Thread.sleep(2000);
		    
		    //choose boarding location
		    xpath="//input[@id='FromTag']";
		    ch.findElement(By.xpath(xpath)).sendKeys("Bangalore");
		    Thread.sleep(4000);
	        //press keyboard ENTER botton
		     robot.keyPress(KeyEvent.VK_ENTER);
		     
		    
		    //choose deboarding  location
		    xpath="//input[@id='ToTag']";
		    ch.findElement(By.xpath(xpath)).sendKeys("Delhi");
		    Thread.sleep(4000);
	
		    //press keyboard ENTER botton
		    robot.keyPress(KeyEvent.VK_ENTER);
		    Thread.sleep(2000);
		    
		    
		    //enter boarding date (6/12/2018)
		    xpath="//table/following::tbody/tr[2]/td[4]/a";
		    ch.findElement(By.xpath(xpath)).click();
		    Thread.sleep(2000);
		    
		   //Enter deboarding date (12/02/2019)
		    xpath="//div[@class='monthBlock last']/div/a";
		    ch.findElement(By.xpath(xpath)).click();
		    Thread.sleep(1000);
		    xpath="//div[@class='monthBlock last']/table/tbody/tr[3]/td[2]";
		    ch.findElement(By.xpath(xpath)).click();
		    Thread.sleep(2000);
		    
		    //selecting number Adults in a trip
		    dropdown = new Select(ch.findElement(By.id("Adults")));
		    dropdown.selectByVisibleText("4");
            //dropdown.selectByIndex(1);
		    Thread.sleep(2000);
		    
		    //selecting number Childrens in a trip
		    dropdown = new Select(ch.findElement(By.id("Childrens")));
		    dropdown.selectByIndex(2);
		   // dropdown.selectByVisibleText("2");
		    Thread.sleep(2000);
            
		    
		    //selecting number Infants in a trip
		    dropdown = new Select(ch.findElement(By.id("Infants")));
		    dropdown.selectByIndex(1);
		   // dropdown.selectByVisibleText("2");
		    Thread.sleep(2000);
		    
		    
		    //click on More Options
		    xpath="//div[@id='MoreOptionsDiv']/p/a";
		    ch.findElement(By.xpath(xpath)).click();
		    Thread.sleep(2000);
		    //click on type of Travel(Premium Economy)
		    xpath="//section[@class='row advanceOptions']/div/dl/dd/select";
		    ch.findElement(By.xpath(xpath)).click();
		    Thread.sleep(1000);
		    dropdown = new Select(ch.findElement(By.id("Class")));
		    dropdown.selectByIndex(3);
		    Thread.sleep(3000);
		    //Preferred Airline
		    xpath="//div[@class='col col11']/dl/dd/span[@class='span span24 clearField']/input";
		    ch.findElement(By.xpath(xpath)).click();
		    ch.findElement(By.xpath(xpath)).sendKeys("Air India");
		    Thread.sleep(4000);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    
		    
		    
		    //enter search
		    xpath = "//div[@class='searchBtnContainer']/input[@id='SearchBtn']";
		   ch.findElement(By.xpath(xpath)).click();
		   Thread.sleep(6000);
		   
		   
		/*  Check for no flight 
		 * xpath="//div[@class='messageScreen']/div/h2";
		  String txt = ch.findElement(By.xpath(xpath)).getText();
		  if(txt.contains("Sorry, there aren't any flights available for your search"))
			  System.out.println(txt);
		  else
			  System.out.println("choose your flight");
		  
		  Thread.sleep(2000);*/
		   
		  ch.close();
		  
		}catch(Exception e )
		{
			
           System.out.println(e);
		
		}finally
		{
			ch = null;
			xpath=null;
			robot=null;
			dropdown = null;
		}
	}
}
