package seleniumClassExerciseActiTime;
//finding wether login successful and create a user, after that delete the same user, finally logout (in Mozilla firefox)
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CreateAndDeleteUserInFirefox {

	public static void main(String[] args) {
		createAndDeletUser();

	}
	
	static void createAndDeletUser()
	{
		FirefoxDriver ch = null;
	try {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\geckodriver.exe");
     ch = new FirefoxDriver();
     ch.manage().window().maximize();
     //load application
     ch.get("http://localhost/login.do");
     Thread.sleep(2000);
    
     //for login crediatials
    ch.findElement(By.id("username")).sendKeys("admin");
    ch.findElement(By.name("pwd")).sendKeys("manager");
    ch.findElement(By.id("keepLoggedInCheckBox")).click();
    ch.findElement(By.id("loginButton")).click();
    Thread.sleep(4000);
   
   //to search whether login succesfull
    String text =  ch.findElement(By.className("pagetitle")).getText();
    if(text.equals("Enter Time-Track"))
 	  System.out.println("login success");
    else
 	  System.out.println("login faild");
    
    ch.findElement(By.className("users")).click();
 
   /*  we can also locate the USERS tab using 
   * ch.findElement(By.xpath("//div[text()='USERS']")).click();
   */
   
   Thread.sleep(3000);
   ch.findElement(By.className("addUserButton")).click();
   Thread.sleep(2000);
   ch.findElement(By.className("firstNameField")).sendKeys("first");
   ch.findElement(By.className("lastNameField")).sendKeys("last");
   ch.findElement(By.className("emailField")).sendKeys("first.last@gmail.com");
   ch.findElement(By.className("usernameField")).sendKeys("mahj");
   ch.findElement(By.className("passwordField")).sendKeys("123456");
   ch.findElement(By.className("passwordCopyField")).sendKeys("123456"); 
   ch.findElement(By.className("buttonTitle")).click();
   Thread.sleep(2000);
 
  ch.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
   Thread.sleep(2000);
  ch.findElement(By.id("userDataLightBox_deleteBtn")).click();
 
  //to handle javaScript alert
  ch.switchTo().alert().accept();
  
  Thread.sleep(2000);
  //ch.findElement(By.id("logoutLink")).click();
//  ch.close();
  
	}catch(Exception e)
	{
		System.out.println(e);
	}

	finally {
		ch=null;
	}

	}}
