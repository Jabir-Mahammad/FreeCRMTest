package assignments.StringAssigment.StringQustions;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str="India is best in the world";
		String arr[]=str.split(" ");
		String s="";
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=arr[i].length()-1;j>=0;j--) 
			{
			 s=s+String.valueOf(arr[i].charAt(j));
			}
			
			System.out.print(s+" ");
			s="";
		}
		

	}

}
