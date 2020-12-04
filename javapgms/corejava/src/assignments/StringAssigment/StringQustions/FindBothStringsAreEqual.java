package assignments.StringAssigment.StringQustions;

public class FindBothStringsAreEqual {

	public static void main(String[] args) {
		String str1="welcome";
		String str2="comewel";
		
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
	
		char temp;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					
				}
			}
		}
		
		
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length-1;j++) {
				if(arr2[j]>arr2[j+1]) {
					temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
					
				}
			}
		}
		
	
		String newStr1 = String.valueOf(arr1);
		String newStr2 = String.valueOf(arr2);
		
		System.out.println("string1 "+newStr1);
		System.out.println("string2 "+newStr2);
		
		
		if( newStr1.equals(newStr2))
			System.out.println("Yess..we got it!!");
		else
			System.out.println("OOps!!...404");
		
		
		
		
	}
}
