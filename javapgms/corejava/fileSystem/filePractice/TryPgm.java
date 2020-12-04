package filePractice;

public class TryPgm {

	public static void main(String[] args) {
		String str="SundayMondayTuesday";  
		String s="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='y')
			{
				if(i==str.length()-1) {
					s=s+ch;
					break;
				}
				s=s+ch;
				
				s=s+',';
			}
			else {
				s=s+ch;
			}
		}
		System.out.println(s);

	}

}
