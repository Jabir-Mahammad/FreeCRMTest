package javaScriptAutomateActitime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

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
		         
		       
		      
		       //login button
		     //  js.executeScript("document.getElementById('loginButton').click();");
		       Thread.sleep(3000);
		       
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
