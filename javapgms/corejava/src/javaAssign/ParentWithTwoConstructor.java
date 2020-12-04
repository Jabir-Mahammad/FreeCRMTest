package javaAssign;

class Parent3{
	
	public Parent3(int a) {
		this(1,2);
		System.out.println("1 st contsructor");
		
		
	}
	
    
	public Parent3(int a,int b) {
	System.out.println("2nd constructor");
		
	}
	
	
}

class Child3 extends Parent3{
	
	public Child3() {
		super(2);
	}
	
	
	
} 

public class ParentWithTwoConstructor {

	public static void main(String[] args) {
		Child3 ob = new Child3();
		
		
		

	}

}
