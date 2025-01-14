import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlashObjectTestYoutube {

	public static void main(String arg[]) throws FindFailed {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");
		driver.manage().window().maximize();
		
		//create the object of Screen class- from sikuli
		Screen scrn = new Screen();
		
		Pattern pat = new Pattern("pauseBtn.PNG");
		scrn.wait(pat,2000);
		scrn.click();
		//scrn.click();
		
		Pattern pat2 = new Pattern("playButton.PNG");
		scrn.wait(pat2,2000);
		scrn.click();
		//scrn.click();
		
		Pattern pat3 = new Pattern("settingBtn.PNG");
		scrn.wait(pat3,2000);
		scrn.click();
		//scrn.click();
	}
	
}
