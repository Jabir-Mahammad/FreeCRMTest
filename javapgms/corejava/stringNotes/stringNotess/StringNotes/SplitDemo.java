package string;

public class SplitDemo {
	public static void main(String[] args) {
		//splitExample1();
		//splitExample2();
		splitExample3();
	}

	//split
	static void splitExample1()
	{
		String str = "SG Testing Institute";
		
		String arr[] = str.split(" ");
		System.out.println("array size: "+arr.length);
		for(String s1: arr) System.out.println(s1);
	}
	
	
	static void splitExample2()
	{
		String str = "SG Testing Institute";
		String arr[] = str.split(" ", 2);
		System.out.println("array size: "+arr.length);
		for(String s1: arr) System.out.println(s1);
	}
	
	
	static void splitExample3()
	{
		String str = "A#B#C#D#E#####";
		String arr[] = str.split("#", -1);
		System.out.println("array size: "+arr.length);
		for(String s1: arr) System.out.println(s1);
	}
}