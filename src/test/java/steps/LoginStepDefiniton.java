/*
package steps;


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.TestBase;
import pages.LoginPage;

public class LoginStepDefiniton extends TestBase{
	   LoginPage lp;
	   @Given("^User is on the techfios login page$")
	   public void user_is_on_the_techfios_login_page()
	   {
		   TestBase.initDriver();
		   driver.get("http://www.techfios.com/billing/?ng=admin/");
		   
	   }
	   
	   @When ("^User enters username as \"([^\"]*)\"$")
	   public void user_enters_username(String username)
	   {
		   lp = PageFactory.initElements(driver, LoginPage.class);
		   lp.inputUserName(username);
	   }
	   
	   @When ("^User enters password as \"([^\"]*)\"$")
	   public void user_enters_password(String password)
	   {
		   lp.inputPassWord(password);

	   }
	   
	   @When ("^User clicks on signin button$")
	   public void user_clicks_signin_button()
	   {
		   lp.login();
	   }
	   
	   @Then("^User should land on Dashboard page$")
	   public void user_land_on_dashboard_page()
	   {
		   String expectedTitle = "Dashboard- iBilling";
		   String actualTitle	= lp.getTitle();
		   Assert.assertEquals(expectedTitle,actualTitle,"TitleNotMatching...");
	   }
}
*/