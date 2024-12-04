package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact {
	public  CreateContact(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contact;
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createbutton;
	@FindBy(xpath = "lastname")
	private WebElement lastname;
	@FindBy(xpath = "support_end_date")
	private WebElement endDate;
	@FindBy(xpath = "support_start_date")
	private WebElement startDate;
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement save;
	public void contact() {
		contact.click();
	}
	public void lastName(String name) {
		lastname.click();
		lastname.sendKeys(name);
	}
	public void saveContact() {
		save.click();
	}
	public void startDate1(String date) {
		save.sendKeys(date);
	}
	public void endDate1(String date) {
		save.sendKeys(date);
	}

}
