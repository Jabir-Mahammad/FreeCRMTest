package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Hooks {

	@Before("@First")
	public void setUp() {
		System.out.println("Chrome launched");
	}
	
	@After("@First")
	public void tearDown() {
		System.out.println("Chrome closed");
	}
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    System.out.println("user is on login page");
	}

	@Then("^enter uname and pwd$")
	public void enter_uname_and_pwd() throws Throwable {
	    System.out.println("uname and pd is entered");
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    System.out.println("clicked on Login button");
	}

	@Given("^user on home page$")
	public void user_on_home_page() throws Throwable {
	    System.out.println("user is on Home page");
	}

	@Then("^verify the title$")
	public void verify_the_title() throws Throwable {
	    System.out.println("verifyng the title");
	}
	
	@Given("^on contact page$")
	public void on_contact_page() throws Throwable {
	    System.out.println("on contacts page");
	}

	@Given("^Validate contacts name$")
	public void validate_contacts_name() throws Throwable {
	    System.out.println("contacts nae validated");
	}

	
}
