package practice;

class PrimeFib{
	void Fibnacci(int a) {
		
		int i,f1=0,f2=1,fib=0;
		for(i=1;i<=a;i++) {
			fib=f1+f2;
			f1=f2; 
			f2=fib;
		}
		System.out.println(f1+" ");
		
	}
	
	int k,count,i,flag=0;
	int MAX=100;
	
	void Prime(int a) 
	{
		for(i=1;i < MAX;i++) 
		{
			count=0;
			for(int num=i;num>=1;num--) 
			{
				if(i%num==0)
				 count++;
			}
			if(count==2) 
			{
				flag++;
				if(flag==a) {
					System.out.println(i);
				break;
				}
			}
				
			
		}
		
	}
}

public class PrimeFibnacci {

	public static void main(String[] args) {
		
		//1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, …
		
		PrimeFib ob = new PrimeFib();
		int num=3;
		if(num%2==1)
			ob.Fibnacci(num/2+1);
		else
			ob.Prime(num/2);

	}

}
