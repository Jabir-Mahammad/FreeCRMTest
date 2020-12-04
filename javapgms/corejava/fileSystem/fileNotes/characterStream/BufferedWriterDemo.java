package characterStream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		writeToFile();
	}
	
	//write to file
	static void writeToFile()
	{
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("D:\\CoreJava\\Example.txt"));
			bw.write("Good day");
			bw.newLine();
			bw.write(65);
			bw.newLine();
			bw.write("AAAAAAAAAAAAAAAAAAAAAA");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				bw.flush();
				bw.close();
				bw = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
