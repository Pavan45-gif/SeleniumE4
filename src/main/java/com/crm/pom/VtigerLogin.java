package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLogin {
	public VtigerLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[name='user_name']")
	public WebElement userName;
	@FindBy(css = "input[name='user_password']")
	public WebElement userPassword;
	@FindBy(css = "input[id ='submitButton']")
	public WebElement loginButton;
	
	public void login(String usern, String pass) {
		userName.sendKeys(usern);
		userPassword.sendKeys(pass);
		loginButton.click();
	}

}
