package assignments;

//class A extends abstract class B implements  interface C,D



interface X1{
	void interface1Method();
	default void meth()
	{
		
	}
}

interface Y1{
	void interface2Method();
}


abstract class B1 {
 abstract void method();
}

class A1 extends B1 implements X1,Y1{
public void interface1Method() {
		System.out.println("class A implents interface1Method");
	}
	
	public void interface2Method() {
		System.out.println("class A implents interface2Method");
	}
	
	
	 void method() {
		
		System.out.println("child class A1 implements abstract class Method");
	}
	
}
public class Inheritance3 {

	public static void main(String[] args) {
	
		A1 ob1 = new A1();
		ob1.interface1Method();
		ob1.interface2Method();
		
		ob1.method();
	}

}





