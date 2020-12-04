package linkedListPackage;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateFromLinkedlist {

	public static void main(String[] args) {
		
		removeDup();
	}
	 static void removeDup()
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
			System.out.println(ob);

            for(int i=0;i<ob.size();i++)
            {
            	for(int j=i+1;j<ob.size();j++)
            	{
            		if(ob.get(i)==ob.get(j)) {
            			ob.remove(j);
            			j--;
            		}
            			
            	}
            }
			
			System.out.println(ob);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally
		 {
			 
		 }
	 }

}
