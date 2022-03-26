package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(how = How.XPATH, using = "//*[@id='txtUsername']")
	private WebElement userNameField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
	private WebElement passwordField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnLogin']")
	private WebElement loginBtn;
	
	

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(WebElement passwordField) {
		this.passwordField = passwordField;
	}

	public WebElement getUserNameField() {
		return userNameField;
	}

	public void setUserNameField(WebElement userNameField) {
		this.userNameField = userNameField;
	}
	
	

}
