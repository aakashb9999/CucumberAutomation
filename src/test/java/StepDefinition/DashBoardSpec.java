package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageObjects.HRMDashBoardPage;
import com.PageObjects.ManageReviewsPage;
import com.Utility.DriverObject;
import com.Utility.Wrapper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashBoardSpec extends DriverObject {

	HRMDashBoardPage hrmDashBoardPage = new HRMDashBoardPage();
	ManageReviewsPage manageReviewsPage = new ManageReviewsPage();
	DriverObject driverobject = new DriverObject();
	Wrapper wrapper = new Wrapper();
	String text = "";
	WebElement element;

	@Given("^In the Dashboard click on performance tab$")
	public void clickOnMainList() throws Throwable {
		element = hrmDashBoardPage.selectMainMenuList();
		wrapper.click(element);

	}

	@When("^user hover on ManageReviewstab$")
	public void hoverOnManageReviewsTab() throws Throwable {
		element = hrmDashBoardPage.selectManageReviews();
		wrapper.hoverToList(element);

	}

	@When("^select sublist option ManageReviews from ManageReviews tab$")
	public void selectManageReviewsSubList() throws Throwable {
		element = hrmDashBoardPage.selectSubListManageReview();
		wrapper.click(element);
	}

	@Then("^It should open tab successfully$")
	public void verifyPerformanceReviews() throws Throwable {
		element = hrmDashBoardPage.lblSearchPerformanceReview();
		text = wrapper.getData(element);
		wrapper.verifyText("Search Performance Reviews", text);

	}

	@When("^Enter details for EmployeeName as \"([^\"]*)\"$")
	public void setEmployeeName(String value) throws Throwable {

		element = manageReviewsPage.enterEmployeeName();
		wrapper.SendData(element, value);
	}

	@And("^click on jobtitle$")
	public void clickOnJobTitle() throws Throwable {

		element = manageReviewsPage.clickOnJobTitle();
		wrapper.click(element);
	}

	@And("^Select job title as \"([^\"]*)\"$")
	public void selectJobTitle(String title) throws Throwable {

		element = manageReviewsPage.clickOnJobTitle();
		wrapper.selectValueFromDropDown(element, title);
	}

	@And("^click on status field$")
	public void clickOnStatusField() throws Throwable {

		element = manageReviewsPage.clickonStatusField();
		wrapper.click(element);
	}

	@And("^Select status as \"([^\"]*)\"$")
	public void selectStatus(String status) throws Throwable {
		element = manageReviewsPage.clickonStatusField();
		wrapper.selectValueFromDropDown(element, status);

	}

	@And("^Enter from date as \"([^\"]*)\"$")
	public void setFromDate(String fromDate) throws Throwable {
		element = manageReviewsPage.enterFromdate();
		wrapper.clearField(element);
		wrapper.SendData(element, fromDate);

	}

	@And("^Enter to date as \"([^\"]*)\"$")
	public void setToDate(String toDate) throws Throwable {
		element = manageReviewsPage.enterToDate();
		wrapper.clearField(element);
		wrapper.SendData(element, toDate);
	}

	@And("^click on Search Button$")
	public void clickOnSearchButton() throws Throwable {

		element = manageReviewsPage.clickSearch();
		wrapper.click(element);
	}

	@Then("^click on Evaluate Button from searched data$")
	public void clickONEvaluateButton() throws Throwable {
		driverobject.refreshPage();
		element = manageReviewsPage.clickOnBtnEvaluate();
		wrapper.doubleClick(element);
	}

	@Given("^User is at Administrator Evaluation Form Page$")
	public void user_is_at_Administrator_Evaluation_Form_Page() throws Throwable {
     element = manageReviewsPage.lblAdministratorEvaluatorForm();
	}

	@When("^User Enter data for \"([^\"]*)\" Field$")
	public void enterDataInTable(String arg1) throws Throwable {
		
		element = driver.findElement(By.xpath("//table[@class='expandTable']//tr//td//center[text()='" + arg1
				+ "']//ancestor::tr[1]//td//input[@type='text']"));
		wrapper.clearField(element);
		wrapper.SendData(element, "1");
		Thread.sleep(1000);

		element = driver.findElement(By.xpath(
				"//table[@class='expandTable']//tr//td//center[text()='" + arg1 + "']//ancestor::tr[1]//td//textarea"));
		wrapper.clearField(element);
		wrapper.SendData(element, "test data");
		Thread.sleep(1000);

	}

	@When("^click on Save Button$")
	public void clickOnSaveButton() throws Throwable {

		element = manageReviewsPage.clickSave();
		wrapper.click(element);
	}

	@Then("^Data Should be saved Successfully in Individual Evaluation Status ReviewverName as \"([^\"]*)\" and ReviewStatus as \"([^\"]*)\"$")
	public void verifyAddedData(
			String arg1, String arg2) throws Throwable {
		element = driver.findElement(By.xpath("//table[@id='induvidualEvaluate']//tr//td[text()='" + arg1
				+ "']//ancestor::tr//td[text()='" + arg2 + "']"));
		wrapper.verifyElementDisplayed(element);
		driverobject.closeBrowser();
	}

	@And("^User Enter comment in Final Comment \"([^\"]*)\" field$")
	public void setFinalComment(String arg1) throws Throwable {
		element = manageReviewsPage.enterFinalComment();
		wrapper.clearField(element);
		wrapper.SendData(element, arg1);

	}

	@And("^User Enter rating in Final Rating \"([^\"]*)\" field$")
	public void setFinalRating(String arg1) throws Throwable {
		element = manageReviewsPage.enterFinalRating();
		wrapper.clearField(element);
		wrapper.SendData(element, arg1);

	}

	@When("^User enter completed date \"([^\"]*)\"$")
	public void setCompletedDate(String arg1) throws Throwable {
		element = manageReviewsPage.enterCompletedDate();
		wrapper.clearField(element);
		wrapper.SendData(element, arg1);
	}

}
