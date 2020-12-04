package javaAssign;

interface ParentInterface{
	void method1();
}

class Child11 implements ParentInterface{
	public void method1() {
		System.out.println("child11 implements method1 of Interface ");
	}
}

class Child22 implements ParentInterface{
	public void method1() {
		System.out.println("child11 implements method1 of Interface ");
	}
}

class Child33 extends Child22{
	public void method1() {
		System.out.println("child33 overrides method1 of child22 ");
	}
}

public class HeirarchHybridInterface {

	public static void main(String[] args) {
		Child33 ob =new Child33();
		ob.method1();
      
		ParentInterface ob2 = new Child11();
		ob2.method1();
	}

}
