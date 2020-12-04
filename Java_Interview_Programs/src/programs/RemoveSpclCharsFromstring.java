package programs;

public class RemoveSpclCharsFromstring {

	public static void main(String[] args) {
		
		String str = "/hello&wor#l@d";
		

		//using Regular Expression
		String s = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
