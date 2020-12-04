package fileNotes.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		//createAndWrite1();
		createAndWrite2();
	}
	
	//Create, Write/append to the file
	static void createAndWrite1()
	{
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("D:\\CoreJava\\Example.txt");
			byte a[] = {65,66,67,68,69};
			for(int i=0;i<a.length;i++)
			{
				fout.write(a[i]);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fout.flush();
				fout.close();
				fout = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	//Read form the Sample.txt & Write to Example.txt
	static void createAndWrite2()
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream("D:\\CoreJava\\Sample.txt");
			fout = new FileOutputStream("D:\\CoreJava\\Example1.txt", false);
			
			int n=0;
			while(true)
			{
				n = fin.read();
				if(n==-1) break;
				fout.write(n);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fout.flush();
				fout.close();
				fout = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}