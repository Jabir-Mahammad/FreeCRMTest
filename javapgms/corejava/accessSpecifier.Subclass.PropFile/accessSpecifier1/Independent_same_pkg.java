package accessSpecifier1;

public class Independent_same_pkg {
	Super s = new Super();
	Independent_same_pkg()
	{
		System.out.println("public_Number: "+s.public_Number);
		//System.out.println("private_Number: "+s.private_Number);
		System.out.println("protected_Number: "+s.protected_Number);
		System.out.println("default_Number: "+s.default_Number);
	}
}
