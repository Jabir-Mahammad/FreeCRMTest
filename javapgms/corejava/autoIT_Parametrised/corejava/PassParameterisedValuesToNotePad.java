package corejava;

public class PassParameterisedValuesToNotePad {

	public static void main(String[] args) {
		autoITDemo2();

	}

	static void autoITDemo2()
	{
		String strExeFile = null;
		String ss="";
		try {
			strExeFile = "C:\\Users\\Lenovo\\Desktop\\AutoIt\\passingParameterisedValuesToNotepad.exe";
			String str1 = "Goodmorning";
			String str22 = "How";
			String str3 = "GOOOOD";
		
			Runtime.getRuntime().exec(strExeFile+" "+str1+" "+str22+" "+str3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
