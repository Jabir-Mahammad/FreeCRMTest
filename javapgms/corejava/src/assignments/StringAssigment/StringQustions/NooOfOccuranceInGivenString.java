package assignments.StringAssigment.StringQustions;

public class NooOfOccuranceInGivenString {

	public static void main(String[] args) {
		String str = "India is best in the world";
		int cnt = findOccurance(str);
		System.out.println("no. of occurance of given word/char is: "+cnt);

	}
   
	static int findOccurance(String str1)
	{
		int cnt=0;
		int pos=0;
		for(int i=0;i<str1.length();i++) 
		{
			pos=str1.indexOf("in",pos);
			if(pos==-1)
			{
				break;
			}
			else
			{
				pos++;
				cnt++;
			}
		}
		return cnt;
	}
}
