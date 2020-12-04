package assignments.StringAssigment.StringQustions;

public class ReverseTheString {

	public static void main(String[] args) {
		String str = "India is best in the world";
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}
		System.out.println(str1);

	}

}
