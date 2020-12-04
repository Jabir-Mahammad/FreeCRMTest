package corejava;

public class NumberOfEachCharsInString {
	
   public static void main(String[] args) {
      charCout();
		
    }

	static void charCout()
	{
		String str = "muhammad jabi";
		int count=0;
		String s="";
		
		char arr[] =  str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			String ss =  String.valueOf(arr[i]);
			if(s.contains(ss))
				continue;
			else
				s=s+String.valueOf(arr[i]);
			
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				
			}
			System.out.println("character: "+arr[i]+" "+"count: "+count);
		  }
		}
		
	}

