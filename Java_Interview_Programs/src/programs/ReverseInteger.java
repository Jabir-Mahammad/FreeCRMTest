package programs;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 4321;
		
		int temp=num;
		int rev = 0;
		
		while(num!=0) {
			 
			rev = rev*10+num%10;
			num = num/10;
		}
		

		System.out.println(rev);
	}

}
