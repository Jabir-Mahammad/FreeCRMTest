package programs;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		//if the Array is sorted
		int arr[] = {1,2,3,7,8,10};
		int num=1;
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i]!=num) {
			
				System.out.println("missig number:"+num);
				i--;
			}
			num++;
		
		}
		
		//if the Array is not sorted
		int arr2[] = {5,3,2};
		int reg[] = new int[5];
		
		for(int n:arr2) {
			reg[n]=1;
		}
		
		for(int j=1;j<=5;j++) {
			if(reg[j]==0) {
				System.out.println(j);
			}
		}

	}

}
