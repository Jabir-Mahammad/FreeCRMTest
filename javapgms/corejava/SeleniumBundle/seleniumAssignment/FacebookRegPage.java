package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//goto google and search fb registration and enter values in reg page and close window

public class FacebookRegPage {
public static void main(String arg[]) {
	FbReg();
}
static void FbReg()

{
	ChromeDriver ch = null;
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
        ch = new ChromeDriver();
        ch.manage().window().maximize();
        ch.get("https://www.google.com/");
       Thread.sleep(2000);
       
      ch.findElement(By.name("q")).sendKeys("fb registration");
      Thread.sleep(2000);
      ch.findElement(By.name("btnK")).click();
      Thread.sleep(2000);
      ch.findElement(By.className("LC20lb")).click();
      Thread.sleep(3000);
      ch.findElement(By.id("u_0_k")).sendKeys("Jabir");
      ch.findElement(By.id("u_0_m")).sendKeys("mahammad");
      ch.findElement(By.id("u_0_p")).sendKeys("7259418407");
      ch.findElement(By.id("u_0_w")).sendKeys("123456");
      ch.findElement(By.id("day")).sendKeys("22");
      ch.findElement(By.id("month")).sendKeys("may");
      ch.findElement(By.id("year")).sendKeys("1996");
      ch.findElement(By.id("u_0_7")).click();
      
      
	}catch(Exception e)
	{
		System.out.println(e);
	}

	finally {
		ch=null;
	}
}
}
