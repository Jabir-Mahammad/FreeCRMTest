package practice;

class Pattern1{
	static void method(int num) {
		int k=num/2;
	for(int i=0;i<=num;i++) {
		
		if(i>=k) {
			int z=1;
			for(int j=k--;j>=0;j--) {
				
				System.out.print(z++);
			}
			System.out.println();
			continue;
		}
		 
		
		else {
			int x=1;
		for(int j=0;j<=i;j++) {
			
			System.out.print(x++);
		}
		}
		System.out.println();
		
	}
	}
}

public class PatternVary {

	public static void main(String[] args) {
	Pattern1.method(15);	

	}

}
