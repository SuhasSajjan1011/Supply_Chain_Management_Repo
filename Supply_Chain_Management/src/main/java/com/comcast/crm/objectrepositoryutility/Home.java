package com.comcast.crm.objectrepositoryutility;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class Home extends WebDriverUtility{                             
                           
	WebDriver driver;
	 public Home(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void logout()
	 {
		logoutEdt.click(); 
	 }
	 @FindBy(xpath="//a[text()=\"Home\"]")
	 private WebElement homelinkEdt;
	
	 @FindBy(xpath="//a[text()='Manage Category']")
	 private WebElement managecategoryEdt;
	 
	 @FindBy(xpath="//a[text()='Add Products']")
	 private WebElement addproductEdt;
	 
	 @FindBy(xpath="//a[text()='Add Retailers']")
	 private WebElement addretailersEdt;
	 
	 @FindBy(xpath="//a[text()='Add Manufacturer']")
	 private WebElement addmanufacturerEdt;
	 
	 @FindBy(xpath="//a[text()='Add Distributor']")
	 private WebElement adddistributorEdt;
	 
	 @FindBy(xpath="//a[text()='Manage Unit']")
	 private WebElement addunitEdt;
	 
	 @FindBy(xpath="//a[text()='Manage Area']")
	 private WebElement addareaEdt;
	 
	 @FindBy(xpath="//a[text()='Change Password']")
	 private WebElement changepasswordEdt;
	 
	 @FindBy(xpath="//input[@value=\"Log out\"]")
	 private WebElement logoutEdt;
	 
	 public WebElement getManageCategory()
	 {
		 return managecategoryEdt;
	 }
	 public WebElement getAddProducts()
	 {
		 return addproductEdt;
	 }
	 public WebElement getAddRetailers()
	 {
		 return addretailersEdt;
	 }
	 public WebElement getAddManufacturer()
	 {
		 return addmanufacturerEdt;
	 }
	 public WebElement getAddDistributor()
	 {
		 return adddistributorEdt;
	 }
	 public WebElement getManageUnit()
	 {
		 return addunitEdt;
	 }
	 public WebElement getManageArea()
	 {
		 return addareaEdt;
	 }
	 public WebElement changePassword()
	 {
		 return changepasswordEdt;
	 }
	 public WebElement getHomeLink()
	 {
		 return homelinkEdt;
	 }
	 public void navigateToAddProducts()
	 {
		 addproductEdt.click();
	 }
	 public void navigateToManageCategory()
	 {
		 managecategoryEdt.click();
	 }
	 public void navigateToAddDistributor()
	 {
		 adddistributorEdt.click();
	 }
	 public void navigateToManageUnit()
	 {
		 addunitEdt.click();
	 }
	 public void navigateToAddRetailers()
	 {
		 addretailersEdt.click();
	 }
	 public void navigateToAddManufacturer()
	 {
		 addmanufacturerEdt.click();
	 }
	 public void navigateToManageArea()
	 {
		 addareaEdt.click();
	 }
	 public void navigateToChangePassword()
	 {
		 changepasswordEdt.click();
	 }
	 
}
	 
	 
	 
	 
	 

	 


	

	
	

