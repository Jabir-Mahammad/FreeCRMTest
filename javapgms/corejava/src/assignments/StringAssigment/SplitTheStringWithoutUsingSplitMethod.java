package assignments.StringAssigment;

public class SplitTheStringWithoutUsingSplitMethod {

	public static void main(String[] args) {

		String str = "India is best in the world ";
		byte arr[] = str.getBytes();
		String s="";
		for (int i = 0; i < arr.length; i++) {
			char ch = (char) arr[i];
			s+=String.valueOf(ch);
			if(arr[i]==32)
			{
				System.out.println(s);
				s="";
			}
		}
	}
}
