package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Automtion";
		
		//using string buffer Reverse method
		StringBuffer strBuffer = new StringBuffer(str);
		System.out.println(strBuffer.reverse());
		
		
		//using for loop 1
		char arr[] = str.toCharArray();
		char newStr[]= new char[arr.length];
		int j=8;
		for(int i=0;i<arr.length;i++) {
			
			newStr[i] = arr[j-i];
			
		}

		String str2 = String.valueOf(newStr);
		
		System.out.println(str2);
		
		//using For Loop with charAt() 
		
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}