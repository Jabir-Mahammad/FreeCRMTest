package assignments.StringAssigment.StringQustions;


//replace space by underscore and make each first letter of the char capital

public class ReplcaeSpaceByUnderScore {

	public static void main(String[] args) {
		
		String str ="abc xyz mno a_z 1_2";
		
		
		String s=makeCapital(str);
		
		
		String str1=s.replace(' ', '_');
		
		System.out.println(str1);
	
		
		
		}
	static String makeCapital(String st) 
	{
		String s1="";	
		String arr[]=st.split(" ");
		
		
		for(String s:arr) 
		{
			s1=s1+" "+s.substring(0, 1).toUpperCase()+s.substring(1);
			
		}
		 s1=s1.replaceFirst(s1.substring(0,1),"");
		 
		 return s1;
	}

}
