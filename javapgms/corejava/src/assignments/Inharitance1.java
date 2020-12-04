package assignments;

/*class A extnds B implements X,Y*/

interface X{
	void interface1Method();
	int x=3;
}

interface Y{
	void interface2Method();
}


class B {
  void method() {
	  System.out.println("Parent class method");
  }
}

class A extends B implements X,Y{
	public void interface1Method() {
		System.out.println("class A implents interface1Method");
	}
	
	public void interface2Method() {
		System.out.println("class  A implemnts interface2Method");
	}
	
	
	 void method() {
		 super.method();
		System.out.println("child class ethod");
	}
	
}
public class Inharitance1 {

	public static void main(String[] args) {
	
		A ob1 = new A();
		ob1.interface1Method();
		ob1.interface2Method();
		
		ob1.method();
	}

}
