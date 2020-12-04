package CssSelectorAssignment;


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
		String cssSel=null;
		Select dropdown = null;
		try
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.get("http://newtours.demoaut.com/");
			Thread.sleep(3000);
			
			//click on Register Link
			cssSel ="table[background=' black']>tbody>tr>:nth-child(2)>a";
			ch.findElement(By.cssSelector(cssSel)).click();
			Thread.sleep(2000);
			
	  //______________________________Registration________________________________
			
			//first name
			cssSel="input[name='firstName']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("Mohd.");
			
			//Last name
			cssSel="input[name='lastName']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("Jabi");
			
			//Phone
			cssSel="input[name='phone']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("8595958487");
			
			//Mail
			cssSel="input[name='userName']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("mjsi123456@gmail.com");
			
			//Address1
			cssSel="input[name='address1']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("Cottonpete");
			
			//Address2
			cssSel="input[name='address2']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("Chickpete");
			
			//City
			cssSel="input[name='city']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("Bangalore");
			
			//State
			cssSel="input[name='state']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("Karnataka");
			
			//Postal Code
			cssSel="input[name='postalCode']";
			ch.findElement(By.cssSelector(cssSel)).click();                                
			ch.findElement(By.cssSelector(cssSel)).sendKeys("560053");
			
			//Country
			cssSel="select[name='country']";
			ch.findElement(By.cssSelector(cssSel)).click();
			Thread.sleep(1000);
			dropdown = new Select(ch.findElement(By.name("country")));
			dropdown.selectByVisibleText("INDIA");
			
			
			//Username
			cssSel="input[name='email']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("mj's");
			
			//New Password
			cssSel="input[name='password']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("786313");
			
			//Confirm Password
			cssSel="input[name='confirmPassword']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("786313");
			
			//submit
			cssSel="input[name='register']";
			ch.findElement(By.cssSelector(cssSel)).click();
			Thread.sleep(2000);
		
		   //____________________________________login________________________________
			
			cssSel="a[href='mercurysignon.php']";
			ch.findElement(By.cssSelector(cssSel)).click();
			Thread.sleep(2000);
			
			//Username
			cssSel="input[name='userName']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("mj's");
			Thread.sleep(2000);
		
			//Password
			cssSel="input[name='password']";
			ch.findElement(By.cssSelector(cssSel)).click();
			ch.findElement(By.cssSelector(cssSel)).sendKeys("786313");
			Thread.sleep(2000);
			
			//submit
			cssSel="input[name='login']";
			ch.findElement(By.cssSelector(cssSel)).click();
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

