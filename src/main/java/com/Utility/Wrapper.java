package com.Utility;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;

import org.junit.rules.Verifier;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Wrapper extends DriverObject {

	static Actions action;

	public void click(WebElement element) {
		element.click();
	}

	public void SendData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public String getData(WebElement element) {
		return element.getText();
	}

	public boolean verifyText(String expectedText, String actualText) {
		return (expectedText.equals(actualText));
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void hoverToList(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void clearField(WebElement element) {
		element.clear();
	}

	public void selectValueFromDropDown(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void doubleClick(WebElement element) {
		action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}

	public boolean verifyElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public void selectData(WebElement element,String data)
	{
		element.sendKeys(data+Keys.ENTER);
	}
		
}
