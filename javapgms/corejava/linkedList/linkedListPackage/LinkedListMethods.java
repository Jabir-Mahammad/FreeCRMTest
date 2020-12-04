package linkedListPackage;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class LinkedListMethods {

	public static void main(String[] args) {
		 //DisplayValues();
		 //addAll();
		//remove();
		//clear();
		//modify();
		//premitiveTypes();
		//rawApproach();
		//convertion1();
		//convertion2();
		//readingDirection();
		//createSubList();
		//containsAllDemo();
	}

	static void DisplayValues()
	{
		LinkedList<String> oList = null;
		try {
			oList = new LinkedList<String>();
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
	
	
	
	//add() and addAll() method	
	static void addAll()
	{
		List<String> ob = null;
		List<String> ob2 = null;
		try
		{
			ob =  new LinkedList<String>();
			ob2 =  new LinkedList<String>();
			ob.add("Polo");
			ob.add("i20");
			ob.add("Jeep");
			
			ob2.add("Compass");
			ob2.add("brezza");
			//the ob2 will add at the last of the ob
			ob.addAll(ob2);
			System.out.println(ob);
			//the ob2 will add at the beginning of the ob
			ob.addAll(0,ob2);
			System.out.println(ob);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			 ob = null;
			 ob2 = null;
			
		}
		
	}
	
	
	//remove() and removeAll() method
	static void remove()
	{
		List<String> ob = null;
		try
		{
			ob =  new LinkedList<String>();
			ob.add("Polo");
			ob.add("i20");
			ob.add("Jeep");
			
			ob.remove(1);
			System.out.println(ob);
			
			//remove complete Collection
			ob.removeAll(ob);
			System.out.println(ob);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			 ob = null;
		}		
	}
	
	
	//clear all collection values
	static void clear()
	{
		List<String> ob = null;
		try
		{
			ob =  new LinkedList<String>();
			ob.add("Polo");
			ob.add("i20");
			ob.add("Jeep");
			System.out.println(ob);
			
			//clear complete Collection
			ob.clear();
			System.out.println(ob);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			 ob = null;
		}		
	}
	
	
	//set() method to modify
	static void modify()
	{
		List<String> ob = null;
		try
		{
			ob =  new LinkedList<String>();
			ob.add("Polo");
			ob.add("i20");
			ob.add("Jeep");
			System.out.println(ob);
			
			
			ob.set(0,"VolksWagan");
			System.out.println(ob);
			
			ob.set(2,ob.get(2)+" Compass");
			System.out.println(ob);
			
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			 ob = null;
		}		
	}
	
	
	
	//add any premitivs to linked list
	static void premitiveTypes()
	{
		LinkedList<Integer> ob = null;
		try
		{
			ob =  new LinkedList<Integer>();
			ob.add(2);
			ob.add(4);
			ob.add(6);
			ob.add(8);
			System.out.println(ob);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			 ob = null;
		}		
	}
	
	
	//Store different datatypes
		static void rawApproach()
		{
			LinkedList oList = null;
			try {
				oList = new LinkedList();
				oList.add("String");
				oList.add(123);
				oList.add(true);
				oList.add(99.99);
				oList.add(new LinkedList());
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
			List<Integer> oList1 = null;
			List<String> oList2 = null;
			try {
				oList1 = Arrays.asList(arr1);
				System.out.println(oList1);
				for(Integer s1: oList1)
				{
					System.out.println(s1);
				}
				
				oList2 = Arrays.asList(arr2);
				System.out.println(oList2);
				for(String s2: oList2)
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
			List<Integer> oList = null;
			try {
				oList = new LinkedList<Integer>();
				oList.add(2);
				oList.add(3);
				oList.add(4);
				oList.add();
				
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
				oList = new LinkedList<String>();
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
		
		
		//extract sublist from linked list
		static void createSubList()
		{
			List<String> oList = null;
			try {
				oList = new LinkedList<String>();
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
		
		
		//contains() and containsAll() 
		
		static void containsAllDemo()
		{
			List<String> oList1 = null;
			List<String> oList2 = null;
			try {
				oList1 = new LinkedList<String>();
				oList1.add("Apple");
				oList1.add("Boy");
				oList1.add("Boy");
				oList1.add("Cat");
				oList1.add("Dog");
				System.out.println(oList1);
				
				oList2 = new LinkedList<String>();
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
}

