package methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.util.Calendar;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driver.DriverScripts;

public class AppIndependentmethods extends DriverScripts{

	
	/**************************************
	 * Method Name	: writeReport
	 * 
	 * 
	 ***************************************/
	public void writeReport(String strStatus, String strMessage)
	{
		Logger log = null;
		try {
			log = Logger.getLogger("Reporting");
			
			switch(strStatus.toLowerCase())
			{
				case "pass":
					log.info(strMessage);
					break;
				case "fail":
					log.error(strMessage);
					break;
				case "exception":
					log.fatal(strMessage);
					break;
				case "#":
					log.info(strMessage);
					break;
				default:
					System.out.println("Invalid status '"+strStatus+"' for writing results");
			}
		}catch(Exception e)
		{
			System.out.println("Exception while executing 'writeReport' method. "+e.getMessage());
		}
		finally {
			log = null;
		}
	}
	
	
	
	/**************************************
	 * Method Name	: clickObject
	 * 
	 * 
	 ***************************************/
	public boolean clickObject(WebDriver oDriver, By objBy)
	{
		WebElement oEle = null;
		try {
			oEle = oDriver.findElement(objBy);
			if(oEle.isDisplayed())
			{
				oEle.click();
				appInd.writeReport("Pass", "The element '"+String.valueOf(objBy)+"' was clicked successful");
				return true;
			}else {
				appInd.writeReport("Fail", "The element '"+String.valueOf(objBy)+"' was unable to find");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'clickObject' method. "+e.getMessage());
			return false;
		}
		finally {
			oEle = null;
		}
	}
	
	
	/**************************************
	 * Method Name	: clickObject
	 * 
	 * 
	 ***************************************/
	public boolean clickObject(WebDriver oDriver, String strObjectName)
	{
		WebElement oEle = null;
		try {
			oEle = appInd.createAndGetObject(oDriver, strObjectName);
			if(oEle.isDisplayed())
			{
				oEle.click();
				appInd.writeReport("Pass", "The element '"+strObjectName+"' was clicked successful");
				return true;
			}else {
				appInd.writeReport("Fail", "The element '"+strObjectName+"' was unable to find");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'clickObject' method. "+e.getMessage());
			return false;
		}
		finally {
			oEle = null;
		}
	}
	
	
	/**************************************
	 * Method Name	: setObject
	 * 
	 * 
	 ***************************************/
	public boolean setObject(WebDriver oDriver, By objBy, String strData)
	{
		WebElement oEle = null;
		try {
			oEle = oDriver.findElement(objBy);
			if(oEle.isDisplayed())
			{
				oEle.sendKeys(strData);
				appInd.writeReport("Pass", "The data '"+strData+"' was entered in the element '"+String.valueOf(objBy)+"' successful");
				return true;
			}else {
				appInd.writeReport("Fail", "Failed to enter the data '"+strData+"' in the element '"+String.valueOf(objBy)+"'");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'setObject' method. "+e.getMessage());
			return false;
		}finally {
			oEle = null;
		}
	}
	
	
	
	/**************************************
	 * Method Name	: setObject
	 * 
	 * 
	 ***************************************/
	public boolean setObject(WebDriver oDriver, String strObjectName, String strData)
	{
		WebElement oEle = null;
		try {
			oEle = appInd.createAndGetObject(oDriver, strObjectName);
			if(oEle.isDisplayed())
			{
				oEle.sendKeys(strData);
				appInd.writeReport("Pass", "The data '"+strData+"' was entered in the element '"+strObjectName+"' successful");
				return true;
			}else {
				appInd.writeReport("Fail", "Failed to enter the data '"+strData+"' in the element '"+strObjectName+"'");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'setObject' method. "+e.getMessage());
			return false;
		}finally {
			oEle = null;
		}
	}
	/**************************************
	 * Method Name	: verifyText
	 * 
	 * 
	 ***************************************/
	public boolean verifyText(WebDriver oDriver, By objBy, String strType, String strExpected)
	{
		WebElement oEle = null;
		String strActual = null;
		Select oSel = null;
		try
		{
			oEle = oDriver.findElement(objBy);
			if(oEle.isDisplayed())
			{
				switch(strType.toLowerCase())
				{
					case "text":
						strActual = oEle.getText();
						break;
					case "value":
						strActual = oEle.getAttribute("value");
						break;
					case "list":
						oSel = new Select(oEle);
						strActual = oSel.getFirstSelectedOption().getText();
						break;
					default:
						appInd.writeReport("Fail", "Invalid object type '"+strType+"' was specified");
				}
				
				if(strActual.equals(strExpected))
				{
					appInd.writeReport("Pass", "Both actual: '"+strActual+"' & expected: '"+strExpected+"' are same");
					return true;
				}else {
					appInd.writeReport("Fail", "Both actual: '"+strActual+"' & expected: '"+strExpected+"' are NOT matching");
					return false;
				}
			}else {
				appInd.writeReport("Fail", "Failed to read the '"+strType+"' from the element '"+String.valueOf(objBy)+"'");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'verifyText' method. "+e.getMessage());
			return false;
		}finally {
			oEle = null;
		}
	}
	
	
	/**************************************
	 * Method Name	: verifyText
	 * 
	 * 
	 ***************************************/
	public boolean verifyText(WebDriver oDriver, String strObjectName, String strType, String strExpected)
	{
		WebElement oEle = null;
		String strActual = null;
		Select oSel = null;
		try
		{
			oEle = appInd.createAndGetObject(oDriver, strObjectName);
			if(oEle.isDisplayed())
			{
				switch(strType.toLowerCase())
				{
					case "text":
						strActual = oEle.getText();
						break;
					case "value":
						strActual = oEle.getAttribute("value");
						break;
					case "list":
						oSel = new Select(oEle);
						strActual = oSel.getFirstSelectedOption().getText();
						break;
					default:
						appInd.writeReport("Fail", "Invalid object type '"+strType+"' was specified");
				}
				
				if(strActual.equals(strExpected))
				{
					appInd.writeReport("Pass", "Both actual: '"+strActual+"' & expected: '"+strExpected+"' are same");
					return true;
				}else {
					appInd.writeReport("Fail", "Both actual: '"+strActual+"' & expected: '"+strExpected+"' are NOT matching");
					return false;
				}
			}else {
				appInd.writeReport("Fail", "Failed to read the '"+strType+"' from the element '"+strObjectName+"'");
				return false;
			}
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'verifyText' method. "+e.getMessage());
			return false;
		}finally {
			oEle = null;
		}
	}
	
	
	/**************************************
	 * Method Name	: getPropData()
	 * 
	 * 
	 ***************************************/
	
	public String getPropData(String strKeyName)
	{
		FileInputStream fin = null;
		Properties prop = null;
		
		try
		{
			fin = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
			prop = new Properties();
			prop.load(fin);
			return prop.getProperty(strKeyName);
		}catch(Exception e)
		{
			appInd.writeReport("exception", "Exception while executing getPropData()");
			return null;
			
		}
		finally
		{
			prop = null;
			try {
				fin.close();
				fin = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	

	
	
	/**************************************
	 * Method Name	: getCellData
	 * 
	 * 
	 ***************************************/
	public String getCellData(String strSheetName, String strColName, int rowNum)
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		int colNum = 0;
		String strData = null;
		try {
			fin = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(strSheetName);
			if(sh==null) {
				appInd.writeReport("Fail", "Failed to find the sheet '"+strSheetName+"'");
				return null;
			}
			
			//find column Number using column name
			row = sh.getRow(0);
			for(int r=0;r<row.getPhysicalNumberOfCells();r++)
			{
				cell = row.getCell(r);
				if(cell.getStringCellValue().trim().equals(strColName))
				{
					colNum = r;
					break;
				}
			}
			
			row = sh.getRow(rowNum);
			cell = row.getCell(colNum);
			if(cell==null) cell = row.createCell(colNum);
			if(cell==null||cell.getCellType()==HSSFCell.CELL_TYPE_BLANK)
			{
				strData = "";
			}else if(cell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN)
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
					String day;
					String month;
					String year;
					if(cal.get(Calendar.DAY_OF_MONTH)<10)
					{
						day="0"+cal.get(Calendar.DAY_OF_MONTH);
					}else {
						day=String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
					}
					
					if((cal.get(Calendar.MONTH)+1)<10)
					{
						month="0"+(cal.get(Calendar.MONTH)+1);
					}else {
						month=String.valueOf(cal.get(Calendar.MONTH)+1);
					}
					
					year = String.valueOf(cal.get(Calendar.YEAR));
					
					strData = day+"/"+month+"/"+year;
						
				}else {
					strData = String.valueOf(cell.getNumericCellValue());
				}
			}
			
			return strData;
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'getCellData' method. "+e.getMessage());
			return null;
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
				appInd.writeReport("Exception", "Exception while executing 'getCellData' method. "+e.getMessage());
				return null;
			}
		}
	}
	
	
	/**************************************************************************************
	 * Method Name : getRowCount()
	 * 
	 * 
	 * 
	 * 
	 * 
	 **************************************************************************************/
	
	public int getRowCount(String strFile, String strSheetName)
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		int rows = 0;
		try
		{
			fin = new FileInputStream(strFile);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(strSheetName);
			if(sh == null)
			{
				appInd.writeReport("fail", "Sheet '"+strSheetName+"'");
				return -1;
			}
			rows = sh.getPhysicalNumberOfRows();
			return rows;
			
					
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'getRowCount'");
			return -1;
		}
		finally
		{
			try {
				fin.close();
				fin = null;
				wb = null;
				sh = null;
			}catch(Exception e)
			{
				
			}
		}
	}
	
	
	
	/**************************************
	 * Method Name	: getCellData
	 * 
	 * 
	 ***************************************/
	public String getCellData(String fileName,String strSheetName, String strColName, int rowNum)
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		int colNum = 0;
		String strData = null;
		try {
			fin = new FileInputStream(fileName);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(strSheetName);
			if(sh==null) {
				appInd.writeReport("Fail", "Failed to find the sheet '"+strSheetName+"'");
				return null;
			}
			
			//find column Number using column name
			row = sh.getRow(0);
			for(int r=0;r<row.getPhysicalNumberOfCells();r++)
			{
				cell = row.getCell(r);
				if(cell.getStringCellValue().trim().equals(strColName))
				{
					colNum = r;
					break;
				}
			}
			
			row = sh.getRow(rowNum);
			cell = row.getCell(colNum);
			if(cell==null) cell = row.createCell(colNum);
			if(cell==null||cell.getCellType()==HSSFCell.CELL_TYPE_BLANK)
			{
				strData = "";
			}else if(cell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN)
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
					String day;
					String month;
					String year;
					if(cal.get(Calendar.DAY_OF_MONTH)<10)
					{
						day="0"+cal.get(Calendar.DAY_OF_MONTH);
					}else {
						day=String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
					}
					
					if((cal.get(Calendar.MONTH)+1)<10)
					{
						month="0"+(cal.get(Calendar.MONTH)+1);
					}else {
						month=String.valueOf(cal.get(Calendar.MONTH)+1);
					}
					
					year = String.valueOf(cal.get(Calendar.YEAR));
					
					strData = day+"/"+month+"/"+year;
						
				}else {
					strData = String.valueOf(cell.getNumericCellValue());
				}
			}
			
			return strData;
		}catch(Exception e)
		{
			appInd.writeReport("Exception", "Exception while executing 'getCellData' method. "+e.getMessage());
			return null;
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
				appInd.writeReport("Exception", "Exception while executing 'getCellData' method. "+e.getMessage());
				return null;
			}
		}
	}
	
	
	/**************************************
	 * Method Name	: getObjDescription
	 * 
	 * 
	 ***************************************/
	public String getObjDescription(String strObjectName)
	{
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		int rowNum = 0;
		try {
			fin = new FileInputStream(System.getProperty("user.dir")+"\\ObjectMapping\\ObjectMap.xlsx");
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(appInd.getPropData("APPNAME"));
			if(sh==null) {
				appInd.writeReport("Fail", "The sheet name '"+appInd.getPropData("APPNAME")+"' was not found in object map excel");
				return null;
			}
			
			int rows = sh.getPhysicalNumberOfRows();
			for(int r=0;r<rows;r++)
			{
				row = sh.getRow(r);
				cell = row.getCell(0);
				if(cell.getStringCellValue().trim().equalsIgnoreCase(strObjectName))
				{
					rowNum = r;
					break;
				}
			}
			
			row = sh.getRow(rowNum);
			String strDesc = row.getCell(1)+"#"+row.getCell(2);
			
			return strDesc;
		}catch(Exception e)
		{
			appInd.writeReport("Fail", "Exception while executing 'getObjDescription' method. "+e.getMessage());
			return null;
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
				appInd.writeReport("Fail", "Exception while executing 'getObjDescription' method. "+e.getMessage());
				return null;
			}
		}
	}
	
	
	/**************************************
	 * Method Name	: createAndGetObject
	 * 
	 * 
	 ***************************************/
	public WebElement createAndGetObject(WebDriver oDriver, String strObjectName)
	{
		WebElement oEle = null;
		String strObjDesc = null;
		try {
			strObjDesc = appInd.getObjDescription(strObjectName);
			String arrObject[] = strObjDesc.split("#");
			switch(arrObject[0].toLowerCase())
			{
				case "id":
					oEle = oDriver.findElement(By.id(arrObject[1]));
					break;
				case "xpath":
					oEle = oDriver.findElement(By.xpath(arrObject[1]));
					break;
				case "cssselector":
					oEle = oDriver.findElement(By.cssSelector(arrObject[1]));
					break;
				case "linktext":
					oEle = oDriver.findElement(By.linkText(arrObject[1]));
					break;
				case "name":
					oEle = oDriver.findElement(By.name(arrObject[1]));
					break;
				case "classname":
					oEle = oDriver.findElement(By.className(arrObject[1]));
					break;
				default:
					appInd.writeReport("Fail", "Invalid locator name '"+arrObject[0]+"'");
			}
			return oEle;
		}catch(Exception e)
		{
			appInd.writeReport("Fail", "Exception while executing 'createAndGetObject' method. "+e.getMessage());
			return null;
		}
	}
	
	
}
