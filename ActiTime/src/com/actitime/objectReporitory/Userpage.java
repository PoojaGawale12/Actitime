package com.actitime.objectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userpage {
 @FindBy(xpath="(//div[.='  Departments'])[2]")
 private WebElement departbtn;
 
 @FindBy(xpath="//div[.='New User']")
 private WebElement newuserbtn;
 
 @FindBy(xpath="//div[.='Bulk Invitations']")
 private WebElement bulkinvitationsbtn;
 
 //initialization
 public Userpage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
 }
 //utilization

public WebElement getDepartbtn() {
	return departbtn;
}

public WebElement getNewuserbtn() {
	return newuserbtn;
}
public WebElement getbulkinvitationsbtn() {
	return bulkinvitationsbtn;
 
}
}
