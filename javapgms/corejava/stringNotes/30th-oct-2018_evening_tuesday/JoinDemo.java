package string;

public class JoinDemo {
	public static void main(String[] args) {
		join();
	}
	
	//join
	static void join()
	{
		String str1 = String.join(">", "A","B","C","D");
		System.out.println(str1);
	}
}