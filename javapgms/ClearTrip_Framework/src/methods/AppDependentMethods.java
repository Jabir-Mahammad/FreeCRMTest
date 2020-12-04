package methods;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import driver.DriverScripts;

public class AppDependentMethods extends DriverScripts {

	
	/*************************************
	 * Method Name		: launchApp()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public WebDriver launchApp(String strBrowser)
	{
		WebDriver oDriver = null;
		try {
			switch(strBrowser.toLowerCase())
			{
				case "chrome":
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\library\\driver\\chromedriver.exe");
					oDriver = new ChromeDriver();
					break;
				case "ie":
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\library\\driver\\IEDriverServer.exe");
					oDriver = new InternetExplorerDriver();
					break;
				case "ff":
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\library\\driver\\geckodriver.exe");
					oDriver = new FirefoxDriver();
					break;
				default:
					appInd.writeReport("Fail", "Invalid browser name '"+strBrowser+"'");
			}
			
			if(oDriver!=null)
			{
				oDriver.manage().window().maximize();
				return oDriver;
			}else {
				return null;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'launchApp' method. "+e.getMessage());
			return null;
		}
	}
	
	
	/*************************************
	 * Method Name		: navigateURL()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean navigateURL(WebDriver oDriver)
	{
		try {
			String url= appInd.getPropData("URL");
			oDriver.navigate().to(url);
			Thread.sleep(2000);
			String strTitle ="#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.";
			if(oDriver.getTitle().equals(strTitle))
			{
				appInd.writeReport("Pass", "URL is navigate successful");
				return true;
			}
			else {
				appInd.writeReport("Fail", "Failed to navigate the URL");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'navigateURL' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	/*************************************
	 * Method Name		: seachFlight()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean seachFlight(WebDriver oDriver)
	{
		String strResult = null;
		String validate= null;

		try
		{
			strResult+=String.valueOf(appInd.clickObject(oDriver, "trip_Mode"));
			
			//getting FROM and TO loc from excel
			String strFrom = appInd.getCellData("searchData", "From_Loc", 1);
			String strTo = appInd.getCellData("searchData", "To_Loc", 1);
			
			//Enter FROM Location
			strResult+=String.valueOf(appInd.setObject(oDriver, "FromLoc", strFrom));
			Thread.sleep(4000);
			strResult+=String.valueOf(appInd.setObject(oDriver, "FromLoc", Keys.ARROW_DOWN));
			strResult+=String.valueOf(appInd.setObject(oDriver, "FromLoc", Keys.ENTER));
			
			
			//Enter TO Location
			strResult+=String.valueOf(appInd.setObject(oDriver, "ToLoc", strTo)); 
			Thread.sleep(4000);
		    strResult+=String.valueOf(appInd.setObject(oDriver, "ToLoc", Keys.ARROW_DOWN));
			strResult+=String.valueOf(appInd.setObject(oDriver, "ToLoc", Keys.ENTER));
		    
			//enter boarding date
			strResult+=String.valueOf(appInd.clickObject(oDriver, "BoardingDate"));
			Thread.sleep(2000);
			//enter deboaring date
			strResult+=String.valueOf(appInd.clickObject(oDriver, "DeBoardingDate1"));
			strResult+=String.valueOf(appInd.clickObject(oDriver, "DeBoardingDate2"));
			
			
			 //selecting number of Adults in a trip
			strResult+=String.valueOf(appInd.selectDropDownValue(oDriver, By.id("Adults"), 2));
			Thread.sleep(2000);
		    
		    //selecting number Childrens in a trip
			strResult+=String.valueOf(appInd.selectDropDownValue(oDriver, By.id("Childrens"), 1));
			Thread.sleep(2000);
			
             //selecting number Infants in a trip
			strResult+=String.valueOf(appInd.selectDropDownValue(oDriver, By.id("Infants"), 1));
		    Thread.sleep(3000);
		    
		  //click on More Options
		    strResult+=String.valueOf(appInd.clickObject(oDriver, "MoreEvents"));
		    
		    
		    //click on type of Travel(Premium Economy)
		    strResult+=String.valueOf(appInd.clickObject(oDriver, "PrefAirLine"));
		    Thread.sleep(1000);
		    strResult+=String.valueOf(appInd.selectDropDownValue(oDriver, By.id("Class"), 0));
		    Thread.sleep(2000);
		   
		    //Preferred Airline
		    strResult+=String.valueOf(appInd.clickObject(oDriver, "PrefAirLine"));
		    String xpath = "//div[@class='col col11']/dl/dd/span[@class='span span24 clearField']/input";
		    strResult+=String.valueOf(appInd.setObject(oDriver, By.xpath(xpath), "Air India"));
		    Thread.sleep(4000);
		    oDriver.findElement(By.xpath(xpath)).sendKeys(Keys.ARROW_DOWN);
		    oDriver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
		    Thread.sleep(2000);
		    
		    //enter search
		    strResult+=String.valueOf(appInd.clickObject(oDriver, "SearchBtn"));
		   Thread.sleep(5000);
		   
		   //verify whether text is there or not
		   
		   xpath = "//div[@class='warningMessage']/h2";
		   validate+=String.valueOf(appInd.verifyText(oDriver, By.xpath(xpath), "Text", "Sorry, there aren't any flights available for your search"));
		   if(validate.contains("false"))
			   appInd.writeReport("#", "Sorryy..!! no flights of your choice");
		   else
			   appInd.writeReport("#", "Yeah..!! Choose your flight");
		   
		   
		     if(strResult.contains("false"))
			{
				appInd.writeReport("fail", "Test cases are failed");
				return false;
			}else
			{
				appInd.writeReport("pass", "Test cases are passed");
				return true;
			}

		}catch(Exception e)
		{
			appInd.writeReport("exception", "exception while executing 'seachFlight' method "+e.getMessage());
			return false;
		}
		finally
		{
			oDriver = null;
		}
	}
	

	
	/*************************************
	 * Method Name		: elementPresent()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean elementPresent(WebDriver oDriver, By objBy)
	{
		try {
			oDriver.findElement(objBy);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	
	
	/*************************************
	 * Method Name		: elementPresent()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean elementPresent(WebDriver oDriver, String strObjectName)
	{
		try {
			appInd.createAndGetObject(oDriver, strObjectName);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}



/*************************************
 * Method Name		: closeBrowser()
 * Author			:
 * Date Creation	:
 * Purpose			:
 * Reviewer			:
 *************************************/
public boolean closeBrowser(WebDriver oDriver)
{
	try {
		oDriver.close();
		
		return true;
	}catch(Exception e)
	{
		appInd.writeReport("Exception", "Exception while executing 'closeBrowser' method. "+e.getMessage());
		return false;
	}
	finally {
		oDriver = null;
	}
}
	
}
	
	

