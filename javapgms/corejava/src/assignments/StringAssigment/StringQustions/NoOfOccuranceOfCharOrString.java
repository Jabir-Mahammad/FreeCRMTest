package assignments.StringAssigment.StringQustions;

import java.util.Arrays;

//find out the number occurance of each character in a string.
//find out the max occurance of char in a given string.

public class NoOfOccuranceOfCharOrString {

	public static void main(String[] args) {
		
      findOccurance();
	}
   
	static void findOccurance()
	{
		int c=0;
		String str = "aabbbb";
		String str1="";
		char[] strArray=str.toCharArray();
		
		int arr2[]= new int[strArray.length];
		for(int i=0;i<strArray.length;i++)
		{
			String s=String.valueOf(strArray[i]);
			if(str1.contains(s) || strArray[i]==' ')
				continue;
				
		  for(int j=0;j<strArray.length;j++)
		   {
		     if(strArray[i]==strArray[j])
		     {
		        c++;
		        str1=str1+String.valueOf(strArray[i]);
		      }
		   }
		System.out.printf("%s :",strArray[i]);
		System.out.printf("%d\n",c);
	    
		arr2[i]=c;
		c=0;
		}	
		
		
	//maximum no. of occurance of the character
		int max=0;
		char ch=0;
		
		for(int i=0;i<arr2.length;i++) 
		{
			if(arr2[i]>max) {
				max=arr2[i];
			    ch=strArray[i];
			}
		}
		
	  System.out.println("maximum occurance: "+max+" "+"character: "+ch);
		
		}
	
	}

