package testScript;

import org.openqa.selenium.WebDriver;

import driver.DriverScripts;
public class TestScript extends DriverScripts{
           
	/**********************************************
	 * Test cript : TC_SearchFlight()
	 * 
	 * 
	 **********************************************/
	
	
	public boolean TC_SearchFlight()
	{
		WebDriver odriver = null;
		String strResult = null;
		
		try
		{
			String browserName = appInd.getPropData("BROWSER");
			odriver = appDep.launchApp(browserName);
			
			if(odriver!=null)
			{
				appInd.writeReport("pass", "Browser launched successfully");
				strResult+=String.valueOf(appDep.navigateURL(odriver));
				strResult+=String.valueOf(appDep.seachFlight(odriver));
				//strResult+=String.valueOf(appDep.closeBrowser(odriver)); 
			}
			else
			{
				appInd.writeReport("Fail", "Failed to launch the driver");
				return false;
			}
			
		
			if(strResult.contains("false"))
			{
				appInd.writeReport("Fail", "Test cases failed");
				return false;
			}else
			{
				appInd.writeReport("Pass", "TestScript TC_URL_Navigation is Passed");
				return true;
			}
			
		}catch(Exception e)
		{
			return false;
		}
		finally
		{
			odriver = null;
		}
	}
	
	
	
	

}
