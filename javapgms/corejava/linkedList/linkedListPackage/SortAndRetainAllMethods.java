package linkedListPackage;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortAndRetainAllMethods {

	public static void main(String[] args) {
		//sortDemo();
		reatainAllDemo();
	}
	static void sortDemo()
	{
		List<Integer> oList = null;
		try {
			oList = new LinkedList<Integer>();
			oList.add(5);
			oList.add(6);
			oList.add(2);
			oList.add(1);
			oList.add(2);
			
			System.out.println(oList);
			
			Collections.sort(oList);
			System.out.println(oList);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	//retainAll()
	static void reatainAllDemo()
	{
		List<String> oList1 = null;
		List<String> oList2 = null;
		try {
			oList1 = new LinkedList<String>();
			oList1.add("A");
			oList1.add("B");
			oList1.add("C");
			System.out.println(oList1);
			
			oList2 = new LinkedList<>();
			oList2.add("C");
			oList2.add("D");
			oList2.add("E");
			oList2.add("B");
			System.out.println(oList2);
			
			oList2.retainAll(oList1);
			System.out.println(oList2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
		}
	}
	

}
