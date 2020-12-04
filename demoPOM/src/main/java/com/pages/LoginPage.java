package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class LoginPage extends LoadableComponent<LoginPage> {
	
	WebDriver driver;
	
	@FindBy(name="email")
	private WebElement emailTxtBox;
	
	@FindBy(name="password")
	private WebElement pswrdTxtBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void loginAsAdmin(String email, String pwd) {
		
		emailTxtBox.clear();
		pswrdTxtBox.clear();
		
		emailTxtBox.sendKeys(email);
		pswrdTxtBox.sendKeys(pwd);
		loginBtn.click();
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	@Override
	protected void load() {
		
		driver.get("http://www.phptravels.net/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Override
	protected void isLoaded() {
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.startsWith("https://www.phptravels.net/admin"), "Some Error!! Not on the correct Page");
	}
	

}
