package com.crm.qa.stepDefinition;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginStepDefinition extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user is on browser$")
	public void user_is_on_browser() throws Throwable {
	    TestBase.initialization();
	}

	@Given("^validate that user is on login page$")
	public void validate_that_user_is_on_login_page() throws Throwable {
	    
		String title = driver.getTitle();
		//Assert.assertEquals("", title);
		System.out.println(title);
	}

	@Given("^user login the Application$")
	public void user_login_the_Application() throws Throwable {
	    loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
	   
	    homepage = new HomePage();
		String title =homepage.verifyHomePageTitle();
		//Assert.assertEquals("", title);
		System.out.println(title);
	}
	
}
