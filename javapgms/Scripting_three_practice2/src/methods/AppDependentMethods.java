package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
	public boolean loginToApp(WebDriver oDriver)
	{
		String strStatus = null;
		try {
			String strUN  = appInd.getCellData("loginToApp", "TD_UserName", 1);
			strStatus+=String.valueOf(appInd.setObject(oDriver, By.id("username"), strUN));
			String strPWD = appInd.getCellData("loginToApp", "TD_Password", 1);
			strStatus+=String.valueOf(appInd.setObject(oDriver, By.name("pwd"), strPWD));
			strStatus+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//a[@id='loginButton']")));
			Thread.sleep(4000);
			
			//validate optional short cut element
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
	
	
	public boolean createUser(WebDriver oDriver)
	{
		String strResult = null;
		try {
			
			strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//div[text()='USERS']")));
			Thread.sleep(2000);
			
			
			strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//div[text()='Add User']")));
			Thread.sleep(2000);
			
			//Enter user details
			
			String fName = appInd.getCellData("createUser", "TD_FirstName", 1);
			strResult+=String.valueOf(appInd.setObject(oDriver, By.name("firstName"), fName));
			
			String lName = appInd.getCellData("createUser", "TD_LastName", 1);
			strResult+=String.valueOf(appInd.setObject(oDriver, By.name("lastName"), lName));
			
			String email = appInd.getCellData("createUser", "TD_Email", 1);
			strResult+=String.valueOf(appInd.setObject(oDriver, By.name("email"), email));
			
			String uname = appInd.getCellData("createUser", "TD_User", 1);
			strResult+=String.valueOf(appInd.setObject(oDriver,By.name("username") , uname));
			
			String pwd = appInd.getCellData("createUser", "TD_Password", 1);
			strResult+=String.valueOf(appInd.setObject(oDriver,By.name("password") , pwd));
		
			String cpwd = appInd.getCellData("createUser", "TD_ReTypePwrd", 1);
			strResult+=String.valueOf(appInd.setObject(oDriver,By.name("passwordCopy") , cpwd));
			
			//Click on CreateUser button
			
			strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//span[text()='Create User']")));
			Thread.sleep(2000);
			strResult+=String.valueOf(appInd.verifyText(oDriver, By.xpath("//span[text()='user1, demo']"), "Text", "user1, demo"));
			if(strResult.contains("false"))
			{
				appInd.writeReport("Fail", "FAiled to create the user");
				return false;
			}else {
				appInd.writeReport("Pass", "User created successful");
				return true;
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
		String strResult = null;
		try {
			//if(oDriver.findElement(By.xpath("//span[text()='+strUserName+']")).isDisplayed())
				if(appInd.verifyText(oDriver, By.xpath("//span[text()='"+strUserName+"']"), "text", strUserName))
			{
				appInd.writeReport("Pass", "User is created and searched");
				
				strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//span[text()="+"'"+strUserName+"'"+"]")));
				Thread.sleep(2000);
				
				strResult+=String.valueOf(appInd.clickObject(oDriver,By.id("userDataLightBox_deleteBtn")));
				Thread.sleep(2000);
				oDriver.switchTo().alert().accept();
				Thread.sleep(2000);
				
				
				if(!elementPresent(oDriver, By.xpath("//div[@class='name']/span[text()='"+strUserName+"']")))
				{
					
					strResult+=String.valueOf("true");
				}else {
					
					strResult+=String.valueOf("false");
				}
				
				
				if(strResult.contains("false"))
				{
					appInd.writeReport("Fail", "Failed to delete the user");
					return false;
					
				}else {
					appInd.writeReport("Pass", "User deleted successful");
					return true;
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
		String strResult = null;
		try {
			
			strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//a[@class='content tasks']")));
			Thread.sleep(2000);
			
			
			strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//*[@class='addNewContainer']")));
			Thread.sleep(2000);
			
			
			strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//*[@class='item createNewProject ellipsis']")));
			Thread.sleep(2000);
			
			String prjName = appInd.getCellData("createProject", "Proj_Name", 1);
			strResult+=String.valueOf(appInd.setObject(oDriver, By.xpath("//*[@id='projectPopup_projectNameField']"), prjName));
			
			String custName = appInd.getCellData("createProject", "Cust_Name", 1);
			strResult+=String.valueOf(appInd.setObject(oDriver, By.xpath("//*[@id='projectPopup_newCustomerNameField']"),custName ));
			
			
			strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//*[@id='projectPopup_commitBtn']")));
			
			Thread.sleep(2000);
			strResult+=String.valueOf(appInd.verifyText(oDriver, By.xpath("//div[text()='Project1']"), "text", "Project1"));
			
		    if(!strResult.contains("false"))		
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
		String strResult = null;
		try {
			if(oDriver.findElement(By.xpath("//div[text()='"+strUserName+"']")).isDisplayed())
			{
				
				appInd.writeReport("Pass", "Project is created and searched");
				
				
				strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//div[@class='editButton available']")));
				Thread.sleep(2000);
				
				strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//*[@class='actionButton']")));
				Thread.sleep(2000);
			
				strResult+=String.valueOf(appInd.clickObject(oDriver,By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")));
			    Thread.sleep(2000);
				strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")));
			    Thread.sleep(2000);
				
			    
				
				if(!elementPresent(oDriver, By.xpath("//div[text()='"+strUserName+"']")))
				{
					strResult+=String.valueOf("true");
				}else {
					strResult+=String.valueOf("false");
				}
			    
			    
				if(!strResult.contains("false"))
				{
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
	 * Method Name		: createTask()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean createTask(WebDriver oDriver)
	{
		String strResult = null;
		try {
			
			strResult += String.valueOf(appInd.clickObject(oDriver, By.xpath("//a[@class='content tasks']")));
			Thread.sleep(2000);
			
			
			strResult += String.valueOf(appInd.clickObject(oDriver, By.xpath("//div[text()='Add New Task']")));
			Thread.sleep(2000);
			
			strResult += String.valueOf(appInd.clickObject(oDriver,By.xpath("//div[@class='item createNewTask ellipsis']")));
			Thread.sleep(2000);
			
			String custName = appInd.getCellData("createTask", "Cust_Name", 1);
			strResult += String.valueOf(appInd.setObject(oDriver, By.xpath("//input[@id='createTasksPopup_newCustomer']"),custName ));
			
			String projName = appInd.getCellData("createTask", "Proj_Name", 1);
			strResult += String.valueOf(appInd.setObject(oDriver, By.xpath("//input[@id='createTasksPopup_newProject']"), projName));
			
			String taskName1 = appInd.getCellData("createTask", "taskName1", 1);
			strResult += String.valueOf(appInd.setObject(oDriver, By.xpath("//input[@placeholder='Enter task name']"), taskName1));
			String taskName2 = appInd.getCellData("createTask", "taskName2", 1);
			strResult += String.valueOf(appInd.setObject(oDriver, By.xpath("//tr[2]/td/input[@placeholder='Enter task name']"), taskName2));
			strResult += String.valueOf(appInd.clickObject(oDriver, By.xpath("//div[@class='buttonIcon']")));
			Thread.sleep(2000);
			
			strResult += String.valueOf(appInd.verifyText(oDriver, By.xpath("//div[@title='Task1']"), "Text", "Task1"));
			
			
			if(!strResult.contains("false"))
			{
				appInd.writeReport("pass", "Task created successful");
				return true;
			}else {
				appInd.writeReport("fail", "faild to create Task");
				return false;
			}  
		}catch(Exception e)
		{
			appInd.writeReport("exception", "Exception while executing 'createTask' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	
	/*************************************
	 * Method Name		: deleteTask()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	public boolean deleteTask(WebDriver oDriver, String strUserName)
	{
		String strResult = null;
		
		try {
			
		    if(appInd.verifyText(oDriver, By.xpath("//div[@title='Task1']"), "text", "Task1"))
			{
				appInd.writeReport("pass", "Task is created and searched");
				strResult += String.valueOf(appInd.clickObject(oDriver, By.xpath("//div[@class='editButton available']")));
				Thread.sleep(2000);
				strResult += String.valueOf(appInd.clickObject(oDriver, By.xpath("//*[@class='actionButton']")));
				Thread.sleep(2000);
				strResult += String.valueOf(appInd.clickObject(oDriver, By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")));
			    Thread.sleep(2000);
			    strResult += String.valueOf(appInd.clickObject(oDriver, By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")));
			    Thread.sleep(2000);
				
			    
			    if(!elementPresent(oDriver, By.xpath("//div[@title='Task1']")))
				{
			    	strResult += String.valueOf("true");
				}else {
					strResult += String.valueOf("false");
				}
			    
				if(!strResult.contains("false"))
				{
					appInd.writeReport("pass", "Task deleted successful");
					return true;
				}else {
					appInd.writeReport("pass", " Failed to delete Task");
					return false;
				}
			}else {
				appInd.writeReport("fail", "Failed to find the Task");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("exception", "Exception while executing 'deleteTask' method. "+e.getMessage());
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
 * Method Name		: logoutFromApp()
 * Author			:
 * Date Creation	:
 * Purpose			:
 * Reviewer			:
 *************************************/
public boolean logoutFromApp(WebDriver oDriver)
{
	String strResult = null;
	try {
		Thread.sleep(2000);
		
		strResult+=String.valueOf(appInd.clickObject(oDriver, By.xpath("//a[@id='logoutLink']")));
		Thread.sleep(2000);
		
		
		if(oDriver.findElement(By.xpath("//img[contains(@src,'/timer.png')]")).isDisplayed())
		{
			strResult+=String.valueOf("true");
		
		}else {
			strResult+=String.valueOf("false");
	
		}
		
		
		if(strResult.contains("false"))
		{
			
			appInd.writeReport("Fail", "Failed to logout");
			return false;
			
		}else {
			appInd.writeReport("Pass", "Logout is successful");
			return true;
		}
	}catch(Exception e)
	{
		appInd.writeReport("Exception", "Exception while executing 'logoutFromApp' method. "+e.getMessage());
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
	
	

