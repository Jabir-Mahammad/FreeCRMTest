package accessSpecifier1;

public class Super{
	public int public_Number = 100;
	private int private_Number = 200;
	protected int protected_Number = 300;
	int default_Number = 400;
	
	public Super()
	{
		System.out.println("public_Number: "+public_Number);
		System.out.println("private_Number: "+private_Number);
		System.out.println("protected_Number: "+protected_Number);
		System.out.println("default_Number: "+default_Number);
	}
}
