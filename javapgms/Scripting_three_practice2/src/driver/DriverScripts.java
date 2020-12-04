package driver;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import methods.AppDependentMethods;
import methods.AppIndependentmethods;
import testScript.TestScript;

public class DriverScripts {

        public static AppIndependentmethods appInd = null;
		public static AppDependentMethods appDep = null;
		public static TestScript script = null;
		public static boolean blnResult = false;
		public static void main(String[] args) {

			try
			{
				appInd = new AppIndependentmethods();
				appDep = new AppDependentMethods();
				
				script = new TestScript();
			
			/*	blnResult=script.TC_Login_Logout();
				if(blnResult)
				{
					appInd.writeReport("Pass", "Login is passed");
				}
				else {
					appInd.writeReport("Fail", "Login is failed");
				} */
				
				/*	blnResult=script.createAndDeleteUser();
				if(blnResult)
				{
					appInd.writeReport("Pass", "User Creation and Deletion is passed");
				}
				else {
					appInd.writeReport("Fail",  "User Creation and Deletion is failed");
				} */
				
				
				blnResult = script.createAndDeleteProject();
				if(blnResult)
					appInd.writeReport("Pass", "user created and deleted successfully");
				else
					appInd.writeReport("Fail", "failed to  create  and delete user"); 
				
			/*	blnResult = script.createAndDeleteTask();
				if(blnResult)
					appInd.writeReport("Pass", "Task is created and deleted successfully");
				else
					appInd.writeReport("Fail", "failed to  create  and delete Task"); */

				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				appInd = null;
				appDep = null;
				script = null;
			}
	}

}
