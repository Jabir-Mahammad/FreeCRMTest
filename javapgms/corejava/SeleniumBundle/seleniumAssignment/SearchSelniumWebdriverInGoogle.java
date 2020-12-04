package seleniumAssignment;


//search "selenium web driver ib google" and switch to first link
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSelniumWebdriverInGoogle {

	public static void main(String ag[]) {
		SeleniumSearch();
	}

static void SeleniumSearch()

{
	ChromeDriver ch = null;
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
        ch = new ChromeDriver();
        ch.manage().window().maximize();
        ch.get("https://www.google.com/");
       Thread.sleep(2000);
       
      ch.findElement(By.name("q")).sendKeys("selenium web driver");
      ch.findElement(By.name("btnK")).click();
      Thread.sleep(2000);
      ch.findElement(By.className("LC20lb")).click();

	}catch(Exception e)
	{
		System.out.println(e);
	}

	finally {
		ch=null;
	}
}
}
