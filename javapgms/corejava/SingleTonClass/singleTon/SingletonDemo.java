package singleTon;

class Test1
{
	public static Test1 obj = null;
	private Test1()
	{
		//Default private Constructor
	}
	
	static Test1 getInstance()
	{
		if(obj==null)
		{
			obj = new Test1();
		}
		
		return obj;
	}
	
	public void display1()
	{
		System.out.println("display1 method");
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		Test1 t1 = Test1.getInstance();
		t1.display1();
		System.out.println("***************");
		
		Test1 t2 = Test1.getInstance();
		t2.display1();
		System.out.println("***************");
		
		Test1 t3 = Test1.getInstance();
		t3.display1();
	}
}
