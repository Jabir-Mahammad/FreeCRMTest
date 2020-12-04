package fileAssignment;
import java.io.BufferedReader;
import java.io.FileReader;

public class FindHowManyCharWordsLinesAreInAFile {
   public static void main(String[] args) {
	      countCharWordsLines();

	 	}
	 	
	 	static void countCharWordsLines()
	 	{
	 		BufferedReader br = null;
	 		
	 		int lineCnt=0,charCnt=0,wordCnt=0;
	 		String arr[]= {};
	 		try
	 		{
	 			br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\javaA\\write.txt"));
	 			String str;  

	 			while((str=br.readLine())!=null)
	 			{
	 				System.out.println(str);
	 				lineCnt++;
	 				charCnt=charCnt+str.length();
	 				arr=str.split(" ");
	 				wordCnt=wordCnt+arr.length;
	 			}	
	 			System.out.println("*****************************************");
	 			System.out.println("No. of characters in a file is: "+charCnt);
	 			System.out.println("No. of lines in a file is: "+lineCnt);
	 			System.out.println("No.of words in a file is: "+wordCnt);
	 			
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


	 	


