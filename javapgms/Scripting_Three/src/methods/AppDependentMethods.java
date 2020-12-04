package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import testScript.TestScript;


//reusable components
public class AppDependentMethods extends TestScript{
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
					System.out.println("Invalid browser name '"+strBrowser+"'");
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
			System.out.println("Exception while executing 'launchApp' method. "+e.getMessage());
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
			oDriver.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
			if(oDriver.getTitle().equals("actiTIME - Login"))
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
	 * Method Name		: loginToApp()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean loginToApp(WebDriver oDriver, String strUN, String strPWD)
	{
		String strStatus = null;
		try {
			strStatus+=String.valueOf(appInd.setObject(oDriver, By.id("username"), strUN));
			strStatus+=String.valueOf(appInd.setObject(oDriver, By.name("pwd"), strPWD));
			strStatus+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//a[@id='loginButton']")));
			Thread.sleep(4000);
			
			//validate optional shortcut element
			if(elementPresent(oDriver, By.id("gettingStartedShortcutsMenuCloseId")))
			{
				oDriver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			}
			
			
			//Validate login is successful
			strStatus+=String.valueOf(appInd.verifyText(oDriver, By.xpath("//td[@class='pagetitle']"), "Text", "Enter Time-Track"));
			
			if(strStatus.contains("false"))
			{
				appInd.writeReport("Fail", "Login failed");
				return false;
			}else {
				appInd.writeReport("Pass", "Login is successful");
				return true;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'loginToApp' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	/*************************************
	 * Method Name		: createUser()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean createUser(WebDriver oDriver)
	{
		try {
			oDriver.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			
			//Enter user details
			oDriver.findElement(By.name("firstName")).sendKeys("demo");
			oDriver.findElement(By.name("lastName")).sendKeys("user1");
			oDriver.findElement(By.name("email")).sendKeys("demo.user1@gmail.com");
			oDriver.findElement(By.name("username")).sendKeys("demouser1");
			oDriver.findElement(By.name("password")).sendKeys("Mercury1");
			oDriver.findElement(By.name("passwordCopy")).sendKeys("Mercury1");
			
			//Click on CreateUser button
			oDriver.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			if(oDriver.findElement(By.xpath("//span[text()='user1, demo']")).isDisplayed())
			{
				appInd.writeReport("Pass", "User created successful");
				return true;
			}else {
				appInd.writeReport("Fail", "FAiled to create the user");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'createUser' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	/*************************************
	 * Method Name		: deleteUser()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean deleteUser(WebDriver oDriver, String strUserName)
	{
		try {
			if(oDriver.findElement(By.xpath("//span[text()="+"'"+strUserName+"'"+"]")).isDisplayed())
			{
				appInd.writeReport("Pass", "User is created and searched");
				oDriver.findElement(By.xpath("//span[text()="+"'"+strUserName+"'"+"]")).click();
				Thread.sleep(2000);
				oDriver.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				oDriver.switchTo().alert().accept();
				Thread.sleep(2000);
				
				if(!elementPresent(oDriver, By.xpath("//div[@class='name']/span[text()="+"'"+strUserName+"'"+"]")))
				{
					appInd.writeReport("Pass", "User deleted successful");
					return true;
				}else {
					appInd.writeReport("Fail", "Failed to delete the user");
					return false;
				}
			}else {
				appInd.writeReport("Fail", "Failed to find the user");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'deleteUser' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	/*************************************
	 * Method Name		: createProject()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean createProject(WebDriver oDriver)
	{
		try {
			
			appInd.clickObject(oDriver, By.xpath("//a[@class='content tasks']"));
			Thread.sleep(2000);
			
			
			appInd.clickObject(oDriver, By.xpath("//*[@class='addNewContainer']"));
			Thread.sleep(2000);
			
			
			appInd.clickObject(oDriver, By.xpath("//*[@class='item createNewProject ellipsis']"));
			Thread.sleep(2000);
			
			
			appInd.setObject(oDriver, By.xpath("//*[@id='projectPopup_projectNameField']"), "Project1");
			
			
			appInd.setObject(oDriver, By.xpath("//*[@id='projectPopup_newCustomerNameField']"), "Client1");
			
			
			appInd.clickObject(oDriver, By.xpath("//*[@id='projectPopup_commitBtn']"));
			
			Thread.sleep(2000);
			
			if(oDriver.findElement(By.xpath("//div[text()='Project1']")).isDisplayed())
			{
				appInd.writeReport("Pass","Project created successful");
				return true;
			}else {
				appInd.writeReport("Fail","FAiled to create the Project");
				return false;
			}  
		}catch(Exception e)
		{
			appInd.writeReport("Exception","Exception while executing 'createProject' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	
	/*************************************
	 * Method Name		: deleteProject()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean deleteProject(WebDriver oDriver, String strUserName)
	{
		try {
			if(oDriver.findElement(By.xpath("//div[text()='"+strUserName+"']")).isDisplayed())
			{
				//System.out.println("Project is created and searched");
				appInd.writeReport("Pass", "Project is created and searched");
				
				//oDriver.findElement(By.xpath("//div[@class='editButton available']")).click();
				appInd.clickObject(oDriver, By.xpath("//div[@class='editButton available']"));
				Thread.sleep(2000);
				//oDriver.findElement(By.xpath("//*[@class='actionButton']")).click();
				appInd.clickObject(oDriver, By.xpath("//*[@class='actionButton']"));
				Thread.sleep(2000);
				//oDriver.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
				appInd.clickObject(oDriver,By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div") );
			    Thread.sleep(2000);
			   // oDriver.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			    appInd.clickObject(oDriver, By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div"));
			    Thread.sleep(2000);
				
				if(!elementPresent(oDriver, By.xpath("//div[text()='"+strUserName+"']")))
				{
					//System.out.println("Project deleted successful");
					appInd.writeReport("Pass", "Project deleted successful");
					return true;
				}else {
					appInd.writeReport("Fail", "Failed to delete the Project");
					return false;
				}
			}else {
				appInd.writeReport("Fail", "Failed to find the Project");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("exception", "Exception while executing 'deleteProject' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	
	
	/*************************************
	 * Method Name		: logoutFromApp()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean logoutFromApp(WebDriver oDriver)
	{
		try {
			Thread.sleep(2000);
			//oDriver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			appInd.clickObject(oDriver, By.xpath("//a[@id='logoutLink']"));
			Thread.sleep(2000);
			
			if(oDriver.findElement(By.xpath("//img[contains(@src,'/timer.png')]")).isDisplayed())
			{
				appInd.writeReport("Pass", "Logout is successful");
				return true;
			}else {
				appInd.writeReport("Fail", "Failed to logout");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'logoutFromApp' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	/*************************************
	 * Method Name		: logoutFromApp()
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
}
