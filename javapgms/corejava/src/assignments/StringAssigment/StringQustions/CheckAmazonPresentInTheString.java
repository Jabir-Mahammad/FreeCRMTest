package assignments.StringAssigment.StringQustions;

import java.util.Arrays;

public class CheckAmazonPresentInTheString {

	public static void main(String[] args) {
		String str1="AMAZON";
		String str2="AAZOMN";
		
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
	
		char temp;
		Arrays.sort(arr1);
		
		
		System.out.println();
		
		Arrays.sort(arr2);
		
	
		String newStr1 = String.valueOf(arr1);
		String newStr2 = String.valueOf(arr2);
		
		System.out.println("string1 "+newStr1);
		System.out.println("string2 "+newStr2);
		
		
		if( newStr1.contains(newStr2))
			System.out.println("Yess..we got it!!");
		else
			System.out.println("OOps!!...404");
		
		
		
		
	}
}
