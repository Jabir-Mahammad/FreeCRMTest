package javaScriptAutomateActitime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUserAndDeleteUser {

	public static void main(String[] args) {
		actitie();

	}

	static void actitie()
	{
		WebDriver ch = null;
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
		       ch.get("http://localhost/login.do");
		       ch.manage().window().maximize();
		       Thread.sleep(2000);
		       
		       //automate using javaScript
		       JavascriptExecutor js = null;
		       js = (JavascriptExecutor) ch ;
		      
		       //to enter username
		       js.executeScript("document.getElementById('username').value='admin';");
		       
		       //enter passwordd
		       js.executeScript("var txt = document.getElementsByName('pwd');txt[0].value='manager';");
		       
		      // ----- Using Xapth-------
		        String xpath ="//*[@id='loginButton']/div";
		         WebElement web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(3000); 
		       
		      //login button
		     //  js.executeScript("document.getElementById('loginButton').click();");
		      
		        //click on USERS
		        xpath="//a[@class='content users']";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(3000);
		        
		        //click on add user
		        xpath="//div[@class='buttonText']";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(3000);
		        
		        //first name 
		        js.executeScript("document.getElementById('userDataLightBox_firstNameField').value='jabir';");
		       
		        //last name 
		        js.executeScript("document.getElementById('userDataLightBox_lastNameField').value='Mohd.';");
		        
		        //email
		        js.executeScript("document.getElementById('userDataLightBox_emailField').value='Mohd@gmail.com';");
		        
		        //username
		        js.executeScript("document.getElementById('userDataLightBox_usernameField').value='Mjsi';");
		        
		        //password
		        js.executeScript("document.getElementById('userDataLightBox_passwordField').value='123456';");
		        
		        //confirm password
		        js.executeScript("document.getElementById('userDataLightBox_passwordCopyField').value='123456';");
		        
		      //submi button
		        js.executeScript("document.getElementById('userDataLightBox_commitBtn').click();");
		        Thread.sleep(3000);
		        
		        //clcik on created user
		        xpath="//td[@class='userNameCell first']";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(2000);
		       
		      //clcik on delete user
		        js.executeScript("document.getElementById('userDataLightBox_deleteBtn').click();");
		        Thread.sleep(1000);
		        
		        //handle alert
		        ch.switchTo().alert().accept();
		        
		       //logout button
		       //js.executeScript("document.getElementById('logoutLink').click();");
		       
		       //ch.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			ch = null;
		}
	}
	
}
