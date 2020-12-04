package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
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
			
			oAlert = ch.switchTo().alert();
			String sText = oAlert.getText();
			System.out.println(sText);
			oAlert.accept();
			
			Thread.sleep(2000);
			ch.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			ch = null;
			oAlert = null;
		}
	}
}
