package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product 
{
	WebDriver driver;
	public Product(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=\"Products\"]")
	private WebElement productlinkEdt;
	
	public WebElement getProductLink()
	{
		return productlinkEdt;
	}
}
