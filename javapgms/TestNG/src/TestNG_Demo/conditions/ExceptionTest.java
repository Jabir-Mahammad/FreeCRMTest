package TestNG_Demo.conditions;

import java.io.File;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(expectedExceptions=NullPointerException.class)
	public void FileSystem()
	{
		File f1 = null;
		long length = f1.length();
		System.out.println("length: "+length);
	}
}
