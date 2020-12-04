package propFile;

import java.io.FileInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ReadPropFile {
	public static void main(String[] args) {
		readPropFile();
	}

	//read from the prop file
	static void readPropFile()
	{
		FileInputStream fin = null;
		Properties prop = null;
		try {
			fin = new FileInputStream("D:\\CoreJava\\test.properties");
			prop = new Properties();
			
			prop.load(fin);
			
			System.out.println(prop.getProperty("UN"));
			System.out.println(prop.getProperty("PWD"));
			System.out.println(prop.getProperty("URL"));
			System.out.println("******************");
			
			Set oKeys = prop.keySet();
			Iterator it1 = oKeys.iterator();
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
			System.out.println("******************");
			
			Collection oVal = prop.values();
			Iterator it2 = oVal.iterator();
			while(it2.hasNext())
			{
				System.out.println(it2.next());
			}
			System.out.println("******************");
			
			
			prop.forEach((x,y)->System.out.println(x+" = "+y));
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				fin.close();
				fin = null;
				prop = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}