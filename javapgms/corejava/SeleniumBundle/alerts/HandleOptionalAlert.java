package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleOptionalAlert {
	public static void main(String[] args) {
		ChromeDriver ch = null;
		Alert oAlert = null;
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Evening_Workspace_OCT2018\\Selenium_Project\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.get("file:///D:/CoreJava/AlertDemo/SampleWebPage.html");
			Thread.sleep(2000);
			
			ch.findElement(By.id("btn_id1")).click();
			Thread.sleep(2000);
			if(isAlertPresent(ch))
			{
				System.out.println("Alert is present. Hence handle the alert");
				oAlert = ch.switchTo().alert();
				String sText = oAlert.getText();
				System.out.println(sText);
				oAlert.accept();
			}else {
				System.out.println("No Alert found");
			}
			
			Thread.sleep(2000);
			ch.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			ch = null;
		}
	}
	
	
	static boolean isAlertPresent(ChromeDriver oChrome)
	{
		try {
			oChrome.switchTo().alert();
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
}
