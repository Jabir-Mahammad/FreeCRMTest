package poiWriteAssignment;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInAlternateRow {

	public static void main(String[] args) {
		writeWeekDays();

	}

	static void writeWeekDays()
	{
		Workbook wb = null;
		Sheet sheet = null;
		Row row = null;
		Cell cell = null;
		FileOutputStream fout = null;
		String arr[]= {"Sun","Mon","Tues","Wed","Thurs","Friday","Saturday"};
		int m=0;
		
		try
		{
			wb = new XSSFWorkbook();
			sheet = wb.createSheet("Page1");
			for(int i=0;i<7;i++)
				{
				if(i%2==1)
					continue;
				row = sheet.createRow(i);
				
				cell = row.createCell(0);
				cell.setCellValue(arr[m]);
				m++;
				
			}
			fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\demo\\doc4.xlsx");
			
			wb.write(fout);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				fout.flush();
				fout.close();
				wb=null;
				cell=null;
				sheet=null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
				
	}
}

