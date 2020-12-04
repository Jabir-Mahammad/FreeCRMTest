package fileAssignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTheFileAndStoreItInArray {

	public static void main(String[] args) {
		findLines();

	}
	
	static void findLines()
	{
		BufferedReader br = null;
		
		int i=0;
		try
		{
			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\text.txt"));
			String str;  
			
			int lineCnt=findLineCnt();
			String arr[]= new String[lineCnt];
			
			while((str=br.readLine())!=null && i<arr.length)
			{
				arr[i]=str;
				i++;
			}
			
			for(String s:arr)
				System.out.println(s);
			
			
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
	
	static int findLineCnt()
	
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
