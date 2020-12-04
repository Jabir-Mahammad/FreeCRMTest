package fileAssignment;
import java.io.File;


//find out no. of text word and excel files i a directory

public class FindOutHowManyDiffFilesInAdirectory {

	public static void main(String[] args) {
		findFiles();

	}
	
	static void findFiles()
	{
		File f1= null;
		int cnt1=0,cnt2=0,cnt3=0;
		try 
		{
		 f1 = new File("C:\\Users\\Lenovo\\Desktop\\javaA");
		 File arr[]=f1.listFiles();
		 for(File ff : arr)
		 {
			 String fileName=ff.getName();
			 if(fileName.contains(".txt"))
				 cnt1++;
			 else if(fileName.contains(".docx"))
				 cnt2++;
			 else
				 cnt3++;
		 }
		 System.out.println("no.of Text Files: "+cnt1);
		 System.out.println("no.of Word Files: "+cnt2);
		 System.out.println("no.of Excel Files: "+cnt3);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			f1=null;
		}
	}

}
