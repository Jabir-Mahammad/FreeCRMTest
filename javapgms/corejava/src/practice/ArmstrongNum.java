package practice;

class Armstrong{
	int rem,sum=0;
	void method(int num) {
		int temp=num;
		while(num!=0) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
		}
		if(temp==sum)
			System.out.println("yes Armstrong");
		else
			System.out.println("not");
	}
}

public class ArmstrongNum {

	public static void main(String[] args) {
		
     Armstrong ob = new Armstrong();
     int num=371;
     ob.method(num);
	}

}
