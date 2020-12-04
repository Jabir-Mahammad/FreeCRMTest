
package actiTimeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTheContentOnTaskDeletePopup {

	public static void main(String[] args) {
		
		readContentDeletePopup();
	}
	
	static void readContentDeletePopup()
	{
		ChromeDriver cd =  null;
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
			cd = new ChromeDriver();
			cd.manage().window().maximize();
			cd.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			cd.findElement(By.name("username")).sendKeys("admin");
		    cd.findElement(By.name("pwd")).sendKeys("manager");
		   
            cd.findElement(By.id("keepLoggedInLabel")).click();
		    cd.findElement(By.id("loginButton")).click();
		    Thread.sleep(2000);
		    
		   
		    //switch to TASKS tab
		    cd.findElement(By.xpath("//div[text()='TASKS']")).click();
		    Thread.sleep(2000);

	 
		    //create new customer
		    cd.findElement(By.className("addNewButton")).click();
		    Thread.sleep(1000);
		    cd.findElement(By.className("createNewCustomer")).click();
		    Thread.sleep(2000);
            cd.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer_1");
		    cd.findElement(By.id("customerLightBox_commitBtn")).click();
		    Thread.sleep(3000);
		    
		    //read created notification
		    String text2 = cd.findElement(By.xpath("/html/body/div[20]")).getText();
		    System.out.println(text2);
		    
		    //to delete added Customer
           cd.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
           Thread.sleep(2000);
           cd.findElement(By.className("actionButton")).click(); 
           Thread.sleep(1000);
           cd.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
           Thread.sleep(1000);
           
           //read message from delete window
           String txt1 = cd.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[4]/div/div/div[2]")).getText();
           System.out.println(txt1);
           cd.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
           Thread.sleep(3000);
           
           //read deleted notification
          String text3 = cd.findElement(By.xpath("/html/body/div[20]")).getText();
          System.out.println(text3);
           
        
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			cd = null;
		}
	}

}
