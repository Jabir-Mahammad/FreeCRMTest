package practice;

public class Prime{
	void prime(int num) {
		int count=0;
		
		for(int i=num;i>=1;i--) {
			if(num%i==0) 
			{
				count++;
			}
				
		}
		if(count==2)
			System.out.println(" prime");
		else
			System.out.println("not prime");
	}
	

  public static void main(String[] args) {
	Prime ob = new Prime();
	int num=2;
	ob.prime(num);

	}

}
