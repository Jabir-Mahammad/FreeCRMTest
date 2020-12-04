package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromDriverDemo {

	public static void main(String[] args) {
		ChromeDriver ch = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
	        ch = new ChromeDriver();
	        ch.manage().window().maximize();
	        ch.get("http://localhost/login.do");
	       Thread.sleep(2000);
	       
	       ch.findElement(By.id("username")).sendKeys("admin");
	      ch.findElement(By.name("pwd")).sendKeys("manager");
	       ch.findElement(By.id("loginButton")).click();
	       ch.findElement(By.id("keepLoggedInCheckBox")).click();
	      Thread.sleep(2000);
	     ch.findElement(By.id("logoutLink")).click();
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
//<a href="/logout.do" id="logoutLink" class="logout">Logout</a>