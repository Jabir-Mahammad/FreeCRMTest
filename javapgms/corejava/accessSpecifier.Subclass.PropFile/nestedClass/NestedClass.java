package nestedClass;

class Outer
{
	int age;
	String strName;
	Inner in = new Inner();
	
	Outer()
	{
		age = 30;
		strName = "Kalam";
		in.displayAge();
	}
	public void displayName() {System.out.println("Name: "+strName);}
	
	public void cityName() {System.out.println("City: "+in.strCity);};
	
	class Inner
	{
		String strCity = "RAICHUR";
		public void displayAge() {System.out.println("Age is: "+age);}
	}
}

public class NestedClass {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.displayName();
		out.cityName();
	}
}