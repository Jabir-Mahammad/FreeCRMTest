package byteStream;

import java.io.FileInputStream;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		readFromFile();
	}
	
	
	//read from the file
	static void readFromFile()
	{
		FileInputStream fin = null;
	    try{
	    	fin = new FileInputStream("D:\\CoreJava\\Sample.txt");
	    int n=0;
	    	while(true)
	    	{
	    		n = fin.read();
	    		if(n==-1) break;
	    		char ch = (char) n;
	    		System.out.print(ch);
	    	}
	    }catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	    finally {
	    	
	    		fin.close();
	    		fin = null;
		   
	    }
	}
}