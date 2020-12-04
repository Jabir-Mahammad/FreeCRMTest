package popuptestAssignment;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimedPOpUP {
	public static void main(String[] args) {
		ChromeDriver ch = null;
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.get("http://popuptest.com/");
			Thread.sleep(2000);
			ch.findElement(By.linkText("Timed PopUp")).click();
			Thread.sleep(5000);
			String sParent = ch.getWindowHandle();
			System.out.println("sParent: "+sParent);
			
			int count=0;
			
			while(ch.getWindowHandles().size()>=2)
			{
				
				Set<String> oChild = null;
		 		String sChild = null;
		 		Point xy;
		 		
				oChild = ch.getWindowHandles();
				for(String child:oChild)
	 			{
	 				sChild = child;
	 				String strURL = ch.switchTo().window(sChild).getCurrentUrl();
	 				if(!(strURL.equals("http://popuptest.com/popuptest3.html")))
	 				{
	 					count++;
	 					System.out.println("sChild: "+sChild);
	 					ch.switchTo().window(sChild);
	 					System.out.println(ch.getCurrentUrl());
	 					
	 					xy = ch.manage().window().getPosition();
						xy.x=xy.x+100;
						xy.y=xy.y+200;
						ch.manage().window().setPosition(xy);
						
						ch.close();
	 					Thread.sleep(4000);
	 				}
	 				if(count==4)
		 				break;
	 				
	 			}
				if(count==4)
	 				break;
				
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
}

