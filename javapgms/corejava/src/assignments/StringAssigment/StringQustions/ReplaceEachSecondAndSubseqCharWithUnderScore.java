package assignments.StringAssigment.StringQustions;

//replace each subsequent uoccurance of char with under score '_'

public class ReplaceEachSecondAndSubseqCharWithUnderScore {

	public static void main(String[] args) {
		String str = "ab ac zd";
		System.out.println(str);
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String s1 = String.valueOf(ch);
			if (s.contains(s1)) {
				if (s1.equals(" ")) {
					s = s + " ";
					continue;
				}
				s = s + String.valueOf('_');
			}

			else {
				s = s + s1;
			}

		}

		System.out.println(s);

	}

}
