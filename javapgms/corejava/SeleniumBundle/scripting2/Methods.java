package scripting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//reusable components
public class Methods {
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
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
					oDriver = new ChromeDriver();
					break;
				case "ie":
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Library\\drivers\\IEDriverServer.exe");
					oDriver = new InternetExplorerDriver();
					break;
				case "ff":
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Library\\drivers\\geckodriver.exe");
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
				System.out.println("URL is navigate successful");
				return true;
			}
			else {
				System.out.println("Failed to navigate the URL");
				return false;
			}
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'navigateURL' method. "+e.getMessage());
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
		try {
			oDriver.findElement(By.id("username")).sendKeys(strUN);
			oDriver.findElement(By.name("pwd")).sendKeys(strPWD);
			oDriver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(4000);
			
			//validate optional short cut element
			if(elementPresent(oDriver, By.id("gettingStartedShortcutsMenuCloseId")))
			{
				oDriver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			}
			//Validate login is successful
			String sText = oDriver.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(sText.equals("Enter Time-Track"))
			{
				System.out.println("Login is successful");
				return true;
			}else {
				System.out.println("Login failed");
				return false;
			}
			
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'loginToApp' method. "+e.getMessage());
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
				System.out.println("User created successful");
				return true;
			}else {
				System.out.println("FAiled to create the user");
				return false;
			}
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'createUser' method. "+e.getMessage());
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
				System.out.println("User is created and searched");
				oDriver.findElement(By.xpath("//span[text()="+"'"+strUserName+"'"+"]")).click();
				Thread.sleep(2000);
				oDriver.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				oDriver.switchTo().alert().accept();
				Thread.sleep(2000);
				
				if(!elementPresent(oDriver, By.xpath("//div[@class='name']/span[text()="+"'"+strUserName+"'"+"]")))
				{
					System.out.println("User deleted successful");
					return true;
				}else {
					System.out.println("Failed to delete the user");
					return false;
				}
			}else {
				System.out.println("Failed to find the user");
				return false;
			}
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'deleteUser' method. "+e.getMessage());
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
			oDriver.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//*[@class='addNewContainer']")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//*[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("Project1");
			
			oDriver.findElement(By.xpath("//*[@id='projectPopup_newCustomerNameField']")).sendKeys("Client1");
			
			oDriver.findElement(By.xpath("//*[@id='projectPopup_commitBtn']")).click();
			Thread.sleep(2000);
			
			
			
			if(oDriver.findElement(By.xpath("//div[text()='Project1']")).isDisplayed())
			{
				System.out.println("Project created successful");
				return true;
			}else {
				System.out.println("FAiled to create the Project");
				return false;
			}  
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'createProject' method. "+e.getMessage());
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
			if(oDriver.findElement(By.xpath("//div[text()='Project1']")).isDisplayed())
			{
				System.out.println("Project is created and searched");
				oDriver.findElement(By.xpath("//div[@class='editButton available']")).click();
				Thread.sleep(2000);
				oDriver.findElement(By.xpath("//*[@class='actionButton']")).click();
				Thread.sleep(2000);
				oDriver.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			    Thread.sleep(2000);
			    oDriver.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			    Thread.sleep(2000);
				
				if(!elementPresent(oDriver, By.xpath("//div[text()="+"'"+strUserName+"'"+"]")))
				{
					System.out.println("Project deleted successful");
					return true;
				}else {
					System.out.println("Failed to delete the Project");
					return false;
				}
			}else {
				System.out.println("Failed to find the Project");
				return false;
			}
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'deleteProject' method. "+e.getMessage());
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
		try {
			oDriver.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//input[@id='createTasksPopup_newCustomer']")).sendKeys("Client1");
			
			oDriver.findElement(By.xpath("//input[@id='createTasksPopup_newProject']")).sendKeys("Project1");
			
			
			oDriver.findElement(By.xpath("//input[@placeholder='Enter task name']")).sendKeys("Task1");
			
			oDriver.findElement(By.xpath("//tr[2]/td/input[@placeholder='Enter task name']")).sendKeys("Task2");
			
			oDriver.findElement(By.xpath("//div[@class='buttonIcon']")).click();
			Thread.sleep(2000);
			
			
			
			if(oDriver.findElement(By.xpath("//div[@class='taskRowsTableContainer']")).isDisplayed())
			{
				System.out.println("Task created successful");
				return true;
			}else {
				System.out.println("FAiled to create the Task");
				return false;
			}  
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'createTask' method. "+e.getMessage());
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
		try {
			if(oDriver.findElement(By.xpath("//div[@title='Task1']")).isDisplayed())
			{
				System.out.println("Task is created and searched");
				oDriver.findElement(By.xpath("//div[@class='editButton available']")).click();
				Thread.sleep(2000);
				oDriver.findElement(By.xpath("//*[@class='actionButton']")).click();
				Thread.sleep(2000);
				oDriver.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			    Thread.sleep(2000);
			    oDriver.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			    Thread.sleep(2000);
				
				if(!elementPresent(oDriver, By.xpath("//div[@title='Task1']")))
				{
					System.out.println("Task deleted successful");
					return true;
				}else {
					System.out.println("Failed to delete the Task");
					return false;
				}
			}else {
				System.out.println("Failed to find the Task");
				return false;
			}
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'deleteTask' method. "+e.getMessage());
			return false;
		}
	}
	
	
	
	/*************************************
	 * Method Name		: modifyTask()
	 * Author			:
	 * Date Creation	:
	 * Purpose			:
	 * Reviewer			:
	 *************************************/
	
	public boolean modifyTask(WebDriver oDriver)
	{
		try {
			
			oDriver.findElement(By.xpath("//div[@title='Task1']")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[1]")).click();
			Thread.sleep(2000);
			
			oDriver.findElement(By.xpath("//div[text()='Completed']")).click();
			Thread.sleep(2000);
			
          oDriver.findElement(By.xpath("//textarea[@placeholder='Enter task description...']")).sendKeys("Task1 is completed");
         Thread.sleep(2000);
			
          oDriver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[1]")).click();
	      Thread.sleep(4000);
			
	      System.out.println("Task is modified");
			return true;
		}catch(Exception e)
		{
			System.out.println("Task can't be modified");
			System.out.println("Exception while executing 'modifyTask' method. "+e.getMessage());
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
			oDriver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			Thread.sleep(2000);
			
			if(oDriver.findElement(By.xpath("//img[contains(@src,'/timer.png')]")).isDisplayed())
			{
				System.out.println("Logout is successful");
				return true;
			}else {
				System.out.println("Failed to logout");
				return false;
			}
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'logoutFromApp' method. "+e.getMessage());
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
			System.out.println("Exception while executing 'closeBrowser' method. "+e.getMessage());
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
