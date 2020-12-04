package javaAssign;
class Sortarr{
	public static void main(String arg[]){
	  int i,j,temp;
	  int nums[]={3,1,5,2,9};

	  for(i=0;i<4;i++){
	   for(j=0;j<4;j++){
	     if(nums[j+1]<nums[j]){

           temp=nums[j];
           nums[j]=nums[j+1];
           nums[j+1]=temp;
	     }
	   }
	  }
	  for(i=0;i<5;i++){
	  System.out.print(nums[i]+" ");
     }
	}
}