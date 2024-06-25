package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRetailer 
{
	WebDriver driver;
	public AddRetailer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id=\"retailer:areaCode\"]")
	private WebElement areacodeEdt;
	
	public WebElement getAreaCode()
	{
		return areacodeEdt;
	}
	
}
