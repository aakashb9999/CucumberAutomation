package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.PageObjects.LoginPage;
import com.Utility.DriverObject;
import com.Utility.Wrapper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSpec {
	DriverObject driverObject = new DriverObject();
	Wrapper wrapper = new Wrapper();
	LoginPage login = new LoginPage();
	WebElement element;

	@Given("^user is a login page$")
	public void loginPage() throws Throwable {
		driverObject.GetChromeDriver();
		driverObject.enterUrl("url");
	}

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		element = login.enterUserName();
		wrapper.SendData(element, arg1);
		element = login.enterPassword();
		wrapper.SendData(element, arg2);
	}

	@And("^click on Login$")
	public void clickOnLoginButton() {
		element = login.clickLoginButton();
		wrapper.click(element);
	}

	@Then("^Invalid credentials message should be displayed$")
	public void verifyMessage() throws Throwable {
		element = login.getMessage();
		String text = wrapper.getData(element);
		wrapper.verifyText("Invalid credentials", text);
	}

	@Then("^It should be Redirected to HomePage$")
	public void verifyHomePage() throws Throwable {
		String text = wrapper.getPageTitle();
		wrapper.verifyText("OrangeHRM", text);
	}

}
