package com.comcast.scm.hometest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.Home;

public class CreateManufacturerIntegrationTest extends BaseClass 
{
	@Test(groups = "regressionTest")
	public void createManufacturerIntegrationTest() throws Throwable
	{
		Home h = new Home(driver);
		h.navigateToAddManufacturer();
		
		String actual_name=eLib.getDataFromExcel("Sheet1", 22, 0);
		driver.findElement(By.xpath("//input[@id=\"manufacturer:name\"]")).sendKeys(actual_name);
		
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
		
		h.getHomeLink().click();
		Thread.sleep(1000);
		
		String expected_name = driver.findElement(By.xpath("//td[text()=\" "+actual_name+" \"]")).getText();
		if(actual_name.equals(expected_name))
		{
			System.out.println(expected_name+" is verified successfully");
		}
		else
		{
			System.out.println("Failed.Manufacturer name doesnt match");
		}
		AssertJUnit.assertEquals(actual_name, expected_name);
		
		
	}
}
