 
package poiReadAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Create a Sheet and write birds name in rows and read it from that sheet aand write it to another sheet
public class WriteToSheetAndReadAndAgainWriteToAnotherSheet {

	public static void main(String[] args) {
		readWrite();

	}

	static void readWrite()
	{
			Workbook wb = null;
			Workbook wb2 = null;
			Sheet sheet1 = null;
			Row row1 = null;
			Cell cell2 = null;
			Sheet sheet2 = null;
			Row row2 = null;
			Cell cell1 = null;
			FileOutputStream fout1 = null;
			FileOutputStream fout2 = null;
			FileInputStream fin1 = null;
			String arr[]= {"Pigeion","Parrot","Crow","Eagle"};
			int m=0;
	      
			//write to sheet1 as rows 		
			try
			  {
				wb = new XSSFWorkbook();
				sheet1 = wb.createSheet("Sheet1");
				for(int i=0;i<arr.length;i++)
				{
					row1 = sheet1.createRow(i);
					cell1 = row1.createCell(0);
					cell1.setCellValue(arr[i]);
					
				}
				fout1 = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\docc.xlsx");
				wb.write(fout1);
				
	        wb=null;
				
				
		  //read from sheet1 and write to sheet2
				fin1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\docc.xlsx");
				wb = new XSSFWorkbook(fin1);
				sheet1 = wb.getSheet("Sheet1");
				if(sheet2==null)
				sheet2 = wb.createSheet("Sheet3");
				int rows = sheet1.getPhysicalNumberOfRows();
				row2 = sheet2.createRow(0);
				for(int i=0;i<rows;i++)
				{
					row1=sheet1.getRow(i);
					cell1 = row1.getCell(0);
					String data = cell1.getStringCellValue();
					cell2=row2.createCell(i);
					cell2.setCellValue(data);
					//cell2=null;
					
				}
				fout2 = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\javaA\\docc.xlsx");
				wb.write(fout2);
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
			finally {
				try {
				fout1.flush();
					fout1.close();
					fout1=null;
					sheet2=null;
					cell2=null;                                                                     
					row2=null;
					wb=null;
					sheet1=null;
					cell1=null;
					row1=null;
					fout1=null;
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
					
		}
	}

