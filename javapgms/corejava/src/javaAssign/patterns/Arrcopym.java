class Arrcopym{
	public static void main(String args[]){
	int arr1[]= {10,20,30,40};
	int arr2[]={1,2,3};
	int i,j,temp;
	for(i=0;i<arr2.length;i++){
	temp=arr1[i];
	arr1[i]=arr2[i];
	arr2[i]=temp;
	}
	System.out.println("The copied array values are");
	for(i=0;i<arr1.length;i++){
	System.out.print(arr1[i]+" ");
	}
    
    System.out.println();
    for(i=0;i<arr2.length;i++){
	System.out.print(arr2[i]+" ");
	}

	}
}