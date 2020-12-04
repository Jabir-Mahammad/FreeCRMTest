package stringBuffer;

public class InsertDemo {
	public static void main(String[] args) {
		insert();
	}

	//insert
	static void insert()
	{
		StringBuffer str = new StringBuffer("GADAG");
		StringBuffer strRes = str.insert(0, "!@#");
		System.out.println(strRes);
	}
}
