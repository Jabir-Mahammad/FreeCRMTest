package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_LoginLogout {

	ChromeDriver cd =  null;
	
	@BeforeGroups("createUser")
	@DataProvider(name="loginData")
	public Object[][] testData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@Test(dataProvider="loginData")
	public void LoginToActitime(String uName, String pwd)
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\library\\driver\\chromedriver.exe");
			cd = new ChromeDriver();
			cd.manage().window().maximize();
			cd.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			cd.findElement(By.name("username")).sendKeys(uName);
		    cd.findElement(By.name("pwd")).sendKeys(pwd);
		   
            cd.findElement(By.id("keepLoggedInLabel")).click();
		    cd.findElement(By.id("loginButton")).click();
		    Thread.sleep(2000);
		    
		    String text = cd.findElement(By.className("pagetitle")).getText();
		    
		    if(text.equals("Enter Time-Track"))
		    	System.out.println("Login Success");
		    else
		    	System.out.println("Login Failed!!");
		     
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	/*****************************************************
	 * Method Name: CreateUser()
	 * 
	 * 
	 ******************************************************/
	@DataProvider(name="userData")
	public Object[][] userData()
	{
		return new Object[][] {{"jabir","mohd","jabir.mohd@gmail.com","mjsi","123456","123456"}};
	}
	@Test(dataProvider="userData",groups="createUser",priority=1)
	public void CreateUser(String fName, String lName, String email,String uName,String pwd,String cpwd )
	{
		try {
		 cd.findElement(By.xpath("//div[text()='USERS']")).click();
		   Thread.sleep(3000);
		   cd.findElement(By.className("addUserButton")).click();
		   Thread.sleep(2000);
		   cd.findElement(By.className("firstNameField")).sendKeys(fName);
		   cd.findElement(By.className("lastNameField")).sendKeys(lName);
		   cd.findElement(By.className("emailField")).sendKeys(email);
		   cd.findElement(By.className("usernameField")).sendKeys(uName);
		   cd.findElement(By.className("passwordField")).sendKeys(pwd);
		   cd.findElement(By.className("passwordCopyField")).sendKeys(cpwd); 
		   cd.findElement(By.className("buttonTitle")).click();
		   Thread.sleep(5000);
		  
		   cd.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		   Thread.sleep(2000);
		   
		   cd.findElement(By.className("firstNameField")).sendKeys("user_2");
		   cd.findElement(By.className("lastNameField")).sendKeys("last");
		   cd.findElement(By.className("emailField")).clear();
		   cd.findElement(By.className("emailField")).sendKeys("first.last@gmail.com");
		   cd.findElement(By.className("usernameField")).sendKeys("MJSI");
		   cd.findElement(By.className("passwordField")).sendKeys("123456");
		   cd.findElement(By.className("passwordCopyField")).sendKeys("123456"); 
		   cd.findElement(By.className("buttonTitle")).click();
		   Thread.sleep(5000);
		   
		  
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	/****************************************************************
	 * Method Name : deleteUser()
	 * 
	 * 
	 * 
	 *******************************************************************/
	@Test(groups="createUser",priority=2)
	public void deleteUser()
	{
		try {
		 cd.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		   Thread.sleep(2000);
		   cd.findElement(By.id("userDataLightBox_deleteBtn")).click();
		   
		   cd.switchTo().alert().accept();
		   Thread.sleep(2000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	/****************************************************************
	 * Method Name : logout()
	 * 
	 * 
	 * 
	 *******************************************************************/
	@AfterGroups("createUser")
	public void logout()
	{
		try {
		
			cd.findElement(By.xpath("//td/a[@id='logoutLink']")).click();
			Thread.sleep(2000);
			String txt = cd.findElement(By.xpath("//tr/td[@id='headerContainer']")).getText();
			if(txt.equals("Please identify yourself"))
			{
				System.out.println("logout is successfull");
			}
			else
			{
				System.out.println("logout is failed");
			}
		}catch(Exception e)
		{
			System.out.println("Exception while logout Method");
			System.out.println(e);
		}
		finally
		{
			cd=null;
		}
	}

	}
	
	


