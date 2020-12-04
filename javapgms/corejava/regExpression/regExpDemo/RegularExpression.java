package regExpDemo;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		//matchesDemo();
		//findDemo();
		//groups_start_end();
		//replaceDemo();
		//splitDemo();
		//QA1();
		QA2();
	}
	
	//matches() demo
	static void matchesDemo()
	{
		Pattern patt;
		Matcher match;
		try {
			patt = Pattern.compile("[A-Z]racle");
			match = patt.matcher("Oracle");
			
			boolean blnRes = match.matches();
			System.out.println(blnRes);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			patt = null;
			match = null;
		}
	}
	
	//find() demo
	static void findDemo()
	{
		Pattern patt;
		Matcher match;
		try {
			patt = Pattern.compile("[v|w]endor");
			match = patt.matcher("Oracle is a DB. Oracle is a vendor");
			
			boolean blnRes = match.find();
			System.out.println(blnRes);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			patt = null;
			match = null;
		}
	}
	
	
	//group(), start() & end() demo
	static void groups_start_end()
	{
		Pattern patt;
		Matcher match;
		try {
			patt = Pattern.compile("is");
			match = patt.matcher("India is great. India stands 1st");
			
			int count = 0;
			while(match.find())
			{
				System.out.println(match.group());
				System.out.println("Start index: "+match.start()+" & end index: "+match.end());
				count++;
			}
			
			System.out.println("Occurrence: "+count);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			patt = null;
			match = null;
		}
	}
	
	//replaceAll() & replaceFirst() demo
	static void replaceDemo()
	{
		Pattern patt;
		Matcher match;
		try {
			patt = Pattern.compile("Oracle");
			match = patt.matcher("Oracle is a DB. Oracle is a vendor");
			
			String str1 = match.replaceFirst("DB2");
			System.out.println(str1);
			
			String str2 = match.replaceAll("Timber");
			System.out.println(str2);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			patt = null;
			match = null;
		}
	}

	//split() demo
	static void splitDemo()
	{
		Pattern patt;
		try {
			patt = Pattern.compile("#");
			String str = "india#is#great";
			String arr[] = patt.split(str);
			
			for(String s:arr) System.out.println(s);
			
			//Convert to collection
			List<String> oList = Arrays.asList(patt.split(str));
			
			System.out.println(oList);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			patt = null;
		}
	}
	
	
	//Interview questions
	static void QA1()
	{
		Pattern patt;
		Matcher match;
		try {
			patt = Pattern.compile("[0-9]{3}");
			match = patt.matcher("agumbe received 123 mm of rain");
			
			System.out.println(match.replaceAll("many"));
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			patt = null;
			match = null;
		}
	}
	
	
	//Separate/split words without split
	static void QA2()
	{
		Pattern patt;
		Matcher match;
		try {
			patt = Pattern.compile("[a-z]+|[A-Z]+");
			match = patt.matcher("agumbe received many mm of rain");
			
			while(match.find())
			{
				System.out.println(match.group());
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			patt = null;
			match = null;
		}
	}
	
}
