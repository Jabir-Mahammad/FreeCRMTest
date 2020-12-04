package fileAssignment;

import java.io.File;

public class RenameAllTheTextFiles {

	public static void main(String[] args) {
		
		renameTextFiles();
	}
  
	static void renameTextFiles()
	{
	  File f1 = null;
	  File  f2=null;
	  boolean flag=false;
	  try
	  {
		  f1 = new File("C:\\Users\\Lenovo\\Desktop\\javaA\\Demo1");
		  
		  File arr[]=f1.listFiles();
		  int i=1;
		  for(File ff:arr)
		  {
			String name=ff.getName();
			if(name.contains(".txt"))
			{
				String newName="text"+i+".txt";
				i++;
				f2=new File(f1,newName);
				flag=ff.renameTo(f2);
			}
				
		  }
		  if(flag)
			  System.out.println("renamed Successfully");
		  else
			  System.out.println("there is no text file");
		  
	  }catch(Exception e) {
		  
	  }
	  finally
	  {
		  
	  }
	}
}
