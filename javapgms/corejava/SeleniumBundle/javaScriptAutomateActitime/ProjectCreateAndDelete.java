package javaScriptAutomateActitime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectCreateAndDelete {

	private static String xpath;

	public static void main(String[] args) {
		actitie();

	}
	
	static void actitie()
	{
		WebDriver ch = null;
		String xpath = null;
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
		         xpath ="//*[@id='loginButton']/div";
		         WebElement web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(3000);
		         
		       
		        //click on TASK
		        xpath = "//a[@class='content tasks']";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(2000);
		        
		        //click on Add New
		        xpath = "//*[@class='addNewContainer']";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(1000);
		        
		        //click on New Project
		        xpath="//*[@class='item createNewProject ellipsis']";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(2000);
		        
		     //enter project name
		        js.executeScript("document.getElementById('projectPopup_projectNameField').value='Project1';");		       

             //select customer
		        js.executeScript("document.getElementById('ext-comp-1019').click();");
		        Thread.sleep(2000);
		        
		      //select new customer
		        xpath="//div[@id='ext-gen90']/ul/li[2]";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(1000);
		        
		        
		      //enter customer name
		      js.executeScript("document.getElementById('projectPopup_newCustomerNameField').value='Client1';");	
		        
		      //submit
		        js.executeScript("document.getElementById('projectPopup_commitBtn').click()");
		        Thread.sleep(2000);
		        
		        //delete created Project
		        xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		        Thread.sleep(2000);
		        
		        
		        //click on Actions
		        xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div";
		         web = ch.findElement(By.xpath(xpath));
		        js.executeScript("arguments[0].click()",web);
		         Thread.sleep(1000);
		         
		         //click on Delete
			        xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div";
			         web = ch.findElement(By.xpath(xpath));
			        js.executeScript("arguments[0].click()",web);
			         Thread.sleep(2000);
		        
			         
			         //click on Confirm delete
				        xpath="//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div";
				         web = ch.findElement(By.xpath(xpath));
				        js.executeScript("arguments[0].click()",web);
				         Thread.sleep(1000);
		       //login button
		     //  js.executeScript("document.getElementById('loginButton').click();");
		       Thread.sleep(3000);
		       
		       //logout button
		      // js.executeScript("document.getElementById('logoutLink').click();");
		       
		      // ch.close();
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
