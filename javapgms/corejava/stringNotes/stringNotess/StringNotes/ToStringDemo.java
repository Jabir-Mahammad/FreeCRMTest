package stringNotess.StringNotes;

class Sample
{
	String FN;
	String LN;
	int age;
	
	Sample(String First, String last, int age)
	{
		FN = First;
		LN = last;
		this.age = age;
	}
	
	public String toString()
	{
		return "First:"+FN+", LN: "+LN+" & age: "+this.age;
	}
}

public class ToStringDemo {
	public static void main(String[] args) {
		Sample s1 = new Sample("Abdul", "Kalam", 70);
		System.out.println(s1);
	}
}