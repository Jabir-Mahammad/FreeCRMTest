package filePractice;


import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) {
		writeToFile1();
		//writeToFile2();
	}

	//write to the file with new line(without method)
	static void writeToFile1()
	{
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Users\\Lenovo\\Desktop\\javaA\\write.txt", false);
			//fw = new FileWriter(new File("D:\\CoreJava\\Example.txt"));
			
			fw.write("Heloooooooooo");
			fw.write(13);
			fw.write(10);
			fw.write("Hello");
			fw.write(13);
			fw.write(10);
			fw.write("Good Morning");
			fw.write(13);
			fw.write(10);
			fw.write("Good Day");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fw.flush();
				fw.close();
				fw = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	////write to the file with new line character(with method)
	static void writeToFile2()
	{
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\CoreJava\\Example.txt", false);
			//fw = new FileWriter(new File("D:\\CoreJava\\Example.txt"));
			
			fw.write("Hi...");
			newLine(fw);
			fw.write("Hello");
			newLine(fw);
			fw.write("Good Morning");
			newLine(fw);
			fw.write("Good Day");
			newLine(fw);
			fw.write(65);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fw.flush();
				fw.close();
				fw = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	static void newLine(FileWriter oFileWriter)
	{
		try {
			oFileWriter.write(13);
			oFileWriter.write(10);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
