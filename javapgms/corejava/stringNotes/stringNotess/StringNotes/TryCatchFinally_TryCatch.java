package stringNotess.StringNotes;

import java.io.FileInputStream;

public class TryCatchFinally_TryCatch {
	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("D:\\CITY\\Sample.txt");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fin.close();
				fin = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
