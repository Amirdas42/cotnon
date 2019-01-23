package com.cottonon.generic_lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_lib {

	String filepath="D:\\selenium\\Selenium1 code\\cotton_on\\Test data\\test data_cotton.xlsx";
    
    public String getexceldata(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, InvalidFormatException, IOException
    {
    	FileInputStream fis=new FileInputStream(filepath);
    	Workbook wb= WorkbookFactory.create(fis);
    	Sheet sh=wb.getSheet(sheetname);
    	Row row=sh.getRow(rownum);
		String data=row.getCell(colnum).getStringCellValue();
		wb.close();
		return data;
    }
    public void setexceldata(String sheetname,int rownum,int colnum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
    {
	    FileInputStream fis=new FileInputStream(filepath);
	    Workbook wb= WorkbookFactory.create(fis);
	    Sheet sh= wb.getSheet(sheetname);
	    Row row= sh.getRow(rownum);
	    Cell cell=row.createCell(colnum);
	    cell.setCellValue(data);
	    FileOutputStream fos=new FileOutputStream(filepath);
	    wb.write(fos);
	    wb.close();
    }
}



