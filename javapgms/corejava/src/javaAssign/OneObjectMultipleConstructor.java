package javaAssign;

class OneObjMultCnstroctr{
	
	 public OneObjMultCnstroctr() {
		this(1);
		System.out.println("1st constructor");
		
	}
	
	 OneObjMultCnstroctr(int a) {
		this(1,2);
		System.out.println("2nd constructor");
		
	}
	 
	 public OneObjMultCnstroctr(int a , int b) {
			this("Mjsi");
			System.out.println("3rd constructor");
			
		}
	 
	 public OneObjMultCnstroctr(String Str) {
			this('S');
			System.out.println("4th constructor");
			
		}
	 
	 public OneObjMultCnstroctr(char chr) {
			System.out.println("5th constructor");
			
		}
	
	
}

public class OneObjectMultipleConstructor {
	public static void main(String arrgs[]) {
		
		OneObjMultCnstroctr ob1 = new OneObjMultCnstroctr();
		
	}

}
