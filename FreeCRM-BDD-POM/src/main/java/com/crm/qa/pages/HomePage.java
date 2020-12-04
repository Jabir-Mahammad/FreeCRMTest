package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cr.qa.util.TestUtil;
import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	TestUtil testutil = new TestUtil();
	
	@FindBy(xpath="//td[contains(text(),'User: Demo User')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	WebElement contactsLinks;
	
	@FindBy(xpath="//a[contains(text(), 'New Contact')]")
	WebElement NewContactsLinks;
	
	@FindBy(xpath="//a[contains(text(), 'Deals')]")
	WebElement dealsLinks;
	
	@FindBy(xpath="//a[contains(text(), 'Tasks')]")
	WebElement taskLinks;
	
	//inialization of WebElements using Page Factory
	public HomePage() {
			PageFactory.initElements(driver, this); 
		}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLinks() {
		testutil.switchToFrame();
		contactsLinks.click();
		return new ContactsPage();
	}
	
    /*public DealsPage clickOnDealsLinks() {
		testutil.switchToFrame();
    	dealsLinks.click();
		return new DealsPage();
	}*/
		
    public TasksPage clickOnTaskLinks() {
    	testutil.switchToFrame();
    	taskLinks.click();
		return new TasksPage();
	}
    
    public void clickOnNewContactLink() {
    	
    	testutil.switchToFrame(); 
    	Actions actions = new Actions(driver);
    	actions.moveToElement(contactsLinks).build().perform();
    	NewContactsLinks.click();
    }
		
}
