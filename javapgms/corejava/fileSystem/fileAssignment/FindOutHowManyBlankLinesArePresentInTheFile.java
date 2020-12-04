 package fileAssignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindOutHowManyBlankLinesArePresentInTheFile {

	public static void main(String[] args) {
		displayCountOfEmptylines();

	}
	
	static void displayCountOfEmptylines()
	{
		BufferedReader br = null;
		
		int cnt=0;
		try
		{
			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\text.txt"));
			String str;  

			while((str=br.readLine())!=null)
			{
				System.out.println(str);
				if(str.isEmpty())
					cnt++;
				else
					continue;
			}	
			System.out.println("*****************************************");
			System.out.println("No. of blank lines in a file: "+cnt);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
				br = null;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}

}


	

