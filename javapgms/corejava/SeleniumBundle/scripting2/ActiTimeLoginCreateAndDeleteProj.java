package scripting2;

import org.openqa.selenium.WebDriver;

public class ActiTimeLoginCreateAndDeleteProj {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		Methods meth = null;
		String strStatus = null;
		try {
			meth = new Methods();
			oBrowser = meth.launchApp("Chrome");
			if(oBrowser!=null)
			{
				strStatus+=String.valueOf(meth.navigateURL(oBrowser));
				strStatus+=String.valueOf(meth.loginToApp(oBrowser, "admin", "manager"));
				strStatus+=String.valueOf(meth.createProject(oBrowser));
			    strStatus+=String.valueOf(meth.deleteProject(oBrowser, "Project1"));
				strStatus+=String.valueOf(meth.logoutFromApp(oBrowser));
				strStatus+=String.valueOf(meth.closeBrowser(oBrowser));
				
				if(strStatus.contains("false"))
				{
					System.out.println("The test case failed");
				}else {
					System.out.println("Test case passed");
				}
			}else {
				System.out.println("Failed to open the browser");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			oBrowser = null;
		}
	}
}