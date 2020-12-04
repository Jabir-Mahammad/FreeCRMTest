package singleTon;

class Test
{
	public void display1()
	{
		System.out.println("display1 method");
	}
}
public class ClassDemo {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display1();
		System.out.println("***************");
		
		Test t2 = new Test();
		t2.display1();
		System.out.println("***************");
		
		Test t3 = new Test();
		t3.display1();
	}
}
