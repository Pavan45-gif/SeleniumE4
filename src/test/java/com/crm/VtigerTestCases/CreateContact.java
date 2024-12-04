package com.crm.VtigerTestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.VtigerBaseClass.VtigerBaseClass;

public class CreateContact extends VtigerBaseClass {
	@Test
	public void main() {
		CreateContactPOM cr = new CreateContactPOM(driver);
		cr.contact();
		cr.createButton();
		String name = "Wakle"+(int)+(Math.random()*100);
		cr.lastName(name);
		cr.saveContact();
		String expname=driver.findElement(By.xpath("//div[@class=''small']//[1]")).getText();
		assertTrue(expname.contains(name),"@contact not same@");
		System.out.println("contacts match");
		
	}

}
