package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedResumeUpload {

	public static void main(String[] args) {
		indeed();

	}
	
	static void indeed()
	{
		ChromeDriver ch = null;
		
		try
		{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
		ch = new ChromeDriver();
       ch.get("https://www.indeed.co.in/?r=us");
       ch.manage().window().maximize();
       Thread.sleep(2000);
       
       //press UPLOAD RESUME button
       ch.findElement(By.xpath("/html/body/div/div[3]/div[2]/span[2]/a")).click();
       Thread.sleep(5000);
       ch.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[1]/button")).click();
     
       //running indeed autoIT program
        autoITDemo1();
       
       Thread.sleep(2000);
       
       ch.findElement(By.xpath("//*[@id='container']/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div[1]/form/button")).click();
   
       
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			ch=null;
		}
	}
	
    static void autoITDemo1()
   	{
   		String strExeFile = null;
   		try {
   			strExeFile = "C:\\Users\\Lenovo\\Desktop\\AutoIt\\indeed.exe";
   			Runtime.getRuntime().exec(strExeFile);
   		}catch(Exception e)
   		{
   			e.printStackTrace();
   		}
   	}

}
