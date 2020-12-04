package fileAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAllTheLinesFromTheFileToAnotherFileInRevOrder {

	public static void main(String[] args) {
		findLines();

	}
	
	static void findLines()
	{
		BufferedReader br = null;
		BufferedWriter br1 = null;
		
		int i=0,cnt=4;
		try
		{
			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\text.txt"));
			br1 =  new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\javaA\\write.txt",false));
			
			String str;  
			
			int count = cntLines();
			
			String arr[]= new String[count];
			
			while((str=br.readLine())!=null)
			{
				
				cnt--;
				arr[cnt]=str;
				
			}
			
			while(i<arr.length)
			{
				br1.write(arr[i]);
				br1.newLine();
				i++;
           }
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
				br = null;
				br1.flush();
				br1.close();
				br1= null;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}
	
static int cntLines()
	
	{
		BufferedReader br = null;
		int cnt=0;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\text.txt"));
		String str;
		
		while((str=br.readLine())!=null)
		{
			cnt++;
			
		}
		}catch(Exception e) {
			
		}
		return cnt;
	}

}
