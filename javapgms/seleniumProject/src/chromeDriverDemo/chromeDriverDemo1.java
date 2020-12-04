package chromeDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriverDemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\dsktopFiles\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		

	}

}
