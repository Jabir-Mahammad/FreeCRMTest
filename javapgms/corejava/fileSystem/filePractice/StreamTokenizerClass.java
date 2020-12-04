
package filePractice;

import java.io.File;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class StreamTokenizerClass {

	public static void main(String[] args) {
		
		streamToken();
	}
	
	static void streamToken()
	{
		StreamTokenizer st = null;
		int cnt=0,val=0;
		try
		{
			st = new StreamTokenizer(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\sample.txt"));
	        while(st.nextToken()!=StreamTokenizer.TT_EOF)
	        {
	        	if(st.ttype==StreamTokenizer.TT_WORD)
	        		cnt++;
	        	if(st.ttype==StreamTokenizer.TT_NUMBER)
	        		val++;
	        }
	        System.out.println("words count:"+cnt);
	        System.out.println("number count:"+val);
		}catch(Exception e) {
			
		}
		finally {
	
		}
	}

}
