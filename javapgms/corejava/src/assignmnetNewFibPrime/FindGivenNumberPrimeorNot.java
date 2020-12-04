package assignmnetNewFibPrime;

public class FindGivenNumberPrimeorNot {

	public static void main(String[] args) {
		findPrime();

	}

	static void findPrime()
	{
		int num=16;
		int val=num/2;
		int cnt=0;
		for(int i=1;i<=val;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
		if(cnt>1)
			System.out.println("not prime");
		else
			System.out.println("no. is prime");
	}
}
