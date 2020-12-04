package actiTimeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDeleteTask {

	public static void main(String[] args) {
		
		createDeleteTask();
	}
	
	static void createDeleteTask()
	{
		ChromeDriver cd =  null;
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\javapgms\\corejava\\Library\\drivers\\chromedriver.exe");
			cd = new ChromeDriver();
			cd.manage().window().maximize();
			cd.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			cd.findElement(By.name("username")).sendKeys("admin");
		    cd.findElement(By.name("pwd")).sendKeys("manager");
		   
            cd.findElement(By.id("keepLoggedInLabel")).click();
		    cd.findElement(By.id("loginButton")).click();
		    Thread.sleep(2000);
		    
		    String text = cd.findElement(By.className("pagetitle")).getText();
		    
		    if(text.equals("Enter Time-Track"))
		    	System.out.println("Login Success");
		    else
		    	System.out.println("Loin Failed!!");
		    
		    Thread.sleep(2000);
		    //cancelling pop-up window
		   // cd.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
		  //  Thread.sleep(2000);
		   
		    //switch to TASKS tab
		    cd.findElement(By.xpath("//div[text()='TASKS']")).click();
		    Thread.sleep(2000);
		   
		    //create new task
		    cd.findElement(By.xpath("//div[text()='Add New Task']")).click();
		    Thread.sleep(2000);
		    cd.findElement(By.className("createNewTask")).click();
		    Thread.sleep(2000);
		   // cd.findElement(By.id("ext-comp-1019")).click();
		  //  Thread.sleep(1000);
		  //  cd.findElement(By.id("ext-gen153")).click();
		  //  Thread.sleep(1000);

		   cd.findElement(By.id("createTasksPopup_newCustomer")).sendKeys("Customer_1");
		   cd.findElement(By.id("createTasksPopup_newProject")).sendKeys("Project_2");
		    Thread.sleep(2000);
cd.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("task_1");
cd.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[2]/td[1]/input")).sendKeys("task_2");
cd.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[3]/td[1]/input")).sendKeys("task_3");
            cd.findElement(By.id("createTasksPopup_commitBtn")).click();
            Thread.sleep(4000);
             
            cd.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/table/tbody/tr/td[1]/div/div")).click();
            Thread.sleep(2000);
            cd.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]")).click();
            
            Thread.sleep(2000);
            cd.findElement(By.id("deleteTaskPopup_deleteConfirm_submitBtn")).click();
            
            
		    
		    
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			cd = null;
		}
	}

}
