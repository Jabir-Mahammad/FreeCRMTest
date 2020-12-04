package listAssignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllTheElementsFromList {

	public static void main(String[] args) {
		
		removeAllValus();
	}
	static void removeAllValus()
	{
		List<String> ob = null;
		try
		{
			ob = new ArrayList<>();
			ob.add("ab");
			ob.add("bc");
			ob.add("cd");
			ob.add("de");
			ob.add("ef");
			
			while(ob.size()>0)
			{
				System.out.println("removed: "+ob.get(0));
				ob.remove(0);
			}
			System.out.println(ob);
			
		}catch(Exception e)
		{
			
		}
		
	}

}
