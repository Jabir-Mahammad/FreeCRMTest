package exception;

public class WhyException {
	public static void main(String[] args) {
		int result = 10/5;
		System.out.println("Division: "+result);
		
		//Handled the array exception
		try {
			int arr[] = new int[2];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			for(int x:arr)
			{
				System.out.println(x);
			}
		}catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println(arr);
		}
		
		
		
		for(int i=0;i<=10;i++)
		{
			if((i%2)==0)
			{
				System.out.println("Even #: "+i);
			}
		}
	}
}