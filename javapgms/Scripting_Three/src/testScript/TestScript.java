package testScript;

import org.openqa.selenium.WebDriver;

import methods.AppDependentMethods;
import methods.AppIndependentmethods;

public class TestScript {
	public static WebDriver oBrowser = null;
	public static AppIndependentmethods appInd = null;
	public static AppDependentMethods appDep = null;
	
	public static void main(String[] args) {
		String strStatus = null;
		try {
			appInd = new AppIndependentmethods();
			appDep = new AppDependentMethods();
			
			oBrowser = appDep.launchApp("chrome");
			
			if(oBrowser!=null)
			{
				strStatus+=String.valueOf(appDep.navigateURL(oBrowser));
				strStatus+=String.valueOf(appDep.loginToApp(oBrowser, "admin", "manager"));
				strStatus+=String.valueOf(appDep.createProject(oBrowser));
			   strStatus+=String.valueOf(appDep.deleteProject(oBrowser, "Project1"));
				strStatus+=String.valueOf(appDep.logoutFromApp(oBrowser));
				strStatus+=String.valueOf(appDep.closeBrowser(oBrowser));
				
				if(strStatus.contains("false"))
				{
					appInd.writeReport("Fail","The test case failed");
				}else {
					appInd.writeReport("Pass","Test case passed");
				}
			}else {
				appInd.writeReport("exception","Failed to open the browser");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
