package setDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//AddAndDisplay();
		//removeElement();
		//AddCollections();
		//convertToArray();
		//arrayToSet();
		//removeDuplicate1();
		//removeDuplicate2();
		//findDuplicate();
		//clearDemo();
		//containsAllDemo();
		//SortDemo();
		//storePrimitives();
		//retainAllDemo();
		addMultipleDataTypes();
	}

	//Add & display values
	static void AddAndDisplay()
	{
		Set<String> oSet = null;
		try {
			oSet = new HashSet<String>();
			oSet.add("Apple");
			oSet.add("Boy");
			oSet.add("Cat");
			oSet.add("Apple");
			System.out.println(oSet);
			System.out.println("****************");
			
			for(String s:oSet)
			{
				System.out.println("for each loop: "+s);
			}
			System.out.println("****************");
			
			Iterator<String> it = oSet.iterator();
			while(it.hasNext())
			{
				System.out.println("Iterator: "+it.next());
			}
			System.out.println("****************");
			
			Spliterator<String> sp = oSet.spliterator();
			sp.forEachRemaining(System.out::println);
			System.out.println("****************");
			
			oSet.forEach((k)->System.out.println("for each method: "+k));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet = null;
		}
	}
	
	
	//remove values
	static void removeElement()
	{
		Set<String> oSet = null;
		try {
			oSet = new HashSet<String>();
			oSet.add("Apple");
			oSet.add("Boy");
			oSet.add("Cat");
			oSet.add("Dog");
			oSet.add("Eagle");
			oSet.add("Frog");
			System.out.println(oSet);
			
			oSet.remove("Cat");
			System.out.println(oSet);
			
			if(oSet.contains("Cat")) System.out.println("Not removed");
			else System.out.println("Removed");
			
			oSet.removeAll(oSet);
			System.out.println(oSet);
			
			System.out.println(oSet.isEmpty());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet = null;
		}
	}
	
	
	//add One Set to another Set
	static void AddCollections()
	{
		Set<String> oSet1 = null;
		Set<String> oSet2 = null;
		try {
			oSet1 = new HashSet<String>();
			oSet1.add("Apple");
			oSet1.add("Boy");
			oSet1.add("Cat");
			System.out.println(oSet1);
			
			oSet2 = new HashSet<String>();
			oSet2.add("Dog");
			oSet2.add("Eagle");
			oSet2.add("Frog");
			System.out.println(oSet2);
			
			oSet1.addAll(oSet2);
			System.out.println(oSet1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet1 = null;
			oSet2 = null;
		}
	}
	
	
	//HashSet into array
	static void convertToArray()
	{
		Set<String> oSet = null;
		try {
			oSet = new HashSet<String>();
			oSet.add("Apple");
			oSet.add("Boy");
			oSet.add("Cat");
			oSet.add("Dog");
			oSet.add("Eagle");
			oSet.add("Frog");
			System.out.println(oSet);
			
			Object arr[] = oSet.toArray();
			
			for(Object s: arr)
			{
				System.out.println(s);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet = null;
		}
	}
	
	
	//Convert array to Set
	static void arrayToSet()
	{
		List<String> oList = null;
		Set<String> oSet = null;
		try {
			String arr[] = {"A","B","C","D","E","A"};
			
			oList = Arrays.asList(arr);
			System.out.println("List: "+oList);
			
			oSet = new HashSet<>(oList);
			
			System.out.println("Set: "+oSet);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet = null;
		}
	}
	
	
	//Remove duplicate values
	static void removeDuplicate1()
	{
		List<String> oList = null;
		Set<String> oSet = null;
		try {
			oList = new ArrayList<String>();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Cat");
			oList.add("Dog");
			oList.add("Eagle");
			oList.add("Frog");
			oList.add("Apple");
			oList.add("Boy");
			System.out.println(oList);
			
			oSet = new HashSet<>(oList);
			oList.clear();
			
			oList.addAll(oSet);
			
			System.out.println(oList);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
			oSet = null;
		}		
	}
	
	
	static void removeDuplicate2()
	{
		List<String> oList = null;
		Set<String> oSet = null;
		try {
			oList = new ArrayList<String>();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Frog");
			oList.add("Dog");
			oList.add("Eagle");
			oList.add("Frog");
			oList.add("Apple");
			oList.add("Boy");
			System.out.println(oList);
			
			oSet = new HashSet<>();
			for(int i=0;i<oList.size();i++)
			{
				if(oSet.add(oList.get(i))==false)
				{
					oList.remove(i);
					i--;
				}
			}
			
			System.out.println(oList);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
			oSet = null;
		}
	}
	
	
	//find duplicate values
	static void findDuplicate()
	{

		List<String> oList = null;
		Set<String> oSet = null;
		try {
			oList = new ArrayList<String>();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Frog");
			oList.add("Dog");
			oList.add("Eagle");
			oList.add("Frog");
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Apple");
			oList.add("Boy");
			System.out.println(oList);
			
			oSet = new HashSet<>();
			
			String s = "";
			for(int i=0;i<oList.size();i++)
			{
				if((oSet.add(oList.get(i))==false) && (!s.contains(oList.get(i))))
				{
					System.out.println("Duplicate: "+oList.get(i));
					s+=oList.get(i);
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
			oSet = null;
		}
	}
	
	//clear demo
	static void clearDemo()
	{
		Set<String> oSet = new HashSet<>();
		oSet = new HashSet<String>();
		oSet.add("Apple");
		oSet.add("Boy");
		oSet.add("Cat");
		oSet.add("Apple");
		System.out.println(oSet);
		oSet.clear();
		System.out.println(oSet);
	}
	
	
	//containsAll
	static void containsAllDemo()
	{
		Set<String> oSet1 = null;
		Set<String> oSet2 = null;
		try {
			oSet1 = new HashSet<String>();
			oSet1.add("Apple");
			oSet1.add("Boy");
			oSet1.add("Cat");
			System.out.println(oSet1);
			
			oSet2 = new HashSet<String>();
			oSet2.add("Dog");
			oSet2.add("Eagle");
			oSet2.add("Frog");
			System.out.println(oSet2);
			
			System.out.println(oSet1.containsAll(oSet2));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet1 = null;
			oSet2 = null;
		}
	}
	
	
	//sort
	static void SortDemo()
	{
		Set<String> oSet = null;
		Set<String> oSet2 = null;
		try {
			oSet = new HashSet<String>();
			oSet.add("Eagle");
			oSet.add("Apple");
			oSet.add("Frog");
			oSet.add("Boy");
			oSet.add("Cat");
			oSet.add("Dog");
			System.out.println(oSet);
			
			oSet2 = new TreeSet<>(oSet);
			System.out.println(oSet2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet = null;
			oSet2 = null;
		}
	}
	
	
	//store premitives
	static void storePrimitives()
	{
		Set<Boolean> oSet = null;
		try {
			oSet = new HashSet<Boolean>();
			oSet.add(true);
			oSet.add(false);
			System.out.println(oSet);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet = null;
		}
	}
	
	
	//retain All
	static void retainAllDemo()
	{
		Set<String> oSet1 = null;
		Set<String> oSet2 = null;
		try {
			oSet1 = new HashSet<String>();
			oSet1.add("Apple");
			oSet1.add("Boy");
			oSet1.add("Cat");
			System.out.println(oSet1);
			
			oSet2 = new HashSet<String>();
			oSet2.add("Dog");
			oSet2.add("Eagle");
			oSet2.add("Frog");
			System.out.println(oSet2);
			
			oSet1.retainAll(oSet2);
			System.out.println(oSet1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oSet1 = null;
			oSet2 = null;
		}
	}
	
	
	//add all datatypes
	static void addMultipleDataTypes()
	{
		Set oSet = new HashSet();
		oSet.add(10);
		oSet.add(true);
		oSet.add("String");
		oSet.add('A');
		System.out.println(oSet);
	}
}