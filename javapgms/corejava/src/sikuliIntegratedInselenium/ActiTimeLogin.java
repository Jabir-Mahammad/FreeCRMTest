package sikuliIntegratedInselenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class ActiTimeLogin {

	public static void main(String[] args) {
		actiTimeLogin();
	}

	public static void actiTimeLogin()
	{
		ChromeDriver ch = null;
		try
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.get("http://localhost/user/submit_tt.do");
			ch.manage().window().maximize();
			Thread.sleep(2000);
			sikuliLogin();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			ch = null;
		}
	}
	
	public static void sikuliLogin()
	{
		Screen sc = null;
		
		//to perform operations like click,type etc..
		Match name = null;
		try
		{
			//screen object for Sikuli
			sc = new Screen();
			
			//get username field using its image
			name = sc.find(System.getProperty("user.dir")+"\\Library\\sikuliImages\\username.png");
			name.type("admin");
			
		
			//after username click somewhere outside to collapse dropdown in username so here we clicking logo
			name = sc.find(System.getProperty("user.dir")+"\\Library\\sikuliImages\\logo.png");
			name.click();
			
			//then get password field and click on it and pass values
			name = sc.find(System.getProperty("user.dir")+"\\Library\\sikuliImages\\psswrd.png");
			name.click();
			name.type("manager");
			
			//finally get login image and click for login
			name = sc.find(System.getProperty("user.dir")+"\\Library\\sikuliImages\\loginBtn.png");
			name.click();
			
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			sc = null;
			name = null;
		}
	}
}
