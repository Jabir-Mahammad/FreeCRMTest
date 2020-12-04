package accessSpecifier1;

public class Derived_Same_pkg extends Super{

	Derived_Same_pkg()
	{
		System.out.println("public_Number: "+public_Number);
		//System.out.println("private_Number: "+private_Number);
		System.out.println("protected_Number: "+protected_Number);
		System.out.println("default_Number: "+default_Number);
	}
}
