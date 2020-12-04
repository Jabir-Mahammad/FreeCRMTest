package excelRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sheet1ToSheet2 {
	public static void main(String[] args) {
		readAndWrite();
	}

	//read from sheet1 & write to Sheet2
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
			if(sh2==null)
			{
				sh2 = wb.createSheet("Sheet2");
			}
			
			rows = sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rows;r++)
			{
				row1 = sh1.getRow(r);
				if(row2==null)
				{
					row2 = sh2.createRow(r);
				}
				
				cols = row1.getPhysicalNumberOfCells();
				
				for(int c=0;c<cols;c++)
				{
					cell1 = row1.getCell(c);
					if(cell2==null)
					{
						cell2 = row2.createCell(c);
					}
					
					if(cell1.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)
					{
						strData = String.valueOf(cell1.getNumericCellValue());
					}
					else if(cell1.getCellType()==HSSFCell.CELL_TYPE_STRING)
					{
						strData = cell1.getStringCellValue();
					}
					cell2.setCellValue(strData);
					cell2=null;
				}
				row2=null;
			}
			
			fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\POI\\POIExcelFile\\excelNew22.xlsx");
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