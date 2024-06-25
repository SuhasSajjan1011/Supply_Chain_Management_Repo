package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders 
{
	WebDriver driver;
	public Orders(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()=\"Orders\"]")
	private WebElement orderlinkEdt;
	
	@FindBy(xpath="//select[@id=\"cmbFilter\"]")
	private WebElement selecttypedropdownEdt;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement searchbuttonEdt;
	
	public WebElement getOrderLink()
	{
		return orderlinkEdt;
	}
	public WebElement getSelectByDropdown()
	{
		return selecttypedropdownEdt;
	}
	public WebElement getSearchButton()
	{
		return searchbuttonEdt;
	}
}
