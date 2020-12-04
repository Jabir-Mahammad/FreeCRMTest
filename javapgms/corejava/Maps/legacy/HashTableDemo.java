package legacy;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String,String> oDictionary = new Hashtable<String,String>();
		oDictionary.put("A", "Apple");
		oDictionary.put("B", "Boy");
		oDictionary.put("C", "Cat");
		oDictionary.put("D", "Dog");
		oDictionary.put("E", "Eagle");
		oDictionary.put("k", "Eagle");
		System.out.println(oDictionary);
		System.out.println("***********************");
		
		oDictionary.forEach((val1,val2)->System.out.println(val1+"="+val2));

		Enumeration enu = oDictionary.keys();
		while(enu.hasMoreElements())
		{
			String s = (String) enu.nextElement();
			System.out.println(s+" = "+oDictionary.get(s));
		}
		try {
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			oDictionary=null;
		}
	}
}