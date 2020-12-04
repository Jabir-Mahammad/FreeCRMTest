package stringNotess.StringNotes;

public class SearchDemo2 {
	public static void main(String[] args) {
		indexOfDemo1();
		//indexOfDemo2();
		//findOccurance();
	}

	//indexOf demo
	static void indexOfDemo1()
	{
		String str = "Welcome to SG Testing institute. Testing";
		int pos1 = str.indexOf('S');
		System.out.println(pos1);
		System.out.println("******************");
		
		int pos2 = str.indexOf('o',5);
		System.out.println(pos2);
		System.out.println("******************");
		
		int pos3 = str.indexOf("Testing");
		System.out.println(pos3);
		System.out.println("******************");
		
		int pos4 = str.indexOf("Testing", 15);
		System.out.println(pos4);
	}
	
	
	static void indexOfDemo2()
	{
		String str = "Welcome to SG Testing institute. Testing";
		int pos1 = str.indexOf('o',str.indexOf('o')+1);
		System.out.println(pos1);
		System.out.println("******************");
		
		int pos2 = str.indexOf("Testing", str.indexOf("Testing")+1);
		System.out.println(pos2);
	}
	
	
	//Q: find the number of occurance of given String/char
	//Ans:
	static void findOccurance()
	{
		String str = "cat is a pet. cat is demostic";
		int count = 0;
		int pos = 0;
		for(int i=0;i<str.length();i++)
		{
			pos = str.indexOf("is", pos);	
			if(pos==-1)
			{
				System.out.println("Occurance: "+count);
				break;
			}else {
				//System.out.println("Position: "+pos);
				pos++;
				count++;
			}
		}
	}
}
