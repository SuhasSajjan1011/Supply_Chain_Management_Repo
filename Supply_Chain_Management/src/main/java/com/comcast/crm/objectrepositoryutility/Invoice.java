package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoice 
{

	WebDriver driver;
	public Invoice(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()=\"Invoice\"]")
	private WebElement invoicelinkEdt;
	
	@FindBy(xpath="//select[@name=\"cmbFilter\"]")
	private WebElement searchtypedropdownEdt;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement searchbuttonEdt;
	
	public WebElement getInvoiceLink()
	{
		return invoicelinkEdt;
	}
	public WebElement getSelectByDropdown()
	{
		return searchtypedropdownEdt;
	}
	public WebElement getSearchButton()
	{
		return searchbuttonEdt;
	}
}
