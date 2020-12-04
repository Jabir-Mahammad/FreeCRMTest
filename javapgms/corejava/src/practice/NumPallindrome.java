package practice;

class NumPallin{
	
	void pallindrome(int num) {
		int temp=num;
		int rem,rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(temp==rev)
			System.out.println("paliindrome");
		else
			System.out.println("not pallindrome");
	}
	
}

public class NumPallindrome {

	public static void main(String[] args) {
		NumPallin ob = new NumPallin();
		int num=344445;
		ob.pallindrome(num);
	}

}
