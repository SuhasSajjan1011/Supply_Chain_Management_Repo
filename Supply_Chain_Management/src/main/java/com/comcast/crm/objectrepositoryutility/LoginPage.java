package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class LoginPage extends WebDriverUtility{                              // Rule-1  create a separte java class
                           
	WebDriver driver;
	public String data;
	 public LoginPage(WebDriver driver) {             //Rule 3 : Object Initialization
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }

	@FindBy(id="login:username")                        // Rule-2 Object Creation
	private WebElement usernameEdt;
	
	@FindBy(id="login:password")
	private WebElement passwordEdt;
	
	@FindBy(name="login_type")
	private WebElement logintypeEdt;
	
	@FindBy(xpath="//input[@class='submit_button']")
	private WebElement loginBtn;
	     
	
	                                             
	public WebElement getUsernameEdt() {            //Rule-4 : Object Encapsulation
		return usernameEdt;                        //Rule-5 : Object Utilization
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getLoginTypeEdit() {
		return logintypeEdt;
	}
	
/**
 *  login to application based username , password , url argumnets 
 * @param url
 * @param username
 * @param password
 * @throws Throwable 
 */
	 public void loginToapp(String url , String username , String password) throws Throwable {
		 WebDriverUtility wlib=new WebDriverUtility();
		 ExcelUtility elib=new ExcelUtility();
		 waitForPageToLoad(driver);
		 driver.get(url);	
		 driver.manage().window().maximize();
		 usernameEdt.sendKeys(username);
		 passwordEdt.sendKeys(password);
		 String data=elib.getDataFromExcel("Sheet1", 3, 0);
		 wlib.select(logintypeEdt, data);
		 loginBtn.click();
	 }
	
	
}
