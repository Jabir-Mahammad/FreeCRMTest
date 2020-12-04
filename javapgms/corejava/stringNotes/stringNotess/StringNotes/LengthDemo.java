package string;

public class LengthDemo {
	public static void main(String[] args) {
		//findLength1();
		int count = getLength("1@3$Qwer");
		System.out.println(count);
	}

	//length
	static void findLength1() {
		String str = "Welcome to SG";
		int length = str.length();
		System.out.println(length);
	}
	
	
	static int getLength(String str)
	{
		int length;
		length = str.length();
		return length;
	}
}
