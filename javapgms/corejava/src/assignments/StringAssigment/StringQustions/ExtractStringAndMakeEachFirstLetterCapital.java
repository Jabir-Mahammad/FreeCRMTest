package assignments.StringAssigment.StringQustions;

public class ExtractStringAndMakeEachFirstLetterCapital {

	public static void main(String[] args) {
		String str = "India is best in the world";
		makeCapital(str);
	}
	static void makeCapital(String str) 
	{
		String s1="";
		String str1 = str.substring(9);
		
		String arr[]=str1.split(" ");
		
		for(String s:arr) 
		{
			s1=s1+" "+s.substring(0, 1).toUpperCase()+s.substring(1);
		}
		System.out.println(s1);
	}
    
}
