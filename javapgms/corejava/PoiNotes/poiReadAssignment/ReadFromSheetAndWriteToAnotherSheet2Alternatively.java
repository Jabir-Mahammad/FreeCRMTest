package poiReadAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromSheetAndWriteToAnotherSheet2Alternatively {
	public static void main(String[] args) {
		readAndWrite();
	}

	//read from sheet1 and write to sheet3 alternatively(spaces)
	static void readAndWrite()
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		Workbook wb = null;
		Sheet sh1 = null;
		Sheet sh2 = null;
		Row row1 = null;
		Row row2 = null;
		Cell cell1 = null;
		Cell cell2 = null;
		int rows = 0;
		int cols = 0;
		String strData = null;
		try {
			fin = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\POI\\POIExcelFile\\excelNew.xlsx");
			wb = new XSSFWorkbook(fin);
			sh1 = wb.getSheet("testdata1");
			int m=1;
			if(sh2==null)
			{
				sh2 = wb.createSheet("Sheet3");
			}
			
			rows = sh1.getPhysicalNumberOfRows();
			
			for(int r=0;r<rows;r++)
			{
				row1 = sh1.getRow(r);
				if(row2==null)
				{
					row2 = sh2.createRow(r*2);
					
				}
				
				cell1 = row1.getCell(0);
					cell2 = row2.createCell(0);
				    strData = cell1.getStringCellValue();
				    cell2.setCellValue(strData);
				    row2=null;
				}
				
				
			
			fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\POI\\POIExcelFile\\excelNew.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				fout.flush();
				fout.close();
				fout = null;
				fin.close();
				fin = null;
				cell1 = null;
				cell2 = null;
				row1 = null;
				row2 = null;
				sh1 = null;
				sh2 = null;
				wb = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
