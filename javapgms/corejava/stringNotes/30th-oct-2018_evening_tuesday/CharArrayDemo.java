package string;

public class CharArrayDemo {
	public static void main(String[] args) {
		//convertoToCharArray();
		//findLength1();
		findLength2();
	}

	//toCharArray
	static void convertoToCharArray()
	{
		String str = "Good Evening";
		char arr[] = str.toCharArray();
		System.out.println("Size: "+arr.length);
		
		for(char s: arr) System.out.println(s);
	}
	
	
	//find # of characters without .length() method
	static void findLength1()
	{
		String str = "abcd e f";
		char ch[] = str.toCharArray();
		
		int count = 0;
		for(char s:ch)
		{
			count++;
		}
		System.out.println("# of characters: "+count);
	}
	
	
	static void findLength2()
	{
		String str = "abcd e f";
		str=str.concat("#");
		System.out.println("# of characters: "+str.indexOf("#"));
	}
}