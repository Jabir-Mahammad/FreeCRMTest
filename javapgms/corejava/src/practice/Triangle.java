package practice;

public class Triangle {
	static int k=0;

	public static void main(String[] args) {
		for(int i=5;i>=0;i--) {
			for(int x=0;x<=i;x++)
			 {
				System.out.print(" ");
			}
			for(int j=1;j<=k;j++)
				System.out.print("*");
			
			System.out.println();
			k++;
		}
		

	}

}
