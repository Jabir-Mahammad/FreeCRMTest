package practice;

public class SplitTheStringWithoutUsingSplitMethod1 {

	public static void main(String[] args) {
		String str = "India is great.";
		char arr[]=str.toCharArray();
		String s="";
		for(char c:arr) {
			s=s+String.valueOf(c);
			if(c==' ' || c=='.') {
				System.out.println(s);
				s="";
			}
		}

	}

}
