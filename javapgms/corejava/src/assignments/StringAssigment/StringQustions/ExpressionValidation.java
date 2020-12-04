package assignments.StringAssigment.StringQustions;



public class ExpressionValidation {

	public static void main(String[] args) {
		String str = "ABC({bcd}))}(";
		int cnt1=0,cnt2=0,cnt3=0;
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			if(ch=='(' )
				cnt1++;
			
			if(ch=='[')
				cnt2++;
			
			if(ch=='{')
				cnt3++;
				
		}
		
		
		int cnt11=0,cnt22=0,cnt33=0;
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			if(ch==')')
				cnt11++;
			
			if(ch==']')
				cnt22++;
			
			if(ch=='}')
				cnt33++;
				
		}
		
		if(cnt1==cnt11)
			System.out.println("correct expression");
		else if(cnt1>cnt11)
			System.out.println("missing ')'");
		else
			System.out.println("missing '('");
			
		
		
		if(cnt2==cnt22)
			System.out.println("correct expression");
		else if(cnt2>cnt22)
			System.out.println("missing ']'");
		else
			System.out.println("missing '['");
		
		
		if(cnt3==cnt33)
			System.out.println("correct expression");
		else if(cnt3>cnt33)
			System.out.println("missing '}'");
		else
			System.out.println("missing '{'");
		
		
		
	}

}
