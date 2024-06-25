package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategory  
{
	WebDriver driver;
	public AddCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id=\"categoryName\"]")
	private WebElement categorynameEdt;
	
	@FindBy(xpath="//textarea[@id=\"categoryDetails\"]")
	private WebElement categorydetailsEdt;
	
	@FindBy(xpath="//input[@value=\"Add Category\"]")
	private WebElement addcategorybuttonEdt;
	
	public WebElement getCategoryName()
	{
		return categorynameEdt;
	}
	public WebElement getCategoryDetails()
	{
		return categorydetailsEdt;
	}
	public WebElement getCategoryButton()
	{
		return addcategorybuttonEdt;
	}
	
}
