package programs;

public class SortingNumbers {

	public static void main(String[] args) {
		
		int arr[] = {2,1,6,5,8,4};
		int newArr[] = new int[arr.length];
		int temp;

		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int n:arr) {
			System.out.print(n+",");
		}
	}

}
