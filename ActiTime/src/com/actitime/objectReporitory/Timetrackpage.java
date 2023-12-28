package com.actitime.objectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timetrackpage {
 @FindBy(xpath="//h3[.='Enter Time-Track for']")
 private WebElement textbtn;
 
 @FindBy(xpath="//button[.='Calendar']")
 private WebElement calbtn;
 
 @FindBy(xpath="Timesheet")
 private WebElement timesheetbtn;
 
 @FindBy(xpath="//button[.='Me']")
 private WebElement mebtn;
 
 //@FindBy(xpath="//button[.='Calendar']")
// private WebElement tn;
 //Initialization
 public Timetrackpage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 //Utilization

public WebElement getTextbtn() {
	return textbtn;
}

public WebElement getCalbtn() {
	return calbtn;
}

public WebElement getTimesheetbtn() {
	return timesheetbtn;
}

public WebElement getMebtn() {
	return mebtn;
}
}
