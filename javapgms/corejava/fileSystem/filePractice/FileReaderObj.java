package filePractice;

import java.io.FileReader;
import java.nio.CharBuffer;


public class FileReaderObj {

	public static void main(String[] args) {
		fileReaderOb();

	}
	
	
	static void fileReaderOb()
	{
		FileReader f = null;
		CharBuffer arr[]= {};
		int i=0;
;		try
		{
			f = new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\write.txt");
			
			while(true) {
			f.read(arr[i]);
			i++;
			System.out.print(arr[i]);
             if(arr[i]==)
            	 break;
			}
		}catch(Exception e) {
			
		}
		finally {
			
		}
		
	}

}
