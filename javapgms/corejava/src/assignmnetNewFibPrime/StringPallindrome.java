package assignmnetNewFibPrime;

public class StringPallindrome {

	public static void main(String[] args) {
		//stringPallindrome1();
		stringPallindrome2();
   }
	
	//using reverse() method of String buffer
	static void stringPallindrome1()
	{
		 String str="madamm";
		 StringBuffer s1 = new StringBuffer(str);
		 s1.reverse();
		 String str2 = new String(s1);
		 if(str2.equals(str))
			 System.out.println("pallindrome");
		 else
			 System.out.println("not pallindrome");
	}
	
	static void stringPallindrome2()
	{
		 String str="abab";
		 String str2="";
		  for(int i=str.length()-1;i>=0;i--)
		  {
			  str2= str2+str.charAt(i);
		  }
		  System.out.println(str2);
		
		 if(str2.equals(str))
			 System.out.println("pallindrome");
		 else
			 System.out.println("not pallindrome");
	}

}
