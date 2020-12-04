
package poiReadAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromOneSheetToAnotherSheet {
	public static void main(String[] args) {
		readAndWrite();
	}

	//read a colms as diff data types from sheet1 & write to Sheet2 as rows
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
			fin = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\POI\\POIExcelFile\\excelNew1.xlsx");
			wb = new XSSFWorkbook(fin);
			sh1 = wb.getSheet("testdata1");
			if(sh2==null)
			{
				sh2 = wb.createSheet("Sheet2");
			}
			
			row1 = sh1.getRow(0);
				cols=row1.getPhysicalNumberOfCells();
				for(int r=0;r<cols;r++)
				{
				if(row2==null)
				{
					row2 = sh2.createRow(r);
				}
				cell1 = row1.getCell(r);
					cell2 = row2.createCell(0);
				    if(cell1.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)
					{
						strData = String.valueOf(cell1.getNumericCellValue());
						
					}
					if(cell1.getCellType()==HSSFCell.CELL_TYPE_STRING)
					{
						strData = cell1.getStringCellValue();
						
					}
				    
					if (cell1.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN)
					{
						strData = String.valueOf(cell1.getBooleanCellValue());
						 
					}
					cell2.setCellValue(strData);
				   
				   cell2=null;
				    row2=null;
				    
				}
			
			fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\POI\\POIExcelFile\\excelNew1.xlsx");
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
