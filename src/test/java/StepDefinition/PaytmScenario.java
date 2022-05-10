package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.PageObjects.PaytmPage;
import com.Utility.DriverObject;
import com.Utility.Wrapper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaytmScenario extends DriverObject{
	DriverObject driverObject = new DriverObject();
	PaytmPage paytmPage = new PaytmPage();
	Wrapper wrapper = new Wrapper();
	String text = "";
	WebElement element;

	@Given("^user is at paytm Page$")
	public void user_is_at_paytm_Page() throws Throwable {
		driverObject.GetChromeDriver();
		driverObject.enterUrl("url1");

	}

	@When("^Selecting metro tab from list$")
	public void selecting_metro_tab_from_list() throws Throwable {
		element = paytmPage.selectMainMenuList();
		wrapper.click(element);
	}

	@And("^Enter Metro type details$")
	public void enter_Metro_type_details() throws Throwable {
		element = paytmPage.clickOnTxtMetroType();
		wrapper.click(element);
		wrapper.selectData(element, "Mumbai");
	}

	@And("^Enter Ticket Type details$")
	public void enter_Ticket_Type_details() throws Throwable {
		element = paytmPage.clickOnTicketType();
		wrapper.click(element);
		wrapper.selectData(element, "Smart");
	}

	@And("^Enter Card Number$")
	public void enter_Card_Number() throws Throwable {
		element = paytmPage.clickOnCardNumber();
		wrapper.click(element);
		wrapper.selectData(element, "123456789");
	}

	@And("^Click on Get Card Balance Button$")
	public void clickOnGetCardDetails() throws Throwable {
		element = paytmPage.clickOnGetCardBalance();
		wrapper.click(element);
	}

	@Then("^verify it is redirected to paytm web account$")
	public void verify_it_is_redirected_to_paytm_web_account() throws Throwable {
		element=driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=paytm-web']"));
		driver.switchTo().frame(element);
		element = paytmPage.labelLoginToViewAccount();
		text = wrapper.getData(element);
		wrapper.verifyText("To Login into your Paytm Web account", text);
		driverObject.closeBrowser();
	}
}
