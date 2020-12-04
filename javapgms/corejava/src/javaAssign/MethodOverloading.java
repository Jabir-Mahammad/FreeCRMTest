package javaAssign;

class Animal{
	void addition(int a,int b, int c) {
	    int res1=a+b+c;	
	    System.out.println("3 param="+res1);
	}
	
	void addition(int a,int b) {
		int res1=a+b;	
		System.out.println("2 param="+res1);
		}
	
	void addition(int a,double b) {
		double res1=a+b;	
		System.out.println("int and float param="+res1);
		}
	
	void addition(double a,int b) {
		double res1=a+b;	
		System.out.println("float and int param="+res1);
		}
}

class Bird{
	void bird(String name) {
	   
	    System.out.println("1 string  param="+name);
	}
	
	void bird(String a,String b) {	
		System.out.println("2 string param name and color="+a+" "+b);
		}
	
	void bird(int life,String name) {	
		System.out.println("int and string param="+life+" "+name);
		}
	
	void bird(String color,int lif) {	
		System.out.println("String and int param="+color+" "+lif);
		}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Animal ob = new Animal();
		ob.addition(8,2);
		ob.addition(8,2,2);
		ob.addition(8,2.55);
		ob.addition(3.5,8);
		
		System.out.println("*******bird class features*******");
		
		Bird ob2= new Bird();
		ob2.bird("parrot");
		ob2.bird(8,"sparrow");
		ob2.bird("parrot","green");
		ob2.bird("crow",5);
		

	}

}
