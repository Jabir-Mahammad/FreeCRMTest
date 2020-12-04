package assignments.StringAssigment.StringQustions;

public class FindOutCountOfUpperAndLower {

	public static void main(String[] args) {
		String str="abcABC Ab AA CBCBbbbzZ";
		int upperCnt=0,lowerCnt=0;
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90) 
			{
				upperCnt++;
			}
			
			if(ch>=97 && ch<=122) 
			{
				lowerCnt++;
			}
		}
		
		System.out.println("no. of UPPER CASE letter:"+upperCnt);
		System.out.println("no. of UPPER CASE letter:"+lowerCnt);

	}

}
