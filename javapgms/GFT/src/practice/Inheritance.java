package practice;

class Sample
{

	int x =10;
	int y=15;
	
	void disp()
	{
		System.out.println("parent");
	}
}

public class Inheritance extends Sample {

	int x = 5 ;
	int y = 6;
	
	void disp()
	{
		System.out.println("child");
	}
	public static void main(String[] args) {
		
       Sample ob = new Inheritance();
       System.out.println(ob.x);
       ob.disp();
       
       Sample ob1 = new Sample();
       System.out.println(ob1.x);
       ob1.disp();
       
       Inheritance ob2 = new Inheritance();
       System.out.println(ob2.x);
	}

}
