package legacy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//List<String> oVect = new Vector<String>();
		Vector<String> oVect = null;
		try {
			oVect = new Vector<String>();
			oVect.add("Apple");
			oVect.add(0, "First");
			oVect.add("Eagle");
			oVect.add("Amazon");
			System.out.println(oVect);
			System.out.println("******************");
			
			Enumeration enu = oVect.elements();
			while(enu.hasMoreElements())
			{
				System.out.println(enu.nextElement());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			oVect = null;
		}
	}
}