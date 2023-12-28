package com.actitime.Testscript;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Genericlibrary.BaseClass;
import com.actitime.Genericlibrary.FileLibrary;
import com.actitime.Genericlibrary.ListenerImplemantation;
import com.actitime.objectReporitory.HomePage;
import com.actitime.objectReporitory.Taskpage;
//@Listeners(ListenerImplemantation.class)
public class CreateCustomer extends BaseClass{
@Test
public void createCustomer () throws EncryptedDocumentException, IOException{
HomePage hp= new HomePage(driver);
hp.getTasklink().click();
Taskpage tp= new Taskpage(driver);
tp.getAddNewbtn().click();
tp.getNewcust().click();
FileLibrary f =new FileLibrary();
String Custname  = f.readFromExcelFile("Sheet2", 1, 2);
tp.getCustname().sendKeys(Custname);
String custdesc = f.readFromExcelFile("Sheet2", 1, 1);
//Assert.fail();
tp.getCustdest().sendKeys(custdesc);
tp.getCreatebtn().click();

}
}