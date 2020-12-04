package javaAssign;

class Parent{
	
	 Parent(String str){
		System.out.println("1constructor parent "+str);
		
	}
	
	Parent(String name,String nat ){
		
		System.out.println("2nd constructor parent "+name+" "+nat);
	}
	
	 Parent(int x){
		System.out.println("3rd constructor");
	}
	 public void meth()
	 {
		 System.out.println("parent");
	 }
	
}

class Child extends Parent{

	Child(){
		
		super(6);
	System.out.println("1constructor child ");
	super.meth();
	
}
		
	//Child(String a,String b){
		//super(a,b);
		
	//}
	
	public void meth()
	 {
		 System.out.println("child");
	 }
	
}

public class MoreConstructorParent {

	public static void main(String[] args) {
		
		Child ob1 = new Child();
		//Child ob2 = new Child("mjsi","shrinivas");
	
	}

}
