package TestNG_Demo.conditions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDemo {

	@Parameters(value= {"strUN","strPWD"})
	@Test
	public void loginToApp(String strUN, String strPWD)
	{
		System.out.println("The userName '"+strUN+"' & password '"+strPWD+"' are matching");
		System.out.println("Login was successful");
	}
}
