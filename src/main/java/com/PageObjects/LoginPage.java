package com.PageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utility.DriverObject;

public class LoginPage extends DriverObject {
	
	private By txtUserName = By.id("txtUsername");
	private By txtPassword = By.id("txtPassword");
	private By btnLogin = By.id("btnLogin");
	private By lblMessage = By.id("spanMessage");
	
	public WebElement enterUserName()
	{
		return driver.findElement(txtUserName);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(txtPassword);
	}

	public WebElement clickLoginButton()
	{
		return driver.findElement(btnLogin);
	}
	
	public WebElement getMessage()
	{
		return driver.findElement(lblMessage);
	}

}
