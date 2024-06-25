package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategory 
{
	WebDriver driver;
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 @FindBy(xpath="//input[@value=\"+ Add Category\"]")
	 private WebElement addcategorybuttonEdt;
	 
	 public WebElement getAddCategoryButton()
	 {
		 return addcategorybuttonEdt;
	 }
	
}
