package exception;

public class TryCatchFinally {
	public static void main(String[] args) {
		String str = null;
		try {
			str = "India is great";
			System.out.println(str);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Default Block");
			str = null;
		}
	}
}
