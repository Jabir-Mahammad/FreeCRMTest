package assignmnetNewFibPrime;

public class FindPrimeNosInGivenRangeOfValues {

	public static void main(String[] args) {
		findPrimeInGivenRange();

	}
	static void findPrimeInGivenRange()
	{
		int num=5,cnt=0;
		int i;
		System.out.printf("first %d prime no's are\n",num);
		for(i=1;i<=num;i++)
		{
			cnt=0;
			int val=i/2;
			for(int j=1;j<=val;j++)
			{
				if(i%j==0)
					cnt++;
					
			}
			if(cnt==1)
				System.out.println(i);
		}
	}

}
