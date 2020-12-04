package string;

public class ValueOfDemo {
	public static void main(String[] args) {
		valueOf();
	}

	//valueOf
	static void valueOf()
	{
		int num = 100;
		String str1 = String.valueOf(num);
		System.out.println(str1);
		
		boolean bln = true;
		String str2 = String.valueOf(bln);
		System.out.println(str2);
		
		double sal = 9999.99;
		String str3 = String.valueOf(sal);
		System.out.println(str3);
	}
}
