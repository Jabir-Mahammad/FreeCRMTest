package fileAssignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindOutHowManyLinesAreThereInAFile {

	public static void main(String[] args) {
		findLines();

	}
	
	static void findLines()
	{
		BufferedReader br = null;
		int cnt=0;
		try
		{
			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\text.txt"));
			
			
			while((br.readLine())!=null)
			{
				cnt++;
			}
			System.out.println("no. of lines are: "+cnt);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			br=null;
		}
	
	}

}
