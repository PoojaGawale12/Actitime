package com.actitime.objectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {
@FindBy(xpath="//div[.='Add New']")
private WebElement AddNewbtn;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement Newcust;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement custname;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement custdest;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement createbtn;

@FindBy(xpath="//div[@class='greyButton cancelBtn']")
private WebElement cancelbtn;


//Initialization
	public Taskpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization


	public WebElement getAddNewbtn() {
		return AddNewbtn;
	}


	public WebElement getNewcust() {
		return Newcust;
	}


	public WebElement getCustname() {
		return custname;
	}


	public WebElement getCustdest() {
		return custdest;
	}


	public WebElement getCreatebtn() {
		return createbtn;
	}


	public WebElement getCancelbtn() {
		return cancelbtn;
	}
}
