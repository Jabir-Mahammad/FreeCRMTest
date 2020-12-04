package testScript;

import org.openqa.selenium.WebDriver;

import driver.DriverScripts;
import net.bytebuddy.implementation.bytecode.Addition;

public class TestScript extends DriverScripts{
           
	/**********************************************
	 * Test cript : TC_Login_Logout()
	 * 
	 * 
	 **********************************************/
	
	
	public boolean TC_Login_Logout()
	{
		WebDriver odriver = null;
		String strResult = null;
		
		try
		{
			String browserName = appInd.getPropData("BROWSER");
			odriver = appDep.launchApp(browserName);
			
			if(odriver!=null)
			{
				strResult+=String.valueOf(appDep.navigateURL(odriver));
				strResult+=String.valueOf(appDep.loginToApp(odriver));
				strResult+=String.valueOf(appDep.logoutFromApp(odriver));
				strResult+=String.valueOf(appDep.closeBrowser(odriver)); 
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
				appInd.writeReport("Pass", "Test cases are Passed");
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
	
	
	
	
	/**********************************************
	 * Test cript : createAndDeleteUser()
	 * 
	 * 
	 **********************************************/
	
	public boolean createAndDeleteUser()
	{
		WebDriver odriver = null;
		String strResult = null;
		try
		{
			odriver = appDep.launchApp(appInd.getPropData("BROWSER"));
			if(odriver!=null)
			{
				strResult+=String.valueOf(appDep.navigateURL(odriver));
				strResult+=String.valueOf(appDep.loginToApp(odriver));
				strResult+=String.valueOf(appDep.createUser(odriver));
				strResult+=String.valueOf(appDep.deleteUser(odriver, "user1, demo"));
				strResult+=String.valueOf(appDep.logoutFromApp(odriver));
				strResult+=String.valueOf(appDep.closeBrowser(odriver));
				
			}
			else
			{
				appInd.writeReport("Fail", "Failed Launch The browser");
				return false;
			}
			
			
			if(strResult.contains("false"))
			{
				appInd.writeReport("Fail", "Test cases failed");
			   return false;
			}else
			{
				appInd.writeReport("Fail", "Test cases passed");
			   return true;
				
			}
		}catch(Exception e)
		{
			return false;
		}finally
		{
			odriver = null;
		}
	}
	
	
	/**********************************************
	 * Test cript : createAndDeleteProject()
	 * 
	 * 
	 **********************************************/
	
	public boolean createAndDeleteProject()
	{
		WebDriver odriver = null;
		String strResult = null;
		
		try
		{
			odriver = appDep.launchApp(appInd.getPropData("BROWSER"));
			
			if(odriver!=null)
			{
				appInd.writeReport("pass", "Browser is succefully launched ");
				strResult+=String.valueOf(appDep.navigateURL(odriver));
				strResult+=String.valueOf(appDep.loginToApp(odriver));
				strResult+=String.valueOf(appDep.createProject(odriver));
				strResult+=String.valueOf(appDep.deleteProject(odriver, "Project1"));
				strResult+=String.valueOf(appDep.logoutFromApp(odriver));
				strResult+=String.valueOf(appDep.closeBrowser(odriver));
			}else
				
			{
				appInd.writeReport("Fail", "Unable to launch the browser");
				return false;
			}
			
			if(strResult.contains("false"))
			{
				appInd.writeReport("Fail", "Test case failed");
				return false;
			}else
			{
				appInd.writeReport("Pass", "Test case passed");
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
	
	
	
	/**********************************************
	 * Test cript : createAndDeleteTask()
	 * 
	 * 
	 **********************************************/
	
	public boolean createAndDeleteTask()
	{
		WebDriver odrievr = null;
		String strResult = null;
		 try
		 {
			 odrievr = appDep.launchApp(appInd.getPropData("BROWSER"));
			 if(odrievr != null)
			 {
				 appInd.writeReport("Pass", "browser launched succesfuly");
				 
				 strResult += String.valueOf(appDep.navigateURL(odrievr));
				 strResult += String.valueOf(appDep.loginToApp(odrievr));
				 strResult += String.valueOf(appDep.createTask(odrievr));
				 strResult += String.valueOf(appDep.deleteTask(odrievr, "Task1"));
				 strResult += String.valueOf(appDep.logoutFromApp(odrievr));
				 strResult += String.valueOf(appDep.closeBrowser(odrievr));
				 
				 if(strResult.contains("false"))
				 {
					 appInd.writeReport("fail", "test cases are failed");
					 return false;
				 }else
				 {
					 appInd.writeReport("pass", "test cases for createAndDeleteTask() are passed");
					 return true; 
				 }
			 }
			 else
			 {
				 appInd.writeReport("fail", "failed to launch the browser");
				 return false;
			 }
		 }catch(Exception e)
		 {
			appInd.writeReport("exception", "exception in createAndDeleteTask"); 
			return false;
		 }finally
		 {
			 odrievr = null;
		 }
	}
}
