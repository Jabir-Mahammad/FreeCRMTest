package assignments.StringAssigment.StringQustions;

public class UpperLowerAlternatively {

	public static void main(String[] args) {
		String str ="INDIA is best in the world";
		
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) 
		{
			if(i%2==0)
			{
				arr[i]=Character.toUpperCase(arr[i]);
			}
			
			else
			{
				arr[i]=Character.toLowerCase(arr[i]);
			}
		}
		
		String str1=String.valueOf(arr);
		System.out.println(str1);
		

	}

}
