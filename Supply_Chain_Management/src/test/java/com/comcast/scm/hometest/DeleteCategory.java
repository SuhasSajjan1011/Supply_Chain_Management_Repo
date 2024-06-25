package com.comcast.scm.hometest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.Home;

public class DeleteCategory extends BaseClass 
{
	@Test(groups = "regressionTest")
	public void deleteCategory() throws Throwable
	{
		Home h=new Home(driver);
		driver.manage().window().maximize();
		h.navigateToManageCategory();
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[37]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Delete\"]")).click();
		h.switchtoAlertAndAccept(driver);
		
		h.navigateToManageUnit();
		driver.findElement(By.xpath("//input[@value=\"+ Add Unit\"]")).click();
		
		String unitname=eLib.getDataFromExcel("Sheet1", 33, 0);
		driver.findElement(By.xpath("//input[@id=\"unitName\"]")).sendKeys(unitname);
		
		String unitdetails=eLib.getDataFromExcel("Sheet1", 33, 1);
		driver.findElement(By.xpath("//textarea[@id=\"unitDetails\"]")).sendKeys(unitdetails);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Add Unit\"]")).click();
		Thread.sleep(1000);
		
		h.switchtoAlertAndAccept(driver);
		
		h.navigateToManageArea();
		
		driver.findElement(By.xpath("//input[@value=\"+ Add Area\"]")).click();
		
		String areaname=eLib.getDataFromExcel("Sheet1", 45, 0);
		driver.findElement(By.xpath("//input[@id=\"areaName\"]")).sendKeys(areaname);
		
		String areacode=eLib.getDataFromExcel("Sheet1", 45, 1);
		driver.findElement(By.xpath("//input[@id=\"areaCode\"]")).sendKeys(areacode);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value=\"Add Area\"]")).click();
		Thread.sleep(1000);
		
		h.switchtoAlertAndAccept(driver);
		
	}
}
