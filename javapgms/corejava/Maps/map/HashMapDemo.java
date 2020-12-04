package map;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
	public static void main(String[] args) {
		addDisplay();
		//removeValues();
		//verifyKeyValExist();
		//getValue();
		//AddMapToMap();
		//findOccurrence();
	}

	//Add & display the values
	static void addDisplay()
	{
		Map oMap = null;
		try {
			oMap = new HashMap<String, String>();
			oMap.put("A", "Apple");
			oMap.put("B", "Boy");
			oMap.put("c", "Polo");
			oMap.put("D", "Dog");
			oMap.put(null, "Apple");
			System.out.println(oMap);
			System.out.println("******************");
			
			//Display Both Key & values
			oMap.forEach((key, value)->System.out.println(key+" = "+value));
			System.out.println("******************");
			
			//Display only Keys
			Set oKeys = oMap.keySet();
			Iterator it1 = oKeys.iterator();
			while(it1.hasNext())
			{
				System.out.println("Keys: "+it1.next());
			}
			System.out.println("******************");
			
			//Display Only Valuese
			Collection oVal = oMap.values();
			Iterator it2 = oVal.iterator();
			while(it2.hasNext())
			{
				System.out.println("Values: "+it2.next());
			}
			System.out.println("******************");
			
			//Display Both key & values
			Set oBoth = oMap.entrySet();
			Iterator it3 = oBoth.iterator();
			while(it3.hasNext())
			{
				Entry<String, String> map = (Entry<String, String>) it3.next();
				System.out.println(map.getKey()+" = "+map.getValue());
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			oMap = null;
		}
	}
	
	
	//remove the values
	static void removeValues()
	{
		Map<String, String> oMap = null;
		try {
			oMap = new HashMap<String, String>();
			oMap.put("A", "Apple");
			oMap.put("B", "Boy");
			oMap.put("C", "Cat");
			oMap.put("D", "Dog");
			oMap.put("E", "Eagle");
			oMap.put("F", "Fan");
			System.out.println(oMap);
			
			oMap.remove("B");
			if(oMap.containsKey("B")==true)
			{
				System.out.println("The key 'B' exist");
			}else {
				System.out.println("The key 'B' doesnot exist");
			}
			System.out.println(oMap);
			
			System.out.println("*******************");
			
			oMap.remove("F", "Fan");
			if(oMap.containsKey("F")==true)
			{
				System.out.println("The key 'F' exist");
			}else {
				System.out.println("The key 'F' doesnot exist");
			}
			System.out.println(oMap);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			oMap = null;
		}
	}
	
	
	//verify Key/Value exist
	static void verifyKeyValExist()
	{
		Map<Integer, String> oMap = null;
		try {
			oMap = new HashMap<Integer, String>();
			oMap.put(1, "One");
			oMap.put(2, "Two");
			oMap.put(3, "Three");
			oMap.put(4, "Four");
			oMap.put(5, "Five");
			System.out.println(oMap);
			
			boolean keyExist = oMap.containsKey(2);
			System.out.println(keyExist);
			
			System.out.println("*****************");
			boolean ValueExist = oMap.containsValue("Five");
			System.out.println(ValueExist);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			oMap = null;
		}
	}
	
	
	//Get the key values
	static void getValue()
	{
		Map<Integer, String> oMap = null;
		try {
			oMap = new HashMap<Integer, String>();
			oMap.put(1, "One");
			oMap.put(2, "Two");
			oMap.put(3, "Three");
			oMap.put(4, "Four");
			oMap.put(5, "Five");
			System.out.println(oMap);
			
			String sValue = oMap.get(3);
			System.out.println(sValue);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			oMap = null;
		}
	}
	
	
	//add one map to another map
	static void AddMapToMap()
	{
		Map<String, String> oMap1 = null;
		Map<String, String> oMap2 = null;
		try {
			oMap1 = new HashMap<>();
			oMap1.put("A", "Apple");
			oMap1.put("B", "Boy");
			System.out.println(oMap1);
			
			oMap2 = new HashMap<>();
			oMap2.put("C", "Cat");
			oMap2.put("D", "Dog");
			oMap2.put("E", "Eagle");
			System.out.println(oMap2);
			
			oMap1.putAll(oMap2);
			System.out.println(oMap1);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			oMap1 = null;
			oMap2 = null;
		}
	}
	
	
	//Find # of occurrenace of the characters
	static void findOccurrence()
	{
		String arr[] = {"A","B","A","C","B","A","C"};
		List<String> oList = Arrays.asList(arr);
		
		String s="";
		for(String key: oList)
		{
			if(!s.contains(key))
			{
				System.out.println("Keys: "+key+": "+Collections.frequency(oList, key));
				s+=key;
			}
		}
	}
}