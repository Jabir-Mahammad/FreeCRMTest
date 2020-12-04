package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FacebookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fbDemo();
	}

	
	static void fbDemo()

	{
		ChromeDriver ch = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
	        ch = new ChromeDriver();
	        ch.manage().window().maximize();
	        ch.get("https://www.google.com/");
	       Thread.sleep(2000);
	       
	      ch.findElement(By.name("q")).sendKeys("fb login");
	      Thread.sleep(1000);
	      ch.findElement(By.name("btnK")).click();
	      Thread.sleep(2000);
	      ch.findElement(By.className("LC20lb")).click();
	      ch.findElement(By.name("email")).sendKeys("7259418407");
	      ch.findElement(By.name("pass")).sendKeys("mjsi78631366");
	      ch.findElement(By.id("loginbutton")).click();
	      Thread.sleep(3000);
	      ch.findElement(By.className("_1frb")).sendKeys("Subrahmanya s");
	      Thread.sleep(2000);
	      ch.findElement(By.className("_42ft _4jy0 _4w98 _4jy3 _517h _51sy")).click();
	      Thread.sleep(1000);
	      ch.findElement(By.className("_54nh")).click();
	      

		}catch(Exception e)
		{
			System.out.println(e);
		}

		finally {
			ch=null;
		}
	}
}
