package com.comcast.scm.hometest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.AddProduct;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.ManageCategory;

public class CreateCategory extends BaseClass
{
	@Test(groups = "smokeTest")
	public void createCategory() throws Throwable {
		WebDriverUtility wLib=new WebDriverUtility();
		Home h=new Home(driver);
		ManageCategory mc=new ManageCategory(driver);
		AddProduct ap=new AddProduct(driver);
		
		h.navigateToManageCategory();
		Thread.sleep(1000);
		WebElement element4=mc.getAddCategoryButton();
		element4.click();
		
		String categoryname=eLib.getDataFromExcel("Sheet1", 39, 0)+jLib.getRandomNumber();
		driver.findElement(By.xpath("//input[@id=\"categoryName\"]")).sendKeys(categoryname);
		
		//String details=eLib.getDataFromExcel("Sheet1", 39, 1)+jLib.getRandomNumber();
		//driver.findElement(By.xpath("//textarea[@id=\"categoryDetails\"]")).sendKeys(details);
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Add Category\"]")).click();
		Thread.sleep(1000);
		
		h.switchtoAlertAndAccept(driver);
		
		h.navigateToAddDistributor();
		
		String name=eLib.getDataFromExcel("Sheet1",27, 0);
		driver.findElement(By.xpath("//input[@id=\"distributor:name\"]")).sendKeys(name);
		
		String email=eLib.getDataFromExcel("Sheet1",27, 1);
		driver.findElement(By.xpath("//input[@id=\"distributor:email\"]")).sendKeys(email);
		
		String phone=eLib.getDataFromExcel("Sheet1",27, 2);
		driver.findElement(By.xpath("//input[@id=\"distributor:phone\"]")).sendKeys(phone);
		
		String address=eLib.getDataFromExcel("Sheet1",27, 3);
		driver.findElement(By.xpath("//textarea[@id=\"distributor:address\"]")).sendKeys(address);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Add Distributor\"]")).click();
		
		Thread.sleep(1000);
		h.switchtoAlertAndAccept(driver);
		
		h.navigateToAddProducts();
		
		String productname=eLib.getDataFromExcel("Sheet1",7, 0)+jLib.getRandomNumber();
		driver.findElement(By.xpath("//input[@id='product:name']")).sendKeys(productname);
		
		
		String price=eLib.getDataFromExcel("Sheet1", 7, 1);
		driver.findElement(By.xpath("//input[@id='product:price']")).sendKeys(price);
		
		String text=eLib.getDataFromExcel("Sheet1", 7, 2);
		WebElement element=ap.getUnitType();
		wLib.select(element,text);
		
		String text1=eLib.getDataFromExcel("Sheet1", 7, 3);
		WebElement element1=ap.getCategoryType();
		wLib.select(element1,text1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
		
		String text2=eLib.getDataFromExcel("Sheet1", 7, 4);
		WebElement element2=ap.getDescription();
		element2.sendKeys(text2);
		//wLib.select(element2,text2);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Add Product\"]")).click();
		Thread.sleep(1000);
		h.switchtoAlertAndAccept(driver);	
	}
}
