package com.selenium.testNG;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileDataLib {
public Properties getPropertiesObj() throws Throwable
{
	FileInputStream fis=new FileInputStream("E:\\Selenium RC\\Work\\testNG\\testData\\commonData.properties");
	Properties pObj=new Properties();
	pObj.load(fis);
	return pObj;
}
public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
{
	FileInputStream fis=new FileInputStream("E:\\Selenium RC\\Work\\testNG\\testData\\Testdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row r=sh.getRow(rowNum);
	String data=r.getCell(cellNum).getStringCellValue();
	return data;
}
}
