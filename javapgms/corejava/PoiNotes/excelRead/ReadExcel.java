package excelRead;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) {
		readExcelFile();
	}

	//read from excel
	static void readExcelFile()
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		int rows = 0;
		int cols = 0;
		try {
			fin = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\POI\\POIExcelFile\\excelNew.xlsx");
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet("TestData1");
			
			rows = sh.getPhysicalNumberOfRows();
			for(int r=0;r<rows;r++)
			{
				row = sh.getRow(r);
				cols = row.getPhysicalNumberOfCells();
				for(int c=0;c<cols;c++)
				{
					cell = row.getCell(c);
					System.out.print(cell.getStringCellValue()+"   ");
				}
				System.out.println();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
				fin = null;
				cell = null;
				row = null;
				sh = null;
				wb = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}