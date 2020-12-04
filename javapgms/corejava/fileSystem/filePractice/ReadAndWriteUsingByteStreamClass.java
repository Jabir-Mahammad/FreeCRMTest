package filePractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteUsingByteStreamClass {

	public static void main(String[] args) {
		
		readWrite();
	}
	
	static void readWrite()
	{
		FileInputStream f1 = null;
		FileOutputStream f2 = null;
		
		try
		{
			f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\even.txt");
			f2 = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\write.txt",false);
		
			while(true) {
				int c = f1.read();
				System.out.print((char)c);
				f2.write(c);
				if(c==-1)
					break;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			try {
				f1.close();
				f1=null;
				f2.flush();
				f2.close();
				f2=null;
	
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
