package conditions;

import java.io.File;

import org.junit.Test;

public class ExceptionTest {

	@Test(expected=ArithmeticException.class)
	public void division()
	{
		int result = 10 /2;
		System.out.println("division: "+result);
	}
	
	@Test(expected=NullPointerException.class)
	public void fileSystem()
	{
		File f1 = null;
		//f1 = new File("D:\\CITY\\Sample.txt");
		long length = f1.length();
		System.out.println("length: "+length);
	}
}
