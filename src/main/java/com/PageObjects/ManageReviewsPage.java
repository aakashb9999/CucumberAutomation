package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utility.DriverObject;

public class ManageReviewsPage extends DriverObject {
	By txtEmployeeName = By.id("performanceReview360SearchForm_employeeName");
	By lstJobTitle = By.id("performanceReview360SearchForm_jobTitleCode");
	By lstStatus = By.id("performanceReview360SearchForm_status");
	By txtFromDate = By.id("fromDate");
	By txtToDate = By.id("toDate");
	By btnSearch = By.id("btnSearch");
	By btnEvaluate = By.xpath("//td//following::a[text()='Evaluate']");
	By tblEvaluation = By.xpath("//table[@class='expandTable']");
	By txtFinalComment = By.id("reviewEvaluation_hrAdminComments");
	By txtFinalRating = By.id("reviewEvaluation_finalRating");
	By txtCompletedDate = By.id("saveReview360Form_workPeriodStartDate");
	By btnSave = By.id("saveBtn");
	By lblAdministratorEvaluationForm = By.xpath("//div[@id='divFormContainer']//h1[text()='Administrator Evaluation Form']");

	public WebElement enterEmployeeName() {
		return driver.findElement(txtEmployeeName);
	}

	public WebElement clickOnJobTitle() {
		return driver.findElement(lstJobTitle);
	}

	public WebElement clickonStatusField() {
		return driver.findElement(lstStatus);
	}

	public WebElement enterFromdate() {
		return driver.findElement(txtFromDate);
	}

	public WebElement enterToDate() {
		return driver.findElement(txtToDate);
	}

	public WebElement clickSearch() {
		return driver.findElement(btnSearch);
	}

	public WebElement clickOnBtnEvaluate() {
		return driver.findElement(btnEvaluate);
	}

	public WebElement tableEvaluationBySupervisior() {
		return driver.findElement(tblEvaluation);
	}

	public WebElement enterFinalComment() {
		return driver.findElement(txtFinalComment);
	}

	public WebElement enterFinalRating() {
		return driver.findElement(txtFinalRating);
	}

	public WebElement enterCompletedDate() {
		return driver.findElement(txtCompletedDate);
	}

	public WebElement clickSave() {
		return driver.findElement(btnSave);
	}
	
	public WebElement lblAdministratorEvaluatorForm() {
		return driver.findElement(lblAdministratorEvaluationForm);
	}

}
