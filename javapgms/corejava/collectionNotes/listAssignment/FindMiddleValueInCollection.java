package listAssignment;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleValueInCollection {

	public static void main(String[] args) {
		
		findMiddle();
	}
	
	static void findMiddle()
	{
		List<String> ob = null;
		try
		{
			ob = new ArrayList<>();
			ob.add("A");
			ob.add("B");
			ob.add("C");
			ob.add("D");
			ob.add("E");
			
			
			int a = ob.size()/2;
			
			System.out.println(ob.get(a));
			}catch(Exception e)
		     {
			e.printStackTrace();
		      }
		finally
		{
			ob=null;
		}
	}

}
