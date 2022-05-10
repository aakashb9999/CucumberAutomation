package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utility.DriverObject;

public class HRMDashBoardPage extends DriverObject {

	By lstMainMenu = By.xpath("//div[@id='mainMenu']//b[text()='Performance']");
	By lstManageReviews = By.xpath("//a[@id='menu_performance_ManageReviews']");
	By subListManageReviews = By.xpath("//a[@id='menu_performance_searchPerformancReview']");
	By searchPerformanceReviews = By.xpath("//div[@class='head']//h1[text()='Search Performance Reviews']");
	
	public WebElement selectMainMenuList()
	{
		return driver.findElement(lstMainMenu);
	}
	
	public WebElement selectManageReviews()
	{
		return driver.findElement(lstManageReviews);
	}
	
	public WebElement selectSubListManageReview()
	{
		return driver.findElement(subListManageReviews);
	}
	public WebElement lblSearchPerformanceReview()
	{
		return driver.findElement(searchPerformanceReviews);
	}
	
}
