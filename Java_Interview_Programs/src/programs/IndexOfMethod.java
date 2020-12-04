package programs;

public class IndexOfMethod {

	public static void main(String[] args) {
		
		String str = "sachin sosurav sssmith sehwag";

		int occurance=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='s') {
				
				occurance++;
				
				if(occurance==5)
				System.out.println(occurance+" occurance at "+str.indexOf(str.charAt(i),i));
			}
		}
			
	}

}
