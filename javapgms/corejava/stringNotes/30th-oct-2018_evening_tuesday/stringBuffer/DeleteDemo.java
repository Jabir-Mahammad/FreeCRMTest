package stringBuffer;

public class DeleteDemo {
	public static void main(String[] args) {
		//delete(new StringBuffer("Bangalore"));
		deleteCharAt("Bangalore");
	}

	//delete
	static void delete(StringBuffer str)
	{
		System.out.println("Before: "+str);
		StringBuffer strRes = str.delete(0, 2);
		System.out.println("After: "+strRes);
	}
	
	
	//deleteCharAt
	static void deleteCharAt(String str)
	{
		StringBuffer strRes = new StringBuffer(str);
		StringBuffer strOutput = strRes.deleteCharAt(0);
		System.out.println(strOutput);
	}
}
