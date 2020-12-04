package handleAlertPopUpAndFrames.AlertDemo.alerts;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {
	public static void main(String[] args) {
		ChromeDriver ch = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.get("http://popuptest.com/");
			Thread.sleep(2000);
			
			System.out.println("Before click: "+popupCount(ch));
			ch.findElement(By.linkText("Multi-PopUp Test")).click();
			Thread.sleep(5000);
			System.out.println("After click: "+popupCount(ch));
			
			String sParent = ch.getWindowHandle();
			System.out.println("sParent: "+sParent);
			if(popupCount(ch)>0)
			{
				//Handle the browser windows
				handleWindows(ch);
			}
			
			ch.switchTo().window(sParent);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			ch.close();
			ch.quit();
			ch = null;
		}
	}
	
	
	static int popupCount(ChromeDriver oChrome)
	{
		int length = 0;
		try {
			length = oChrome.getWindowHandles().size()-1;
			return length;
		}catch(Exception e)
		{
			return -1;
		}
	}
	
	
	static void handleWindows(ChromeDriver oChrome)
	{
		Set<String> oChild = null;
		String sChild = null;
		Point xy;
		try{
			oChild = oChrome.getWindowHandles();
			
			for(String child:oChild)
			{
				sChild = child;
				String strURL = oChrome.switchTo().window(sChild).getCurrentUrl();
				if(!strURL.equals("http://popuptest.com/popuptest1.html"))
				{
					System.out.println("sChild: "+sChild);
					oChrome.switchTo().window(sChild);
					System.out.println(oChrome.getCurrentUrl());
					
					xy = oChrome.manage().window().getPosition();
					xy.x=xy.x+100;
					xy.y=xy.y+200;
					oChrome.manage().window().setPosition(xy);
					Thread.sleep(2000);
					oChrome.close();
				}
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			sChild = null;
			oChild = null;
		}
	}
}
