package stringTokenizer;

import java.util.StringTokenizer;

public class StreamTokenizerDemo {
	public static void main(String[] args) {
		String str = null;
		StringTokenizer sToken = null;
		try {
			str = "welcome to SG Testing";
			sToken = new StringTokenizer(str, " ");
			
			while(sToken.hasMoreTokens())
			{
				System.out.println(sToken.nextToken());
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			str = null;
			sToken = null;
		}
	}
}