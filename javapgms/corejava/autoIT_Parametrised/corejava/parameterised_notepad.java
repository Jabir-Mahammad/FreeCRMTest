package corejava;


public class parameterised_notepad {
	public static void main(String[] args) {
		//autoITDemo1();
		autoITDemo2();
	}
	
	
	//autoIT without parameter
	static void autoITDemo1()
	{
		String strExeFile = null;
		try {
			strExeFile = "C:\\Users\\Lenovo\\Desktop\\AutoIt\\NotePad_No_Parameter.exe";
			Runtime.getRuntime().exec(strExeFile);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	//autoIT without parameter
	static void autoITDemo2()
	{
		String strExeFile = null;
		String strFile = null;
		try {
			strExeFile = "C:\\Users\\Lenovo\\Desktop\\AutoIt\\NotePad_With_Parameter.exe";
			strFile = "C:\\Users\\Lenovo\\Desktop\\javaNotes\\ABC.txt";
			
			Runtime.getRuntime().exec(strExeFile+" "+strFile);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

