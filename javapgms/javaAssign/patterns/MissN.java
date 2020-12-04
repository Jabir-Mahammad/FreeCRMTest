class MissN{
	public static void main(String args[]){
	  int i=0,j;
	  int arr[]={100,103,105,106};
	  int k=0;
	  for(i=arr[0];i<arr[arr.length-1];i++){
           if(arr[k]==i)
           {
           	k++;
           }
           else
           {
           	System.out.println(i);
           }


	  }
	}
}