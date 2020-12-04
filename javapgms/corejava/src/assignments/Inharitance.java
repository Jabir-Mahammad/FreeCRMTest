package assignments;

//interface A extends interface B

interface AA{
	void method();
	
}

interface BB extends AA{
	 void method1();
	 static int a=8;
	 static void meth()
	 {
		 System.out.println("hii");
	 }
	 default void meth1() {
		 System.out.println("deflt meth1");
	 }
}


class AX implements BB{
	
	public void method() {
		System.out.println("interface1 method implemented");
	}
	
public void method1() {
	System.out.println("interface2 method implemented");
	}
	
}
public class Inharitance {

	public static void main(String[] args) {
		 AX ax = new AX();
		 ax.method1();
		 ax.method();
         BB.meth();
         ax.meth1();
        System.out.println(AX.a);
        BB.meth();
	}

}
