
	 package popuptestAssignment;

	 import java.util.Set;
	 import org.openqa.selenium.By;
	 import org.openqa.selenium.Point;
	 import org.openqa.selenium.chrome.ChromeDriver;

	 public class PopupComeAndGo {
	 	public static void main(String[] args) {
	 		ChromeDriver ch = null;
	 		try {
	 			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
	 			ch = new ChromeDriver();
	 			ch.manage().window().maximize();
	 			ch.get("http://popuptest.com/");
	 			Thread.sleep(2000);
	 			
	 			
	 			ch.findElement(By.linkText("Come & Go Test")).click();
	 			Thread.sleep(5000);
	 			
	 			
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
	 		
	 		try{
	 			oChild = oChrome.getWindowHandles();
	 			
	 			for(String child:oChild)
	 			{
	 				sChild = child;
	 				String strURL = oChrome.switchTo().window(sChild).getCurrentUrl();
	 				if(!(strURL.equals("http://popuptest.com/popuptest2.html")))
	 				{
	 					System.out.println("sChild: "+sChild);
	 					oChrome.switchTo().window(sChild);
	 					System.out.println(oChrome.getCurrentUrl());
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
