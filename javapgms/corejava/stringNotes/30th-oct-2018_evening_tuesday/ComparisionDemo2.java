package string;

public class ComparisionDemo2 {
	public static void main(String[] args) {
		//compareTo();
		compareToIgnoreCase();
	}
	//compareTo
	static void compareTo()
	{
		String str1 = "Raichur";
		String str2 = "Raichur";
		String str3 = "raichur";
		
		int num1 = str1.compareTo(str2);
		System.out.println("Both are same: "+num1);
		System.out.println("**************");
		
		int num2 = str1.compareTo(str3);
		System.out.println("First is smaller than second: "+num2);
		System.out.println("**************");
		
		int num3 = str3.compareTo(str1);
		System.out.println("First is bigger than second: "+num3);
	}
	
	
	//compareToIgnoreCase
	static void compareToIgnoreCase()
	{
		String str1 = "Bangalore";
		String str2 = "BaNgAlOrE";
		int num = str1.compareToIgnoreCase(str2);
		System.out.println(num);
	}
}
