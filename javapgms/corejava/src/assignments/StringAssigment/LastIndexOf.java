package assignments.StringAssigment;


public class LastIndexOf {
	public static void main(String[] args) {
		indexOfDemo1();
		indexOfDemo2();
		findOccurance();
	}

	//indexOf demo
	static void indexOfDemo1()
	{
		String str = "Welcome to SG Testing institute. Testing";
		int pos1 = str.lastIndexOf('S');
		System.out.println(pos1);
		System.out.println("******************");
		
		int pos2 = str.lastIndexOf('o',5);
		System.out.println(pos2);
		System.out.println("******************");
		
		int pos3 = str.lastIndexOf("Testing");
		System.out.println(pos3);
		System.out.println("******************");
		
		int pos4 = str.lastIndexOf("Testing", 15);
		System.out.println(pos4);
	}
	
	
	static void indexOfDemo2()
	{
		String str = "Welcome to SG Testing institute. Testing";
		int pos1 = str.lastIndexOf('o',str.lastIndexOf('o')-1);
		System.out.println(pos1);
		System.out.println("******************");
		
		int pos2 = str.lastIndexOf("Testing", str.lastIndexOf("Testing")-1);
		System.out.println(pos2);
	}
	
	
	//Q: find the number of occurance of given String/char
	//Ans:
	static void findOccurance()
	{
		String str = "cat is a pet. cat is is demostic is";
		int count = 0;
		int pos = str.length();
		for(int i=0;i<str.length();i++)
		{
			pos = str.lastIndexOf("is", pos);	
			if(pos==-1)
			{
				System.out.println("Occurance: "+count);
				break;
			}else {
				
				pos--;
				count++;
			}
		}
	}
}

