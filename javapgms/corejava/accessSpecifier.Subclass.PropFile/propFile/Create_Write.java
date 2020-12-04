package propFile;

import java.io.FileOutputStream;
import java.util.Properties;

public class Create_Write {
	public static void main(String[] args) {
		writeToPropFile();
	}

	//create& write to .properties file
	static void writeToPropFile()
	{
		FileOutputStream fout = null;
		Properties prop = null;
		try {
			fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\newP.properties");
			prop = new Properties();
			
			prop.setProperty("UN","hghg");
			prop.setProperty("PWD", "mercury");
			prop.setProperty("URL", "http://localhost/login.do");
			prop.store(fout, "Sample comments");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fout.flush();
				fout.close();
				fout = null;
				prop = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
