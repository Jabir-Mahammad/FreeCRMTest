package fileNotes.serialization_deSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		ObjectInputStream obj = null;
		MyClass cls = null;
		try {
			obj = new ObjectInputStream(new FileInputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\obj.txt"));
			//obj = new ObjectInputStream(fin);
			cls = (MyClass) obj.readObject();
			
			cls.displayName();
			cls.displayCity();
			cls.showAge();
			cls.getSalary();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				//fin.close();
				fin = null;
				obj.close();
				obj = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}