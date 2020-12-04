package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static DataFormatter formatter =  new DataFormatter();
	
	public static Object[][] readFromExcel(String path) throws IOException{
		
		File file = new File(path);
		FileInputStream input = new FileInputStream(file);
		
		wb = new XSSFWorkbook(input);
		sheet = wb.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
        Object data[][]= new Object[rows-1][cols];
        
        for(int i=0;i<rows-1;i++) {
        	
        	XSSFRow row = sheet.getRow(i+1);
        	for(int j=0;j<cols;j++) {
        	
        	XSSFCell cell = row.getCell(j);
        	if(cell==null)
        		data[i][j]="";
        	else
        		data[i][j] = formatter.formatCellValue(cell);
        	}
        }
        wb.close();
        return data; 
       
	}
	 
	public static void writeToExcel(String path, String outputPath) throws IOException{
		
		File file = new File(path);
		FileInputStream input = new FileInputStream(file);
		
		wb = new XSSFWorkbook(input);
		sheet = wb.getSheet("Sheet1");
		
	    sheet.getRow(0).createCell(2).setCellValue("Status");
	    sheet.getRow(1).createCell(2).setCellValue("Passed");
	    sheet.getRow(2).createCell(2).setCellValue("Failed");
        
	    FileOutputStream out = new FileOutputStream(new File(outputPath));

        wb.write(out);
        out.close();
        
       
	}

}
