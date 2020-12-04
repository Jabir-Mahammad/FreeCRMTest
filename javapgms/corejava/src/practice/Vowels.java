package practice;

//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class Vowels
{
// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
public static void eliminateVowelString(String string)
{
 char arr[]=string.toCharArray();
 char arr2[]=new char[arr.length];
 int k=0;
 
 for(int i=0;i<arr.length;i++){
     if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
         continue;
     }
     else{
       arr2[k]=arr[i];
       k++;
     }
 }
 
 for(int i=0;i<arr2.length;i++) {
	 System.out.print(arr2[i]);
 }




} 
public static void main(String arg[]){
    Vowels.eliminateVowelString("jaeioubr");
   
}
//METHOD SIGNATURE ENDS
}
