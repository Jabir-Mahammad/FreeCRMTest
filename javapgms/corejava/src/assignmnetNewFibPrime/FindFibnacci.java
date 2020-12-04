package assignmnetNewFibPrime;

public class FindFibnacci {

	public static void main(String[] args) {
		findFib();

	}
	static void findFib()
	{
		int num =5;
		int fib1=1,fib2=1,fib=0;
		if(num==1)
			System.out.println(fib2);
		 if(num>=2) {
				System.out.println(fib1);
				System.out.println(fib2);
		    }
		
		for(int i=3;i<=num;i++)
		{
			fib=fib1+fib2;
			System.out.println(fib);
			fib1=fib2;
			fib2=fib;
		}
	}

}
