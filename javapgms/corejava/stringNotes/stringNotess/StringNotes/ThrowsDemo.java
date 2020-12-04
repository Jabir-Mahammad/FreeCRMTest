package stringNotess.StringNotes;

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
	
	
	public static void fileSystem() throws NullPointerException

	{
		FileInputStream fin = null;
		
		System.out.println(fin.getClass());
	}
}
