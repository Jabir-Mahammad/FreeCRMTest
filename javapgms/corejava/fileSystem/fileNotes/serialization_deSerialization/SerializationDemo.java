package fileNotes.serialization_deSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyClass implements Serializable
{
	String strName;
	 String strCity;
	 int age;
	double salary;
	
	public void displayName()
	{
		System.out.println("Name is: "+strName);
	}
	
	public void displayCity()
	{
		System.out.println("City is: "+strCity);
	}
	
	public void showAge()
	{
		System.out.println("Age is: "+age);
	}
	
	public void getSalary()
	{
		System.out.println("Salary is: "+salary);
	}
}


public class SerializationDemo {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		ObjectOutputStream obj = null;
		try {
			MyClass cls = new MyClass();
			fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\obj.txt");
			obj = new ObjectOutputStream(fout);
			cls.strName = "Kalam";
			cls.strCity = "TN";
			cls.age = 75;
			cls.salary = 9999.99;
			
			obj.writeObject(cls);
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
				obj.flush();
				obj.close();
				obj = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}