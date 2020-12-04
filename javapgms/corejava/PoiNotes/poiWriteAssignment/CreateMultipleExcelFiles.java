


package poiWriteAssignment;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateMultipleExcelFiles {

	public static void main(String[] args) {
		
		writeToExcel();
	}
	
	static void writeToExcel()
	{
		FileOutputStream ob = null;
		Workbook wb = null;
		try
		{
			int cnt=10;
			for(int i=0;i<5;i++)
			{
				
					ob = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\demo\\doc"+cnt+".xlsx");
					
					cnt++;
				}
			
			}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				ob.flush();
				ob.close();
				ob=null;
				wb=null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}

