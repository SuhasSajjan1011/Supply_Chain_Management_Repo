package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct 
{
	WebDriver driver;
	public AddProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//select[@id=\"product:unit\"]")
	 private WebElement unittypeEdt;
	 
	 @FindBy(xpath="//select[@id=\"product:category\"]")
	 private WebElement categorytypeEdt;
	 
	 @FindBy(xpath="//textarea[@id=\"product:description\"]")
	 private WebElement descriptionEdt;
	 
	 @FindBy(xpath="//input[@value=\"Add Product\"]")
	 private WebElement addproductbuttonEdt;
	 
	 public WebElement getUnitType()
	 {
		 return unittypeEdt;
	 }
	 public WebElement getCategoryType()
	 {
		 return categorytypeEdt;
	 }
	 public WebElement getDescription()
	 {
		 return descriptionEdt;
	 }
	 public WebElement getAddProductButton()
	 {
		 return addproductbuttonEdt;
	 }
	 
}
