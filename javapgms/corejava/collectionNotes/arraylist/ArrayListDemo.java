package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//DisplayValues();
		//AddArrayLists1();
		//AddArrayLists2();
		//RemoveValues();
		//modifyValues();
		//PrimitiveTypes();
		//rawApproach();
		//convertion1();
		//convertion2();
		//readingDirection();
		//createSubList();
		//containsAllDemo();
		//clearDemo();
	}
	
	//How to add & display the vlaues
	static void DisplayValues()
	{
		List<String> oList = null;
		try {
			oList = new ArrayList<String>();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Boy");
			oList.add("Cat");
			oList.add("Dog");
			oList.add(0, "Elephant");
			
			System.out.println(oList);
			System.out.println("***************");
			
			for(int i=0; i<oList.size();i++)
			{
				System.out.println("For: "+oList.get(i));
			}
			System.out.println("***************");
			
			for(String str: oList)
			{
				System.out.println("For each: "+str);
			}
			System.out.println("***************");
			
			int x = 0;
			while(x<oList.size())
			{
				System.out.println("while: "+oList.get(x));
				x++;
			}
			System.out.println("***************");
			
			int y = 0;
			do {
				System.out.println("do while: "+oList.get(y));
				y++;
			}while(y<oList.size());
			System.out.println("***************");
			
			Iterator<String> it = oList.iterator();
			while(it.hasNext())
			{
				System.out.println("Iterator: "+it.next());
			}
			System.out.println("***************");
			
			Spliterator<String> sp = oList.spliterator();
			sp.forEachRemaining(System.out::println);
			System.out.println("***************");
			
			oList.forEach((val)->System.out.println(val));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
		}
	}
	
	
	//addAll()
	static void AddArrayLists1()
	{
		List<String> oList1 = new ArrayList<String>();
		oList1.add("A1");
		oList1.add("B1");
		oList1.add("C1");
		System.out.println(oList1);
		
		List<String> oList2 = new ArrayList<String>();
		oList2.add("A2");
		oList2.add("B2");
		oList2.add("C2");
		System.out.println(oList2);
		
		oList1.addAll(oList2);
		System.out.println(oList1);
	}
	
	
	//addAll()
	static void AddArrayLists2()
	{
		List<String> oList1 = new ArrayList<String>();
		oList1.add("A1");
		oList1.add("B1");
		oList1.add("C1");
		System.out.println(oList1);
		
		List<String> oList2 = new ArrayList<String>();
		oList2.add("A2");
		oList2.add("B2");
		oList2.add("C2");
		System.out.println(oList2);
		
		oList1.addAll(0, oList2);
		System.out.println(oList1);
		
		List<String> oList3 = new ArrayList<String>();
		
		
		
	}
	
	
	//remove
	static void RemoveValues()
	{
		List<String> oList = null;
		try {
			oList = new ArrayList<String>();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Boy");
			oList.add("Cat");
			oList.add("Dog");
			oList.add(0, "Elephant");
			System.out.println(oList);
			
			oList.remove("Apple");
			System.out.println(oList);
			
			oList.remove(0);
			System.out.println(oList);
			
			oList.removeAll(oList);
			System.out.println(oList);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
		}
	}
	
	
	//modify/Update the values
	static void modifyValues()
	{
		List<String> oList = null;
		try {
			oList = new ArrayList<String>();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Boy");
			oList.add("Cat");
			oList.add("Dog");
			oList.add(0, "Elephant");
			System.out.println(oList);
			
			oList.set(1, "It's a FRUIT");
			System.out.println(oList);
			
			oList.set(4, oList.get(4)+" - Pet");
			System.out.println(oList);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
		}
	}
	
	
	//Add primitives to ArrayList
	static void PrimitiveTypes()
	{
		List<Integer> oList = null;
		try {
			oList = new ArrayList<Integer>();
			oList.add(10);
			oList.add(20);
			oList.add(30);
			oList.add(40);
			System.out.println(oList);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
		}
	}
	
	
	//Store different datatypes
	static void rawApproach()
	{
		List oList = null;
		try {
			oList = new ArrayList();
			oList.add("String");
			oList.add(123);
			oList.add(true);
			oList.add(99.99);
			oList.add(new ArrayList());
			System.out.println(oList);
			
			for(int i=0;i<oList.size();i++)
			{
				System.out.println(oList.get(i));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
		}
	}
	
	
	//Array to ArrayList
	static void convertion1()
	{
		Integer arr1[] = {10,20,30};
		String arr2[] = {"A","B","C","D"};
		List<String> oList1 = null;
		List<Integer> oList2 = null;
		try {
			
			oList1 = new ArrayList<String>();
			oList1 = Arrays.asList(arr2);
			System.out.println(oList1);
			for(String s1: oList1)
			{
				System.out.println(s1);
			}
			
			oList2 = Arrays.asList(arr1);
			for(Integer s2: oList2)
			{
				System.out.println(s2);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList1 = null;
			oList2 = null;
		}
	}
	
	
	//ArrayList to array
	static void convertion2()
	{
		List oList = null;
		try {
			oList = new ArrayList();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Boy");
			oList.add("Cat");
			oList.add(10);
			
			Object arr[] = oList.toArray();
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
		}
	}
	
	//print the ArrayList in both forward & reverse direction
	static void readingDirection()
	{
		List<String> oList = null;
		try {
			oList = new ArrayList<String>();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Boy");
			oList.add("Cat");
			oList.add("Dog");
			
			ListIterator<String> li = oList.listIterator();
			while(li.hasNext())
			{
				System.out.println("Forward: "+li.next());
			}
			
			System.out.println("*****************");
			
			while(li.hasPrevious())
			{
				System.out.println("Backward: "+li.previous());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
		}
	}
	
	
	//subList
	static void createSubList()
	{
		List<String> oList = null;
		try {
			oList = new ArrayList<String>();
			oList.add("Apple");
			oList.add("Boy");
			oList.add("Boy");
			oList.add("Cat");
			oList.add("Dog");
			System.out.println(oList);
			
			List<String> oList2 = oList.subList(1, 4);
			System.out.println(oList2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList = null;
		}
	}
	
	
	
	static void containsAllDemo()
	{
		List<String> oList1 = null;
		List<String> oList2 = null;
		try {
			oList1 = new ArrayList<String>();
			oList1.add("Apple");
			oList1.add("Boy");
			oList1.add("Boy");
			oList1.add("Cat");
			oList1.add("Dog");
			System.out.println(oList1);
			
			oList2 = new ArrayList<String>();
			oList2.add("Cat");
			oList2.add("Dog");
			System.out.println(oList2);
			
			if(oList1.contains("Apple"))
			{
				System.out.println("TRUE");
			}else {
				System.out.println("FALSE");
			}
			
			System.out.println("********************");
			boolean blnRes = oList1.containsAll(oList2);
			System.out.println(blnRes);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList1 = null;
			oList2 = null;
		}
	}
	
	
	//clear demo
	static void clearDemo()
	{
		List<String> oList1 = null;
		try {
			oList1 = new ArrayList<String>();
			oList1.add("Apple");
			oList1.add("Boy");
			oList1.add("Boy");
			oList1.add("Cat");
			oList1.add("Dog");
			System.out.println(oList1);
			System.out.println(oList1.get(0));
			
			oList1.removeAll(oList1);
			System.out.println(oList1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			oList1 = null;
		}
	}
}