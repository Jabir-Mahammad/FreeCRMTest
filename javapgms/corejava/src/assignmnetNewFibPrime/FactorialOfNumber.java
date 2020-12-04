package assignmnetNewFibPrime;

public class FactorialOfNumber {

	public static void main(String[] args) {
		factNum();

	}
	static void factNum()
	{
		int num=5;
		int fact=1,i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of a number is: "+fact);
	}

}
