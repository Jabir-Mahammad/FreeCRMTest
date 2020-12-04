package stringBuffer;

public class ItsMutable {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Sachin");
		StringBuffer str1 = str.append(" Tendulkar");
		System.out.println(str);
		System.out.println(str1);
	}
}