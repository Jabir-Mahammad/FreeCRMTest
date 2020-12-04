package string;

public class IsEmptyDemo {
	public static void main(String[] args) {
		isEmpty();
	}

	//isEmpty
	static void isEmpty()
	{
		String s1 = null;
		String s2 = "";
		String s3 = "Good Morning";
		
		boolean blnRes1 = s1.isEmpty(); // It throws error "NullPointerException"
		System.out.println(blnRes1);
		
		boolean blnRes2 = s2.isEmpty();
		System.out.println(blnRes2);
		
		boolean blnRes3 = s3.isEmpty();
		System.out.println(blnRes3);
	}
}
