package linkedListPackage;

import java.util.LinkedList;
import java.util.List;

public class FindDupValuesInLinkedList {

	public static void main(String[] args) {
		
		findDup();
	}
	 static void findDup()
	 {
		 List<String> ob =  null;
		 try
		 {
			ob =  new LinkedList<String>();
			ob.add("polo");
			ob.add("vw");
			ob.add("jeep");
			ob.add("compass");
			ob.add("compass");
			ob.add("compass");
			ob.add("polo");
			ob.add("polo");
			ob.add("polo");
			ob.add("compass");
			String str="";
			String s1="";
			
			for(String s: ob)
			{
				if(str.contains(s)) 
				{
					 
					 if(s1.contains(s))
							continue;
					 else {
						 s1=s1+s;
						 System.out.println(s);
					 }
					 
				}
				else
				   str=str+s;
			}
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally
		 {
			 
		 }
	 }

}
