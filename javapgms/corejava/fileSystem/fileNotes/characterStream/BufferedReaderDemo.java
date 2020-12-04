package fileNotes.characterStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		readFromFile();
	}

	//read from the file
	static void readFromFile()
	{
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\write.txt"));
			String sLine;
			while((sLine = br.readLine())!=null)
			{
				System.out.println(sLine);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				br.close();
				br = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}