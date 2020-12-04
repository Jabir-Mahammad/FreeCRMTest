package stringBuffer;

public class ReverseDemo {
	public static void main(String[] args) {
		//reverse1();
		//reverse2();
		reverse3();
	}

	//reverse
	static void reverse1()
	{
		StringBuffer str = new StringBuffer("BANGALORE");
		StringBuffer strRes = str.reverse();
		System.out.println(strRes);
	}
	
	static void reverse2()
	{
		String str = "BANGALORE";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	
	static void reverse3()
	{
		String str = "BANGALORE";
		char ch[] = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}
