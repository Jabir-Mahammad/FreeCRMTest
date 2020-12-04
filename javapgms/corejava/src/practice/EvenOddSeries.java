package practice;

class EvenOdd1{
	void method() {
		int k=2,m=1;
	for(int i=1;i<11;i++) {
		if(i%2 != 0) {
			System.out.print(k+" ");
			k=k+2;
		}
		else {
			System.out.print(m+" ");
			m=m+2;
		}
	
	}
}}

public class EvenOddSeries {

	public static void main(String[] args) {
	EvenOdd1 ob = new  EvenOdd1();
	ob.method();
	}
	}


