package setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

class Sample
{
	String FN;
	String LN;
	int age;
	
	Sample(String fName, String lName, int age)
	{
		FN = fName;
		LN = lName;
		this.age = age;
	}
	
	public String toString()
	{
		return "FN: "+FN+". LN: "+LN+" & age is: "+age;
	}
}

public class AddClassToCollection {
	public static void main(String[] args) {
		List<Sample> oList1 = new ArrayList<>();
		oList1.add(new Sample("Narendra", "Modi", 60));
		System.out.println(oList1);
		System.out.println("*************");
	    
		List<Sample> oList2 = new LinkedList<>();
		oList2.add(new Sample("Abdul", "Kalam", 70));
		System.out.println(oList2);
		System.out.println("*************");
		
		Set<Sample> oSet = new HashSet<>();
		oSet.add(new Sample("Sachin", "Tendulkar", 40));
		System.out.println(oSet);
	}
}