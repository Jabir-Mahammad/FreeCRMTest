package programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {

	public static void main(String[] args) {
	
		String str="Apple Apple orange Apple graphs banana graphs";
		
		String arr[] = str.split(" ");
		String newStr="";
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(newStr.contains(arr[i])) {
				
				System.out.println("Duplicate "+arr[i]);
				
			}
			
			else
				newStr+=arr[i];
			
		}

		
		//using Map
		
		Map<String, Integer> count = new HashMap<>();
		int k=1;
		for(int j=0;j<arr.length;j++) {
			
			if(count.containsKey(arr[j])) {
				count.put(arr[j], (count.get(arr[j]))+1);
			}
			
			else {
				count.put(arr[j], k);
			}
			
			
		}
		
		System.out.println(count);
		
		
	}

}
