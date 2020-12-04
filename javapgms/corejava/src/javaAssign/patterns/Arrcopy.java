class Arrcopy{
	public static void main(String args[]){
	int arr1[]= new int[4];
	int arr2[]={1,2,3,4};
	int i,j;
	for(i=0;i<arr2.length;i++){
	arr1[i]=arr2[i];
	}
	System.out.println("The copied array values are");
	for(i=0;i<arr2.length;i++){
	System.out.print(arr1[i]+" ");
	}
	}
}