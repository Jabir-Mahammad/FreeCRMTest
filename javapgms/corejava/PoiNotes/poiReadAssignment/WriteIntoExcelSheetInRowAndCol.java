package poiReadAssignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//create excel sheet and write birds name in row and in another sheet write birds name in column
public class WriteIntoExcelSheetInRowAndCol {

	public static void main(String[] args) {
		readWrite();

	}

	static void readWrite()
	{
			Workbook wb = null;
			Sheet sheet = null;
			Row row = null;
			Cell cell2 = null;
			Sheet sheet2 = null;
			Row row2 = null;
			Cell cell = null;
			FileOutputStream fout = null;
			String arr[]= {"Pigeion","Parrot","Crow","Eagle"};
			int m=0;
			
			try
			{
				wb = new XSSFWorkbook();
				sheet = wb.createSheet("Page1");
				sheet2 = wb.createSheet("Page2");
				row2 = sheet2.createRow(0);
				for(int i=0;i<4;i++)
				{
					
					row = sheet.createRow(i);
					cell = row.createCell(0);
					cell2 = row2.createCell(i);
					cell.setCellValue(arr[m]);
					cell2.setCellValue(arr[m]);
					m++;
				}
				fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\demo\\doc1.xlsx");
				
				wb.write(fout);
			}catch(Exception e) {
				System.out.println(e);
			}
			finally {
				try {
				fout.flush();
					fout.close();
					fout=null;
					wb=null;
					sheet=null;
					cell=null;
					row=null;
					sheet2=null;
					cell2=null;
					row2=null;
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
					
		}
	}

