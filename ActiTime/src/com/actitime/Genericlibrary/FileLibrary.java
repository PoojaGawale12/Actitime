package com.actitime.Genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * this is
 *
 */
  
 
 
 
public class FileLibrary {
	/**
	 * this method is a generic method design the property file class
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	public String readDatafromPropertyFile(String Key) throws IOException {
		FileInputStream fis =new FileInputStream("./Testdata/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String data = p.getProperty(Key);
		return data;
	}
	/**
	 * this method is a generic method design the excel file class
	 * @param sheet
	 * @param num
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String readFromExcelFile(String sheet ,int num,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("./Testdata/Testdata.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
	    String data =wb.getSheet(sheet).getRow(num).getCell(cell).getStringCellValue();
	    return data;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLibrary f=new FileLibrary();
		String data = f.readFromExcelFile("Sheet2", 1, 1);
		System.out.println(data);
	}
		

	
		
}

	