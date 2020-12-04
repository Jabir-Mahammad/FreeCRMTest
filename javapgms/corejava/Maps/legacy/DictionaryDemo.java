package legacy;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DictionaryDemo {
	public static void main(String[] args) {
		Dictionary<String,String> oDictionary = new Hashtable<String,String>();
		oDictionary.put("A", "Apple");
		oDictionary.put("B", "Boy");
		oDictionary.put("C", "Cat");
		oDictionary.put("D", "Dog");
		oDictionary.put("E", "Eagle");
		System.out.println(oDictionary);
		System.out.println("***********************");
		
	
		Enumeration enu = oDictionary.keys();
		while(enu.hasMoreElements())
		{
			//String s = (String) enu.nextElement();
			//System.out.println(s+" = "+oDictionary.get(s));
			
			System.out.println(enu.nextElement());
		}
		try {
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
}