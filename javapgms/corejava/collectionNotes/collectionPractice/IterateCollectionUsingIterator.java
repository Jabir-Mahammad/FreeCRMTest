package collectionPractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateCollectionUsingIterator {

	public static void main(String[] args) {
		iterator();

	}
	
	static void iterator()
	{
		List ob = null;
		try
		{
		 ob = new ArrayList();
		 
		 ob.add("Jeep");
		 ob.add("Compass");
		 ob.add("POLLO");
		 ob.add("i20");
		 ob.add('c');
		 ob.add(true);
		 System.out.println(ob);
		 
		 Iterator it = ob.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(" "+it.next());
		 }
		 
		}catch(Exception e) {
			
		}
		finally {
			
		}
	}

}
