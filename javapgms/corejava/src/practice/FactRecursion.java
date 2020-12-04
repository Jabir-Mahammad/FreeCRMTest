package practice;

class Fact1{
	static int meth(int n) {
	if(n==0)
		return 1;
	else 
		return(n*meth(n-1));
}
}

public class FactRecursion {

	public static void main(String[] args) {
		
		Fact1 obj = new Fact1();
	    int num=4;
		System.out.println(obj.meth(num));
	}}
