package methods;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testScript.TestScript;


public class AppIndependentmethods extends TestScript{
	/**************************************
	 * Method Name	: writeReport
	 * 
	 * 
	 ***************************************/
	public void writeReport(String strStatus, String strMessage)
	{
		Logger log = null;
		try {
			log = Logger.getLogger("Reporting");
			
			switch(strStatus.toLowerCase())
			{
				case "pass":
					log.info(strMessage);
					break;
				case "fail":
					log.error(strMessage);
					break;
				case "exception":
					log.fatal(strMessage);
					break;
				case "#":
					log.info(strMessage);
					break;
				default:
					System.out.println("Invalid status '"+strStatus+"' for writing results");
			}
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'writeReport' method. "+e.getMessage());
		}
		finally {
			log = null;
		}
	}
	
	
	/**************************************
	 * Method Name	: clickObject
	 * 
	 * 
	 ***************************************/
	public boolean clickObject(WebDriver oDriver, By objBy)
	{
		WebElement oEle = null;
		try {
			oEle = oDriver.findElement(objBy);
			if(oEle.isDisplayed())
			{
				oEle.click();
				appInd.writeReport("Pass", "The element '"+String.valueOf(objBy)+"' was clicked successful");
				return true;
			}else {
				appInd.writeReport("Fail", "The element '"+String.valueOf(objBy)+"' was unable to find");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'clickObject' method. "+e.getMessage());
			return false;
		}
		finally {
			oEle = null;
		}
	}
	
	
	
	/**************************************
	 * Method Name	: setObject
	 * 
	 * 
	 ***************************************/
	public boolean setObject(WebDriver oDriver, By objBy, String strData)
	{
		WebElement oEle = null;
		try {
			oEle = oDriver.findElement(objBy);
			if(oEle.isDisplayed())
			{
				oEle.sendKeys(strData);
				appInd.writeReport("Pass", "The data '"+strData+"' was entered in the element '"+String.valueOf(objBy)+"' successful");
				return true;
			}else {
				appInd.writeReport("Fail", "Failed to enter the data '"+strData+"' in the element '"+String.valueOf(objBy)+"'");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'setObject' method. "+e.getMessage());
			return false;
		}finally {
			oEle = null;
		}
	}
	
	
	
	/**************************************
	 * Method Name	: verifyText
	 * 
	 * 
	 ***************************************/
	public boolean verifyText(WebDriver oDriver, By objBy, String strType, String strExpected)
	{
		WebElement oEle = null;
		String strActual = null;
		Select oSel = null;
		try
		{
			oEle = oDriver.findElement(objBy);
			if(oEle.isDisplayed())
			{
				switch(strType.toLowerCase())
				{
					case "text":
						strActual = oEle.getText();
						break;
					case "value":
						strActual = oEle.getAttribute("value");
						break;
					case "list":
						oSel = new Select(oEle);
						strActual = oSel.getFirstSelectedOption().getText();
						break;
					default:
						appInd.writeReport("Fail", "Invalid object type '"+strType+"' was specified");
				}
				
				if(strActual.equals(strExpected))
				{
					appInd.writeReport("Pass", "Both actual: '"+strActual+"' & expected: '"+strExpected+"' are same");
					return true;
				}else {
					appInd.writeReport("Fail", "Both actual: '"+strActual+"' & expected: '"+strExpected+"' are NOT matching");
					return false;
				}
			}else {
				appInd.writeReport("Fail", "Failed to read the '"+strType+"' from the element '"+String.valueOf(objBy)+"'");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'setObject' method. "+e.getMessage());
			return false;
		}finally {
			oEle = null;
		}
	}
}
