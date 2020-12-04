package poiWriteAssignment;


import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//create multiple sheets in a excel file

public class Create12Sheets {

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
		String arr[]= {"Jan","Feb","March","April","May"};
		int m=0;
		
		try
		{
			wb = new XSSFWorkbook();
			
			for(int i=0;i<4;i++)
			{
				sheet = wb.createSheet(arr[m]);
				m++;
				
			}
			fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\demo\\doc2.xlsx");
			
			wb.write(fout);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			
		}
				
	}
}
