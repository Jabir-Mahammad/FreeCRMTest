package stringNoess.StringNotes;

public class CasesInString {
	public static void main(String[] args) {
		//toLowerCaseDemo();
		//toUpperCaseDemo();
		casesDemo("Abdul KALAM", "Narendra Modi");
	}
	
	//toLowerCase
	static void toLowerCaseDemo()
	{
		String str = "WelCome TO SG TESTIng";
		String sRes = str.toLowerCase();
		System.out.println(sRes);
	}
	
	
	//toUpperCase
	static void toUpperCaseDemo()
	{
		String str1 = "welcome To SG testING";
		String sRes = str1.toUpperCase();
		System.out.println(sRes);
	}
	
	
	
	static void casesDemo(String str1, String str2)
	{
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
	}
	
}
