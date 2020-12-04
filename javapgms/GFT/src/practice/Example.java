package practice;

class A111
{
    
	void print()
	{
		System.out.println("jbj");
		disp();
	}
}

class B11 extends A111
{

	void disp()
	{
		System.out.println("child");
	}
}


public class Example
{
	public static void main(String ar[])
	{

	A111 ob = new B11();
	}
}