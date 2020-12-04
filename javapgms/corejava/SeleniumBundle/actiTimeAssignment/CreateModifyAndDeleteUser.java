package actiTimeAssignment;

//finding wether login successfull and create a user, modify user, delete 
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyAndDeleteUser {

	public static void main(String[] args) {
		createAndDeletUser();

	}
	
	static void createAndDeletUser()
	{
	ChromeDriver ch = null;
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
      ch = new ChromeDriver();
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
   {
  	 System.out.println("login success");
   }
   
   else
  	 System.out.println("login faild");
   
   ch.findElement(By.xpath("//div[text()='USERS']")).click();
   Thread.sleep(3000);
   ch.findElement(By.className("addUserButton")).click();
   Thread.sleep(2000);
   ch.findElement(By.className("firstNameField")).sendKeys("user_1");
   ch.findElement(By.className("lastNameField")).sendKeys("last");
   ch.findElement(By.className("emailField")).sendKeys("first.last@gmail.com");
   ch.findElement(By.className("usernameField")).sendKeys("MJ");
   ch.findElement(By.className("passwordField")).sendKeys("123456");
   ch.findElement(By.className("passwordCopyField")).sendKeys("123456"); 
   ch.findElement(By.className("buttonTitle")).click();
   Thread.sleep(5000);
  
   ch.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
   Thread.sleep(2000);
   
   ch.findElement(By.className("firstNameField")).sendKeys("user_2");
   ch.findElement(By.className("lastNameField")).sendKeys("last");
   ch.findElement(By.className("emailField")).clear();
   ch.findElement(By.className("emailField")).sendKeys("first.last@gmail.com");
   ch.findElement(By.className("usernameField")).sendKeys("MJSI");
   ch.findElement(By.className("passwordField")).sendKeys("123456");
   ch.findElement(By.className("passwordCopyField")).sendKeys("123456"); 
   ch.findElement(By.className("buttonTitle")).click();
   Thread.sleep(5000);
   
   ch.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
   Thread.sleep(2000);
   ch.findElement(By.id("userDataLightBox_deleteBtn")).click();
   
   ch.switchTo().alert().accept();
   Thread.sleep(2000);
 //  ch.findElement(By.id("logoutLink")).click();
  // ch.close();
    
   
   
  //  ch.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}

	finally {
		ch=null;
	}

	}}
