package javaScriptAutomateActitime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingMethod {

     public static void main(String[] args) {
		actitie();

	}
     
	static void reuse(JavascriptExecutor js, String path, WebDriver ch)
	{
		 String xpath =path;
         WebElement web = ch.findElement(By.xpath(xpath));
        js.executeScript("arguments[0].click()",web);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
		       reuse(js,"//*[@id=\"loginButton\"]/div",ch);
		         
		       //click on TASK
		       reuse(js,"//a[@class='content tasks']",ch);
		 
		       //click on Add New
		        reuse(js,"//*[@class='addNewContainer']",ch);
	
	           //click on New Project
		        reuse(js,"//*[@class='item createNewProject ellipsis']",ch);
		     
		       //enter project name
		        js.executeScript("document.getElementById('projectPopup_projectNameField').value='Project1';");		       

               //select customer
		       js.executeScript("document.getElementById('ext-comp-1019').click();");
		       Thread.sleep(2000);
		        
		       //select new customer
		       reuse(js,"//div[@id='ext-gen90']/ul/li[2]",ch);
		        
		      //enter customer name
		      js.executeScript("document.getElementById('projectPopup_newCustomerNameField').value='Client1';");	
		        
		      //submit
		      js.executeScript("document.getElementById('projectPopup_commitBtn').click()");
		      Thread.sleep(2000);
		        
		      //delete created Project
		      reuse(js,"//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]",ch);
		      
		      //click on Actions
		      reuse(js,"//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div",ch);
		      
		      //click on Delete
		      reuse(js,"//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div",ch);
			  
		      //click on Confirm delete
			  reuse(js,"//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div",ch);
			
		      //logout button
		      js.executeScript("document.getElementById('logoutLink').click();");
		       
		      ch.close();   
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
