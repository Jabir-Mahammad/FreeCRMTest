  
 
 
 package actiTimeAssignment;

 import java.util.Set;

import org.openqa.selenium.By;
 import org.openqa.selenium.chrome.ChromeDriver;

 public class ReadPlaceholdersInYahooRegPage {

 	public static void main(String[] args) {
 		
 		yahooReg();
 	}
 	static void yahooReg()

 	{
 		ChromeDriver ch = null;
 		ChromeDriver ch2 = null;
 		try {
 			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
 	        ch = new ChromeDriver();
 	        ch.manage().window().maximize();
 	        ch.get("https://www.google.com/");
 	       Thread.sleep(2000);
 	   
 	       ch.findElement(By.name("q")).sendKeys("yahoo registration");
 	      Thread.sleep(2000);
 	      ch.findElement(By.name("btnK")).click();
 	      Thread.sleep(2000);
 	      ch.findElement(By.className("LC20lb")).click();
 	      Thread.sleep(3000);
 	    
 	    //read first name placeholder value  
 	    String userName =  ch.findElement(By.id("usernamereg-firstName")).getAttribute("placeholder");
 	    System.out.println(userName);
 	    
 	   //read last name placeholder value  
 	    String lastName =  ch.findElement(By.id("usernamereg-lastName")).getAttribute("placeholder");
 	    System.out.println(lastName);
 	    
 	   //read Mail placeholder value  
 	    String mail =  ch.findElement(By.id("usernamereg-yid")).getAttribute("placeholder");
 	    System.out.println(mail);
 	    
 	    
 	    //parent window id
 	    String id = ch.getWindowHandle();
 	    
 	    //navigate to terms link
 	    ch.findElement(By.className("termsLink")).click();
 	    Thread.sleep(5000);
 	    
 	    //change window id to TERMS window
 	    Set<String> arr = ch.getWindowHandles();
 	    
 	    for(String s : arr) {
 	    	if(s!=id) {
 	    		ch.switchTo().window(s);
 	    	  
 	    	}
 	    }
 	    
 	      //reading a text from TERMS window
		  String txt = ch.findElement(By.className("active")).getText();
		 System.out.println(txt);
		 ch.close();
		 
		 //switchin back from TERMS to parent(reg page)
 	    ch.switchTo().window(id);
 	    Thread.sleep(2000);
 	    
 	    
 	   //navigate to Privacy policy  link
 	    ch.findElement(By.className("privacyLink")).click();
 	    Thread.sleep(5000);
 	    
 	    //change window id to Privacy and Policy window
 	    Set<String> arr1 = ch.getWindowHandles();
 	     for(String s : arr1) {
 	    	if(s!=id) {
 	    		ch.switchTo().window(s);
 	    	  
 	    	}
 	    }
 	    
 	     //reading a text from POLICY window
 	     String txt1 = ch.findElement(By.xpath("//*[@id='site-main']/section/div/div/div/h1")).getText();
		 System.out.println(txt1);
		 ch.close();
 	 
		//switchin back from PRIVACY POLICY to parent(reg page)
 	    ch.switchTo().window(id);
 	    ch.close();
 	    
 	    
 		}catch(Exception e)
		{
			System.out.println(e);
		}

		finally {
			ch=null;
		}
 	}
 }