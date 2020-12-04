package XpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_DemoAut {

	public static void main(String[] args) {
		demoauto();

	}
	
	static void demoauto()
	{
		ChromeDriver ch = null;
		String xpath=null;
		Select dropdown = null;
		try
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.get("http://newtours.demoaut.com/");
			Thread.sleep(3000);
			
			//click on Register Link
			xpath ="//table/tbody/tr/td[2]/a[text()='REGISTER']";
			ch.findElement(By.xpath(xpath)).click();
			Thread.sleep(2000);
			
	  //______________________________Registration________________________________
			
			//first name
			xpath="//table/tbody/tr[2]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("Mohd.");
			
			//Last name
			xpath="//table/tbody/tr[3]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("Jabi");
			
			//Phone
			xpath="//table/tbody/tr[4]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("8595958487");
			
			//Mail
			xpath="//table/tbody/tr[5]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("mjsi123456@gmail.com");
			
			//Address1
			xpath="//table/tbody/tr[7]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("Cottonpete");
			
			//Address2
			xpath="//table/tbody/tr[8]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("Chickpete");
			
			//City
			xpath="//table/tbody/tr[9]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("Bangalore");
			
			//State
			xpath="//table/tbody/tr[10]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("Karnataka");
			
			//Postal Code
			xpath="//table/tbody/tr[11]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();                                
			ch.findElement(By.xpath(xpath)).sendKeys("560053");
			
			//Country
			xpath="//table/tbody/tr/td/select";
			ch.findElement(By.xpath(xpath)).click();
			Thread.sleep(1000);
			dropdown = new Select(ch.findElement(By.name("country")));
			dropdown.selectByVisibleText("INDIA");
			
			
			//Username
			xpath="//table/tbody/tr[14]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("mj's");
			
			//New Password
			xpath="//table/tbody/tr[15]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("786313");
			
			//Confirm Password
			xpath="//table/tbody/tr[16]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("786313");
			
			//submit
			xpath="//table/tbody/tr/td/input[@name='register']";
			ch.findElement(By.xpath(xpath)).click();
			Thread.sleep(2000);
		
		   //____________________________________login________________________________
			
			xpath="//table/tbody/tr[3]/td/p[2]/font/a";
			ch.findElement(By.xpath(xpath)).click();
			Thread.sleep(2000);
			
			//Username
			xpath="//table/tbody/tr/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("mj's");
			Thread.sleep(2000);
		
			//Password
			xpath="//table/tbody/tr[2]/td[2]/input";
			ch.findElement(By.xpath(xpath)).click();
			ch.findElement(By.xpath(xpath)).sendKeys("786313");
			Thread.sleep(2000);
			
			//submit
			xpath="//table/tbody/tr[4]/td/input";
			ch.findElement(By.xpath(xpath)).click();
			Thread.sleep(2000);
			
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
