package filePractice;

import java.io.FileOutputStream;

public class FileOutputStreamObj {

	public static void main(String[] args) {
		FileOutputStreamOb();

	}

	static void FileOutputStreamOb()
	{
		FileOutputStream f1 = null;
		int ch=0;
		try
		{
			f1 = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\write.txt");
			
			String str =  "hello I am Jabir";
			char arr[]=str.toCharArray();
			for(char c:arr) {
				ch=c;
				f1.write(ch);
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
}
