package practice;

class AAA{
	private int a;
    
	int  AA(){
		
	return a;
	}
}

public class SetterAndGetter {

	public static void main(String[] args) {
		AAA ob = new AAA();
        int val= ob.AA();
        val=10;
        System.out.println(val);
	}

}
