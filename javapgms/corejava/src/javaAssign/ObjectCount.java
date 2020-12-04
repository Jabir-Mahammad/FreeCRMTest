package javaAssign;

class ObjectCnt{
	static int count;
	ObjectCnt(){
	count++;
	}
}

public class ObjectCount {

	public static void main(String[] args) {
		ObjectCnt ob = new ObjectCnt();
		ObjectCnt ob2 = new ObjectCnt();
		
		
		System.out.println("no. of objects created are: "+ObjectCnt.count);
		
		

	}

}
