package com.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotClass {
	
	
	WebDriver driver;

	@BeforeTest
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	}
	@AfterTest
	public void tearDown(){

	driver.quit();
	}

	@Test
	public void contextClickTest() throws InterruptedException, AWTException{

	driver.get("https://blueimp.github.io/jQuery-File-Upload/");

	//driver.get("https://demoguru99.com/test/upload");
	String path = "C:\\DSC_0009.JPG";
	StringSelection sel = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);

	Thread.sleep(20000);
	driver.findElement(By.xpath("//*[text()='Add files...']")).click();
	Thread.sleep(5000);

	Robot rb = new Robot();
	Thread.sleep(2000);

	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);

	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);

	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);

	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);

	driver.findElement(By.xpath("//input[value='press']")).click();
	Thread.sleep(5000);
	}

}
