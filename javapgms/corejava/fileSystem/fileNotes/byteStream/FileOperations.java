package byteStream;

import java.io.File;

public class FileOperations {
	public static void main(String[] args) {
		//getFileAttributes();
		//createNewFile();
		//renameFile();
		//moveFile();
		//deleteFiles();
		//FileCollection1();
		FileCollection2();
	}
	
	//File attributes
	static void getFileAttributes()
	{
		File f1 = null;
		try {
			f1 = new File("D:\\CoreJava\\Sample.txt");
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
	
	
	//createNewFile()
	static void createNewFile()
	{
		File f1 = null;
		try {
			f1 = new File("D:\\CoreJava\\Sample.txt");
			boolean blnRes = f1.createNewFile();
			if(blnRes)
			{
				System.out.println("New file created");
			}else System.out.println("Failed to create File");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			f1 = null;
		}
	}
	
	
	//renameTo(): to rename the file
	static void renameFile()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("D:\\CoreJava\\Sample.txt");
			f2 = new File("D:\\CoreJava\\Example.txt");
			
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
	
	
	
	//renameTo(): to move the file
	static void moveFile()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("D:\\CoreJava\\Example.txt");
			f2 = new File("D:\\CoreJava\\Test\\Example.txt");
			
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
	static void deleteFiles()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("D:\\CoreJava\\Sample.txt");
			f2 = new File("D:\\CoreJava\\Example.txt");
			
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
	
	
	//File collection: using .list() method
	static void FileCollection1()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("D:\\CoreJava\\Sample");
			
			String sFile[] = f1.list();
			for(int i=0;i<sFile.length;i++)
			{
				f2 = new File(f1, sFile[i]);
				if(f2.isFile())
				{
					System.out.println(f2.getPath());
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
	
	
	//File collection: using .listFiles() method
	static void FileCollection2()
	{
		File f1 = null;
		try {
			f1 = new File("D:\\CoreJava\\Sample");
			File oFile[] = f1.listFiles();
			
			for(int i=0;i<oFile.length;i++)
			{
				if(oFile[i].isFile())
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
}