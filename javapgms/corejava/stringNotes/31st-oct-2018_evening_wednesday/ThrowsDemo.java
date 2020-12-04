package exception;

import java.io.FileInputStream;

public class ThrowsDemo {
	public static void main(String args[])
	{
		try {
			fileSystem();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void fileSystem() throws NullPointerException, Exception
	{
		FileInputStream fin = null;
		fin = new FileInputStream("D:\\CITY\\Sample.txt");
		System.out.println(fin.getClass());
	}
}
