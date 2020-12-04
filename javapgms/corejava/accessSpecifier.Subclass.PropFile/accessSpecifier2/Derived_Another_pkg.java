package accessSpecifier2;

import accessSpecifier1.Super;

public class Derived_Another_pkg extends Super{
	Derived_Another_pkg()
	{
		System.out.println("public_Number: "+public_Number);
		//System.out.println("private_Number: "+private_Number);
		System.out.println("protected_Number: "+protected_Number);
		//System.out.println("default_Number: "+default_Number);
	}
}
