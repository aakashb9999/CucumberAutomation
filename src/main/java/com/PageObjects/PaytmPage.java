package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utility.DriverObject;

public class PaytmPage extends DriverObject {
By btnMetro = By.xpath("//a[@title='Metro']");
By txtMetro = By.xpath("//div//li[1]//input");
By txtTicketType = By.xpath("//input[@value='Mumbai Metro']//ancestor::ul//li[2]//input");
By txtCardNumber = By.xpath("//input[@value='Mumbai Metro']//ancestor::ul//li[3]//input");
By btnGetCardBalance = By.xpath("//button[text()='Get Card Balance']");
By lblLogin	= By.xpath("//p[text()='To Login into your Paytm Web account']");
public WebElement selectMainMenuList()
{
	return driver.findElement(btnMetro);
}

public WebElement clickOnTxtMetroType()
{
	return driver.findElement(txtMetro);
}


public WebElement clickOnTicketType()
{
	return driver.findElement(txtTicketType);
}

public WebElement clickOnCardNumber()
{
	return driver.findElement(txtCardNumber);
}

public WebElement clickOnGetCardBalance()
{
	return driver.findElement(btnGetCardBalance);
}

public WebElement labelLoginToViewAccount()
{
	return driver.findElement(lblLogin);
}

}
