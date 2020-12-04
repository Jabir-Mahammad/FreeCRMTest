package handleAlertPopUpAndFrames.AlertDemo.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
	public static void main(String[] args) {
		ChromeDriver ch = null;
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Evening_Workspace_OCT2018\\Selenium_Project\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
			Thread.sleep(2000);
			
			//SWitch to First frame using index
			ch.switchTo().frame(0);
			ch.findElement(By.linkText("org.openqa.selenium")).click();
			Thread.sleep(2000);
			ch.switchTo().defaultContent();
			
			//SWitch to second frame using name
			ch.switchTo().frame("packageFrame");
			ch.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			ch.switchTo().defaultContent();
			
			
			
			//SWitch to second frame using name
			WebElement oFrame = ch.findElement(By.name("classFrame"));
			ch.switchTo().frame(oFrame);
			String sText = ch.findElement(By.xpath("//h2")).getText();
			System.out.println(sText);
			
			
			Thread.sleep(2000);
			ch.switchTo().defaultContent();
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
}
