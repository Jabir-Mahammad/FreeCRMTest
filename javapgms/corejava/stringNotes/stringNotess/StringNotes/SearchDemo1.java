package stringNotess.StringNotes;

public class SearchDemo1 {
	public static void main(String[] args) {
		//startsWithDemo();
		//endsWithDemo();
		containsDemo();
	}
	
	//startsWith demo
	static void startsWithDemo()
	{
		String str1 = "India is great";
		String str2 = "SG Testing Institute";
		
		boolean  blnRes1 = str1.startsWith("India");
		System.out.println(blnRes1);
		
		System.out.println("****************");
		boolean blnRes2 = str2.startsWith("Institute");
		System.out.println(blnRes2);
	}
	
	
	//endsWith Demo
	static void endsWithDemo()
	{
		String str1 = "India is great";
		String str2 = "SG Testing Institute";
		
		boolean blnRes1 = str1.endsWith("great");
		System.out.println(blnRes1);
		
		System.out.println("****************");
		
		boolean blnRes2 = str2.endsWith("SG");
		System.out.println(blnRes2);
	}
	
	
	//contains Demo
	static void containsDemo()
	{
		String str1 = "India is great. India";
		boolean blnRes1 = str1.contains("I");
		System.out.println(blnRes1);
		System.out.println("****************");
		
		String str2 = "Welcome to SG Institute";
		boolean blnRes2 = str2.contains("SG");
		System.out.println(blnRes2);
		System.out.println("****************");
		
		String str3 = "Welcome to SG Institute";
		boolean blnRes3 = str3.contains("Institute");
		System.out.println(blnRes3);
	}
}
