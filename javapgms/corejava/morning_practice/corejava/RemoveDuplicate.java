package corejava;


public class RemoveDuplicate {

	public static void main(String[] args) {
		String str ="hello";
		String s = "";
	char ar[] =str.toCharArray();
 
	for(int i=0;i<ar.length;i++)
	{
		if(s.contains(String.valueOf(ar[i])))
			continue;
		else
		{
			s=s+String.valueOf(ar[i]);
		}
	}
		

		System.out.println(s);
	}

}
