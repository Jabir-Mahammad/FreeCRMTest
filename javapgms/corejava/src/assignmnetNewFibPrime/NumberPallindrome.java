package assignmnetNewFibPrime;

public class NumberPallindrome {

	public static void main(String[] args) {
		numPallindrome();

	}

	static void numPallindrome()
	{
		int num=1000;
		int temp=num;
		int rem,res=0;
		while(num>0)
		{
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		if(res==temp)
		     System.out.println("yes pallindrome");
		else
			System.out.println("not pallindrome");
	}
}

