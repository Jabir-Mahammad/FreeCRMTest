package assignmnetNewFibPrime;

public class FindSecondMaxAndMinInArray {

	public static void main(String[] args) {
		
		findSecondMax();
	FindSecondMin();

	}
	
	static void findSecondMax()
	{
		int arr[]= {11,10,14,2,11,2222,15,14,12,13,14,15,18};
		int max=arr[0];
		int max2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2 && arr[i]<max)
			{
				max2=arr[i];
			}
		}
		System.out.println("first maximum number is: "+max);
		System.out.println("second max number is: "+max2);
   }
	
	static void FindSecondMin()
	{
		int arr[]= {2,-9,1,0,-8,745,123,456,4500,2,-9};
		int min=arr[0];
		int min2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min2=min;
				min=arr[i];
			}
			
			else if(arr[i]<min2 && arr[i]>min)
			{
				min2=arr[i];
			}
		}
		System.out.println("first minimum number is: "+min);
		System.out.println("second min number is: "+min2);

	}

}
