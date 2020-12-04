package listAssignment;

import java.util.ArrayList;
import java.util.List;

public class MissingStringInList {

	public static void main(String[] args) {
		findMissingString();
	}

	static void findMissingString()
	{
		List<String> ob = null;
		try
		{
			ob = new ArrayList<>();
			ob.add("A");
			ob.add("D");
			int val=0;
			
			int a = ob.get(0).charAt(0);
			int b = ob.get(ob.size()-1).charAt(0);
			
			for(int i=a;i<=b;i++) 
			{
				if(i==ob.get(val).charAt(0))
				{
					val++;
					continue;
				}
				else {
					char ch = (char)i;
					System.out.println("missing values: "+ch);
				}
				
			}
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
