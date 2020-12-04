package accessSpecifier2;

import accessSpecifier1.Super;

public class Independent_Another_Pkg {
	Super s = new Super();
	Independent_Another_Pkg()
	{
		System.out.println("public_Number: "+s.public_Number);
		//System.out.println("private_Number: "+s.private_Number);
		//System.out.println("protected_Number: "+s.protected_Number);
		//System.out.println("default_Number: "+s.default_Number);
	}
}
