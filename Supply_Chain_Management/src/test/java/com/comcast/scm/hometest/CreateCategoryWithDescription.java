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
import com.comcast.crm.objectrepositoryutility.AddRetailer;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.ManageCategory;

public class CreateCategoryWithDescription extends BaseClass
{
	@Test(groups = "smokeTest")
	public void createCategoryWithDescription() throws Throwable
	{
		WebDriverUtility wLib=new WebDriverUtility();
		Home h=new Home(driver);
		ManageCategory mc=new ManageCategory(driver);
		AddRetailer ar=new AddRetailer(driver);
		
		h.navigateToManageCategory();
		Thread.sleep(1000);
		WebElement element4=mc.getAddCategoryButton();
		element4.click();
		
		String categoryname=eLib.getDataFromExcel("Sheet1", 39, 0)+jLib.getRandomNumber();
		driver.findElement(By.xpath("//input[@id=\"categoryName\"]")).sendKeys(categoryname);
		
		String details=eLib.getDataFromExcel("Sheet1", 39, 1)+jLib.getRandomNumber();
		driver.findElement(By.xpath("//textarea[@id=\"categoryDetails\"]")).sendKeys(details);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Add Category\"]")).click();
		Thread.sleep(1000);
		
		h.switchtoAlertAndAccept(driver);
		
		h.navigateToAddRetailers();
		
		String username=eLib.getDataFromExcel("Sheet1", 14, 0);
		driver.findElement(By.xpath("//input[@id=\"retailer:username\"]")).sendKeys(username);
		
		String password=eLib.getDataFromExcel("Sheet1", 14, 1);
		driver.findElement(By.xpath("//input[@id=\"retailer:password\"]")).sendKeys(password);
		
		String areacode=eLib.getDataFromExcel("Sheet1", 14, 2);
		WebElement element5=ar.getAreaCode();
		wLib.select(element5, areacode);
		
		String phone=eLib.getDataFromExcel("Sheet1", 14, 3);
		driver.findElement(By.xpath("//input[@id=\"retailer:phone\"]")).sendKeys(phone);
		
		String email=eLib.getDataFromExcel("Sheet1", 14, 4);
		driver.findElement(By.xpath("//input[@id=\"retailer:email\"]")).sendKeys(email);
		
		String address=eLib.getDataFromExcel("Sheet1", 14, 5);
		driver.findElement(By.xpath("//textarea[@id=\"retailer:address\"]")).sendKeys(address);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Add Retailer\"]")).click();
		
		h.switchtoAlertAndAccept(driver);
		
		h.navigateToAddManufacturer();
		
		String name=eLib.getDataFromExcel("Sheet1", 22, 0);
		driver.findElement(By.xpath("//input[@id=\"manufacturer:name\"]")).sendKeys(name);
		
		String email1=eLib.getDataFromExcel("Sheet1", 22, 1);
		driver.findElement(By.xpath("//input[@id=\"manufacturer:email\"]")).sendKeys(email1);
		
		String phone1=eLib.getDataFromExcel("Sheet1", 22, 2);
		driver.findElement(By.xpath("//input[@id=\"manufacturer:phone\"]")).sendKeys(phone1);
		
		String username1=eLib.getDataFromExcel("Sheet1", 22, 3);
		driver.findElement(By.xpath("//input[@id=\"manufacturer:username\"]")).sendKeys(username1);
		
		String password1=eLib.getDataFromExcel("Sheet1", 22, 4);
		driver.findElement(By.xpath("//input[@id=\"manufacturer:password\"]")).sendKeys(password1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Add Manufacturer\"]")).click();
		Thread.sleep(1000);
		
		h.switchtoAlertAndAccept(driver);
	}
}
