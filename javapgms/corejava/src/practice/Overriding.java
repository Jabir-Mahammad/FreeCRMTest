package practice;

class A {
	void method1()
     {
		System.out.println("parent method");
		
		}
	
	 A(){
		 System.out.println("parent constr");
	 }
}


class B extends A{
	B()
    {
		super();
		System.out.println();
		super.method1();
		
		
		}
}
public class Overriding {

	public static void main(String[] args) {
		
B ob = new B();


	}

}
