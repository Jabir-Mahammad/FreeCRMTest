class Ontwo{
	public static void main(String args[]){
	  int arr[]= {1,2,3,4};
	  int arr2[][]=new int[2][3];
	  int n=0;

	  for(int i=0;i<arr2.length;i++){
	     for(int j=0;j<arr2[i].length;j++){
	     	if(n>arr.length-1) break;

	       arr2[i][j]=arr[n++];
	       System.out.print(arr2[i][j]);
	       
	     }
	     System.out.println();

	  }

	}
}