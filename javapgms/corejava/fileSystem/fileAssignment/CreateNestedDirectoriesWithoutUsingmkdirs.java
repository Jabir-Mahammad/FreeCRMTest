package fileAssignment;

import java.io.File;

public class CreateNestedDirectoriesWithoutUsingmkdirs {

	public static void main(String[] args) {
	
		directoryCreation();
	}

	static void directoryCreation()
	{
		File f1= null;
		String arr[]= {"A","B","C"};
		String x = ""; 
		try
		 {
			 for(String s:arr)
			 {
				 x+="\\"+s;
				 f1 = new File("C:\\Users\\Lenovo\\Desktop\\javaA\\play"+x);
				 f1.mkdir();
			 }
			 
		 }catch(Exception e)
		 {
			 
		 }
	}

}
