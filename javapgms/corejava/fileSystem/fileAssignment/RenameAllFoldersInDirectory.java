package fileAssignment;

import java.io.File;

public class RenameAllFoldersInDirectory {

	public static void main(String[] args) {
		
		renameFolders();
	}
	
	static void renameFolders()
	{
		File f1=null;
		File f2=null;
		int i=0;
		boolean flag=false;
		try
		{
			f1 =  new File("C:\\Users\\Lenovo\\Desktop\\javaA\\demo");
			String mnths[]= {"jan","feb","march"};
			File arr[]=f1.listFiles();
			for(File ff:arr)
			{
				if(ff.isDirectory())
				{
					/*String name=ff.getName();
					f3 = new File(f1,name);
					f2=new File(f1,mnths[i]);
					i++;
					flag=f3.renameTo(f2);*/
					
					f2=new File(f1,mnths[i]);
					i++;
					flag=ff.renameTo(f2);
				}
			}
			if(flag)
				System.out.println("all the files are renamed ");
			else
				System.out.println("there is no file to rename");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally {
		     f1=null;
			 f2=null;
		}
	}

}
