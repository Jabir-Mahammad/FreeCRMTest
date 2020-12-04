package string;

public class ExtractValueFromGivenString {
	public static void main(String[] args) {
		//extractValue1();
		//extractValue2();
		subSequenceDemo();
	}

	//subString: to extract last values
	static void extractValue1()
	{
		String str1 = "India is great";
		
		String sRes = str1.substring(9);
		System.out.println(sRes);
	}
	
	
	//subString: Extract starting/middle values
	static void extractValue2()
	{
		String str1 = "India is great";
		String sRes = str1.substring(0, 5);
		System.out.println(sRes);
	}
	
	//***************************************
	
	//subSequence: to extract start, middle and end values
	static void subSequenceDemo()
	{
		String str1 = "Welcome to SG Testing";
		
		CharSequence sRes = str1.subSequence(11, 13);
		System.out.println(sRes);
	}
}
