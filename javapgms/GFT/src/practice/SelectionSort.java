package practice;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {4,2,6,3,9,1};
		int temp;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j] > arr[++j])
				{
					temp = arr[j];
				    arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int a : arr)
			System.out.println(a);

	}

}
