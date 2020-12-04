package linkedList;

import java.util.LinkedList;

public class LinkedLisDemo {
	public static void main(String[] args) {
		//addValues();
		removeDemo1();
		//removeOccurrances();
	}

	//LinkedList methods
	static void addValues()
	{
		LinkedList<Double> oList = new LinkedList<Double>();
		oList.add(11.10);
		oList.add(22.20);
		oList.add(33.30);
		oList.add(44.40);
		oList.addFirst(00.00);
		oList.addLast(99.99);
		
		System.out.println(oList);
	}
	
	//removeFirst() & removeLast()
	static void removeDemo1()
	{
		LinkedList<String> oList = new LinkedList<String>();
		oList.add("Apple");
		oList.add("Boy");
		oList.add("Cat");
		oList.add("Dog");
		oList.add("Eagle");
		System.out.println(oList);
		
		oList.removeFirst();
		System.out.println(oList);
		
		oList.removeLast();
		System.out.println(oList);
	}
	
	//removeFirstOccurrance() & removeLastOccurrance()
	static void removeOccurrances()
	{
		LinkedList<String> oList = new LinkedList<String>();
		oList.add("A");
		oList.add("B");
		oList.add("C");
		oList.add("D");
		oList.add("E");
		oList.add("A");
		oList.add("B");
		oList.add("C");
		oList.add("D");
		oList.add("E");
		System.out.println(oList);
		
		oList.removeFirstOccurrence("A");
		System.out.println(oList);
		
		oList.removeLastOccurrence("E");
		System.out.println(oList);
	}
}