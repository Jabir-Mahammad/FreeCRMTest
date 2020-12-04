package fileAssignment;
import java.io.File;
public class DeleteOnlyExcelFilesFromTheDirectory {

	public static void main(String[] args) {
		deleteExcelFiles();

	}
	
	static void deleteExcelFiles()
	{
		File f1 = null;
		
	try 
	{
		f1=new File("C:\\Users\\Lenovo\\Desktop\\javaA");
		File arr[]=f1.listFiles();
		boolean flag=false;

		for(int i=0;i<arr.length;i++)
		{
			String name=arr[i].getName();
			if(name.contains(".xlsx"))
			{
			
				flag=arr[i].delete();
					
			}
			/*else
			{
				if(i==arr.length-1)
					System.out.println("there is no more excel file");
				else
					continue;
			}*/
			
	    }
		if(flag)
			System.out.println("The all Excel files are deleted");
		else
			System.out.println("OOpss!! There is no Excel file!!");
			
	  }catch(Exception e) {
		e.printStackTrace();
	}
	finally
	{
		f1=null;
	}
		
	}

}
