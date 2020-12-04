package assignmnetNewFibPrime;

public class MaxAndMinNumberInArray {

	public static void main(String[] args) {
		findMax();
		findMin1();
	}
	
	//find maximum
	static void findMax()
	{
		int arr[]= {-1,4,0,99};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max) 
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	//find minimum
		static void findMin1()
		{
			int arr[]= {-1,5,89,74,123,456,4500};
			int min=arr[0];
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
					min=arr[i];
			}
			System.out.println(min);
		}
}
