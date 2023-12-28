package com.actitime.objectReporitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reportspage {
 @FindBy (xpath="//div[@class='containers-WidgetsDashboard-DashboardHeader-ViewSelector-trigger--3G0b5EfG']")
 private WebElement dropdownbtn;
 
 @FindBy (xpath="//button[@fdprocessedid='fdprocessedid']")
 private WebElement createwidgetbtn;
 
 @FindBy (xpath="//button[@fdprocessedid='3s8nzw']")
 private WebElement createchartbtn;
 
 @FindBy (xpath="//button[@fdprocessedid='ktx3jd']")
 private WebElement Newreportbtn;
 
 //initialization
 public Reportspage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 //Utilization

public WebElement getDropdownbtn() {
	return dropdownbtn;
}

public WebElement getCreatewidgetbtn() {
	return createwidgetbtn;
}

public WebElement getCreatechartbtn() {
	return createchartbtn;
}

public WebElement getNewreportbtn() {
	return Newreportbtn;
}
 
}
