package javaAssign;

abstract class A{
	abstract void method1();
	abstract void method2();
}

abstract class B extends A{
	void method1() {
		System.out.println("B implements mthod1 of abstract class A");
	}
	
	void method2() {
		System.out.println("B implements mthod2 of abstract class A ");
	}
	
	abstract void method3();
}

class C extends A{
	void method1() {
		System.out.println("C implements mthod1 of abstract class A");
	}
	
	void method2() {
		System.out.println("C implements mthod2 of abstract class A");
	}
}

class D extends B {
	void method3() {
		System.out.println("D implements method3 of abstract class B");
	}
	void method4() {
		System.out.println("D implements method3 of abstract class B");
	}
}



public class HeirarchyAbstractClass {

	public static void main(String[] args) {
		
     C ob1 = new C();
     ob1.method1();
     ob1.method2();
     System.out.println();
     
     //B uses child class D references
     B ob3 = new D();
     ob3.method1();
     ob3.method2();
     
     System.out.println();
    
     D ob2 = new D();
     ob2.method3();


	}

	
}
