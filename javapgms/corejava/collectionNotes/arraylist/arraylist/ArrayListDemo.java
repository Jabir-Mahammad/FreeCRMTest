package arraylist.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		//sortDemo();
		//reatainAllDemo();
		findDuplicate();
		//removeDuplicate();
	}
	
	//sort
	static void sortDemo()
	{
		List oList = null;
		try {
			oList = new ArrayList();
			oList.add(5);
			oList.add(6);
			oList.add(2);
			oList.add(1);
			oList.add(2);
			
			System.out.println(oList);
			
			Collections.sort(oList);
			System.out.println(oList);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	//retainAll()
	static void reatainAllDemo()
	{
		List<String> oList1 = null;
		List<String> oList2 = null;
		try {
			oList1 = new ArrayList<>();
			oList1.add("A");
			oList1.add("B");
			oList1.add("C");
			System.out.println(oList1);
			
			oList2 = new ArrayList<>();
			oList2.add("C");
			oList2.add("D");
			oList2.add("E");
			oList2.add("B");
			System.out.println(oList2);
			
			oList2.retainAll(oList1);
			System.out.println(oList2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
		}
	}
	
	
	//find duplicate values
	static void findDuplicate()
	{
		List<String> oList = new ArrayList<>();
		oList.add("Apple");
		oList.add("Zebra");
		oList.add("Lion");
		oList.add("Cat");
		oList.add("Dog");
		oList.add("Zebra");
		oList.add("Cat");
		oList.add("Zebra");
		oList.add("Cat");
		oList.add("Dog");
		oList.add("Dog");
		System.out.println(oList);
		
		String s = "";
		for(int i=0;i<oList.size();i++)
		{
			if(!s.contains(oList.get(i)))
			{
				for(int j=i+1;j<oList.size();j++)
				{
					if(oList.get(i).equals(oList.get(j)))
					{
						System.out.println("Duplicate: "+oList.get(i));
						s+=oList.get(i);
						break;
					}
				}
			}
		}
	}
	
	
	
	//remove duplicate values
	static void removeDuplicate()
	{
		List<String> oList = new ArrayList<>();
		oList.add("Apple");
		oList.add("Zebra");
		oList.add("Lion");
		oList.add("Cat");
		oList.add("Dog");
		oList.add("Zebra");
		oList.add("Cat");
		oList.add("Zebra");
		oList.add("Cat");
		oList.add("Dog");
		oList.add("Dog");
		System.out.println(oList);
		
		for(int i=0;i<oList.size();i++)
		{
			for(int j=i+1;j<oList.size();j++)
			{
				if(oList.get(i).equals(oList.get(j)))
				{
					oList.remove(j);
					j--;
				}
			}
		}
		System.out.println(oList);
	}
}