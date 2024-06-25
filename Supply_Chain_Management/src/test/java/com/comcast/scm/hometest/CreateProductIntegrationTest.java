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
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.AddProduct;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.Product;

public class CreateProductIntegrationTest extends BaseClass 
{
	@Test(groups = "regressionTest")
	public void createProductIntegrationTest() throws Throwable
	{
		WebDriverUtility wLib = new WebDriverUtility();
		Home h=new Home(driver);
		AddProduct ap = new AddProduct(driver);
		Product p = new Product(driver);
		h.navigateToAddProducts();
		
		String actual_product_name=eLib.getDataFromExcel("Sheet1",7, 0)+jLib.getRandomNumber();
		driver.findElement(By.xpath("//input[@id='product:name']")).sendKeys(actual_product_name);
		
		
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
		
		//driver.findElement(By.xpath("//a[text()='Products']")).click();
		p.getProductLink().click();
		String expected_product_name=driver.findElement(By.xpath("//td[text()=' "+actual_product_name+" ']")).getText();
		if(actual_product_name.equals(expected_product_name))
		{
			System.out.println(expected_product_name + " is verified successfully");
		}
		else
		{
			System.out.println("Failed.Products name doesnt match");
		}
		AssertJUnit.assertEquals(actual_product_name, expected_product_name);
	}
}
