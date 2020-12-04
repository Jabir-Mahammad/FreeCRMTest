package CssSelectorAssignment;

 import java.awt.Robot;
 import java.awt.event.KeyEvent;

 import org.openqa.selenium.By;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.Select;

 public class ClearTripDemo {

 	public static void main(String[] args) {
 		clearTripflight();

 	}

 	static void clearTripflight()
 	{
 		ChromeDriver ch = null;
 	    String cssSel=null;
 	    Robot robot=null;
 	    Select dropdown = null;
 		try
 		{
 			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
 		    ch = new ChromeDriver();
 		    robot = new Robot();
 		    
 		    ch.get("https://www.cleartrip.com");
 		    Thread.sleep(4000);
 		   
 		   ch.manage().window().maximize();
 		   Thread.sleep(3000);
 		 
 		   //choose type of trip
 		   cssSel="li label input[name='trip_type'][value='RoundTrip']";
 		    ch.findElement(By.cssSelector(cssSel)).click();
 		    Thread.sleep(2000);
 		    
 		    //choose boarding location
 		   cssSel="input[title='Any worldwide city or airport']";
 		    ch.findElement(By.cssSelector(cssSel)).sendKeys("Bangalore");
 		    Thread.sleep(4000);
 	        //press keyboard ENTER botton
 		     robot.keyPress(KeyEvent.VK_ENTER);
 		    
           
 		     //choose deboarding  location
 		    cssSel="input[title='Any worldwide city or airport'][name='destination']";
 		    ch.findElement(By.cssSelector(cssSel)).sendKeys("Delhi");
 		    Thread.sleep(4000);
 	
 		    //press keyboard ENTER botton
 		    robot.keyPress(KeyEvent.VK_ENTER);
 		    Thread.sleep(2000);
 		    
 		    
 		    //enter boarding date
 		   cssSel="table[class='calendar']>tbody> :nth-child(3) :nth-child(4)>a";
 		    ch.findElement(By.cssSelector(cssSel)).click();
 		    Thread.sleep(2000);
 		    
 		   //Enter deboarding date 
 		    cssSel="div[class='monthBlock last']> :nth-child(2)>tbody> :nth-child(2) :nth-child(4)>a";
 		    ch.findElement(By.cssSelector(cssSel)).click();
 		    Thread.sleep(1000);
 		    
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
 		    cssSel="div>p>a>strong";
 		    ch.findElement(By.cssSelector(cssSel)).click();
 		    Thread.sleep(2000);
 		    //click on type of Travel(Premium Economy)
 		    cssSel="div[id='FlClass']>dl> :nth-child(2)>select";
 		    ch.findElement(By.cssSelector(cssSel)).click();
 		    Thread.sleep(1000);
 		    dropdown = new Select(ch.findElement(By.id("Class")));
 		    dropdown.selectByIndex(3);
 		    Thread.sleep(3000);
 		    //Preferred Airline
 		    cssSel="dd>span>input[name='airline']";
 		    ch.findElement(By.cssSelector(cssSel)).click();
 		    ch.findElement(By.cssSelector(cssSel)).sendKeys("Air India");
 		    Thread.sleep(4000);
 		    robot.keyPress(KeyEvent.VK_ENTER);
 		    
 		    
 		    
 		    //enter search
 		    cssSel = "div[class='searchBtnContainer']> :nth-child(2)";
 		   ch.findElement(By.cssSelector(cssSel)).click();
 		   Thread.sleep(6000);
 		   
 		   
 		/*  Check for no flight 
 		 * xpath="//div[@class='messageScreen']/div/h2";
 		  String txt = ch.findElement(By.xpath(xpath)).getText();
 		  if(txt.contains("Sorry, there aren't any flights available for your search"))
 			  System.out.println(txt);
 		  else
 			  System.out.println("choose your flight");
 		  
 		  Thread.sleep(2000);*/
 		   
 		//  ch.close();         
 		  
 		}catch(Exception e )
 		{
 			
            System.out.println(e);
 		
 		}finally
 		{
 			ch = null;
 			cssSel=null;
 			robot=null;
 			dropdown = null;
 		}
 	}
 }


	