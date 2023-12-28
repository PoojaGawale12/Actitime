package com.actitime.objectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//declaration
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement timetracklink;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasklink;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement Reportslink;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement Userslink;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutbtn;
	
	//Initialization
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Declaration
	
	public WebElement gettimetracklink() {
		return timetracklink;
	}

	public WebElement getTasklink() {
		return tasklink;
	}

	public WebElement getReportslink() {
		return Reportslink;
	}

	public WebElement getUserslink() {
		return Userslink;
	}
	public WebElement getlogoutlink() {
		return logoutbtn;
	}
}
