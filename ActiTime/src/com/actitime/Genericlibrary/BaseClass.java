package com.actitime.Genericlibrary;

import java.io.IOException;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.actitime.objectReporitory.HomePage;
import com.actitime.objectReporitory.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	FileLibrary f=new FileLibrary();
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected",true);
}
	@BeforeTest
	public void LunchBrowser() throws IOException {
		 driver=new ChromeDriver();
		 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.manage().window().maximize();
	    String URL = f.readDatafromPropertyFile("url");
	     driver.get(URL);
		 Reporter.log("Launch Brower",true);
	}
	@BeforeMethod
	public void logintoActitime() throws IOException {
		String un = f.readDatafromPropertyFile("username");
		String pwd = f.readDatafromPropertyFile("password");
		LoginPage l=new LoginPage(driver);
		
		l.getUntbx().sendKeys(un);
		l.getPwdtbx().sendKeys(pwd);
		l.getLgbtn().click();
	}
	@AfterMethod
	 public void logout () {
		 HomePage hp = new HomePage(driver);
		 hp.getlogoutlink().click();
		  Reporter.log("closer the browser",true);
	 }

	 
	 @AfterClass
	 
	 public void closeBrowser () {
		 driver.close();
		  Reporter.log("closer the browser",true);
	 }

	 
	 
	 
	 @AfterSuite
	 public void DisconnectDatabase() {
		  Reporter.log("disconnect database",true);
	 }
	 
	}

	
