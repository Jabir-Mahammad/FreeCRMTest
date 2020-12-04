package seleniumAssignment;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MSN {

	public static void main(String args[])
	{
		WebDriver odriver = null;
		 JavascriptExecutor js = null;
		 WebElement Element=null;
		
		 
		try
		{
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			odriver = new ChromeDriver();
			Actions act = new Actions(odriver);
			 js = (JavascriptExecutor) odriver;
			odriver.manage().window().maximize();
			odriver.navigate().to("https://www.msn.com/en-in/");
			Thread.sleep(4000);
			
    /***********************scrolling webpage using javaScript*********************************
			//Find element by link text and store in variable "Element"       		
	        Element = odriver.findElement(By.xpath("//li[@id='fbcount']"));
            //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        Thread.sleep(12000);
   *******************************************************************************************/
	        
   /***********************Scrolling webpage using ACTION class********************************/
		    Element = odriver.findElement(By.xpath("//li[@id='fbcount']"));
		    Thread.sleep(2000);
	        act.moveToElement(Element);
	        act.build().perform();
	        Thread.sleep(10000);
   /*******************************************************************************************/
	        
	        //switching to iframe
	        String xpath ="//iframe[contains(@src,'//www.facebook.com/plugins/like.php?')]";
	        Element = odriver.findElement(By.xpath(xpath));
	        odriver.switchTo().frame(Element);
	        Thread.sleep(2000);
	     
   /************************click on facebook button without using ACTION class***********************/
            Element = odriver.findElement(By.xpath("//*[@id='u_0_0']/div/button/div/span[2]"));
            Element.click();
            Element.click();
   /**********************************************************************************************************/
            
   /***********************use ACTION class to click on facebook button***************************************   
             act.moveToElement(Element);
             act.click(Element).perform();
             act.click(Element).perform();
    ***********************************************************************************************************/        
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			odriver = null;
		}
	}
}
