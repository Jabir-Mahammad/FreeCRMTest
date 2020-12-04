package fileAssignment;

import java.io.File;

//try to delete the directory when it consist of files inside it

public class DeleteDirectory {

	public static void main(String[] args) {
		deleteDir();

	}
 
	static void deleteDir()
	{
		File f = null;
		try
		{
			f = new File("C:\\Users\\Lenovo\\Desktop\\javaA\\host");
			if(f.delete())
				System.out.println("deleted");
			else
				System.out.println("can't delete directory,there are files inside");
		}catch(Exception e)
		{
			
		}
	}
}
