package assignments.StringAssigment;

public class CapitalizefirstLetterOfTheWord {

	public static void main(String[] args) {
		
		
		String st = "welcome to sg testing institute";
		
		String str=st.substring(11);
		
		
		
		//capitalize the initial letter of each word
		String str1 = str.substring(0,1).toUpperCase()+str.substring(1, 3)+
				str.substring(3,4).toUpperCase()+str.substring(4,11)+str.substring(11,12).toUpperCase()+str.substring(12,20);
		System.out.println(str1); 

	}

}


