package practice;

public class SqntialSearch {

	public static void main(String[] args) {
		
		
		int arr[] =  {1,2,3,5,6,7,8,9};
		int Low = 0;
		int high = arr.length-1;
		int key = 11;
		 binSearch(arr, Low, high, key);
		

	}

	static void binSearch(int arr[],int low,int high,int key)
	{
		
		if(high >= low)
		{
			 int mid = (low + high) / 2;
			 
	    if(arr[mid] == key)
	    	System.out.println("found");
	    
	     if(arr[mid] > key)
	    {
	    	
	    	binSearch(arr, low, mid - 1, key);
	    }
	    
	     if(arr[mid] < key)
	    {
	    	
	    	 binSearch(arr, mid+1, high, key);
	    }
	}
		
		else
			System.out.println("not found");
			
		
	}
}
