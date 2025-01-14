package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactLabel;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(xpath="//input[@type='button' and @value='Load From Company']//following::input")
	WebElement saveBtn;
	
	public ContactsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactLable() {
		
		return contactLabel.isDisplayed();
	}
	
	public void selectContactByname(String name) {
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
	
	public void createNewContact(String title, String fName, String lName, String company ) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByValue(title);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		saveBtn.click();
	}
}
