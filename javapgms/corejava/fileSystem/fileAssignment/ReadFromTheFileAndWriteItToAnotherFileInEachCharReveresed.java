package fileAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadFromTheFileAndWriteItToAnotherFileInEachCharReveresed {

	public static void main(String[] args) {
		revFile();

	}
	
	static void revFile()
	{
		BufferedWriter bw = null;
		BufferedReader br =  null;
		try
		{
			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\text.txt"));
			bw = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\javaA\\text1.txt"));
			String str;
			while((str=br.readLine())!=null)
			{
				StringBuffer str1 = new StringBuffer(str);
				str1.reverse();
				String s =  new String(str1);
				System.out.println(s);
				bw.write(s);
				bw.newLine();
			}
					
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			try {
				
				bw.flush();
				bw.close();
				br.close();
				br = null;
				bw = null;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
