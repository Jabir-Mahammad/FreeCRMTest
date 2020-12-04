package practice;

class Pallin{
	Pallin() {
		String str="ajwaja";
		int k=0;
		
		char  str2[]=str.toCharArray();
		char str3[]=new char[str2.length];
		
		for(int i=str2.length-1;i>=0;i--) {
			str3[k]=str2[i];
			k++;
		}
		int flag=0;
		
		for(int i=0;i<str3.length;i++) {
	       if(str3[i]==str2[i])
	    	    flag=1;
	       else {
	    	   flag=0;
	    	   break;
	    	   
	       }
		}
		if(flag==1)
			System.out.println("yes it is pallindrome");
		else 
			System.out.println("not pallindrome");
		 
	}
}

public class Pallindrome {

	public static void main(String[] args) {
	Pallin p=new Pallin();

	}

}
