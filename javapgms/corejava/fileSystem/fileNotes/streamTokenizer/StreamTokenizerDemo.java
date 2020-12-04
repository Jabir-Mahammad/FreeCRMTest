package fileNotes.streamTokenizer;

import java.io.FileReader;
import java.io.StreamTokenizer;

public class StreamTokenizerDemo {
	public static void main(String[] args) {
		//readWords();
		readInteger();
	}

	//read only words from file
	static void readWords()
	{
		StreamTokenizer sToken = null;
		try {
			sToken = new StreamTokenizer(new FileReader("D:\\CoreJava\\Sample.txt"));
			
			while((sToken.nextToken())!=StreamTokenizer.TT_EOF)
			{
				if(sToken.ttype==StreamTokenizer.TT_WORD)
				{
					System.out.println(sToken.sval);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sToken = null;
		}
	}
	
	
	//read only number from file
	static void readInteger()
	{
		StreamTokenizer sToken = null;
		try {
			sToken = new StreamTokenizer(new FileReader("D:\\CoreJava\\Sample.txt"));
			
			while((sToken.nextToken())!=StreamTokenizer.TT_EOF)
			{
				if(sToken.ttype==StreamTokenizer.TT_NUMBER)
				{
					System.out.println(sToken.nval);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sToken = null;
		}
	}
	
}