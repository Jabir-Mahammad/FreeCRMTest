package exception;

public class ChildException {
	public static void main(String[] args) {
		try {
			int result = 10/5;
			System.out.println("Division: "+result);
			
			
			int arr[] = new int[2];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			for(int x:arr)
			{
				System.out.println(x);
			}
			
		}catch(ArithmeticException arith)
		{
			System.out.println("Arithmatic: "+arith);
		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println("Array: "+arr);
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}
}