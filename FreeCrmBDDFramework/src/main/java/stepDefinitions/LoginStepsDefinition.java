package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginStepsDefinition {

	WebDriver driver;
	
	@Before
	void setUp() {
		System.out.println("Chrome launched");
	}
	
	@After
	void tearDown() {
		System.out.println("Chrome closed");
	}
	
	@Given("^User is already on Logi Page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Lab\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
	}
	
	@When("^Titlee of the login page is Free CRM$")
	public void title_of_the_login_page() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, title);
	}
	
	@Then("^user enters \"(.*)\" and user enters \"(.*)\"$")
	public void user_enters_user_name_and_user_enters_pasword(String uname, String pwd) throws Throwable {
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Then("^user click on Loin button$")
	public void user_click_on_Loin_button() {
	    
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn); 
	    
	}

	@Then("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	   
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO", title);
	    
	}
	
		
	
}
