package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='logout']/a/strong")
	private WebElement logoutBtn;
	
	public DashboardPage(WebDriver driver) {
		
		this.driver = driver;
	} 
	
	public void LogoutAsAdmin() {
		
		logoutBtn.click();
	}
	
	public String getPageTitl() {
		
		return driver.getTitle();
	}

}
