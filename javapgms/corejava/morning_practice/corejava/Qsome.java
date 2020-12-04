package corejava;

public class Qsome {

	public static void main(String[] args) {
		char arr [] = {'Q','S','O','M','E'};
		
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=0;j<=arr.length-i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.print("/");
			for(int k=0;k<i;k++)
			{
				System.out.print(arr[k]);
				
			}
			System.out.println("\\");
		}

	}

}
