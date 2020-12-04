class Twoone{
	public static void main(String args[]){
	  int arr[]= new int[6];
	  int arr2[][]={{1,2,3},{3,4,5}};
	  int n=0;

	  for(int i=0;i<arr2.length;i++){
	     for(int j=0;j<arr2[i].length;j++){
	     	

	       arr[n]=arr2[i][j];
	       System.out.print(arr[n]);
	       n++;
	     }
	    
	  }

	}
}