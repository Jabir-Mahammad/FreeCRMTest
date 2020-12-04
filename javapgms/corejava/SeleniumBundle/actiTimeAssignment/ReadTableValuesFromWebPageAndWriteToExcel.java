package actiTimeAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTableValuesFromWebPageAndWriteToExcel {
	public static void main(String args[])
	{
		WebDriver oBrowser = null;
		WebElement oEle = null;
		List<WebElement> oEles = null;
		FileOutputStream fout = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		List<WebElement> intCols = null;
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.get("C:\\Users\\Lenovo\\Desktop\\html_pages\\webTableDemo\\webTableDemo.html");
			Thread.sleep(2000);
			
			fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\tabledata.xlsx");
			wb = new XSSFWorkbook();
		    sh = wb.createSheet("TableDatas");
		    
		    //reading table heading from student data
		    int k=0;
		    intCols = oBrowser.findElements(By.xpath("//table[@id='tbl2']/tbody/tr[1]/th"));
		    row = sh.createRow(0);
		    for(int c=0;c<intCols.size();c++)
			{
				oEle = oBrowser.findElement(By.xpath("//table[@id='tbl2']/tbody/tr[1]/th["+(c+1)+"]"));
				   cell = row.createCell(k);
				   k++;
				cell.setCellValue(oEle.getText());
				System.out.print("     "+oEle.getText());
				
			}
		    System.out.println();  
			//read the student table data  and write into Excel sheet
			List<WebElement> intRows1 = oBrowser.findElements(By.xpath("//table[@id='tbl2']/tbody/tr"));
			for(int r=0;r<intRows1.size();r++)
			{
				 intCols = oBrowser.findElements(By.xpath("//table[@id='tbl2']/tbody/tr["+(r+2)+"]/td"));
				 row = sh.createRow(r+1);
				
				for(int c=0;c<intCols.size();c++)
				{
					oEle = oBrowser.findElement(By.xpath("//table[@id='tbl2']/tbody/tr["+(r+2)+"]/td["+(c+1)+"]"));
					   cell = row.createCell(c);
					cell.setCellValue(oEle.getText());
					System.out.print("     "+oEle.getText());
					
				}
				
				System.out.println();

			}
			wb.write(fout);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			oEle = null;
			oEles = null;
			oBrowser = null;
		}
	}
	
}