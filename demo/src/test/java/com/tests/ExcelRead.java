package com.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtility;

public class ExcelRead {
	
	WebDriver driver;

	@BeforeTest
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();

	}
	//@AfterTest
	public void tearDown(){

	driver.quit();
	}

	@DataProvider
	public Object[][] loginData() throws IOException{
		return ExcelUtility.readFromExcel("C:\\Users\\Lenovo\\Desktop\\slenium3++Training\\dataDriven.xlsx");
	}
	
	@Test(dataProvider="loginData")
	public void excelRead(String uname, String pwd, String status) throws InterruptedException, AWTException{
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(10000);
		
    }


	//@Test
	public void excelWrite() throws IOException {
		String path = "C:\\Users\\Lenovo\\Desktop\\slenium3++Training\\dataDriven.xlsx";
		String outputPath = "C:\\Users\\Lenovo\\Desktop\\slenium3++Training\\dataDriven.xlsx";
		ExcelUtility.writeToExcel(path, outputPath);
		System.out.println("written");
	}
}
