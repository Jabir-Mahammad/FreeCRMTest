package javaAssign;

class Parent1{
	
	public void method(int a) {
		System.out.println("method witth 1 int param");
	}
	
	void method(String a) {
		System.out.println("method witth 1 string  param");
	}
	
	void method(int a,int b) {
		System.out.println("method witth 2 int param");
	}
	
}

class Child1 extends Parent1{
	Child1(){
		
		method(2);
		method(2,4);
		
		}
	void method(int a,String b) {
		
		System.out.println("child consructor");
	}
	
	void method(String b,int a) {
		
		System.out.println("child consructor2");
	}
	
	
}

public class SimpleInherMethodoverloading {

	public static void main(String[] args) {
		Child1 ob = new Child1();
		ob.method("mjsi");
		ob.method(1,"mjsi");
		ob.method("mjsi",2);

	}

}
