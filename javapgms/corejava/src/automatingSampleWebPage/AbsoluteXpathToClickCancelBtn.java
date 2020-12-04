package automatingSampleWebPage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathToClickCancelBtn {

	public static void main(String[] args) {
		clickCancel();
	}

	static void clickCancel()
	{
		ChromeDriver ch = null;
		try
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.get("file:///C:/Users/Lenovo/Desktop/html_pages/sample.html");
			Thread.sleep(4000);
		
			
		    ch.findElement(By.xpath("/html/body/form/input[@id='cancelId1']")).click();
			Thread.sleep(2000);
			
			ch.findElement(By.xpath("/html/body/form/input[@id='unId2']")).sendKeys("jabir");
			Thread.sleep(1000);
			ch.findElement(By.xpath("/html/body/form/input[@id='pwdwId2']")).sendKeys("hhkvhh");
			Thread.sleep(2000);
			
			//click on CANCEL button in Frame 2 
			ch.findElement(By.xpath("/html/body/form[@id='frm2']/input[@id='cancelId1']")).click();
			Thread.sleep(2000);
			
			//click on FEMALE RADIO BUTTON
			ch.findElement(By.xpath("/html/body/input[@id='radId2']")).click();
			Thread.sleep(2000);
			
			//click on CHECKBOX SELENIUM WEBDRIVER
			ch.findElement(By.xpath("/html/body/input[@id='chkId']")).click();
			Thread.sleep(2000);
			
			String sample = ch.getWindowHandle();
			System.out.println(sample);
			//click the Google Link in the page
			ch.findElement(By.xpath("/html/body/a[@href='https://www.google.com/']")).click();
		    Thread.sleep(2000);
		
		    Set<String> arr = ch.getWindowHandles();
	 	    
	 	    for(String s : arr) {
	 	    	if(s!=sample) {
	 	    		ch.switchTo().window(s);
	 	    		System.out.println(ch.getTitle());
	 	    	  
	 	    	}
	 	    }
	 	    Thread.sleep(2000);
	 	   ch.close();
               
			
			
			//switch back to parent Sample page
			ch.switchTo().window(sample);
			Thread.sleep(2000);
			
	        //switch to Yahoo Link
			ch.findElement(By.xpath("/html/body/a[@href='https://login.yahoo.com/']")).click();
			Thread.sleep(2000);
			  
			Set<String> arr1 = ch.getWindowHandles();
		 	    
		 	    for(String s : arr1) {
		 	    	if(s!=sample) {
		 	    		ch.switchTo().window(s);
		 	    		System.out.println(ch.getTitle());
		 	    	  }
		 	    }
		 	   Thread.sleep(2000);
		 	   ch.close();
			
			//switch back to parent Sample page
			ch.switchTo().window(sample);
			Thread.sleep(2000);
	
			
			//switch to FAcebook Link
			ch.findElement(By.xpath("/html/body/a[@href='https://www.facebook.com/']")).click();
			Thread.sleep(2000);
			System.out.println(ch.getTitle());
			
			//navigate back to parent
			ch.navigate().back();
	
			
			//switch to ActiTime Link
			ch.findElement(By.xpath("/html/body/a[@href='http://localhost/login.do']")).click();
			Thread.sleep(2000);
			System.out.println(ch.getTitle());
			
			//navigate back to parent
			ch.navigate().back();
			
			//finally close the parent window
			Thread.sleep(3000);
			ch.close();
		
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			ch=null;
		}
	}
}
