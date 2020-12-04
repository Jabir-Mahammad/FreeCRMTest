package practice;

public class Fact {

	public static void main(String[] args) {
		System.out.println("factorial of the number");
		int num =4;
		int i=1,fact=1;
		while(i<=num) {
			fact = fact* i;
			i++;
		}
System.out.println(fact);
	}

}
