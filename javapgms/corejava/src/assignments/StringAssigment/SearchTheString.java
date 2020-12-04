package assignments.StringAssigment;

//search string

public class SearchTheString {

	public static void main(String[] args) {
		
		String st="India is best in the world";
        String search="BEST";
        search(st,search);
	}
	
	static void search(String str,String srch) {
		
		String str1 =str.toLowerCase();
		String str2 =srch.toLowerCase();
		boolean res = str1.contains(str2);
		System.out.println(res);
		
	}

}
