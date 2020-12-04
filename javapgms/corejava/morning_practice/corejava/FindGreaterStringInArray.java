package corejava;

public class FindGreaterStringInArray {

	public static void main(String[] args) {
		
		String arr[] = {"Vijay","Alie","Mary","Mary","Michal","Vijay","Michal","Haris","Aris","Alie"};
		
		int k=0,count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
				}
			}
		}
	
		System.out.println(count);
		String newArr[]= new String[count];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					newArr[k] = arr[i];
					k++;
				}
			}
		}
		
		for(String x : newArr)
			System.out.println(x);
		int x;
		String  max = "";
		for(int i=0;i<newArr.length;i++)
		{
			x = newArr[i].compareTo(max);
			if(x > 0)
				max = newArr[i];
			else if(x < 0)
				max = max;
			else if(x == 0)
				max =  newArr[i];
		
		}
		
		
		System.out.println(max);
	

	}

}
