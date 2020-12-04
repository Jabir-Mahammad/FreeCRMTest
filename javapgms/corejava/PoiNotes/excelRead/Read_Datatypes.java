package excelRead;

import java.io.FileInputStream;
import java.util.Calendar;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Datatypes {
	public static void main(String[] args) {
		readDatatypes();
	}

	//read different datatypes
	static void readDatatypes()
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		int rows = 0;
		int cols = 0;
		String strData = null;
		String day = "";
		String month = "";
		String year = "";
		try {
			fin = new FileInputStream(" ");
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet("Data");
			rows = sh.getPhysicalNumberOfRows();
			
			for(int r=0;r<rows;r++)
			{
				row = sh.getRow(r);
				cols = row.getLastCellNum();
				for(int c=0;c<cols;c++)
				{
					cell = row.getCell(c);
					
					if(cell==null|| cell.getCellType()==HSSFCell.CELL_TYPE_BLANK)
					{
						strData = "";
					}
					else if (cell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN)
					{
						strData = String.valueOf(cell.getBooleanCellValue());
					}
					else if(cell.getCellType()==HSSFCell.CELL_TYPE_STRING)
					{
						strData = cell.getStringCellValue();
					}
					else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC)
					{
						if(HSSFDateUtil.isCellDateFormatted(cell))
						{
							double dt = cell.getNumericCellValue();
							Calendar cal = Calendar.getInstance();
							cal.setTime(HSSFDateUtil.getJavaDate(dt));
							if(cal.get(Calendar.DAY_OF_MONTH)<10)
							{
								day="0"+String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
							}
							
							if((cal.get(Calendar.MONTH)+1)<10)
							{
								month="0"+String.valueOf((cal.get(Calendar.MONTH)+1));
							}
							
							year = String.valueOf(cal.get(Calendar.YEAR));
							strData = day+"/"+month+"/"+year;
						}else {
							strData = String.valueOf(cell.getNumericCellValue());
						}
					}
					
					System.out.printf("%20s",strData);
				}
				System.out.println();
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fin.close();
				fin = null;
				cell = null;
				row = null;
				sh = null;
				wb = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}