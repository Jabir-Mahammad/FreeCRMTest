package listAssignment;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumberInList {

	public static void main(String[] args) {
	
		findMissing();
	}
	
	static void findMissing()
	{
		List<Integer> ob = null;
		try
		{
			ob = new ArrayList<>();
			ob.add(1);
			ob.add(4);
			ob.add(6);
			int j=0;
			
			for(int i=ob.get(0);i<=ob.get(ob.size()-1);i++)
			{
				if(i==ob.get(j))
				{
					j++;
					continue;
				}
				
				else 
			     System.out.println("Missing number: "+i);
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
