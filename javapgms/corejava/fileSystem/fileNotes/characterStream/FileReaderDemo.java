package characterStream;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) {
		readFile();
	}
	
	//read from the file
	static void readFile()
	{
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\CoreJava\\Sample.txt");
			fr = new FileReader(new File("D:\\CoreJava\\Sample.txt"));
			int n=0;
			while(true)
			{
				n = fr.read();
				if(n==-1) break;
				char ch = (char) n;
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
				fr = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}