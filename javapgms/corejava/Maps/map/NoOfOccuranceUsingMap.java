package map;

import java.util.HashMap;

public class NoOfOccuranceUsingMap {

	public static void main(String[] args) {
		mapCount();
		
   }
	
	static void mapCount()
	{
		HashMap<Character,Integer> ob = new HashMap();
		
		String str =  "jabir mahammad";
		char arr[]=str.toCharArray();
		for(char ch : arr)
		{
			if(ob.containsKey(ch))
				ob.put(ch, ob.get(ch)+1);
			else
				ob.put(ch, 1);
		}
		System.out.println(ob);
		
	}

}
