package excelWrite;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {

	public static void main(String[] args) {
		
		writeToExcel();
	}
	
	static void writeToExcel()
	{
		FileOutputStream ob = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		try
		{
			wb = new XSSFWorkbook();
			sh = wb.createSheet("testdata1");
			
			for(int rw=0;rw<6;rw++)
			{
				row=sh.createRow(rw);
				for(int cl=0;cl<5;cl++)
				{
					cell= row.createCell(cl);
					cell.setCellValue("Row: "+rw+" ,Col: "+cl);
				}
			}
			
			ob = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\POI\\POIExcelFile\\excelNew1.xlsx");
			
			wb.write(ob);
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
				sh=null;
				cell=null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
