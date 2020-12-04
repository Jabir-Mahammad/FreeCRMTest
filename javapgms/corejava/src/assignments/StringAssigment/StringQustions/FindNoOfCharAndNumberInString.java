package assignments.StringAssigment.StringQustions;

public class FindNoOfCharAndNumberInString {

	public static void main(String[] args) {
		String str ="h1";
		int count=0,item=0;
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			boolean bRes=Character.isDigit(c);
			if(bRes) 
			{
				count++;
			}
			else
			{
			  item++;	
			}
			
		}
		System.out.println("no. of characters "+item);
		System.out.println("no. of Numeric values "+count);

	}

}
