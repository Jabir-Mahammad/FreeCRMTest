package fileAssignment;

 import java.io.BufferedReader;
 import java.io.FileReader;

 public class ReadOnlyTheEvenLinesFromTheFile {

 	public static void main(String[] args) {
 		readEvenLines();

 	}
 	
 	static void readEvenLines()
 	{
 		BufferedReader br = null;
 		
 		int i=1;
 		try
 		{
 			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\even.txt"));
 			String str;  

 			while((str=br.readLine())!=null)
 			{
 				if(i%2==0)
 					System.out.println(str);
 				i++;
 			}	
 			
 		}catch(Exception e) {
 			e.printStackTrace();
 		}
 		finally
 		{
 			try {
 				br.close();
 				br = null;
 			}catch(Exception e) {
 				e.printStackTrace();
 			}
 		}
 	
 	}

 }

