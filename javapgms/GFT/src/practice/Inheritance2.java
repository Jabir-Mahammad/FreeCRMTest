package practice;

class A 
{
	void method1(){System.out.println("hi");}  
	void method2(){
	System.out.println("world");
	} 
}

class B extends A
{
	void method1(){
		System.out.println("hello");
		}
}


public class Inheritance2 extends B  {

	public static void main(String[] args) {
	
      A a = new Inheritance2(); 
      
      B b=new B(); 
      B b1=new Inheritance2();
      a.method1(); 
      b.method1(); 
      a.method2();
      b1.method1();
	}

}
