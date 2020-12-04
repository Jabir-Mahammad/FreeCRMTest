package byteStream;

import java.io.File;

public class DirectoryOperations {
	public static void main(String[] args) {
		//createDir();
		//nestedDirs();
		//renameDir();
		//moveDir();
		//deleteDirs();
		//DirCollection1();
		//DirCollection2();
		getDirAttributes();
	}

	//mkdir(): to create dir
	static void createDir()
	{
		File f1 = null;
		try {
			f1 = new File("D:\\CoreJava\\Test");
	
			if(f1.mkdir())
			{
				System.out.println("New dir created");
			}else {
				System.out.println("Failed to create Dir");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			f1 = null;
		}
	}
	
	
	//mkdirs() - to create nested Dir
	static void nestedDirs()
	{
		File f1 = null;
		try {
			f1 = new File("D:\\CoreJava\\A\\B\\C\\D\\E\\F");
			if(f1.mkdirs())
			{
				System.out.println("NEsted Dir's created");
			}else {
				System.out.println("Failed to created nested Dir's");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			f1 = null;
		}
	}
	
	
	//renameTo(): to rename the Dir
	static void renameDir()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("D:\\CoreJava\\Test");
			f2 = new File("D:\\CoreJava\\Example");
			
			boolean blnRes = f1.renameTo(f2);
			if(blnRes) System.out.println("Renamed successful");
			else System.out.println("Failed to rename");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			f1 = null;
			f2 = null;
		}
	}
	
	
	
	//renameTo(): to Move the Dir
	static void moveDir()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("D:\\CoreJava\\Example");
			f2 = new File("D:\\CoreJava\\Sample\\Example123");
			
			boolean blnRes = f1.renameTo(f2);
			if(blnRes) System.out.println("Moved successful");
			else System.out.println("Failed to Move");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			f1 = null;
			f2 = null;
		}
	}
	
	
	//delete() & deleteOnExit()
	static void deleteDirs()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("D:\\CoreJava\\Test");
			f2 = new File("D:\\CoreJava\\Example");
			
			boolean blnRes = f1.delete();
			if(blnRes) System.out.println("Deleted");
			else System.out.println("Not deleted");
			
			
			f2.deleteOnExit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			f1 = null;
			f2 = null;
		}
	}
	
	
	//Dir collection: using .list() method
	static void DirCollection1()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("C:\\Users\\Lenovo\\Desktop\\javaA");
			
			String sFile[] = f1.list();
			for(int i=0;i<sFile.length;i++)
			{
				f2 = new File(f1, sFile[i]);
				if(f2.isDirectory())
				{
					System.out.println("yes it is");
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			f1 = null;
			f2 = null;
		}
	}
	
	
	//Dir collection: using .listFiles() method
	static void DirCollection2()
	{
		File f1 = null;
		try {
			f1 = new File("D:\\CoreJava\\Sample");
			File oFile[] = f1.listFiles();
			
			for(int i=0;i<oFile.length;i++)
			{
				if(oFile[i].isDirectory())
				{
					System.out.println(oFile[i].getPath());
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			f1 = null;
		}
	}
	
	
	//Folder attributes
	static void getDirAttributes()
	{
		File f1 = null;
		try {
			f1 = new File("D:\\CoreJava");
			System.out.println("getAbsolutePath: "+f1.getAbsolutePath());
			System.out.println("getName: "+f1.getName());
			System.out.println("getPath: "+f1.getPath());
			System.out.println("getFreeSpace: "+f1.getFreeSpace());
			System.out.println("getParent: "+f1.getParent());
			System.out.println("getTotalSpace: "+f1.getTotalSpace());
			System.out.println("getUsableSpace: "+f1.getUsableSpace());
			System.out.println("isFile: "+f1.isFile());
			System.out.println("isDirectory: "+f1.isDirectory());
			System.out.println("isHidden: "+f1.isHidden());
			System.out.println("canExecute: "+f1.canExecute());
			System.out.println("canRead: "+f1.canRead());
			System.out.println("canWrite: "+f1.canWrite());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			f1 = null;
		}
	}
}